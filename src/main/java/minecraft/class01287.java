package minecraft;

public class class01287 extends class06139 {
   @Override
   public void L() {
      this.N.method_6100(true);
      this.N.z(true);
      this.N.E(false);
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.p().N(class07438, 60.0F, 30.0F);
         class06889 class06889 = new class06889(
               class07438.method_23317() - this.N.method_23317(),
               class07438.method_23318() - this.N.method_23318(),
               class07438.method_23321() - this.N.method_23321()
            )
            .u();
         this.N.method_18799(this.N.method_18798().y(class06889.M * 0.8, 0.9, class06889.Z * 0.8));
      }

      this.N.f().W();
   }

   public class01287(class06165 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.p().N(class07438, 60.0F, 30.0F);
      }

      if (!this.N.n()) {
         class06889 class06889 = this.N.method_18798();
         if (class06889.B * class06889.B < 0.03F && this.N.method_36455() != 0.0F) {
            this.N.method_36457(class04995.Z(0.2F, this.N.method_36455(), 0.0F));
         } else {
            double d0 = class06889.Z();
            double d1 = Math.signum(-class06889.B) * Math.acos(d0 / class06889.M()) * 180.0F / (float)Math.PI;
            this.N.method_36457((float)d1);
         }
      }

      if (class07438 != null && this.N.method_5739(class07438) <= 2.0F) {
         this.N.method_6121(N_18(this.N.method_73183()), class07438);
      } else if (this.N.method_36455() > 0.0F
         && this.N.method_24828()
         && (float)this.N.method_18798().B != 0.0F
         && this.N.method_73183().method_8320(this.N.method_24515()).N(class00869.is)) {
         this.N.method_36457(60.0F);
         this.N.y(null);
         this.N.M(true);
      }
   }

   @Override
   public void u() {
      this.N.U(false);
      this.N.R = 0.0F;
      this.N.M = 0.0F;
      this.N.E(false);
      this.N.z(false);
   }

   @Override
   public boolean y() {
      class07438 class07438 = this.N.T();
      if (class07438 != null && class07438.method_5805()) {
         double d0 = this.N.method_18798().B;
         return (!(d0 * d0 < 0.05F) || !(Math.abs(this.N.method_36455()) < 15.0F) || !this.N.method_24828()) && !this.N.n();
      } else {
         return false;
      }
   }

   @Override
   public boolean N() {
      if (!this.N.l()) {
         return false;
      } else {
         class07438 class07438 = this.N.T();
         if (class07438 != null && class07438.method_5805()) {
            if (class07438.method_5755() != class07438.method_5735()) {
               return false;
            } else {
               boolean flag = class06165.N(this.N, class07438);
               if (!flag) {
                  this.N.f().N(class07438, 0);
                  this.N.U(false);
                  this.N.E(false);
               }

               return flag;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean O_() {
      return false;
   }
}
