package minecraft;

import java.util.EnumSet;

class class07642 extends class07473 {
   private final class07618 N;
   private boolean y;

   @Override
   public void L() {
      if (this.N.method_73183() instanceof class04782) {
         class04782 class04782 = (class04782)this.N.method_73183();
         this.y = false;
         this.N.f().W();
         class07209 class07209x = this.N.method_24515();
         class07209 class07209x = class04782.method_8487(class04398.y, class07209x, 50, false);
         if (class07209x != null) {
            this.N.i = class07209x;
            class04782.method_8421(this.N, (byte)38);
         } else {
            this.y = true;
         }
      }
   }

   class07642(class07618 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      if (this.N.i != null) {
         class07299 class07299 = this.N.method_73183();
         if (this.N.m() || this.N.f().U()) {
            class06889 class06889x = class06889.y(this.N.i);
            class06889 class06889x = class05475.N(this.N, 16, 1, class06889x, (float) (Math.PI / 8));
            if (class06889x == null) {
               class06889x = class05475.N(this.N, 8, 4, class06889x, (float) (Math.PI / 2));
            }

            if (class06889x != null) {
               class07209 class07209 = class07209.method_49638(class06889x);
               if (!class07299.method_8316(class07209).N(class01231.N) || !class07299.method_8320(class07209).N(class08791.field_48)) {
                  class06889x = class05475.N(this.N, 8, 5, class06889x, (float) (Math.PI / 2));
               }
            }

            if (class06889x == null) {
               this.y = true;
               return;
            }

            this.N.p().N(class06889x.M, class06889x.B, class06889x.Z, this.N.NR() + 20, this.N.Ni());
            this.N.f().N(class06889x.M, class06889x.B, class06889x.Z, 1.3);
            if (class07299.field_9229.y(this.N(80)) == 0) {
               class07299.method_8421(this.N, (byte)38);
            }
         }
      }
   }

   @Override
   public void u() {
      class07209 class07209 = this.N.i;
      if (class07209 == null
         || class07209.method_49637(class07209.method_10263(), this.N.method_23318(), class07209.method_10260()).method_19769(this.N.method_73189(), 4.0)
         || this.y) {
         this.N.N(false);
      }
   }

   @Override
   public boolean y() {
      class07209 class07209 = this.N.i;
      return class07209 == null
         ? false
         : !class07209.method_49637(class07209.method_10263(), this.N.method_23318(), class07209.method_10260()).method_19769(this.N.method_73189(), 4.0)
            && !this.y
            && this.N.method_5669() >= 100;
   }

   @Override
   public boolean N() {
      return this.N.B() && this.N.method_5669() >= 100;
   }

   @Override
   public boolean O_() {
      return false;
   }
}
