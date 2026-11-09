package minecraft;

import Nursultan.class10762;
import Nursultan.class10866;
import org.jspecify.annotations.Nullable;

public class class07564 extends class08004 {
   @Override
   protected void L(class04782 var1) {
      this.N(var1, class07078.yx);
      if (!this.method_5701()) {
         var1.method_8444(null, 1041, this.method_24515(), 0);
      }
   }

   public class07564(class07078<? extends class07564> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      return class04909.Ph;
   }

   @Override
   protected boolean m() {
      return true;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      var4 = super.N(var1, var2, var3, var4);
      float f = var2.u();
      if (var3 != class06113.field_16468) {
         this.L(class06069.z() < 0.55F * f);
      }

      if (var4 != null) {
         var4 = new class10762((class10866)var4);
         ((class10762)var4).N = var3 != class06113.field_16459;
      }

      if (var4 instanceof class10762 class10762 && !class10762.N) {
         class07209 class07209 = this.method_24515();
         if (var1.y(class07078.G.N(class07209.method_10263() + 0.5, class07209.method_10264(), class07209.method_10260() + 0.5))) {
            class10762.N = true;
            if (class06069.z() < 0.1F) {
               this.method_5673(class07085.field_6173, new class06584(class06570.le));
               class06832 class06832 = class07078.G.N(this.method_73183(), class06113.field_16459);
               if (class06832 != null) {
                  class06832.method_5814(this.method_23317(), this.method_23318(), this.method_23321());
                  class06832.N(var1, var2, var3, null);
                  this.method_5873(class06832, true, true);
                  var1.method_8649(class06832);
                  class06824 class06824 = class07078.NS.N(this.method_73183(), class06113.field_16459);
                  if (class06824 != null) {
                     class06824.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
                     class06824.N(var1, var2, var3, null);
                     class06824.method_5873(class06832, false, false);
                     var1.y(class06824);
                  }
               }
            }
         }
      }

      return var4;
   }

   @Override
   public class04891 method_6002() {
      return class04909.sN;
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      boolean flag = super.method_6121(var1, var2);
      if (flag && this.method_6047().R() && var2 instanceof class07438) {
         float f = var1.method_8404(this.method_24515()).y();
         ((class07438)var2).method_37222(new class07055(class07047.T, 140 * (int)f), this);
      }

      return flag;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.sy;
   }

   @Override
   protected class04891 X_() {
      return class04909.sL;
   }

   @Override
   protected boolean U_() {
      return false;
   }
}
