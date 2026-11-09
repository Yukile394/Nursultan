package minecraft;

import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08125 {
   private static final NamespacedId N;

   public class08125() {
      super();
   }

   private void y(class07937 var1, class01422 var2, class08117 var3, CallbackInfo var4) {
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
   }

   private static void N(class01423 var0, class01391 var1, float var2, float var3, float var4, float var5, float var6) {
      var1.N(var0, var2, var3, var4).method_39415(-1).method_22913(var5, var6).method_60796(0, 10).method_60803(240).y(var0, 0.0F, 1.0F, 0.0F);
   }

   private void N(class07937 var1, class01422 var2, class08117 var3, CallbackInfo var4) {
      if (WorldRenderingSettings.INSTANCE.getEntityIds() != null) {
         CapturedRenderingState.INSTANCE.setCurrentEntity(WorldRenderingSettings.INSTANCE.getEntityIds().applyAsInt(N));
      }
   }

   public void N(class07937 var1, class01422 var2, class08117 var3) {
      this.N(var1, var2, var3, null);

      for (class06031 class06031 : var1.y()) {
         this.N(class06031.N(), var2, class06031.y(), class06031.L(), var3);
      }

      this.y(var1, var2, var3, null);
   }

   private void N(class01423 var1, class01407 var2, class08800 var3, Quaternionf var4, class08117 var5) {
      class08388 class08388xx = var5.N(class08874.N);
      class08388 class08388x = var5.N(class08874.y);
      float f = var3.s * 1.4F;
      var1.y(f, f, f);
      float f1 = 0.5F;
      float f2 = 0.0F;
      float f3 = var3.T / f;
      float f4 = 0.0F;
      var1.N(var4);
      var1.N(0.0F, 0.0F, 0.3F - (int)f3 * 0.02F);
      float f5 = 0.0F;
      int i = 0;

      for (class01391 class01391 = var2.method_73477(class05911.Z()); f3 > 0.0F; i++) {
         class08388 class08388xx = i % 2 == 0 ? class08388xx : class08388x;
         float f6 = class08388xx.method_4594();
         float f7 = class08388xx.method_4593();
         float f8 = class08388xx.method_4577();
         float f9 = class08388xx.method_4575();
         if (i / 2 % 2 == 0) {
            float f10 = f8;
            f8 = f6;
            f6 = f10;
         }

         N(var1, class01391, -f1 - 0.0F, 0.0F - f4, f5, f8, f9);
         N(var1, class01391, f1 - 0.0F, 0.0F - f4, f5, f6, f9);
         N(var1, class01391, f1 - 0.0F, 1.4F - f4, f5, f6, f7);
         N(var1, class01391, -f1 - 0.0F, 1.4F - f4, f5, f8, f7);
         f3 -= 0.45F;
         f4 -= 0.45F;
         f1 *= 0.9F;
         f5 -= 0.03F;
      }
   }
}
