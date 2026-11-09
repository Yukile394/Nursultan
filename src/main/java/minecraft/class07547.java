package minecraft;

import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public class class07547 extends class07458 {
   private final class07079 N;
   private int W;
   private final boolean m;
   private final BooleanSupplier P;

   public class07547(class07079 var1, boolean var2, BooleanSupplier var3) {
      super(var1);
      this.N = var1;
      this.m = var2;
      this.P = var3;
   }

   private boolean N(class07290 var1, @Nullable class06889 var2, @Nullable class06889 var3, class07209 var4, boolean var5, boolean var6) {
      class00500 class00500 = var1.method_8320(var4);
      if (class00500.P()) {
         return true;
      } else {
         boolean flag = var2 != null && var3 != null;
         boolean flag1 = flag
            ? !this.N.method_63612(var2, var3, class00500.M(var1, var4).method_64034(new class06889(var4)).method_1090())
            : class00500.M(var1, var4).method_1110();
         if (!this.m) {
            return flag1;
         } else if (class00500.N(class01210.yO)) {
            return false;
         } else {
            class04688 class04688 = var1.method_8316(var4);
            if (!class04688.W() && (!flag || this.N.method_66648(class04688, var4, var2, var3))) {
               if (class04688.N(class01231.N)) {
                  return var5;
               }

               if (class04688.N(class01231.y)) {
                  return var6;
               }
            }

            return flag1;
         }
      }
   }

   private boolean N(class06889 var1) {
      class00734 class00734x = this.N.method_5829();
      class00734 class00734x = class00734x.L(var1);
      if (this.m) {
         for (class07209 class07209 : class07209.method_62671(class00734x.M(1.0))) {
            if (!this.N(this.N.method_73183(), null, null, class07209, false, false)) {
               return false;
            }
         }
      }

      boolean flag = this.N.method_5799();
      boolean flag1 = this.N.method_5771();
      class06889 class06889x = this.N.method_73189();
      class06889 class06889x = class06889x.i(var1);
      return class07290.N(
         class06889x,
         class06889x,
         class00734x,
         (var6x, var7x) -> class00734x.y(var6x) ? true : this.N(this.N.method_73183(), class06889x, class06889, var6x, flag, flag1)
      );
   }

   @Override
   public void N() {
      if (this.P.getAsBoolean()) {
         this.E = class07435.field_6377;
         this.N.NN();
      }

      if (this.E == class07435.field_6378) {
         if (this.W-- <= 0) {
            this.W = this.W + this.N.method_59922().y(5) + 2;
            class06889 class06889 = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
            if (this.N(class06889)) {
               this.N.method_18799(this.N.method_18798().i(class06889.u().L(this.N.method_45325(class05298.m) * 5.0 / 3.0)));
            } else {
               this.E = class07435.field_6377;
            }
         }
      }
   }
}
