package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

class class04590 extends class04614 {
   private final class06581 y;
   private final class04618 L;

   class04590(class04611 var1, class06581 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = new class04618(this, var2.E());
   }

   protected void N(class01054 var1, @Nullable class04907<?> var2, int var3, int var4, boolean var5) {
      Object object = var2 == null ? class04610.i : class00392.y(var2.N(this.N.R.B.N(var2)));
      var1.y(class04610.M(this.N.R), (class00392)object, var3 - class04610.B(this.N.R).N((class05936)object), var4, var5 ? -1 : -4539718);
   }

   protected class06581 N() {
      return this.y;
   }

   @Override
   public List<? extends class04654> method_25396() {
      return List.of(this.L);
   }

   @Override
   public List<? extends class03434> method_37025() {
      return List.of(this.L);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.L.y(this.method_73380(), this.method_73382());
      this.L.method_25394(var1, var2, var3, var5);
      class04611 class04611 = this.N;
      int i = class04611.method_25396().indexOf(this);

      for (int j = 0; j < class04611.N.size(); j++) {
         class04907<class00891> class04907;
         if (this.y instanceof class06918 class06918) {
            class04907 = class04611.N.get(j).y(class06918.L());
         } else {
            class04907 = null;
         }

         this.N(var1, class04907, this.method_73380() + this.N.N(j), this.method_73385() - 4, i % 2 == 0);
      }

      for (int k = 0; k < class04611.y.size(); k++) {
         this.N(var1, class04611.y.get(k).y(this.y), this.method_73380() + this.N.N(k + class04611.N.size()), this.method_73385() - 4, i % 2 == 0);
      }
   }
}
