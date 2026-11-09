package minecraft;

public class class02000 extends class02795<class02976, class08787, class03797> {
   private static final class01894 N = class01894.y("textures/entity/camel/camel.png");

   public class02000(class04832 var1) {
      super(var1, new class03797(var1.N(class04802.V)), new class03797(var1.N(class04802.e)), 0.7F);
      this.N(this.N(var1));
   }

   public class08787 method_55269() {
      return new class08787();
   }

   public void method_62354(class02976 var1, class08787 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_6118(class07085.field_55946).t();
      var2.y = var1.method_5782();
      var2.L = Math.max(var1.n() - var3, 0.0F);
      var2.u.N(var1.h);
      var2.i.N(var1.r);
      var2.R.N(var1.NN);
      var2.M.N(var1.Ny);
      var2.B.N(var1.NL);
   }

   public class01894 N(class08787 var1) {
      return N;
   }

   protected class00207<class08787, class03797, class00210> N(class04832 var1) {
      return new class00207<>(
         this, var1.B(), class08719.field_56125, var0 -> var0.N, new class00210(var1.N(class04802.H)), new class00210(var1.N(class04802.c))
      );
   }
}
