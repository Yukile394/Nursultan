package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08829 extends class08918 implements class03609 {
   private static final Logger field_25794 = LogUtils.getLogger();
   @Nullable
   private class08280 field_5200;

   public class08829(Supplier<String> var1, int var2, int var3, boolean var4) {
      super();
      this.field_5200 = new class08280(var2, var3, var4);
      this.method_71142(var1);
   }

   public class08829(String var1, int var2, int var3, boolean var4) {
      super();
      this.field_5200 = new class08280(var2, var3, var4);
      this.method_71141(var1);
   }

   public class08829(Supplier<String> var1, class08280 var2) {
      super();
      this.field_5200 = var2;
      this.method_71142(var1);
      this.method_4524();
   }

   @Override
   public void close() {
      if (this.field_5200 != null) {
         this.field_5200.close();
         this.field_5200 = null;
      }

      super.close();
   }

   public void method_4526(class08280 var1) {
      if (this.field_5200 != null) {
         this.field_5200.close();
      }

      this.field_5200 = var1;
   }

   @Override
   public void method_49712(class01894 var1, Path var2) throws IOException {
      if (this.field_5200 != null) {
         String s = var1.L() + ".png";
         Path path = var2.resolve(s);
         this.field_5200.N(path);
      }
   }

   private void method_71141(String var1) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.field_56974 = gpudevice.createTexture(var1, 5, TextureFormat.RGBA8, this.field_5200.N(), this.field_5200.y(), 1, 1);
      this.field_63613 = RenderSystem.getSamplerCache().y(FilterMode.NEAREST);
      this.field_60597 = gpudevice.createTextureView(this.field_56974);
   }

   private void method_71142(Supplier<String> var1) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.field_56974 = gpudevice.createTexture(var1, 5, TextureFormat.RGBA8, this.field_5200.N(), this.field_5200.y(), 1, 1);
      this.field_63613 = RenderSystem.getSamplerCache().y(FilterMode.NEAREST);
      this.field_60597 = gpudevice.createTextureView(this.field_56974);
   }

   public void method_4524() {
      if (this.field_5200 != null && this.field_56974 != null) {
         RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.field_56974, this.field_5200);
      } else {
         field_25794.warn("Trying to upload disposed texture {}", this.method_68004().getLabel());
      }
   }

   @Nullable
   public class08280 method_4525() {
      return this.field_5200;
   }
}
