package minecraft;

import com.mojang.serialization.MapCodec;

public class class06885 extends class00891 {
   public static final MapCodec<class06885> N = y(class06885::new);

   public class06885(class01362 var1) {
      super(var1);
   }

   @Override
   public MapCodec<class06885> N() {
      return N;
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (!var1.N(class06570.vr)) {
         return super.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var3 instanceof class04782 class04782) {
         class07211 class07211x = var7.i();
         class07211 class07211x = class07211x.z() == class07185.field_11052 ? var5.method_5735().b() : class07211x;
         N(
            class04782,
            class06273.NX,
            var2,
            var3.method_8321(var4),
            var1,
            var5,
            (var3x, var4x) -> {
               class00717 class00717 = new class00717(
                  var3, var4.method_10263() + 0.5 + class07211.P() * 0.65, var4.method_10264() + 0.1, var4.method_10260() + 0.5 + class07211.T() * 0.65, var4x
               );
               class00717.method_18800(0.05 * class07211.P() + var3.field_9229.U() * 0.02, 0.05, 0.05 * class07211.T() + var3.field_9229.U() * 0.02);
               var3.method_8649(class00717);
            }
         );
         var3.method_8396(null, var4, class04909.lo, class04911.field_15245, 1.0F, 1.0F);
         var3.method_8652(var4, class00869.iK.W().y(class00885.y, class07211x), 11);
         var1.N(1, var5, var6.N());
         var3.N(var5, class01194.H, var4);
         var5.method_7259(class01235.L.y(class06570.vr));
         return class07082.N;
      } else {
         return class07082.N;
      }
   }
}
