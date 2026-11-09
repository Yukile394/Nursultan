package minecraft;

public class class01712 extends class07482 implements class07508 {
   protected static final int N = 9;
   private static final int y = 9;
   private static final int L = 36;
   private static final int u = 36;
   private static final int i = 45;
   private final class06919 R = new class06919();
   private final class05845 j;
   private final class08036 v;
   private final class03507 n;

   public class01712(int var1, class08044 var2) {
      super(class05851.field_46790, var1);
      this.v = var2.z;
      this.j = new class05853(10);
      this.n = new class07495(this, 3, 3);
      this.N(var2);
   }

   public class01712(int var1, class08044 var2, class03507 var3, class05845 var4) {
      super(class05851.field_46790, var1);
      this.v = var2.z;
      this.j = var4;
      this.n = var3;
      N(var3, 9);
      var3.method_5435(var2.z);
      this.N(var2);
      this.N(this);
   }

   private void m() {
      class08036 class08036 = this.v;
      if (class08036 instanceof class04770) {
         class04782 class04782 = ((class04770)class08036).method_51469();
         class02903 class02903 = this.n.u();
         class06584 class06584 = class01748.N(class04782, class02903)
            .map(var2x -> var2x.y().method_8116(class02903, class04782.method_30349()))
            .orElse(class06584.E);
         this.R.method_5447(0, class06584);
      }
   }

   public boolean E() {
      return this.j.N(9) == 1;
   }

   @Override
   public boolean N(class08036 var1) {
      return this.n.method_5443(var1);
   }

   @Override
   public void N(class07482 var1, int var2, class06584 var3) {
      this.m();
   }

   @Override
   public void N(class07482 var1, int var2, int var3) {
   }

   private void N(class08044 var1) {
      for (int ix = 0; ix < 3; ix++) {
         for (int jx = 0; jx < 3; jx++) {
            int k = jx + ix * 3;
            this.N(new class01726(this.n, k, 26 + jx * 18, 17 + ix * 18, this));
         }
      }

      this.L(var1, 8, 84);
      this.N(new class01753(this.R, 0, 134, 35));
      this.N(this.j);
      this.m();
   }

   public void N(int var1, boolean var2) {
      class01726 class01726 = (class01726)this.L(var1);
      this.j.N(class01726.u, var2 ? 0 : 1);
      this.u();
   }

   public boolean N(int var1) {
      return var1 > -1 && var1 < 9 ? this.j.N(var1) == 1 : false;
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
            class06937.i(class06584.E);
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

   public class06695 W() {
      return this.n;
   }
}
