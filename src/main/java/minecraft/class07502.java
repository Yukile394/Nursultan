package minecraft;

public class class07502 extends class07482 {
   private static final int N = 9;
   private static final int y = 9;
   private static final int L = 36;
   private static final int u = 36;
   private static final int i = 45;
   private final class06695 R;

   public class07502(int var1, class08044 var2) {
      this(var1, var2, new class07075(9));
   }

   public class07502(int var1, class08044 var2, class06695 var3) {
      super(class05851.field_17328, var1);
      N(var3, 9);
      this.R = var3;
      var3.method_5435(var2.z);
      this.u(var3, 62, 17);
      this.L(var2, 8, 84);
   }

   protected void u(class06695 var1, int var2, int var3) {
      for (int ix = 0; ix < 3; ix++) {
         for (int j = 0; j < 3; j++) {
            int k = j + ix * 3;
            this.N(new class06937(var1, k, var2 + j * 18, var3 + ix * 18));
         }
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.R.method_5432(var1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 < 9) {
            if (!this.N(class06584x, 9, 45, true)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 0, 9, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   @Override
   public boolean N(class08036 var1) {
      return this.R.method_5443(var1);
   }
}
