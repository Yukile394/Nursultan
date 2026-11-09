package minecraft;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class class08293 extends Thread {
   private final class08311 N;
   private final InetAddress y;
   private final MulticastSocket L;

   public class08293(class08311 var1) throws IOException {
      super("LanServerDetector #" + class08309.N.incrementAndGet());
      this.N = var1;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new class07980(class08309.y));
      this.L = new MulticastSocket(4445);
      this.y = InetAddress.getByName("224.0.2.60");
      this.L.setSoTimeout(5000);
      this.L.joinGroup(this.y);
   }

   @Override
   public void run() {
      byte[] abyte = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket datagrampacket = new DatagramPacket(abyte, abyte.length);

         try {
            this.L.receive(datagrampacket);
         } catch (SocketTimeoutException sockettimeoutexception) {
            continue;
         } catch (IOException ioexception1) {
            class08309.y.error("Couldn't ping server", ioexception1);
            break;
         }

         String s = new String(datagrampacket.getData(), datagrampacket.getOffset(), datagrampacket.getLength(), StandardCharsets.UTF_8);
         class08309.y.debug("{}: {}", datagrampacket.getAddress(), s);
         this.N.N(s, datagrampacket.getAddress());
      }

      try {
         this.L.leaveGroup(this.y);
      } catch (IOException ioexception) {
      }

      this.L.close();
   }
}
