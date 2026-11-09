package minecraft;

import java.util.List;

public class class02660 extends class04507<class07517, class08259> {
   public static final class01894 N = class01894.y("textures/entity/trident.png");
   private final class03852 y;

   public class02660(class04832 var1) {
      super(var1);
      this.y = new class03852(var1.N(class04802.ue));
   }

   public void method_3936(class08259 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N(class02058.u.N(var1.y - 90.0F));
      var2.N(class02058.R.N(var1.N + 90.0F));
      List<class07311> list = class02862.N(this.y.method_23500(N), false, var1.L);

      for (int i = 0; i < list.size(); i++) {
         var3.N(i).N(this.y, class06244.field_17274, var2, list.get(i), var1.G, class01384.u, -1, null, var1.l, null);
      }

      var2.y();
      super.method_3936(var1, var2, var3, var4);
   }

   public void method_62354(class07517 var1, class08259 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.y = var1.method_61415(var3);
      var2.N = var1.method_61414(var3);
      var2.L = var1.m();
   }

   public class08259 method_55269() {
      return new class08259();
   }
}
