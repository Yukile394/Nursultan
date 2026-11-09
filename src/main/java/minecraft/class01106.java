package minecraft;

import com.mojang.serialization.MapCodec;

public class class01106 extends class07215 {
   public static final MapCodec<class01106> N = y(class01106::new);

   public class01106(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11036));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public MapCodec<class01106> N() {
      return N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class07211 class07211 = var1.L(y);
      double d0 = var3.method_10263() + 0.55 - var4.z() * 0.1F;
      double d1 = var3.method_10264() + 0.55 - var4.z() * 0.1F;
      double d2 = var3.method_10260() + 0.55 - var4.z() * 0.1F;
      double d3 = 0.4F - (var4.z() + var4.z()) * 0.4F;
      if (var4.y(5) == 0) {
         var2.method_8406(
            class07107.n, d0 + class07211.P() * d3, d1 + class07211.s() * d3, d2 + class07211.T() * d3, var4.E() * 0.005, var4.E() * 0.005, var4.E() * 0.005
         );
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211 = var1.method_8038();
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037().method_10093(class07211.b()));
      return class00500.N(this) && class00500.L(y) == class07211 ? this.W().y(y, class07211.b()) : this.W().y(y, class07211);
   }
}
