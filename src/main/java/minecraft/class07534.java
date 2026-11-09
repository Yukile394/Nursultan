package minecraft;

import org.jspecify.annotations.Nullable;

public class class07534 extends class07141 {
   public static class05300 M() {
      return class07141.B().N(class05298.n, 12.0);
   }

   @Override
   public class06889 method_55668(class07049 var1) {
      return var1.method_17681() <= this.method_17681() ? new class06889(0.0, 0.21875 * this.method_55693(), 0.0) : super.method_55668(var1);
   }

   public class07534(class07078<? extends class07534> var1, class07299 var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      return var4;
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      if (super.method_6121(var1, var2)) {
         if (var2 instanceof class07438) {
            byte b0 = 0;
            if (this.method_73183().y() == class07086.field_5802) {
               b0 = 7;
            } else if (this.method_73183().y() == class07086.field_5807) {
               b0 = 15;
            }

            if (b0 > 0) {
               ((class07438)var2).method_37222(new class07055(class07047.j, b0 * 20, 0), this);
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
