package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;

public class class07465 extends class07473 {
   private static final int N = 40;
   private static final Predicate<class00500> y = var0 -> var0.N(class01210.yW);
   private final class07079 L;
   private final class07299 u;
   private int i;

   @Override
   public void L() {
      this.i = this.N(40);
      this.u.method_8421(this.L, (byte)10);
      this.L.f().W();
   }

   public int M() {
      return this.i;
   }

   public class07465(class07079 var1) {
      super();
      this.L = var1;
      this.u = var1.method_73183();
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406, class07430.field_18407));
   }

   @Override
   public void i() {
      this.i = Math.max(0, this.i - 1);
      if (this.i == this.N(4)) {
         class07209 class07209x = this.L.method_24515();
         if (y.test(this.u.method_8320(class07209x))) {
            if (N_18(this.u).method_64395().N(class07305.I)) {
               this.u.N(class07209x, false);
            }

            this.L.x();
         } else {
            class07209 class07209x = class07209x.method_10074();
            if (this.u.method_8320(class07209x).N(class00869.Z)) {
               if (N_18(this.u).method_64395().N(class07305.I)) {
                  this.u.N(2001, class07209x, class00891.W(class00869.Z.W()));
                  this.u.method_8652(class07209x, class00869.z.W(), 2);
               }

               this.L.x();
            }
         }
      }
   }

   @Override
   public void u() {
      this.i = 0;
   }

   @Override
   public boolean y() {
      return this.i > 0;
   }

   @Override
   public boolean N() {
      if (this.L.method_59922().y(this.N(this.L.method_6109() ? 50 : 1000)) != 0) {
         return false;
      } else {
         class07209 class07209 = this.L.method_24515();
         return y.test(this.u.method_8320(class07209)) ? true : this.u.method_8320(class07209.method_10074()).N(class00869.Z);
      }
   }
}
