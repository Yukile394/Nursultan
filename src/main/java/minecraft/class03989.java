package minecraft;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleRenderEvents.AllowBlockDustTint;
import net.irisshaders.iris.fantastic.IrisParticleRenderTypes;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class03989 extends class05848 {
   private final class05846 N;
   private final class07209 y;
   private final float L;
   private final float u;
   private boolean i;

   public class03989(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class00500 var14) {
      this(var1, var2, var4, var6, var8, var10, var12, var14, class07209.method_49637(var2, var4, var6));
   }

   public class03989(class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class00500 var14, class07209 var15) {
      super(var1, var2, var4, var6, var8, var10, var12, N(class06202.Nq().yU().N(), var14, var1, var2, var4, var6, var8, var10, var12, var14, var15));
      this.y = var15;
      this.field_3844 = 1.0F;
      this.field_62633 = 0.6F;
      this.field_62634 = 0.6F;
      this.field_62635 = 0.6F;
      var14 = this.N(var14, var1, var15);
      if (!var14.N(class00869.Z)) {
         int ix = class06202.Nq().d().N(var14, var1, var15, 0);
         this.field_62633 *= (ix >> 16 & 0xFF) / 255.0F;
         this.field_62634 *= (ix >> 8 & 0xFF) / 255.0F;
         this.field_62635 *= (ix & 0xFF) / 255.0F;
      }

      this.field_17867 /= 2.0F;
      this.L = this.field_3840.z() * 3.0F;
      this.u = this.field_3840.z() * 3.0F;
      this.N = this.field_62632.method_45852().equals(class08626.N) ? class05846.N : class05846.y;
      this.N(var1, var2, var4, var6, var8, var10, var12, var14, var15, null);
   }

   @Nullable
   static class03989 N(class07105 var0, class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      class00500 class00500 = var0.N();
      if (!class00500.P() && !class00500.N(class00869.LN) && class00500.g()) {
         class03989 class03989 = N(var1, var2, var4, var6, var8, var10, var12, class00500, var0, var1, var2, var4, var6, var8, var10, var12);
         if (class03989 == null) {
            throw new NullPointerException(
               "@Redirect constructor handler net/minecraft/class_727::constructBlockDustParticle returned null for net.minecraft.class_727"
            );
         } else {
            return class03989;
         }
      } else {
         return null;
      }
   }

   private class00500 N(class00500 var1, class03448 var2, class07209 var3) {
      return !((AllowBlockDustTint)ParticleRenderEvents.ALLOW_BLOCK_DUST_TINT.invoker()).allowBlockDustTint(var1, var2, var3) ? class00869.Z.W() : var1;
   }

   private void N(CallbackInfoReturnable var1) {
      if (this.i && var1.getReturnValue() == class05846.N) {
         var1.setReturnValue(IrisParticleRenderTypes.TERRAIN_OPAQUE);
      }
   }

   private static class03989 N(
      class03448 var0,
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      class00500 var13,
      class07105 var14,
      class03448 var15,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24,
      double var26
   ) {
      class07209 class07209 = var14.getBlockPos();
      return class07209 != null
         ? new class03989(var0, var1, var3, var5, var7, var9, var11, var13, class07209)
         : new class03989(var0, var1, var3, var5, var7, var9, var11, var13);
   }

   private static class08388 N(
      class03770 var0,
      class00500 var1,
      class03448 var2,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      class00500 var15,
      class07209 var16
   ) {
      return var0.getModelParticleSprite(var1, var2, var16);
   }

   private void N(
      class03448 var1, double var2, double var4, double var6, double var8, double var10, double var12, class00500 var14, class07209 var15, CallbackInfo var16
   ) {
      class08743 class08743 = class05885.N(var14);
      if (class08743 == class08743.field_60923 || class08743 == class08743.field_60925) {
         this.i = true;
      }
   }

   @Override
   public class05846 method_74255() {
      class05846 class05846x;
      class05846 class05846x = class05846x = this.N;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class05846x);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class05846)callbackinforeturnable.getReturnValue() : class05846x;
   }

   @Override
   protected float method_18133() {
      return this.field_62632.method_4580((this.L + 1.0F) / 4.0F);
   }

   @Override
   protected float method_18134() {
      return this.field_62632.method_4580(this.L / 4.0F);
   }

   @Override
   protected float method_18136() {
      return this.field_62632.method_4570((this.u + 1.0F) / 4.0F);
   }

   @Override
   public int method_3068(float var1) {
      int ix = super.method_3068(var1);
      return ix == 0 && this.field_3851.E(this.y) ? class03063.N(this.field_3851, this.y) : ix;
   }

   @Override
   protected float method_18135() {
      return this.field_62632.method_4570(this.u / 4.0F);
   }
}
