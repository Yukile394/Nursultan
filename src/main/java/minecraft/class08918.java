package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.AbstractTextureExtended;
import net.irisshaders.iris.pbr.TextureTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class08918 implements AutoCloseable, AbstractTextureExtended {
   @Nullable
   protected GpuTexture field_56974;
   @Nullable
   protected GpuTextureView field_60597;
   protected class08188 field_63613 = RenderSystem.getSamplerCache().N(AddressMode.REPEAT, AddressMode.REPEAT, FilterMode.NEAREST, FilterMode.LINEAR, false);
   private GpuTexture lastChecked;

   public class08918() {
      super();
   }

   @Override
   public void close() {
      if (this.field_56974 != null) {
         this.field_56974.close();
         this.field_56974 = null;
      }

      if (this.field_60597 != null) {
         this.field_60597.close();
         this.field_60597 = null;
      }
   }

   public GpuTextureView method_71659() {
      if (this.field_60597 == null) {
         throw new IllegalStateException("Texture view does not exist, can't get it before something initializes it");
      } else {
         return this.field_60597;
      }
   }

   public class08188 method_75484() {
      return this.field_63613;
   }

   public GpuTexture method_68004() {
      if (this.field_56974 == null) {
         throw new IllegalStateException("Texture does not exist, can't get it before something initializes it");
      } else {
         GpuTexture gputexture;
         GpuTexture gputexture1 = gputexture = this.field_56974;
         this.handler$bhc000$iris$afterGenerateId(new CallbackInfoReturnable("", false, gputexture));
         return gputexture1;
      }
   }

   private void iris$setFilter(boolean var1, boolean var2, CallbackInfo var3) {
      this.onSet(var1, var2);
   }

   private void onSet(boolean var1, boolean var2) {
      if (!var1) {
         if (this instanceof class08361 class08361x) {
            Iris.logger.warn(class08361x.method_65859() + " was set to nearest");
         } else if (this instanceof class08626 class08626x) {
            Iris.logger.warn(class08626x.i() + " was set to nearest");
         }
      } else if (this instanceof class08361 class08361) {
         Iris.logger.warn(class08361.method_65859() + " was set to linear");
      } else if (this instanceof class08626 class08626) {
         Iris.logger.warn(class08626.i() + " was set to linear");
      }
   }

   private void handler$bhc000$iris$afterGenerateId(CallbackInfoReturnable var1) {
      if (this.lastChecked != var1.getReturnValue()) {
         this.lastChecked = (GpuTexture)var1.getReturnValue();
         TextureTracker.INSTANCE.trackTexture(this.lastChecked.iris$getGlId(), this);
      }
   }
}
