package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

class class07173 extends class07978 {
   @Nullable
   private class07211 Z;
   private boolean z;

   @Override
   public void L() {
      if (!this.z) {
         super.L();
      } else {
         class07299 class07299 = this.y.method_73183();
         class07209 class07209 = class07209.method_49637(this.y.method_23317(), this.y.method_23318() + 0.5, this.y.method_23321()).method_10093(this.Z);
         class00500 class00500 = class07299.method_8320(class07209);
         if (class07137.U(class00500)) {
            class07299.method_8652(class07209, class07137.E(class00500), 3);
            this.y.h();
            this.y.method_31472();
         }
      }
   }

   public class07173(class07147 var1) {
      super(var1, 1.0, 10);
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean y() {
      return this.z ? false : super.y();
   }

   @Override
   public boolean N() {
      if (this.y.T() != null) {
         return false;
      } else if (!this.y.f().U()) {
         return false;
      } else {
         class06069 class06069 = this.y.method_59922();
         if (N(this.y).method_64395().N(class07305.I) && class06069.y(y(10)) == 0) {
            this.Z = class07211.y(class06069);
            class07209 class07209 = class07209.method_49637(this.y.method_23317(), this.y.method_23318() + 0.5, this.y.method_23321()).method_10093(this.Z);
            if (class07137.U(this.y.method_73183().method_8320(class07209))) {
               this.z = true;
               return true;
            }
         }

         this.z = false;
         return super.N();
      }
   }
}
