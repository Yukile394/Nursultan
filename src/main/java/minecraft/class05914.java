package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class05914 extends class05096 {
   protected final class05096 field_21335;
   protected final class05630 field_21336;
   @Nullable
   protected class05002 field_51824;
   public final class03686 field_49503 = new class03686(this);

   public class05914(class05096 var1, class05630 var2, class00392 var3) {
      super(var3);
      this.field_21335 = var1;
      this.field_21336 = var2;
   }

   @Override
   public void method_25426() {
      this.method_57732();
      this.method_60329();
      this.method_31387();
      this.field_49503.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.field_49503.N();
      if (this.field_51824 != null) {
         this.field_51824.method_57712(this.field_22789, this.field_49503);
      }
   }

   @Override
   public void method_25432() {
      ((class05630)this.field_22787.i_7).Np();
   }

   @Override
   public void method_25419() {
      if (this.field_51824 != null) {
         this.field_51824.y();
      }

      this.field_22787.N(this.field_21335);
   }

   protected abstract void method_60325();

   protected void method_60329() {
      this.field_51824 = this.field_49503.L(new class05002(this.field_22787, this.field_22789, this));
      this.method_60325();
      if (this.field_51824.y(this.field_21336.NV()) instanceof class06366 class06366) {
         this.field_52252 = class06366;
         this.field_52252.field_22763 = this.field_22787.NT().N();
      }
   }

   protected void method_57732() {
      this.field_49503.N(this.field_22785, this.field_22793);
   }

   protected void method_31387() {
      this.field_49503.y(class05362.method_46430(class05220.u, var1 -> this.method_25419()).N(200).N());
   }

   public void method_75370(class04370<?> var1) {
      if (this.field_51824 != null) {
         this.field_51824.L(var1);
      }
   }
}
