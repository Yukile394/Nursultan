package minecraft;

public class class07478 extends class07482 {
   public static final int N = 5;
   private final class06695 y;

   public class07478(int var1, class08044 var2) {
      this(var1, var2, new class07075(5));
   }

   public class07478(int var1, class08044 var2, class06695 var3) {
      super(class05851.field_17337, var1);
      this.y = var3;
      N(var3, 5);
      var3.method_5435(var2.z);

      for (int i = 0; i < 5; i++) {
         this.N(new class06937(var3, i, 44 + i * 18, 20));
      }

      this.L(var2, 8, 51);
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.y.method_5432(var1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 < this.y.method_5439()) {
            if (!this.N(class06584x, this.y.method_5439(), this.T.size(), true)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 0, this.y.method_5439(), false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }
      }

      return class06584x;
   }

   @Override
   public boolean N(class08036 var1) {
      return this.y.method_5443(var1);
   }
}
