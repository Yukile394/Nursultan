package minecraft;

import org.jspecify.annotations.Nullable;

class class00876 implements class06237 {
   @Override
   public class00392 method_5476() {
      if (this.N.method_16914()) {
         return this.N.method_5476();
      } else {
         return (class00392)(this.y.method_16914() ? this.y.method_5476() : class00392.L("container.chestDouble"));
      }
   }

   class00876(class00861 var1, class00379 var2, class00379 var3, class06695 var4) {
      super();
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Nullable
   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      if (this.N.N(var3) && this.y.N(var3)) {
         this.N.y(var2.z);
         this.y.y(var2.z);
         return class07490.y(var1, var2, this.L);
      } else {
         class07211 class07211 = class00860.E(this.N.w());
         class07236.N(this.N.d().method_46558().y(class07211.P() / 2.0, 0.0, class07211.T() / 2.0), var3, this.method_5476());
         return null;
      }
   }
}
