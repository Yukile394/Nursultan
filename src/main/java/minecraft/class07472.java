package minecraft;

public class class07472 implements class08701 {
   private final class07079 N;
   private static final int y = 15;
   private static final int L = 10;
   private static final int u = 10;
   private int i;
   private float R;

   private void L() {
      this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = class04995.L(
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2, this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0, (float)this.N.NR()
      );
   }

   public class07472(class07079 var1) {
      super();
      this.N = var1;
   }

   private boolean i() {
      return !(this.N.method_31483() instanceof class07079);
   }

   private void u() {
      float f = class04995.N((this.i - 10) / 10.0F, 0.0F, 1.0F);
      float f1 = this.N.NR() * (1.0F - f);
      this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = class04995.L(
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0, this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2, f1
      );
   }

   private void y() {
      this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = class04995.L(
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0, this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2, (float)this.N.NR()
      );
   }

   public void N() {
      if (this.R()) {
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         this.L();
         this.R = this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
         this.i = 0;
      } else {
         if (this.i()) {
            if (Math.abs(this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2 - this.R) > 15.0F) {
               this.i = 0;
               this.R = this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
               this.y();
            } else {
               this.i++;
               if (this.i > 10) {
                  this.u();
               }
            }
         }
      }
   }

   private boolean R() {
      double d0 = this.N.method_23317() - this.N.field_6014;
      double d1 = this.N.method_23321() - this.N.field_5969;
      return d0 * d0 + d1 * d1 > 2.5000003E-7F;
   }
}
