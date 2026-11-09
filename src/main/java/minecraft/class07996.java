package minecraft;

import java.util.EnumSet;

public class class07996<T extends class07150 & class07172> extends class07473 {
   private final T N;
   private final double y;
   private int L;
   private final float u;
   private int i = -1;
   private int R;
   private boolean M;
   private boolean B;
   private int Z = -1;

   @Override
   public void L() {
      super.L();
      this.N.R(true);
   }

   public void L(int var1) {
      this.L = var1;
   }

   protected boolean M() {
      return this.N.method_24518(class06570.sx);
   }

   public class07996(T var1, double var2, int var4, float var5) {
      super();
      this.N = (T)var1;
      this.y = var2;
      this.L = var4;
      this.u = var5 * var5;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         double d0 = this.N.method_5649(class07438.method_23317(), class07438.method_23318(), class07438.method_23321());
         boolean flag = this.N.C().N(class07438);
         boolean flag1 = this.R > 0;
         if (flag != flag1) {
            this.R = 0;
         }

         if (flag) {
            this.R++;
         } else {
            this.R--;
         }

         if (!(d0 > this.u) && this.R >= 20) {
            this.N.f().W();
            this.Z++;
         } else {
            this.N.f().N(class07438, this.y);
            this.Z = -1;
         }

         if (this.Z >= 20) {
            if (this.N.method_59922().z() < 0.3) {
               this.M = !this.M;
            }

            if (this.N.method_59922().z() < 0.3) {
               this.B = !this.B;
            }

            this.Z = 0;
         }

         if (this.Z > -1) {
            if (d0 > this.u * 0.75F) {
               this.B = false;
            } else if (d0 < this.u * 0.25F) {
               this.B = true;
            }

            this.N.F().N(this.B ? -0.5F : 0.5F, this.M ? 0.5F : -0.5F);
            if (this.N.method_49694() instanceof class07079 class07079) {
               class07079.N(class07438, 30.0F, 30.0F);
            }

            this.N.N(class07438, 30.0F, 30.0F);
         } else {
            this.N.p().N(class07438, 30.0F, 30.0F);
         }

         if (this.N.method_6115()) {
            if (!flag && this.R < -60) {
               this.N.method_6021();
            } else if (flag) {
               int ix = this.N.method_6048();
               if (ix >= 20) {
                  this.N.method_6021();
                  this.N.N(class07438, class06924.N(ix));
                  this.i = this.L;
               }
            }
         } else if (--this.i <= 0 && this.R >= -60) {
            this.N.method_6019(class08038.N(this.N, class06570.sx));
         }
      }
   }

   @Override
   public void u() {
      super.u();
      this.N.R(false);
      this.R = 0;
      this.i = -1;
      this.N.method_6021();
   }

   @Override
   public boolean y() {
      return (this.N() || !this.N.f().U()) && this.M();
   }

   @Override
   public boolean N() {
      return this.N.T() == null ? false : this.M();
   }
}
