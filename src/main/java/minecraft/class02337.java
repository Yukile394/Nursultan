package minecraft;

public class class02337 extends class04507<class08002, class08458> {
   private static final class01894 N = class01894.y("textures/entity/shulker/spark.png");
   private static final class07311 y = class06851.z(N);
   private final class02143 L;

   public class02337(class04832 var1) {
      super(var1);
      this.L = new class02143(var1.N(class04802.uM));
   }

   protected int method_24087(class08002 var1, class07209 var2) {
      return 15;
   }

   public void method_62354(class08002 var1, class08458 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.y = var1.method_61415(var3);
      var2.N = var1.method_61414(var3);
   }

   public class08458 method_55269() {
      return new class08458();
   }

   public void method_3936(class08458 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      float f = var1.P;
      var2.N(0.0F, 0.15F, 0.0F);
      var2.N(class02058.u.N(class04995.m(f * 0.1F) * 180.0F));
      var2.N(class02058.y.N(class04995.P(f * 0.1F) * 180.0F));
      var2.N(class02058.R.N(class04995.m(f * 0.15F) * 360.0F));
      var2.y(-0.5F, -0.5F, 0.5F);
      var3.N(this.L, var1, var2, this.L.method_23500(N), var1.G, class01384.u, var1.l, null);
      var2.y(1.5F, 1.5F, 1.5F);
      var3.N(1).N(this.L, var1, var2, y, var1.G, class01384.u, 654311423, null, var1.l, null);
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }
}
