package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.slf4j.Logger;

public class class06459 extends class05149 {
   private static final Logger u = LogUtils.getLogger();
   private static final int i = 3;
   private static final int R = 2;
   private static final int M = 0;
   private static final int B = 2;
   private static final int Z = -1;
   private boolean z;
   private final Socket U;
   private final byte[] E = new byte[1460];
   private final String W;
   private final class04243 m;

   class06459(class04243 var1, String var2, Socket var3) {
      super("RCON Client " + var3.getInetAddress());
      this.m = var1;
      this.U = var3;

      try {
         this.U.setSoTimeout(0);
      } catch (Exception exception) {
         this.N = false;
      }

      this.W = var2;
   }

   @Override
   public void run() {
      try {
         try {
            while (this.N) {
               BufferedInputStream bufferedinputstream = new BufferedInputStream(this.U.getInputStream());
               int ix = bufferedinputstream.read(this.E, 0, 1460);
               if (10 > ix) {
                  return;
               }

               int j = 0;
               if (class05183.y(this.E, 0, ix) != ix - 4) {
                  return;
               }

               j += 4;
               int k = class05183.y(this.E, j, ix);
               j += 4;
               int l = class05183.N(this.E, j);
               j += 4;
               switch (l) {
                  case 2:
                     if (this.z) {
                        String s1 = class05183.N(this.E, j, ix);

                        try {
                           this.N(k, this.m.N(s1));
                        } catch (Exception exception) {
                           this.N(k, "Error executing: " + s1 + " (" + exception.getMessage() + ")");
                        }
                        break;
                     }

                     this.u();
                     break;
                  case 3:
                     String s = class05183.N(this.E, j, ix);
                     j += s.length();
                     if (!s.isEmpty() && s.equals(this.W)) {
                        this.z = true;
                        this.N(k, 2, "");
                        break;
                     }

                     this.z = false;
                     this.u();
                     break;
                  default:
                     this.N(k, String.format(Locale.ROOT, "Unknown request %s", Integer.toHexString(l)));
               }
            }

            return;
         } catch (IOException ioexception) {
         } catch (Exception exception1) {
            u.error("Exception whilst parsing RCON input", exception1);
         }
      } finally {
         this.i();
         u.info("Thread {} shutting down", this.y);
         this.N = false;
      }
   }

   private void i() {
      try {
         this.U.close();
      } catch (IOException ioexception) {
         u.warn("Failed to close socket", ioexception);
      }
   }

   private void u() throws IOException {
      this.N(-1, 2, "");
   }

   @Override
   public void y() {
      this.N = false;
      this.i();
      super.y();
   }

   private void N(int var1, String var2) throws IOException {
      int ix = var2.length();

      do {
         int j = 4096 <= ix ? 4096 : ix;
         this.N(var1, 0, var2.substring(0, j));
         var2 = var2.substring(j);
         ix = var2.length();
      } while (0 != ix);
   }

   private void N(int var1, int var2, String var3) throws IOException {
      ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(1248);
      DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
      byte[] abyte = var3.getBytes(StandardCharsets.UTF_8);
      dataoutputstream.writeInt(Integer.reverseBytes(abyte.length + 10));
      dataoutputstream.writeInt(Integer.reverseBytes(var1));
      dataoutputstream.writeInt(Integer.reverseBytes(var2));
      dataoutputstream.write(abyte);
      dataoutputstream.write(0);
      dataoutputstream.write(0);
      this.U.getOutputStream().write(bytearrayoutputstream.toByteArray());
   }
}
