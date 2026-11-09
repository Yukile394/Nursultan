package minecraft;

public class class02650<T extends class07883> extends class02795<T, class08255, class04388> {
   private static final class01894 N = class01894.y("textures/entity/squid/squid.png");

   public class02650(class04832 var1, class04388 var2, class04388 var3) {
      super(var1, var2, var3, 0.7F);
   }

   public class08255 method_55269() {
      return new class08255();
   }

   public void method_62354(T var1, class08255 var2, float var3) {
      super.method_62354((T)var1, var2, var3);
      var2.N = class04995.B(var3, var1.B, var1.M);
      var2.y = class04995.B(var3, var1.y, var1.N);
      var2.L = class04995.B(var3, var1.u, var1.L);
   }

   protected void y(class08255 var1, class01421 var2, float var3, float var4) {
      var2.N(0.0F, var1.NB ? 0.25F : 0.5F, 0.0F);
      var2.N(class02058.u.N(180.0F - var3));
      var2.N(class02058.y.N(var1.y));
      var2.N(class02058.u.N(var1.L));
      var2.N(0.0F, var1.NB ? -0.6F : -1.2F, 0.0F);
   }

   public class01894 N(class08255 var1) {
      return N;
   }
}
