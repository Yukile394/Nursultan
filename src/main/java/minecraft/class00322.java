package minecraft;

public class class00322<T extends class00245> extends class02840<T, class00292, class00313> {
   private static final class01894 N = class01894.y("textures/entity/creaking/creaking.png");
   private static final class01894 i = class01894.y("textures/entity/creaking/creaking_eyes.png");

   public class00322(class04832 var1) {
      super(var1, new class00313(var1.N(class04802.Nt)), 0.6F);
      this.N(new class03971<>(this, var0 -> i, (var0, var1x) -> var0.u ? 1.0F : 0.0F, new class00313(var1.N(class04802.NG)), class06851::T, true));
   }

   public class00292 method_55269() {
      return new class00292();
   }

   public void method_62354(T var1, class00292 var2, float var3) {
      super.method_62354((T)var1, var2, var3);
      var2.y.N(var1.M);
      var2.N.N(var1.B);
      var2.L.N(var1.Z);
      if (var1.W()) {
         var2.r = 0.0F;
         var2.NU = false;
         var2.u = var1.m();
      } else {
         var2.u = var1.v();
      }

      var2.i = var1.B();
   }

   public class01894 N(class00292 var1) {
      return N;
   }
}
