package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05628 {
   private static final Logger y = LogUtils.getLogger();
   public static final String N = "screenshots";

   public class05628() {
      super();
   }

   public static void N(File var0, @Nullable String var1, class08066 var2, int var3, Consumer<class00392> var4) {
      N(
         var2,
         var3,
         var3x -> {
            File file1 = new File(var0, "screenshots");
            file1.mkdir();
            File file2;
            if (var1 == null) {
               file2 = N(file1);
            } else {
               file2 = new File(file1, var1);
            }

            class07536.Z()
               .execute(
                  () -> {
                     try {
                        class08280 class08280 = var3x;

                        try {
                           var3x.N(file2);
                           class05216 class05216 = class00392.y(file2.getName())
                              .N(class06541.field_1073)
                              .N(var1xxx -> var1xxx.N(new class00623(file2.getAbsoluteFile())));
                           var4.accept(class00392.N("screenshot.success", class05216));
                        } catch (Throwable throwable1) {
                           if (var3x != null) {
                              try {
                                 class08280.close();
                              } catch (Throwable throwable) {
                                 throwable1.addSuppressed(throwable);
                              }
                           }

                           throw throwable1;
                        }

                        if (var3x != null) {
                           var3x.close();
                        }
                     } catch (Exception exception) {
                        y.warn("Couldn't save screenshot", exception);
                        var4.accept(class00392.N("screenshot.failure", exception.getMessage()));
                     }
                  }
               );
         }
      );
   }

   public static void N(class08066 var0, Consumer<class08280> var1) {
      N(var0, 1, var1);
   }

   public static void N(class08066 var0, int var1, Consumer<class08280> var2) {
      int i = var0.N;
      int j = var0.y;
      GpuTexture gputexture = var0.L();
      if (gputexture == null) {
         throw new IllegalStateException("Tried to capture screenshot of an incomplete framebuffer");
      } else if (i % var1 == 0 && j % var1 == 0) {
         GpuBuffer gpubuffer = RenderSystem.getDevice().createBuffer(() -> "Screenshot buffer", 9, (long)i * j * gputexture.getFormat().pixelSize());
         CommandEncoder commandencoder = RenderSystem.getDevice().createCommandEncoder();
         RenderSystem.getDevice().createCommandEncoder().copyTextureToBuffer(gputexture, gpubuffer, 0L, () -> {
            MappedView mappedview = commandencoder.mapBuffer(gpubuffer, true, false);

            try {
               int ix = j / var1;
               int jx = i / var1;
               class08280 class08280 = new class08280(jx, ix, false);

               for (int k = 0; k < ix; k++) {
                  for (int l = 0; l < jx; l++) {
                     if (var1 == 1) {
                        int k2 = mappedview.data().getInt((l + k * i) * gputexture.getFormat().pixelSize());
                        class08280.N(l, j - k - 1, k2 | 0xFF000000);
                     } else {
                        int i1 = 0;
                        int j1 = 0;
                        int k1 = 0;

                        for (int l1 = 0; l1 < var1; l1++) {
                           for (int i2 = 0; i2 < var1; i2++) {
                              int j2 = mappedview.data().getInt((l * var1 + l1 + (k * var1 + i2) * i) * gputexture.getFormat().pixelSize());
                              i1 += class02566.L(j2);
                              j1 += class02566.u(j2);
                              k1 += class02566.i(j2);
                           }
                        }

                        int l2 = var1 * var1;
                        class08280.N(l, ix - k - 1, class02566.y(255, i1 / l2, j1 / l2, k1 / l2));
                     }
                  }
               }

               var2.accept(class08280);
            } catch (Throwable throwable1) {
               if (mappedview != null) {
                  try {
                     mappedview.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (mappedview != null) {
               mappedview.close();
            }

            gpubuffer.close();
         }, 0);
      } else {
         throw new IllegalArgumentException("Image size is not divisible by downscale factor");
      }
   }

   private static File N(File var0) {
      String s = class07536.R();
      int i = 1;

      while (true) {
         File file1 = new File(var0, s + (i == 1 ? "" : "_" + i) + ".png");
         if (!file1.exists()) {
            return file1;
         }

         i++;
      }
   }

   public static void N(File var0, class08066 var1, Consumer<class00392> var2) {
      N(var0, null, var1, 1, var2);
   }
}
