package minecraft;

import Nursultan.class10969;
import Nursultan.class11938;
import org.joml.Quaternionf;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class01987<T extends class03688, S, ST extends class08783> extends class04507<T, ST> {
   private final class01781 N;

   private static int L(class03688 var0) {
      class03657 class03657 = var0.L();
      return class03657 != null ? class03657.L() : -1;
   }

   protected class01987(class04832 var1) {
      super(var1);
      this.N = var1.N();
   }

   protected int method_24087(T var1, class07209 var2) {
      int i = L(var1);
      return i != -1 ? class03042.N(i) : super.method_24087((T)var1, var2);
   }

   protected float method_65247(ST var1) {
      class03657 class03657 = var1.y;
      return class03657 == null ? 0.0F : class03657.i().method_48886(var1.L);
   }

   private static float y(float var0) {
      return -var0;
   }

   private static <T extends class03688> float y(T var0, float var1) {
      return var0.method_61414(var1);
   }

   protected boolean method_62406(T var1) {
      return var1.y();
   }

   private void N(class08783 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      class10969 class10969 = class10969.N(var1);
      class11938.L().L(class10969);
      if (class10969.y()) {
         var5.cancel();
      }
   }

   private static <T extends class03688> float N(T var0, float var1) {
      return var0.method_61415(var1);
   }

   protected abstract void N(ST var1, class01421 var2, class01237 var3, int var4, float var5);

   public void method_62354(T var1, ST var2, float var3) {
      super.method_62354((T)var1, var2, var3);
      var2.y = var1.L();
      var2.L = var1.R(var3);
      var2.u = N(var1, var3);
      var2.i = y(var1, var3);
      class05363 class05363 = this.N.y;
      var2.M = class05363.i();
      var2.R = class05363.R();
   }

   protected class00734 method_62358(T var1) {
      return var1.N();
   }

   protected int method_27950(T var1, class07209 var2) {
      int i = L(var1);
      return i != -1 ? class03042.y(i) : super.method_27950((T)var1, var2);
   }

   protected float method_55831(ST var1) {
      class03657 class03657 = var1.y;
      return class03657 == null ? 0.0F : class03657.u().method_48886(var1.L);
   }

   private static float N(float var0) {
      return var0 - 180.0F;
   }

   private Quaternionf N(class03657 var1, ST var2, Quaternionf var3) {
      return switch (var1.y()) {
         case field_42406 -> var3.rotationYXZ((float) (-Math.PI / 180.0) * var2.u, (float) (Math.PI / 180.0) * var2.i, 0.0F);
         case field_42408 -> var3.rotationYXZ((float) (-Math.PI / 180.0) * var2.u, (float) (Math.PI / 180.0) * y(var2.M), 0.0F);
         case field_42407 -> var3.rotationYXZ((float) (-Math.PI / 180.0) * N(var2.R), (float) (Math.PI / 180.0) * var2.i, 0.0F);
         case field_42409 -> var3.rotationYXZ((float) (-Math.PI / 180.0) * N(var2.R), (float) (Math.PI / 180.0) * y(var2.M), 0.0F);
      };
   }

   public void method_3936(ST var1, class01421 var2, class01237 var3, class06959 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class03657 class03657 = var1.y;
         if (class03657 != null && var1.N()) {
            float f = var1.L;
            super.method_3936(var1, var2, var3, var4);
            var2.N();
            var2.N(this.N(class03657, (ST)var1, new Quaternionf()));
            class01404 class01404 = class03657.N().method_48888(f);
            var2.N(class01404.L());
            this.N((ST)var1, var2, var3, var1.G, f);
            var2.y();
         }
      }
   }
}
