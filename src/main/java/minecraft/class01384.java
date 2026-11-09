package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;

public class class01384 implements AutoCloseable {
   private static final int i = 16;
   public static final int N = 0;
   public static final int y = 3;
   public static final int L = 10;
   public static final int u = N(0, 10);
   private final class08829 R = new class08829("Entity Color Overlay", 16, 16, false);

   public class01384() {
      super();
      class08280 class08280 = this.R.method_4525();

      for (int ix = 0; ix < 16; ix++) {
         for (int j = 0; j < 16; j++) {
            if (ix < 8) {
               class08280.y(j, ix, -1291911168);
            } else {
               int k = (int)((1.0F - j / 15.0F * 0.75F) * 255.0F);
               class08280.y(j, ix, class02566.Z(k));
            }
         }
      }

      this.R.method_4524();
   }

   @Override
   public void close() {
      this.R.close();
   }

   public static int N(float var0, boolean var1) {
      return N(N(var0), N(var1));
   }

   public static int N(int var0, int var1) {
      return var0 | var1 << 16;
   }

   public GpuTextureView N() {
      return this.R.method_71659();
   }

   public static int N(boolean var0) {
      return var0 ? 3 : 10;
   }

   public static int N(float var0) {
      return (int)(var0 * 15.0F);
   }
}
