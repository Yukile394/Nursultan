package minecraft;

public class class01532 extends class04256<class01238, class08447, class01486> {
   private static final class01894 i = class01894.y("textures/entity/piglin/piglin.png");
   private static final class01894 R = class01894.y("textures/entity/piglin/piglin_brute.png");
   public static final class02221 N = new class02221(0.0F, 0.0F, 1.0019531F);

   public class01532(class04832 var1, class01134 var2, class01134 var3, class08118<class01134> var4, class08118<class01134> var5) {
      super(var1, new class01486(var1.N(var2)), new class01486(var1.N(var3)), 0.5F, N);
      this.N(new class02562<>(this, class08118.N(var4, var1.R(), class01486::new), class08118.N(var5, var1.R(), class01486::new), var1.B()));
   }

   protected boolean L(class08447 var1) {
      return super.L(var1) || var1.y;
   }

   public class08447 method_55269() {
      return new class08447();
   }

   public class01894 N(class08447 var1) {
      return var1.N ? R : i;
   }

   public void method_62354(class01238 var1, class08447 var2, float var3) {
      super.method_62354((class01238)var1, (class08447)var2, var3);
      var2.N = var1.method_5864() == class07078.yN;
      var2.p = var1.E();
      var2.a = class06593.y(var1.method_6030(), var1);
      var2.y = var1.G();
   }
}
