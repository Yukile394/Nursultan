package minecraft;

public class class02288 extends class04507<class08021, class08456> {
   private static final class01894 N = class01894.y("textures/entity/llama/spit.png");
   private final class06065 y;

   public class02288(class04832 var1) {
      super(var1);
      this.y = new class06065(var1.N(class04802.yp));
   }

   public void method_3936(class08456 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N(0.0F, 0.15F, 0.0F);
      var2.N(class02058.u.N(var1.N - 90.0F));
      var2.N(class02058.R.N(var1.y));
      var3.N(this.y, var1, var2, this.y.method_23500(N), var1.G, class01384.u, var1.l, null);
      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   public void method_62354(class08021 var1, class08456 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.y = var1.method_61414(var3);
      var2.N = var1.method_61415(var3);
   }

   public class08456 method_55269() {
      return new class08456();
   }
}
