package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.List;
import me.flashyreese.mods.sodiumextra.common.util.AnimationStateExtended;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteContentsExtension;
import net.irisshaders.iris.mixin.texture.SpriteContentsTickerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02011 implements AutoCloseable, AnimationStateExtended, SpriteContentsTickerAccessor {
   private int N;
   private int y;
   private final class02034 L;
   private final Int2ObjectMap<GpuTextureView> u;
   private final GpuBufferSlice[] i;
   private boolean R;
   private class01991 M;
   private boolean B = false;
   private boolean Z = false;
   private class08388 z;

   class02011(class02034 var1, Int2ObjectMap<GpuTextureView> var2, GpuBufferSlice[] var3, GpuBufferSlice[] var4) {
      super();
      this.R = true;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.N(var1, var2, var3, var4, null);
   }

   @Override
   public void close() {
      ObjectIterator<GpuTextureView> objectiterator = this.u.values().iterator();

      while (objectiterator.hasNext()) {
         GpuTextureView gputextureview = (GpuTextureView)objectiterator.next();
         gputextureview.texture().close();
         gputextureview.close();
      }
   }

   public boolean y() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.L.y || this.R;
   }

   private void N(CallbackInfo var1) {
      SpriteContentsExtension spritecontentsextension = this.M;
      this.Z = spritecontentsextension.sodium$isActive();
      spritecontentsextension.sodium$setActive(false);
   }

   public void N(class01991 var1, class02034 var2, Int2ObjectMap var3, GpuBufferSlice[] var4, CallbackInfo var5) {
      this.M = var1;
   }

   private void N(CallbackInfoReturnable var1) {
      boolean flag = SodiumClientMod.options().performance.animateOnlyVisibleTextures;
      if (!this.B) {
         if (this.N != this.L.N.size() - 1) {
            return;
         }

         this.B = true;
      }

      if (flag && !this.Z) {
         var1.setReturnValue(false);
      }
   }

   public void N() {
      this.N(null);
      this.y++;
      this.R = false;
      class02007 class02007 = this.L.N.get(this.N);
      if (this.y >= class02007.y()) {
         int ix = class02007.getIndex();
         this.N = (this.N + 1) % this.L.N.size();
         this.y = 0;
         int j = this.L.N.get(this.N).getIndex();
         if (ix != j) {
            this.R = true;
         }
      }
   }

   public GpuBufferSlice N(int var1) {
      return this.i[var1];
   }

   public void N(RenderPass var1, GpuBufferSlice var2) {
      class08188 class08188 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST, true);
      List<class02007> list = this.L.N;
      int ix = list.get(this.N).getIndex();
      int j = (int)((float)this.y / this.L.N.get(this.N).y() * 1000.0F);
      if (this.L.y) {
         int k = list.get((this.N + 1) % list.size()).getIndex();
         var1.setPipeline(class08394.yM);
         var1.bindTexture("CurrentSprite", (GpuTextureView)this.u.get(ix), class08188);
         var1.bindTexture("NextSprite", (GpuTextureView)this.u.get(k), class08188);
      } else if (this.R) {
         var1.setPipeline(class08394.yR);
         var1.bindTexture("Sprite", (GpuTextureView)this.u.get(ix), class08188);
      }

      var1.setUniform("SpriteAnimationInfo", var2);
      var1.draw(j << 3, 6);
   }

   public class08388 sodium_extra$getSprite() {
      return this.z;
   }

   public void sodium_extra$setSprite(class08388 var1) {
      this.z = var1;
   }
}
