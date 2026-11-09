package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05178 extends class05149 {
   private static final Logger u = LogUtils.getLogger();
   private static final String i = "SMP";
   private static final String R = "MINECRAFT";
   private static final long M = 30000L;
   private static final long B = 5000L;
   private long Z;
   private final int z;
   private final int U;
   private final int E;
   private final String W;
   private final String m;
   private DatagramSocket P;
   private final byte[] s = new byte[1460];
   private String T;
   private String b;
   private final Map<SocketAddress, class05150> j;
   private final class05164 v;
   private long n;
   private final class04243 t;

   private Boolean L(DatagramPacket var1) {
      SocketAddress socketaddress = var1.getSocketAddress();
      if (!this.j.containsKey(socketaddress)) {
         return false;
      } else {
         byte[] abyte = var1.getData();
         return this.j.get(socketaddress).N() == class05183.L(abyte, 7, var1.getLength());
      }
   }

   private class05178(class04243 var1, int var2) {
      super("Query Listener");
      this.t = var1;
      this.z = var2;
      this.b = var1.L();
      this.U = var1.u();
      this.W = var1.i();
      this.E = var1.t();
      this.m = var1.W();
      this.n = 0L;
      this.T = "0.0.0.0";
      if (!this.b.isEmpty() && !this.T.equals(this.b)) {
         this.T = this.b;
      } else {
         this.b = "0.0.0.0";

         try {
            InetAddress inetaddress = InetAddress.getLocalHost();
            this.T = inetaddress.getHostAddress();
         } catch (UnknownHostException unknownhostexception) {
            u.warn("Unable to determine local host IP, please set server-ip in server.properties", unknownhostexception);
         }
      }

      this.v = new class05164(1460);
      this.j = Maps.newHashMap();
   }

   @Override
   public void run() {
      u.info("Query running on {}:{}", this.b, this.z);
      this.Z = class07536.L();
      DatagramPacket datagrampacket = new DatagramPacket(this.s, this.s.length);

      try {
         while (this.N) {
            try {
               this.P.receive(datagrampacket);
               this.u();
               this.N(datagrampacket);
            } catch (SocketTimeoutException sockettimeoutexception) {
               this.u();
            } catch (PortUnreachableException portunreachableexception) {
            } catch (IOException ioexception) {
               this.N(ioexception);
            }
         }
      } finally {
         u.debug("closeSocket: {}:{}", this.b, this.z);
         this.P.close();
      }
   }

   private boolean i() {
      try {
         this.P = new DatagramSocket(this.z, InetAddress.getByName(this.b));
         this.P.setSoTimeout(500);
         return true;
      } catch (Exception exception) {
         u.warn("Unable to initialise query system on {}:{}", new Object[]{this.b, this.z, exception});
         return false;
      }
   }

   private void u() {
      if (this.N) {
         long ix = class07536.L();
         if (ix >= this.Z + 30000L) {
            this.Z = ix;
            this.j.values().removeIf(var2 -> var2.N(ix));
         }
      }
   }

   private void u(DatagramPacket var1) throws IOException {
      class05150 class05150 = new class05150(var1);
      this.j.put(var1.getSocketAddress(), class05150);
      this.N(class05150.y(), var1);
   }

   private byte[] y(DatagramPacket var1) throws IOException {
      long ix = class07536.L();
      if (ix < this.n + 5000L) {
         byte[] abyte = this.v.N();
         byte[] abyte1 = this.N(var1.getSocketAddress());
         abyte[1] = abyte1[0];
         abyte[2] = abyte1[1];
         abyte[3] = abyte1[2];
         abyte[4] = abyte1[3];
         return abyte;
      } else {
         this.n = ix;
         this.v.y();
         this.v.N(0);
         this.v.N(this.N(var1.getSocketAddress()));
         this.v.N("splitnum");
         this.v.N(128);
         this.v.N(0);
         this.v.N("hostname");
         this.v.N(this.W);
         this.v.N("gametype");
         this.v.N("SMP");
         this.v.N("game_id");
         this.v.N("MINECRAFT");
         this.v.N("version");
         this.v.N(this.t.w());
         this.v.N("plugins");
         this.v.N(this.t.s());
         this.v.N("map");
         this.v.N(this.m);
         this.v.N("numplayers");
         this.v.N(this.t.Q() + "");
         this.v.N("maxplayers");
         this.v.N(this.E + "");
         this.v.N("hostport");
         this.v.N(this.U + "");
         this.v.N("hostip");
         this.v.N(this.T);
         this.v.N(0);
         this.v.N(1);
         this.v.N("player_");
         this.v.N(0);
         String[] astring = this.t.z_();

         for (String sx : astring) {
            this.v.N(sx);
         }

         this.v.N(0);
         return this.v.N();
      }
   }

   private void N(Exception var1) {
      if (this.N) {
         u.warn("Unexpected exception", var1);
         if (!this.i()) {
            u.error("Failed to recover from exception, shutting down!");
            this.N = false;
         }
      }
   }

   private boolean N(DatagramPacket var1) throws IOException {
      byte[] abyte = var1.getData();
      int ix = var1.getLength();
      SocketAddress socketaddress = var1.getSocketAddress();
      u.debug("Packet len {} [{}]", ix, socketaddress);
      if (3 <= ix && -2 == abyte[0] && -3 == abyte[1]) {
         u.debug("Packet '{}' [{}]", class05183.N(abyte[2]), socketaddress);
         switch (abyte[2]) {
            case 0:
               if (!this.L(var1)) {
                  u.debug("Invalid challenge [{}]", socketaddress);
                  return false;
               } else if (15 == ix) {
                  this.N(this.y(var1), var1);
                  u.debug("Rules [{}]", socketaddress);
               } else {
                  class05164 class05164 = new class05164(1460);
                  class05164.N(0);
                  class05164.N(this.N(var1.getSocketAddress()));
                  class05164.N(this.W);
                  class05164.N("SMP");
                  class05164.N(this.m);
                  class05164.N(Integer.toString(this.t.Q()));
                  class05164.N(Integer.toString(this.E));
                  class05164.N((short)this.U);
                  class05164.N(this.T);
                  this.N(class05164.N(), var1);
                  u.debug("Status [{}]", socketaddress);
               }
            default:
               return true;
            case 9:
               this.u(var1);
               u.debug("Challenge [{}]", socketaddress);
               return true;
         }
      } else {
         u.debug("Invalid packet [{}]", socketaddress);
         return false;
      }
   }

   @Nullable
   public static class05178 N(class04243 var0) {
      int ix = var0.y().Y;
      if (0 < ix && 65535 >= ix) {
         class05178 class05178 = new class05178(var0, ix);
         return !class05178.N() ? null : class05178;
      } else {
         u.warn("Invalid query port {} found in server.properties (queries disabled)", ix);
         return null;
      }
   }

   private void N(byte[] var1, DatagramPacket var2) throws IOException {
      this.P.send(new DatagramPacket(var1, var1.length, var2.getSocketAddress()));
   }

   private byte[] N(SocketAddress var1) {
      return this.j.get(var1).L();
   }

   @Override
   public boolean N() {
      if (this.N) {
         return true;
      } else {
         return !this.i() ? false : super.N();
      }
   }
}
