package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04903 extends class05149 {
   private static final Logger u = LogUtils.getLogger();
   private final ServerSocket i;
   private final String R;
   private final List<class06459> M = Lists.newArrayList();
   private final class04243 B;

   private class04903(class04243 var1, ServerSocket var2, String var3) {
      super("RCON Listener");
      this.B = var1;
      this.i = var2;
      this.R = var3;
   }

   @Override
   public void run() {
      try {
         while (this.N) {
            try {
               Socket socket = this.i.accept();
               class06459 class06459 = new class06459(this.B, this.R, socket);
               class06459.N();
               this.M.add(class06459);
               this.u();
            } catch (SocketTimeoutException sockettimeoutexception) {
               this.u();
            } catch (IOException ioexception) {
               if (this.N) {
                  u.info("IO exception: ", ioexception);
               }
            }
         }
      } finally {
         this.N(this.i);
      }
   }

   private void u() {
      this.M.removeIf(var0 -> !var0.L());
   }

   @Override
   public void y() {
      this.N = false;
      this.N(this.i);
      super.y();

      for (class06459 class06459 : this.M) {
         if (class06459.L()) {
            class06459.y();
         }
      }

      this.M.clear();
   }

   @Nullable
   public static class04903 N(class04243 var0) {
      class05270 class05270 = var0.y();
      String s = var0.L();
      if (s.isEmpty()) {
         s = "0.0.0.0";
      }

      int ix = class05270.O;
      if (0 < ix && 65535 >= ix) {
         String s1 = class05270.g;
         if (s1.isEmpty()) {
            u.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
         } else {
            try {
               ServerSocket serversocket = new ServerSocket(ix, 0, InetAddress.getByName(s));
               serversocket.setSoTimeout(500);
               class04903 class04903 = new class04903(var0, serversocket, s1);
               if (!class04903.N()) {
                  return null;
               } else {
                  u.info("RCON running on {}:{}", s, ix);
                  return class04903;
               }
            } catch (IOException ioexception) {
               u.warn("Unable to initialise RCON on {}:{}", new Object[]{s, ix, ioexception});
               return null;
            }
         }
      } else {
         u.warn("Invalid rcon port {} found in server.properties, rcon disabled!", ix);
         return null;
      }
   }

   private void N(ServerSocket var1) {
      u.debug("closeSocket: {}", var1);

      try {
         var1.close();
      } catch (IOException ioexception) {
         u.warn("Failed to close socket", ioexception);
      }
   }
}
