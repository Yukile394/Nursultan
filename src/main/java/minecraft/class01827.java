package minecraft;

import org.jspecify.annotations.Nullable;

public class class01827 extends class05914 {
   private static final class00392 L = class00392.L("controls.keybinds.title");
   @Nullable
   public class06428 N;
   public long y;
   private class01402 u;
   private class05362 i;

   public class01827(class05096 var1, class05630 var2) {
      super(var1, var2, L);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.N != null) {
         if (var1.i()) {
            this.N.y(class04655.yI);
         } else {
            this.N.y(class04655.N(var1));
         }

         this.N = null;
         this.y = class07536.L();
         this.u.y();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.field_49503.N();
      this.u.method_57712(this.field_22789, this.field_49503);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      boolean flag = false;
      class06428[] aclass06428 = this.field_21336.Nn;
      int ix = aclass06428.length;

      for (int j = 0; j < ix; j++) {
         if (!aclass06428[j].P()) {
            flag = true;
            break;
         }
      }

      this.i.field_22763 = flag;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.N != null) {
         this.N.y(class04648.field_1672.N(var1.v()));
         this.N = null;
         this.u.y();
         return true;
      } else {
         return super.method_25402(var1, var2);
      }
   }

   @Override
   protected void method_60325() {
   }

   @Override
   protected void method_60329() {
      this.u = this.field_49503.L(new class01402(this, this.field_22787));
   }

   @Override
   protected void method_31387() {
      this.i = class05362.method_46430(class00392.L("controls.resetAll"), var1x -> {
         for (class06428 class06428 : this.field_21336.Nn) {
            class06428.y(class06428.E());
         }

         this.u.y();
      }).N();
      class01885 class01885 = this.field_49503.y(class01885.i().N(8));
      class01885.N(this.i);
      class01885.N(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N());
   }
}
