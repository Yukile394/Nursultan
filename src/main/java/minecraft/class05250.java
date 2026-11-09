package minecraft;

import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.file.Path;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class05250 extends class08918 implements class03609 {
   private static final int N = 256;
   private final class03504 y;
   private final boolean L;
   private final class05276 u;

   public class05250(Supplier<String> var1, class03504 var2, boolean var3) {
      super();
      this.L = var3;
      this.u = new class05276(0, 0, 256, 256);
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.field_56974 = gpudevice.createTexture(var1, 7, var3 ? TextureFormat.RGBA8 : TextureFormat.RED8, 256, 256, 1, 1);
      this.field_63613 = RenderSystem.getSamplerCache().y(FilterMode.NEAREST);
      this.field_60597 = gpudevice.createTextureView(this.field_56974);
      this.y = var2;
   }

   @Nullable
   public class05272 N(class05247 var1, class05237 var2) {
      if (var2.method_2033() != this.L) {
         return null;
      } else {
         class05276 class05276 = this.u.N(var2);
         if (class05276 != null) {
            var2.method_2030(class05276.N, class05276.y, this.method_68004());
            float f = 256.0F;
            float f1 = 256.0F;
            float f2 = 0.01F;
            return new class05272(
               var1,
               this.y,
               this.method_71659(),
               (class05276.N + 0.01F) / 256.0F,
               (class05276.N - 0.01F + var2.method_2031()) / 256.0F,
               (class05276.y + 0.01F) / 256.0F,
               (class05276.y - 0.01F + var2.method_2032()) / 256.0F,
               var2.N(),
               var2.y(),
               var2.L(),
               var2.u()
            );
         } else {
            return null;
         }
      }
   }

   @Override
   public void method_49712(class01894 var1, Path var2) {
      if (this.field_56974 != null) {
         String s = var1.L();
         TextureUtil.writeAsPNG(var2, s, this.field_56974, 0, var0 -> (var0 & 0xFF000000) == 0 ? -16777216 : var0);
      }
   }
}
