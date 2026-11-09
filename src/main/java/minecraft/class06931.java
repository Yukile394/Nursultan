package minecraft;

public class class06931<T extends class07049 & class01361> extends class06581 {
   private final class07078<T> N;
   private final int y;

   public class06931(class07078<T> var1, int var2, class06573 var3) {
      super(var3);
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584x = var2.method_5998(var3);
      if (var1.method_8608()) {
         return class07082.i;
      } else {
         class07049 class07049 = var2.method_49694();
         if (var2.method_5765() && class07049 instanceof class01361 class01361 && class07049.method_5864() == this.N && class01361.W()) {
            class07085 class07085 = var3.N();
            class06584 class06584x = class06584x.N(this.y, class06570.jr, var2, class07085);
            return class07082.y.N(class06584x);
         } else {
            var2.method_7259(class01235.L.y(this));
            return class07082.i;
         }
      }
   }
}
