package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;

public class class08998 extends class08361 {
   private static final String[] N = new String[]{"_1.png", "_3.png", "_5.png", "_4.png", "_0.png", "_2.png"};

   public class08998(class01894 var1) {
      super(var1);
   }

   @Override
   public class08354 method_65809(class01089 var1) throws IOException {
      class01894 class01894 = this.method_65859();

      class08354 class08354;
      try (class08354 class08354x = class08354.N(var1, class01894.M(N[0]))) {
         int i = class08354x.u().N();
         int j = class08354x.u().y();
         class08280 class08280 = new class08280(i, j * 6, false);
         class08354x.u().N(class08280, 0, 0, 0, 0, i, j, false, true);

         for (int k = 1; k < 6; k++) {
            try (class08354 class08354xx = class08354.N(var1, class01894.M(N[k]))) {
               if (class08354xx.u().N() != i || class08354xx.u().y() != j) {
                  throw new IOException(
                     "Image dimensions of cubemap '"
                        + class01894
                        + "' sides do not match: part 0 is "
                        + i
                        + "x"
                        + j
                        + ", but part "
                        + k
                        + " is "
                        + class08354xx.u().N()
                        + "x"
                        + class08354xx.u().y()
                  );
               }

               class08354xx.u().N(class08280, 0, 0, 0, k * j, i, j, false, true);
            }
         }

         class08354 = new class08354(class08280, new class08500(true, false, class06846.field_64077, 0.0F));
      }

      return class08354;
   }

   @Override
   protected void method_65856(class08280 var1) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      int i = var1.N();
      int j = var1.y() / 6;
      this.close();
      this.field_56974 = gpudevice.createTexture(this.method_65859()::toString, 21, TextureFormat.RGBA8, i, j, 6, 1);
      this.field_60597 = gpudevice.createTextureView(this.field_56974);

      for (int k = 0; k < 6; k++) {
         gpudevice.createCommandEncoder().writeToTexture(this.field_56974, var1, 0, k, 0, 0, i, j, 0, j * k);
      }
   }
}
