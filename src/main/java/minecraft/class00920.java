package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

record class00920(
   class03504 renderTypes, GpuTextureView textureView, class08388 sprite, float x, float y, int color, int shadowColor, float shadowOffset, class00405 style
) implements class06596 {
   public class03504 L() {
      return this.renderTypes;
   }

   @Override
   public int M() {
      return this.color;
   }

   class00920(
      class03504 renderTypes, GpuTextureView textureView, class08388 sprite, float x, float y, int color, int shadowColor, float shadowOffset, class00405 style
   ) {
      super();
      this.renderTypes = renderTypes;
      this.textureView = textureView;
      this.sprite = sprite;
      this.x = x;
      this.y = y;
      this.color = color;
      this.shadowColor = shadowColor;
      this.shadowOffset = shadowOffset;
      this.style = style;
   }

   @Override
   public int B() {
      return this.shadowColor;
   }

   @Override
   public float Z() {
      return this.shadowOffset;
   }

   @Override
   public float i() {
      return this.x;
   }

   @Override
   public class00405 z() {
      return this.style;
   }

   public class08388 u() {
      return this.sprite;
   }

   @Override
   public GpuTextureView y() {
      return this.textureView;
   }

   private void N(CallbackInfo var1) {
      SpriteUtil.INSTANCE.markSpriteActive(this.sprite);
   }

   @Override
   public class07311 N(class01583 var1) {
      return this.renderTypes.N(var1);
   }

   @Override
   public RenderPipeline N() {
      return this.renderTypes.u();
   }

   @Override
   public void N(Matrix4f var1, class01391 var2, int var3, float var4, float var5, float var6, int var7) {
      this.N(null);
      float f = var4 + this.U();
      float f1 = var4 + this.W();
      float f2 = var5 + this.E();
      float f3 = var5 + this.m();
      var2.N(var1, f, f2, var6).method_22913(this.sprite.method_4594(), this.sprite.method_4593()).method_39415(var7).method_60803(var3);
      var2.N(var1, f, f3, var6).method_22913(this.sprite.method_4594(), this.sprite.method_4575()).method_39415(var7).method_60803(var3);
      var2.N(var1, f1, f3, var6).method_22913(this.sprite.method_4577(), this.sprite.method_4575()).method_39415(var7).method_60803(var3);
      var2.N(var1, f1, f2, var6).method_22913(this.sprite.method_4577(), this.sprite.method_4593()).method_39415(var7).method_60803(var3);
   }

   @Override
   public float R() {
      return this.y;
   }
}
