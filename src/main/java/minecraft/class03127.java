package minecraft;

public class class03127 extends class04507<class00676, class08792> {
   private static final class01894 N = class01894.y("textures/entity/end_crystal/end_crystal.png");
   private static final class07311 y = class06851.M(N);
   private final class02454 L;

   public class03127(class04832 var1) {
      super(var1);
      this.field_4673 = 0.5F;
      this.L = new class02454(var1.N(class04802.Nr));
   }

   public boolean method_3933(class00676 var1, class01383 var2, double var3, double var5, double var7) {
      return super.method_3933(var1, var2, var3, var5, var7) || var1.N() != null;
   }

   public void method_3936(class08792 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.y(2.0F, 2.0F, 2.0F);
      var2.N(0.0F, -0.5F, 0.0F);
      var3.N(this.L, var1, var2, y, var1.G, class01384.u, var1.l, null);
      var2.y();
      class06889 class06889 = var1.y;
      if (class06889 != null) {
         float f = N(var1.P);
         float f1 = (float)class06889.M;
         float f2 = (float)class06889.B;
         float f3 = (float)class06889.Z;
         var2.N(class06889);
         class04511.N(-f1, -f2 + f, -f3, var1.P, var2, var3, var1.G);
      }

      super.method_3936(var1, var2, var3, var4);
   }

   public void method_62354(class00676 var1, class08792 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.P = var1.N + var3;
      var2.N = var1.y();
      class07209 class07209 = var1.N();
      if (class07209 != null) {
         var2.y = class06889.y(class07209).u(var1.method_30950(var3));
      } else {
         var2.y = null;
      }
   }

   public class08792 method_55269() {
      return new class08792();
   }

   public static float N(float var0) {
      float f = class04995.m(var0 * 0.2F) / 2.0F + 0.5F;
      f = (f * f + f) * 0.4F;
      return f - 1.4F;
   }
}
