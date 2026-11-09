package minecraft;

import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05848 extends class04406 {
   protected float field_17867;
   protected float field_62633 = 1.0F;
   protected float field_62634 = 1.0F;
   protected float field_62635 = 1.0F;
   protected float field_62636 = 1.0F;
   protected float field_62637;
   protected float field_62638;
   protected class08388 field_62632;
   private boolean shouldTickSprite;

   public class05848(class03448 var1, double var2, double var4, double var6, class08388 var8) {
      super(var1, var2, var4, var6);
      this.field_62632 = var8;
      this.field_17867 = 0.1F * (this.field_3840.z() * 0.5F + 0.5F) * 2.0F;
   }

   protected class05848(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class08388 var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_62632 = var14;
      this.field_17867 = 0.1F * (this.field_3840.z() * 0.5F + 0.5F) * 2.0F;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + ", Pos ("
         + this.field_3874
         + ","
         + this.field_3854
         + ","
         + this.field_3871
         + "), RGBA ("
         + this.field_62633
         + ","
         + this.field_62634
         + ","
         + this.field_62635
         + ","
         + this.field_62636
         + "), Age "
         + this.field_3866;
   }

   @Override
   public class04406 method_3087(float var1) {
      this.field_17867 *= var1;
      return super.method_3087(var1);
   }

   protected abstract class05846 method_74255();

   public void method_3074(class00965 var1, class05363 var2, float var3) {
      Quaternionf quaternionf = new Quaternionf();
      this.method_55245().setRotation(quaternionf, var2, var3);
      if (this.field_62637 != 0.0F) {
         quaternionf.rotateZ(class04995.B(var3, this.field_62638, this.field_62637));
      }

      this.method_60373(var1, var2, quaternionf, var3);
   }

   protected void method_60375(class00965 var1, Quaternionf var2, float var3, float var4, float var5, float var6) {
      this.handler$cml000$sodium$tickSprite(var1, var2, var3, var4, var5, var6, null);
      var1.N(
         this.method_74255(),
         var3,
         var4,
         var5,
         var2.x,
         var2.y,
         var2.z,
         var2.w,
         this.method_18132(var6),
         this.method_18133(),
         this.method_18134(),
         this.method_18135(),
         this.method_18136(),
         class02566.N(this.field_62636, this.field_62633, this.field_62634, this.field_62635),
         this.method_3068(var6)
      );
   }

   protected float method_18133() {
      return this.field_62632.method_4594();
   }

   public class05863 method_55245() {
      return class05863.N;
   }

   protected float method_18134() {
      return this.field_62632.method_4577();
   }

   public void method_74306(class06143 var1) {
      if (!this.field_3843) {
         this.method_74307(var1.method_18138(this.field_3866, this.field_3847));
      }
   }

   protected void method_74307(class08388 var1) {
      this.field_62632 = var1;
      this.handler$cml000$sodium$afterSetSprite(var1, null);
   }

   protected float method_18136() {
      return this.field_62632.method_4575();
   }

   public void method_74308(float var1) {
      this.field_62636 = var1;
   }

   public void method_60373(class00965 var1, class05363 var2, Quaternionf var3, float var4) {
      class06889 class06889 = var2.y();
      float f = (float)(class04995.u((double)var4, this.field_3858, this.field_3874) - class06889.N());
      float f1 = (float)(class04995.u((double)var4, this.field_3838, this.field_3854) - class06889.y());
      float f2 = (float)(class04995.u((double)var4, this.field_3856, this.field_3871) - class06889.L());
      this.method_60375(var1, var3, f, f1, f2, var4);
   }

   public void method_74305(float var1, float var2, float var3) {
      this.field_62633 = var1;
      this.field_62634 = var2;
      this.field_62635 = var3;
   }

   protected float method_18135() {
      return this.field_62632.method_4593();
   }

   @Override
   public class06166 method_74274() {
      return class06166.N;
   }

   public float method_18132(float var1) {
      return this.field_17867;
   }

   private void handler$cml000$sodium$afterSetSprite(class08388 var1, CallbackInfo var2) {
      this.shouldTickSprite = var1 != null && SpriteUtil.INSTANCE.hasAnimation(var1);
   }

   private void handler$cml000$sodium$tickSprite(class00965 var1, Quaternionf var2, float var3, float var4, float var5, float var6, CallbackInfo var7) {
      if (this.shouldTickSprite) {
         SpriteUtil.INSTANCE.markSpriteActive(this.field_62632);
      }
   }
}
