package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08338 extends Thread {
   private static final AtomicInteger L = new AtomicInteger(0);
   private static final Logger u = LogUtils.getLogger();
   public static final String N = "224.0.2.60";
   public static final int y = 4445;
   private static final long i = 1500L;
   private final String R;
   private final DatagramSocket M;
   private boolean B = true;
   private final String Z;

   public class08338(String var1, String var2) throws IOException {
      super("LanServerPinger #" + L.incrementAndGet());
      this.R = var1;
      this.Z = var2;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new class07980(u));
      this.M = new DatagramSocket();
   }

   @Override
   public void run() {
      byte[] abyte = N(this.R, this.Z).getBytes(StandardCharsets.UTF_8);

      while (!this.isInterrupted() && this.B) {
         try {
            InetAddress inetaddress = InetAddress.getByName("224.0.2.60");
            DatagramPacket datagrampacket = new DatagramPacket(abyte, abyte.length, inetaddress, 4445);
            this.M.send(datagrampacket);
         } catch (IOException ioexception) {
            u.warn("LanServerPinger: {}", ioexception.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException interruptedexception) {
         }
      }
   }

   @Override
   public void interrupt() {
      super.interrupt();
      this.B = false;
   }

   @Nullable
   public static String y(String var0) {
      int ix = var0.indexOf("[/MOTD]");
      if (ix < 0) {
         return null;
      } else if (var0.indexOf("[/MOTD]", ix + "[/MOTD]".length()) >= 0) {
         return null;
      } else {
         int j = var0.indexOf("[AD]", ix + "[/MOTD]".length());
         if (j < 0) {
            return null;
         } else {
            int k = var0.indexOf("[/AD]", j + "[AD]".length());
            return k < j ? null : var0.substring(j + "[AD]".length(), k);
         }
      }
   }

   public static String N(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String N(String var0) {
      int ix = var0.indexOf("[MOTD]");
      if (ix < 0) {
         return "missing no";
      } else {
         int j = var0.indexOf("[/MOTD]", ix + "[MOTD]".length());
         return j < ix ? "missing no" : var0.substring(ix + "[MOTD]".length(), j);
      }
   }
}
