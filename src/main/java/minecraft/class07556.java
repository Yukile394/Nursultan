package minecraft;

import org.jspecify.annotations.Nullable;

class class07556 extends class07952<class08036> {
   private final class07525 Z;
   @Nullable
   private class08036 z;
   private int U;
   private int E;
   private final class01328 W;
   private final class01328 m = class01328.N().u();
   private final class01317 P;

   @Override
   public void L() {
      this.U = this.N(5);
      this.E = 0;
      this.Z.l();
   }

   public class07556(class07525 var1, @Nullable class01317 var2) {
      super(var1, class08036.class, 10, false, false, var2);
      this.Z = var1;
      this.P = (var1x, var2x) -> (var1.N((class08036)var1x) || var1.N(var1x, var2x)) && !var1.method_5821(var1x);
      this.W = class01328.N().N(this.Z()).N(this.P);
   }

   @Override
   public void i() {
      if (this.Z.T() == null) {
         super.N(null);
      }

      if (this.z != null) {
         if (--this.U <= 0) {
            this.L = this.z;
            this.z = null;
            super.L();
         }
      } else {
         if (this.L != null && !this.Z.method_5765()) {
            if (this.Z.N((class08036)this.L)) {
               if (this.L.method_5858(this.Z) < 16.0) {
                  this.Z.v();
               }

               this.E = 0;
            } else if (this.L.method_5858(this.Z) > 256.0 && this.E++ >= this.N(30) && this.Z.L(this.L)) {
               this.E = 0;
            }
         }

         super.i();
      }
   }

   @Override
   public void u() {
      this.z = null;
      super.u();
   }

   @Override
   public boolean y() {
      if (this.z != null) {
         if (!this.P.method_18303(this.z, N(this.Z))) {
            return false;
         } else {
            this.Z.N(this.z, 10.0F, 10.0F);
            return true;
         }
      } else {
         if (this.L != null) {
            if (this.Z.method_5821(this.L)) {
               return false;
            }

            if (this.m.N(N(this.Z), this.Z, this.L)) {
               return true;
            }
         }

         return super.y();
      }
   }

   @Override
   public boolean N() {
      this.z = N(this.Z).N(this.W.N(this.Z()), this.Z);
      return this.z != null;
   }
}
