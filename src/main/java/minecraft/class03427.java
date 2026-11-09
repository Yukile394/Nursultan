package minecraft;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03427 implements class05207 {
   private final boolean N;
   private final boolean y;
   private class05042 L;
   private long u;
   private long i;
   private boolean R;
   private class07086 M;
   private boolean B;

   @Override
   public long L() {
      return this.i;
   }

   @Override
   public boolean T() {
      return this.B;
   }

   public class03427(class07086 var1, boolean var2, boolean var3) {
      super();
      this.M = var1;
      this.N = var2;
      this.y = var3;
   }

   @Override
   public boolean B() {
      return this.R;
   }

   @Override
   public class07086 s() {
      return this.M;
   }

   @Override
   public boolean U() {
      return this.N;
   }

   public float u() {
      return this.y ? 1.0F : 32.0F;
   }

   @Override
   public void y(boolean var1) {
      this.R = var1;
   }

   public void y(long var1) {
      this.i = var1;
   }

   @Override
   public long y() {
      return this.u;
   }

   public void N(boolean var1) {
      this.B = var1;
   }

   public void N(class07086 var1) {
      this.M = var1;
   }

   public double N(class05474 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueD();
      } else {
         return this.y ? var1.method_31607() : 63.0;
      }
   }

   @Override
   public class05042 N() {
      return this.L;
   }

   @Override
   public void N(class07074 var1, class05474 var2) {
      class05207.super.N(var1, var2);
   }

   @Override
   public void N(class05042 var1) {
      this.L = var1;
   }

   public void N(long var1) {
      this.u = var1;
   }

   private void N(CallbackInfoReturnable var1) {
      if (((class03386)class06202.Nq().i_5).s().W() != class04798.field_27888) {
         var1.setReturnValue(Double.NEGATIVE_INFINITY);
      }
   }

   @Override
   public boolean R() {
      return false;
   }
}
