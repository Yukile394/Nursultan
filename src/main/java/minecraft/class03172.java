package minecraft;

import java.io.IOException;
import java.io.InputStream;

public class class03172 extends InputStream {
   private static final int N = 8192;
   private final InputStream y;
   private final byte[] L;
   private int u;
   private int i;

   public class03172(InputStream var1) {
      this(var1, 8192);
   }

   public class03172(InputStream var1, int var2) {
      super();
      this.y = var1;
      this.L = new byte[var2];
   }

   @Override
   public int read(byte[] var1, int var2, int var3) throws IOException {
      int ix = this.N();
      if (ix <= 0) {
         if (var3 >= this.L.length) {
            return this.y.read(var1, var2, var3);
         }

         this.y();
         ix = this.N();
         if (ix <= 0) {
            return -1;
         }
      }

      if (var3 > ix) {
         var3 = ix;
      }

      System.arraycopy(this.L, this.i, var1, var2, var3);
      this.i += var3;
      return var3;
   }

   @Override
   public int read() throws IOException {
      if (this.i >= this.u) {
         this.y();
         if (this.i >= this.u) {
            return -1;
         }
      }

      return Byte.toUnsignedInt(this.L[this.i++]);
   }

   @Override
   public void close() throws IOException {
      this.y.close();
   }

   @Override
   public long skip(long var1) throws IOException {
      if (var1 <= 0L) {
         return 0L;
      } else {
         long ix = this.N();
         if (ix <= 0L) {
            return this.y.skip(var1);
         } else {
            if (var1 > ix) {
               var1 = ix;
            }

            this.i = (int)(this.i + var1);
            return var1;
         }
      }
   }

   @Override
   public int available() throws IOException {
      return this.N() + this.y.available();
   }

   private void y() throws IOException {
      this.u = 0;
      this.i = 0;
      int ix = this.y.read(this.L, 0, this.L.length);
      if (ix > 0) {
         this.u = ix;
      }
   }

   private int N() {
      return this.u - this.i;
   }
}
