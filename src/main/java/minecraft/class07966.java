package minecraft;

import java.util.EnumSet;

public class class07966<T extends class07150 & class07172 & class04854> extends class07473 {
   public static final class02135 N = class01517.N(1, 2);
   private final T y;
   private class07964 L = class07964.field_16534;
   private final double u;
   private final float i;
   private int R;
   private int M;
   private int B;

   private boolean M() {
      return this.y.method_24518(class06570.dw);
   }

   public class07966(T var1, double var2, float var4) {
      super();
      this.y = (T)var1;
      this.u = var2;
      this.i = var4 * var4;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   private boolean Z() {
      return this.y.T() != null && this.y.T().method_5805();
   }

   @Override
   public void i() {
      class07438 class07438 = this.y.T();
      if (class07438 != null) {
         boolean flag = this.y.C().N(class07438);
         boolean flag1 = this.R > 0;
         if (flag != flag1) {
            this.R = 0;
         }

         if (flag) {
            this.R++;
         } else {
            this.R--;
         }

         boolean flag2 = (this.y.method_5858(class07438) > this.i || this.R < 5) && this.M == 0;
         if (flag2) {
            this.B--;
            if (this.B <= 0) {
               this.y.f().N(class07438, this.U() ? this.u : this.u * 0.5);
               this.B = N.N(this.y.method_59922());
            }
         } else {
            this.B = 0;
            this.y.f().W();
         }

         this.y.p().N(class07438, 30.0F, 30.0F);
         if (this.L == class07964.field_16534) {
            if (!flag2) {
               this.y.method_6019(class08038.N(this.y, class06570.dw));
               this.L = class07964.field_16530;
               this.y.N(true);
            }
         } else if (this.L == class07964.field_16530) {
            if (!this.y.method_6115()) {
               this.L = class07964.field_16534;
            }

            int ix = this.y.method_6048();
            class06584 class06584 = this.y.method_6030();
            if (ix >= class06593.y(class06584, this.y)) {
               this.y.method_6075();
               this.L = class07964.field_16532;
               this.M = 20 + this.y.method_59922().y(20);
               this.y.N(false);
            }
         } else if (this.L == class07964.field_16532) {
            this.M--;
            if (this.M == 0) {
               this.L = class07964.field_16533;
            }
         } else if (this.L == class07964.field_16533 && flag) {
            this.y.N(class07438, 1.0F);
            this.L = class07964.field_16534;
         }
      }
   }

   private boolean U() {
      return this.L == class07964.field_16534;
   }

   @Override
   public void u() {
      super.u();
      this.y.R(false);
      this.y.y(null);
      this.R = 0;
      if (this.y.method_6115()) {
         this.y.method_6021();
         this.y.N(false);
         this.y.method_6030().N(class02484.x, class02820.N);
      }
   }

   @Override
   public boolean y() {
      return this.Z() && (this.N() || !this.y.f().U()) && this.M();
   }

   @Override
   public boolean N() {
      return this.Z() && this.M();
   }
}
