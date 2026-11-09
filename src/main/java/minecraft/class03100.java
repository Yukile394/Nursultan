package minecraft;

public class class03100 extends class02840<class07525, class08785, class06374<class08785>> {
   private static final class01894 N = class01894.y("textures/entity/enderman/enderman.png");
   private final class06069 i = class06069.u();

   public class03100(class04832 var1) {
      super(var1, new class06374<>(var1.N(class04802.Nx)), 0.5F);
      this.N(new class02568(this));
      this.N(new class02235(this));
   }

   public class01894 y(class08785 var1) {
      return N;
   }

   public class08785 method_55269() {
      return new class08785();
   }

   public void method_62354(class07525 var1, class08785 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class04256.N(var1, var2, var3, this.L);
      var2.N = var1.t();
      var2.y = var1.n();
   }

   public class06889 method_23169(class08785 var1) {
      class06889 class06889 = super.method_23169(var1);
      if (var1.N) {
         double d0 = 0.02 * var1.NL;
         return class06889.y(this.i.E() * d0, 0.0, this.i.E() * d0);
      } else {
         return class06889;
      }
   }
}
