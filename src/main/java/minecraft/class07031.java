package minecraft;

import com.mojang.serialization.MapCodec;

public class class07031 extends class00741 {
   public static final MapCodec<class07031> N = y(class07031::new);

   public class07031(class01362 var1) {
      super(var1);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      double d0 = Math.abs(var4.method_18798().B);
      if (d0 < 0.1 && !var4.method_21749()) {
         double d1 = 0.4 + d0 * 0.2;
         var4.method_18799(var4.method_18798().u(d1, 1.0, d1));
      }

      super.N(var1, var2, var3, var4);
   }

   private void N(class07049 var1) {
      class06889 class06889 = var1.method_18798();
      if (class06889.B < 0.0) {
         double d0 = var1 instanceof class07438 ? 1.0 : 0.8;
         var1.method_18800(class06889.M, -class06889.B * d0, class06889.Z);
      }
   }

   @Override
   public MapCodec<class07031> N() {
      return N;
   }

   @Override
   public void N(class07290 var1, class07049 var2) {
      if (var2.method_21750()) {
         super.N(var1, var2);
      } else {
         this.N(var2);
      }
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      if (!var4.method_21750()) {
         var4.method_5747(var5, 0.0F, var1.method_48963().E());
      }
   }
}
