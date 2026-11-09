package minecraft;

import org.jspecify.annotations.Nullable;

class class07638 extends class07977 {
   @Nullable
   @Override
   protected class06889 M() {
      class06889 class06889 = null;
      if (this.y.method_5799()) {
         class06889 = class05456.N(this.y, 15, 15);
      }

      if (this.y.method_59922().z() >= this.z) {
         class06889 = this.U();
      }

      return class06889 == null ? super.M() : class06889;
   }

   public class07638(class07475 var1, double var2) {
      super(var1, var2);
   }

   @Nullable
   private class06889 U() {
      class07209 class07209x = this.y.method_24515();
      class07218 class07218x = new class07218();
      class07218 class07218x = new class07218();

      for (class07209 class07209x : class07209.method_10094(
         class04995.N(this.y.method_23317() - 3.0),
         class04995.N(this.y.method_23318() - 6.0),
         class04995.N(this.y.method_23321() - 3.0),
         class04995.N(this.y.method_23317() + 3.0),
         class04995.N(this.y.method_23318() + 6.0),
         class04995.N(this.y.method_23321() + 3.0)
      )) {
         if (!class07209x.equals(class07209x)) {
            class00500 class00500 = this.y.method_73183().method_8320(class07218x.N(class07209x, class07211.field_11033));
            if ((class00500.i() instanceof class07131 || class00500.N(class01210.g))
               && this.y.method_73183().R(class07209x)
               && this.y.method_73183().R(class07218x.N(class07209x, class07211.field_11036))) {
               return class06889.L(class07209x);
            }
         }
      }

      return null;
   }
}
