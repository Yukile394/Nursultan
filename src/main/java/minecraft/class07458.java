package minecraft;

public class class07458 implements class08701 {
   public static final float y = 5.0E-4F;
   public static final float L = 2.5000003E-7F;
   protected static final int u = 90;
   protected final class07079 i;
   protected double R;
   protected double M;
   protected double B;
   protected double Z;
   protected float z;
   protected float U;
   protected class07435 E = class07435.field_6377;

   public double L() {
      return this.Z;
   }

   public void M() {
      this.E = class07435.field_6377;
   }

   public class07458(class07079 var1) {
      super();
      this.i = var1;
   }

   public double i() {
      return this.M;
   }

   public double u() {
      return this.R;
   }

   public boolean y() {
      return this.E == class07435.field_6378;
   }

   private boolean y(float var1, float var2) {
      class07623 class07623 = this.i.f();
      if (class07623 != null) {
         class02119 class02119 = class07623.P();
         if (class02119 != null
            && class02119.y(this.i, class07209.method_49637(this.i.method_23317() + var1, this.i.method_31478(), this.i.method_23321() + var2))
               != class04425.field_12) {
            return false;
         }
      }

      return true;
   }

   protected float y(float var1, float var2, float var3) {
      float f = class04995.R(var2 - var1);
      if (f > var3) {
         f = var3;
      }

      if (f < -var3) {
         f = -var3;
      }

      float f1 = var1 + f;
      if (f1 < 0.0F) {
         f1 += 360.0F;
      } else if (f1 > 360.0F) {
         f1 -= 360.0F;
      }

      return f1;
   }

   public void N(double var1, double var3, double var5, double var7) {
      this.R = var1;
      this.M = var3;
      this.B = var5;
      this.Z = var7;
      if (this.E != class07435.field_6379) {
         this.E = class07435.field_6378;
      }
   }

   public void N() {
      if (this.E == class07435.field_6376) {
         float f = (float)this.i.method_45325(class05298.l);
         float f1 = (float)this.Z * f;
         float f2 = this.z;
         float f3 = this.U;
         float f4 = class04995.N(f2 * f2 + f3 * f3);
         if (f4 < 1.0F) {
            f4 = 1.0F;
         }

         f4 = f1 / f4;
         f2 *= f4;
         f3 *= f4;
         float f5 = class04995.m(this.i.method_36454() * (float) (Math.PI / 180.0));
         float f6 = class04995.P(this.i.method_36454() * (float) (Math.PI / 180.0));
         float f7 = f2 * f6 - f3 * f5;
         float f8 = f3 * f6 + f2 * f5;
         if (!this.y(f7, f8)) {
            this.z = 1.0F;
            this.U = 0.0F;
         }

         this.i.method_6125(f1);
         this.i.N(this.z);
         this.i.L(this.U);
         this.E = class07435.field_6377;
      } else if (this.E == class07435.field_6378) {
         this.E = class07435.field_6377;
         double d0 = this.R - this.i.method_23317();
         double d1 = this.B - this.i.method_23321();
         double d2 = this.M - this.i.method_23318();
         double d3 = d0 * d0 + d2 * d2 + d1 * d1;
         if (d3 < 2.5000003E-7F) {
            this.i.N(0.0F);
            return;
         }

         float f9 = (float)(class04995.u(d1, d0) * 180.0F / (float)Math.PI) - 90.0F;
         this.i.method_36456(this.y(this.i.method_36454(), f9, 90.0F));
         this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
         class07209 class07209 = this.i.method_24515();
         class00500 class00500 = this.i.method_73183().method_8320(class07209);
         class00494 class00494 = class00500.M(this.i.method_73183(), class07209);
         if (d2 > this.i.method_49476() && d0 * d0 + d1 * d1 < Math.max(1.0F, this.i.method_17681())
            || !class00494.method_1110()
               && this.i.method_23318() < class00494.method_1105(class07185.field_11052) + class07209.method_10264()
               && !class00500.N(class01210.P)
               && !class00500.N(class01210.A)) {
            this.i.A().y();
            this.E = class07435.field_6379;
         }
      } else if (this.E == class07435.field_6379) {
         this.i.method_6125((float)(this.Z * this.i.method_45325(class05298.l)));
         if (this.i.method_24828() || this.i.method_52535() && this.i.method_29920()) {
            this.E = class07435.field_6377;
         }
      } else {
         this.i.N(0.0F);
      }
   }

   public void N(float var1, float var2) {
      this.E = class07435.field_6376;
      this.z = var1;
      this.U = var2;
      this.Z = 0.25;
   }

   public double R() {
      return this.B;
   }
}
