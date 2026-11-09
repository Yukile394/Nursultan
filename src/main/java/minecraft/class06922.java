package minecraft;

public class class06922 extends class07482 {
   private static final int y = 27;
   public final class06695 N;

   public class06922(int var1, class08044 var2) {
      this(var1, var2, new class07075(27));
   }

   public class06922(int var1, class08044 var2, class06695 var3) {
      super(class05851.field_17341, var1);
      N(var3, 27);
      this.N = var3;
      var3.method_5435(var2.z);
      byte b0 = 3;
      byte b1 = 9;

      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 9; j++) {
            this.N(new class06948(var3, j + i * 9, 8 + j * 18, 18 + i * 18));
         }
      }

      this.L(var2, 8, 84);
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.N.method_5432(var1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 < this.N.method_5439()) {
            if (!this.N(class06584x, this.N.method_5439(), this.T.size(), true)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 0, this.N.method_5439(), false)) {
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
      return this.N.method_5443(var1);
   }
}
