package minecraft;

import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06093 implements class06092 {
   private final boolean N;
   private final double y;
   private final boolean L;
   private class06584 u;
   private final boolean i;
   @Nullable
   private final class07049 R;

   @Override
   public boolean L() {
      return this.N;
   }

   public class06584 M() {
      this.N(null);
      return this.u;
   }

   @Deprecated
   protected class06093(class07049 var1, boolean var2, boolean var3) {
      this(var1.method_21752(), var3, var1.method_23318(), N(var1, class07438.class) ? ((class07438)var1).method_6047() : class06584.E, var2, var1);
      this.N(var1, var2, var3, null);
   }

   public class06093(boolean var1, boolean var2, double var3, class06584 var5, boolean var6, @Nullable class07049 var7) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = var3;
      this.u = var5;
      this.i = var6;
      this.R = var7;
   }

   private void B() {
      if (this.u == null) {
         this.u = this.R instanceof class07438 ? ((class07438)this.R).method_6047() : class06584.E;
      }
   }

   @Override
   public boolean i() {
      return this.L;
   }

   @Override
   public boolean u() {
      return this.i;
   }

   private void N(class07049 var1, boolean var2, boolean var3, CallbackInfo var4) {
      this.u = null;
   }

   private void N(CallbackInfoReturnable var1) {
      this.B();
   }

   public void N_55(class06581 var1, CallbackInfoReturnable var2) {
      this.B();
   }

   @Override
   public boolean N(class06581 var1) {
      this.N_55(var1, null);
      return this.u.N(var1);
   }

   @Override
   public class00494 N(class00500 var1, class07322 var2, class07209 var3) {
      return var1.y(var2, var3, this);
   }

   @Override
   public boolean N(class04688 var1, class04688 var2) {
      class07049 class07049 = this.R;
      return !(class07049 instanceof class07438) ? false : ((class07438)class07049).method_26319(var2) && !var1.N().N(var2.N());
   }

   @Override
   public boolean N(class00494 var1, class07209 var2, boolean var3) {
      return this.y > var2.method_10264() + var1.method_1105(class07185.field_11052) - 1.0E-5F;
   }

   private static boolean N(Object var0, Class var1) {
      return false;
   }

   @Nullable
   public class07049 R() {
      return this.R;
   }
}
