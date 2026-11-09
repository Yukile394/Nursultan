package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ClosedByInterruptException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03309 {
   private static final Logger N = LogUtils.getLogger();
   private final String y;
   private final int L;
   private final class01062 u;
   private final int i;
   private volatile boolean R;
   @Nullable
   private ServerSocket M;
   private final CopyOnWriteArrayList<Socket> B = new CopyOnWriteArrayList<>();

   private void L() {
      class03295 class03295x = null;

      while (this.R) {
         if (!this.B.isEmpty()) {
            class03295 class03295x = this.i();
            if (class03295x != null && !class03295x.equals(class03295x)) {
               class03295x = class03295x;
               byte[] abyte = class03295x.N().getBytes(StandardCharsets.US_ASCII);

               for (Socket socket : this.B) {
                  if (!socket.isClosed()) {
                     class07536.Z().execute(() -> {
                        try {
                           OutputStream outputstream = socket.getOutputStream();
                           outputstream.write(abyte);
                           outputstream.flush();
                        } catch (IOException ioexception) {
                           N.info("Remote control client socket got an IO exception and will be closed", ioexception);
                           IOUtils.closeQuietly(socket);
                        }
                     });
                  }
               }
            }

            List list = this.B.stream().filter(Socket::isClosed).collect(Collectors.toList());
            this.B.removeAll(list);
         }

         if (this.R) {
            try {
               Thread.sleep(this.i);
            } catch (InterruptedException interruptedexception) {
            }
         }
      }
   }

   public class03309(String var1, int var2, class01062 var3, int var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   @Nullable
   private class03295 i() {
      List<class04770> list = this.u.v();
      if (list.isEmpty()) {
         return null;
      } else {
         class04770 class04770 = list.get(0);
         String s = (String)class03305.N.inverse().get(class04770.method_51469().method_27983());
         return s == null
            ? null
            : new class03295(
               s, class04770.method_23317(), class04770.method_23318(), class04770.method_23321(), class04770.method_36454(), class04770.method_36455()
            );
      }
   }

   private void u() {
      try {
         while (this.R) {
            if (this.M != null) {
               N.info("Remote control server is listening for connections on port {}", this.L);
               Socket socket = this.M.accept();
               N.info("Remote control server received client connection on port {}", socket.getPort());
               this.B.add(socket);
            }
         }
      } catch (ClosedByInterruptException closedbyinterruptexception) {
         if (this.R) {
            N.info("Remote control server closed by interrupt");
         }
      } catch (IOException ioexception) {
         if (this.R) {
            N.error("Remote control server closed because of an IO exception", ioexception);
         }
      } finally {
         IOUtils.closeQuietly(this.M);
      }

      N.info("Remote control server is now stopped");
      this.R = false;
   }

   public void y() {
      this.R = false;
      IOUtils.closeQuietly(this.M);
      this.M = null;
   }

   public void N() throws IOException {
      if (this.M != null && !this.M.isClosed()) {
         N.warn("Remote control server was asked to start, but it is already running. Will ignore.");
      } else {
         this.R = true;
         this.M = new ServerSocket(this.L, 50, InetAddress.getByName(this.y));
         Thread thread = new Thread(this::u, "chase-server-acceptor");
         thread.setDaemon(true);
         thread.start();
         Thread thread1 = new Thread(this::L, "chase-server-sender");
         thread1.setDaemon(true);
         thread1.start();
      }
   }
}
