package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06088 extends class00748 {
   public static final MapCodec<class06088> L = y(class06088::new);

   public class06088(class01362 var1) {
      super(var1);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         double d0 = var3.method_10263() + 0.5;
         double d1 = var3.method_10264();
         double d2 = var3.method_10260() + 0.5;
         if (var4.U() < 0.1) {
            var2.method_8486(d0, d1, d2, class04909.LH, class04911.field_15245, 1.0F, 1.0F, false);
         }

         class07211 class07211 = var1.L(N);
         class07185 class07185 = class07211.z();
         double d3 = 0.52;
         double d4 = var4.U() * 0.6 - 0.3;
         double d5 = class07185 == class07185.field_11048 ? class07211.P() * 0.52 : d4;
         double d6 = var4.U() * 9.0 / 16.0;
         double d7 = class07185 == class07185.field_11051 ? class07211.T() * 0.52 : d4;
         var2.method_8406(class07107.NZ, d0 + d5, d1 + d6, d2 + d7, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class08036 var3) {
      class00394 class00394 = var1.method_8321(var2);
      if (class00394 instanceof class06120) {
         var3.method_17355((class06237)class00394);
         var3.method_7281(class01235.Nn);
      }
   }

   @Override
   public MapCodec<class06088> N() {
      return L;
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var1, var3, class00404.field_16415);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class06120(var1, var2);
   }
}
