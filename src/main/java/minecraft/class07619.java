package minecraft;

import java.util.EnumSet;

class class07619 extends class07473 {
   private final class07637 N;

   @Override
   public void L() {
      this.N.z(true);
   }

   public class07619(class07637 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406, class07430.field_18407));
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean N() {
      if ((this.N.method_6109() || this.N.o()) && this.N.method_24828()) {
         if (!this.N.No()) {
            return false;
         } else {
            float f = this.N.method_36454() * (float) (Math.PI / 180.0);
            float f1 = -class04995.m(f);
            float f2 = class04995.P(f);
            int i = Math.abs(f1) > 0.5 ? class04995.U((double)f1) : 0;
            int j = Math.abs(f2) > 0.5 ? class04995.U((double)f2) : 0;
            if (this.N.method_73183().method_8320(this.N.method_24515().method_10069(i, -1, j)).P()) {
               return true;
            } else {
               return this.N.o() && class07637.N(this.N).y(y(60)) == 1 ? true : class07637.y(this.N).y(y(500)) == 1;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean O_() {
      return false;
   }
}
