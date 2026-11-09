package minecraft;

import com.mojang.serialization.MapCodec;

public class class00420 extends class00891 {
   public static final MapCodec<class00420> N = y(class00420::new);

   public class00420(class01362 var1) {
      super(var1);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class07211 class07211 = class07211.y(var4);
      if (class07211 != class07211.field_11036) {
         class07209 class07209 = var3.method_10093(class07211);
         class00500 class00500 = var2.method_8320(class07209);
         if (!var1.G() || !class00500.L(var2, class07209, class07211.b())) {
            double d0 = var3.method_10263();
            double d1 = var3.method_10264();
            double d2 = var3.method_10260();
            if (class07211 == class07211.field_11033) {
               d1 -= 0.05;
               d0 += var4.U();
               d2 += var4.U();
            } else {
               d1 += var4.U() * 0.8;
               if (class07211.z() == class07185.field_11048) {
                  d2 += var4.U();
                  if (class07211 == class07211.field_11034) {
                     d0++;
                  } else {
                     d0 += 0.05;
                  }
               } else {
                  d0 += var4.U();
                  if (class07211 == class07211.field_11035) {
                     d2++;
                  } else {
                     d2 += 0.05;
                  }
               }
            }

            var2.method_8406(class07107.W, d0, d1, d2, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public MapCodec<class00420> N() {
      return N;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (var2.method_75728().N(class00608.Y, var3)) {
         var2.method_8652(var3, class00869.NS.W(), 3);
         var2.N(2009, var3, 0);
         var2.method_8396(null, var3, class04909.II, class04911.field_15245, 1.0F, (1.0F + var2.method_8409().z() * 0.2F) * 0.7F);
      }
   }
}
