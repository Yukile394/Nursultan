package minecraft;

class class07526 extends class07473 {
   private final class07525 N;

   public class07526(class07525 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      class06069 class06069 = this.N.method_59922();
      class07299 class07299 = this.N.method_73183();
      int i = class04995.N(this.N.method_23317() - 1.0 + class06069.U() * 2.0);
      int j = class04995.N(this.N.method_23318() + class06069.U() * 2.0);
      int k = class04995.N(this.N.method_23321() - 1.0 + class06069.U() * 2.0);
      class07209 class07209x = new class07209(i, j, k);
      class00500 class00500xx = class07299.method_8320(class07209x);
      class07209 class07209x = class07209x.method_10074();
      class00500 class00500x = class07299.method_8320(class07209x);
      class00500 class00500xx = this.N.n();
      if (class00500xx != null) {
         class00500xx = class00891.a_(class00500xx, this.N.method_73183(), class07209x);
         if (this.N(class07299, class07209x, class00500xx, class00500xx, class00500x, class07209x)) {
            class07299.method_8652(class07209x, class00500xx, 3);
            class07299.N(class01194.Z, class07209x, class01164.N(this.N, class00500xx));
            this.N.N(null);
         }
      }
   }

   @Override
   public boolean N() {
      if (this.N.n() == null) {
         return false;
      } else {
         return !N(this.N).method_64395().N(class07305.I) ? false : this.N.method_59922().y(y(2000)) == 0;
      }
   }

   private boolean N(class07299 var1, class07209 var2, class00500 var3, class00500 var4, class00500 var5, class07209 var6) {
      return var4.P()
         && !var5.P()
         && !var5.N(class00869.q)
         && var5.W(var1, var6)
         && var3.N((class05487)var1, var2)
         && var1.N_70(this.N, class00734.N(class06889.N(var2))).isEmpty();
   }
}
