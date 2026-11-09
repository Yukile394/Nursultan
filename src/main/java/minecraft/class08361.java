package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.IOException;
import net.irisshaders.iris.mixin.texture.ReloadableTextureAccessor;
import net.irisshaders.iris.pbr.TextureTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class08361 extends class08918 implements ReloadableTextureAccessor {
   private final class01894 field_55529;

   public class08361(class01894 var1) {
      super();
      this.field_55529 = var1;
   }

   public class01894 method_65859() {
      return this.field_55529;
   }

   private void handler$bhi000$iris$onDoLoad(class08280 var1, CallbackInfo var2) {
      TextureTracker.INSTANCE.trackTexture(this.field_56974.iris$getGlId(), this);
   }

   public abstract class08354 method_65809(class01089 var1) throws IOException;

   protected void method_65856(class08280 var1) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.close();
      this.field_56974 = gpudevice.createTexture(this.field_55529::toString, 5, TextureFormat.RGBA8, var1.N(), var1.y(), 1, 1);
      this.field_60597 = gpudevice.createTextureView(this.field_56974);
      gpudevice.createCommandEncoder().writeToTexture(this.field_56974, var1);
      this.handler$bhi000$iris$onDoLoad(var1, null);
   }

   public void method_65857(class08354 var1) {
      boolean flag = var1.L();
      boolean flag1 = var1.y();
      AddressMode addressmode = flag ? AddressMode.CLAMP_TO_EDGE : AddressMode.REPEAT;
      FilterMode filtermode = flag1 ? FilterMode.LINEAR : FilterMode.NEAREST;
      this.field_63613 = RenderSystem.getSamplerCache().N(addressmode, addressmode, filtermode, filtermode, false);

      try (class08280 class08280 = var1.u()) {
         this.method_65856(class08280);
      }
   }
}
