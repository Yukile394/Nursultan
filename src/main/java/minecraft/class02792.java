package minecraft;

public class class02792 extends class04256<class07182, class08248, class02439> {
   private static final class01894 N = class01894.y("textures/entity/piglin/zombified_piglin.png");

   public class02792(class04832 var1, class01134 var2, class01134 var3, class08118<class01134> var4, class08118<class01134> var5) {
      super(var1, new class02439(var1.N(var2)), new class02439(var1.N(var3)), 0.5F, class01532.N);
      this.N(new class02562<>(this, class08118.N(var4, var1.R(), class02439::new), class08118.N(var5, var1.R(), class02439::new), var1.B()));
   }

   public class08248 method_55269() {
      return new class08248();
   }

   public class01894 N(class08248 var1) {
      return N;
   }

   public void method_62354(class07182 var1, class08248 var2, float var3) {
      super.method_62354((class07182)var1, (class08248)var2, var3);
      var2.N = var1.Nl();
   }
}
