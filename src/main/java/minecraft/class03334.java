package minecraft;

import java.util.EnumSet;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03334<T extends class07279, S extends class00978> implements class03358<T, S> {
   public static final class01894 N = class01894.y("textures/environment/end_sky.png");
   public static final class01894 y = class01894.y("textures/entity/end_portal.png");
   private static final float L = 0.075F;
   private static final float u = 0.15F;
   private static final float i = 0.2F;

   protected class07311 M() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class07311)callbackinforeturnable.getReturnValue() : class06851.s();
   }

   public class03334() {
      super();
   }

   protected float u() {
      return 0.75F;
   }

   private void N(
      class00978 var1,
      class01391 var2,
      class01423 var3,
      Matrix3f var4,
      class07211 var5,
      float var6,
      int var7,
      int var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20
   ) {
      if (var1.i.contains(var5)) {
         float f = var5.P();
         float f1 = var5.s();
         float f2 = var5.T();
         var2.N(var3, var9, var10, var11)
            .method_22915(0.075F, 0.15F, 0.2F, 1.0F)
            .method_22913(0.0F + var6, 0.0F + var6)
            .method_22922(var7)
            .method_60803(var8)
            .y(var3, f, f1, f2);
         var2.N(var3, var12, var13, var14)
            .method_22915(0.075F, 0.15F, 0.2F, 1.0F)
            .method_22913(0.0F + var6, 0.2F + var6)
            .method_22922(var7)
            .method_60803(var8)
            .y(var3, f, f1, f2);
         var2.N(var3, var15, var16, var17)
            .method_22915(0.075F, 0.15F, 0.2F, 1.0F)
            .method_22913(0.2F + var6, 0.2F + var6)
            .method_22922(var7)
            .method_60803(var8)
            .y(var3, f, f1, f2);
         var2.N(var3, var18, var19, var20)
            .method_22915(0.075F, 0.15F, 0.2F, 1.0F)
            .method_22913(0.2F + var6, 0.0F + var6)
            .method_22922(var7)
            .method_60803(var8)
            .y(var3, f, f1, f2);
      }
   }

   private static void N(CallbackInfoReturnable var0) {
      if (Iris.getCurrentPack().isPresent()) {
         var0.setReturnValue(class06851.u(class00995.y));
      }
   }

   public void N(class00978 var1, class01423 var2, class01391 var3, CallbackInfo var4) {
      if (!Iris.getCurrentPack().isEmpty()) {
         int ix = class01384.u;
         int j = 15728880;
         var4.cancel();
         Matrix3f matrix3f = var2.y();
         float f = SystemTimeUniforms.TIMER.getFrameTimeCounter() * 0.01F % 1.0F;
         float f1 = this.u();
         float f2 = this.R();
         this.N(var1, var3, var2, matrix3f, class07211.field_11036, f, ix, j, 0.0F, f1, 1.0F, 1.0F, f1, 1.0F, 1.0F, f1, 0.0F, 0.0F, f1, 0.0F);
         this.N(var1, var3, var2, matrix3f, class07211.field_11033, f, ix, j, 0.0F, f2, 1.0F, 0.0F, f2, 0.0F, 1.0F, f2, 0.0F, 1.0F, f2, 1.0F);
         this.N(var1, var3, var2, matrix3f, class07211.field_11043, f, ix, j, 0.0F, f1, 0.0F, 1.0F, f1, 0.0F, 1.0F, f2, 0.0F, 0.0F, f2, 0.0F);
         this.N(var1, var3, var2, matrix3f, class07211.field_11039, f, ix, j, 0.0F, f1, 1.0F, 0.0F, f1, 0.0F, 0.0F, f2, 0.0F, 0.0F, f2, 1.0F);
         this.N(var1, var3, var2, matrix3f, class07211.field_11035, f, ix, j, 0.0F, f1, 1.0F, 0.0F, f2, 1.0F, 1.0F, f2, 1.0F, 1.0F, f1, 1.0F);
         this.N(var1, var3, var2, matrix3f, class07211.field_11034, f, ix, j, 1.0F, f1, 1.0F, 1.0F, f2, 1.0F, 1.0F, f2, 0.0F, 1.0F, f1, 0.0F);
      }
   }

   public void N(S var1, class01421 var2, class01237 var3, class06959 var4) {
      var3.N(var2, this.M(), (var2x, var3x) -> {
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var2x, var3x, callbackinfo);
         if (!callbackinfo.isCancelled()) {
            this.N(var1.i, var2x.N(), var3x);
         }
      });
   }

   private void N(EnumSet<class07211> var1, Matrix4f var2, class01391 var3) {
      float f = this.R();
      float f1 = this.u();
      this.N(var1, var2, var3, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, class07211.field_11035);
      this.N(var1, var2, var3, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, class07211.field_11043);
      this.N(var1, var2, var3, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, class07211.field_11034);
      this.N(var1, var2, var3, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, class07211.field_11039);
      this.N(var1, var2, var3, 0.0F, 1.0F, f, f, 0.0F, 0.0F, 1.0F, 1.0F, class07211.field_11033);
      this.N(var1, var2, var3, 0.0F, 1.0F, f1, f1, 1.0F, 1.0F, 0.0F, 0.0F, class07211.field_11036);
   }

   private void N(
      EnumSet<class07211> var1,
      Matrix4f var2,
      class01391 var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      class07211 var12
   ) {
      if (var1.contains(var12)) {
         var3.N(var2, var4, var6, var8);
         var3.N(var2, var5, var6, var9);
         var3.N(var2, var5, var7, var10);
         var3.N(var2, var4, var7, var11);
      }
   }

   public void N(T var1, S var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N((T)var1, (S)var2, var3, var4, var5);
      var2.i.clear();

      for (class07211 class07211 : class07211.values()) {
         if (var1.N(class07211)) {
            var2.i.add(class07211);
         }
      }
   }

   protected float R() {
      return 0.375F;
   }
}
