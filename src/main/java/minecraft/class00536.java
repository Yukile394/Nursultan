package minecraft;

import java.util.Arrays;
import org.jspecify.annotations.Nullable;

public class class00536 {
   public static final int N = 16;
   public static final int y = 128;
   public static final int L = 2048;
   private static final int i = 4;
   @Nullable
   protected byte[] u;
   private int R;

   public boolean L(int var1) {
      return this.u == null && this.R == var1;
   }

   public boolean L() {
      return this.u == null;
   }

   private static byte M(int var0) {
      byte b0 = (byte)var0;

      for (byte b1 = 4; b1 < 8; b1 += 4) {
         b0 = (byte)(b0 | var0 << b1);
      }

      return b0;
   }

   public class00536() {
      this(0);
   }

   public class00536(int var1) {
      super();
      this.R = var1;
   }

   public class00536(byte[] var1) {
      super();
      this.u = var1;
      this.R = 0;
      if (var1.length != 2048) {
         throw (IllegalArgumentException)class07536.y(new IllegalArgumentException("DataLayer should be 2048 bytes not: " + var1.length));
      }
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder();

      for (int ix = 0; ix < 4096; ix++) {
         stringbuilder.append(Integer.toHexString(this.u(ix)));
         if ((ix & 15) == 15) {
            stringbuilder.append("\n");
         }

         if ((ix & 0xFF) == 255) {
            stringbuilder.append("\n");
         }
      }

      return stringbuilder.toString();
   }

   private static int i(int var0) {
      return var0 & 1;
   }

   public boolean u() {
      return this.u == null && this.R == 0;
   }

   private int u(int var1) {
      if (this.u == null) {
         return this.R;
      } else {
         int ix = R(var1);
         int j = i(var1);
         return this.u[ix] >> 4 * j & 15;
      }
   }

   public String y(int var1) {
      StringBuilder stringbuilder = new StringBuilder();

      for (int ix = 0; ix < 256; ix++) {
         stringbuilder.append(Integer.toHexString(this.u(ix)));
         if ((ix & 15) == 15) {
            stringbuilder.append("\n");
         }
      }

      return stringbuilder.toString();
   }

   public class00536 y() {
      return this.u == null ? new class00536(this.R) : new class00536((byte[])this.u.clone());
   }

   private static int y(int var0, int var1, int var2) {
      return var1 << 8 | var2 << 4 | var0;
   }

   public int N(int var1, int var2, int var3) {
      return this.u(y(var1, var2, var3));
   }

   public void N(int var1, int var2, int var3, int var4) {
      this.N(y(var1, var2, var3), var4);
   }

   public void N(int var1) {
      this.R = var1;
      this.u = null;
   }

   public byte[] N() {
      if (this.u == null) {
         this.u = new byte[2048];
         if (this.R != 0) {
            Arrays.fill(this.u, M(this.R));
         }
      }

      return this.u;
   }

   private void N(int var1, int var2) {
      byte[] abyte = this.N();
      int ix = R(var1);
      int j = i(var1);
      int k = ~(15 << 4 * j);
      int l = (var2 & 15) << 4 * j;
      abyte[ix] = (byte)(abyte[ix] & k | l);
   }

   private static int R(int var0) {
      return var0 >> 1;
   }
}
