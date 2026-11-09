package minecraft;

import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class class06872 implements class03719 {
   class06872(class06880 var1, Set var2, List var3, class04476 var4, class01929 var5, class01997 var6, class01997 var7) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
      this.i = var6;
      this.R = var7;
   }

   private void N(class05946<class06521<?>> var1, class06521<?> var2) {
      this.y.add(class07135.N(this.L, this.u, class06521.R, var2, this.i.N(var1.N())));
   }

   private void N(class03711 var1) {
      this.y.add(class07135.N(this.L, this.u, class07151.N, var1.y(), this.R.N(var1.N())));
   }

   @Override
   public void method_62738() {
      class03711 class03711 = class07165.y().N("impossible", class06912.y.N(new class00828())).y(class05544.N);
      this.N(class03711);
   }

   @Override
   public class07165 method_53818() {
      return class07165.y().N(class05544.N);
   }

   @Override
   public void method_53819(class05946<class06521<?>> var1, class06521<?> var2, @Nullable class03711 var3) {
      if (!this.N.add(var1)) {
         throw new IllegalStateException("Duplicate recipe " + var1.N());
      } else {
         this.N(var1, var2);
         if (var3 != null) {
            this.N(var3);
         }
      }
   }
}
