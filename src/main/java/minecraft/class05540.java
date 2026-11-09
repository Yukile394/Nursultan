package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class class05540 extends class07101 implements class00873, class06084 {
   public static final MapCodec<class05540> N = y(class05540::new);
   private static final class06667 y = class06665.q;
   private static final Map<class07211, class00494> L = class00389.L(class00891.y(6.0, 0.0, 16.0).method_1096(0.0, 0.0, 0.25).method_1097());

   public class05540(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false).y(R, class07211.field_11043));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(y) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      Optional<class07209> optional = class01008.N(var1, var2, var3.i(), class07211.field_11036, class00869.nL);
      if (optional.isEmpty()) {
         return false;
      } else {
         class07209 class07209 = optional.get().method_10084();
         class00500 class00500 = var1.method_8320(class07209);
         return class05584.N((class05474)var1, class07209, class00500);
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      Optional<class07209> optional = class01008.N(var1, var3, var4.i(), class07211.field_11036, class00869.nL);
      if (!optional.isEmpty()) {
         class07209 class07209x = optional.get();
         class07209 class07209x = class07209x.method_10084();
         class07211 class07211 = var4.L(R);
         N(var1, class07209x, var1.method_8316(class07209x), class07211);
         class05584.N(var1, class07209x, var1.method_8316(class07209x), class07211);
      }
   }

   @Override
   public MapCodec<class05540> N() {
      return N;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class00869.nL);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, R);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L.get(var1.L(R));
   }

   protected static boolean N(class07284 var0, class07209 var1, class04688 var2, class07211 var3) {
      class00500 class00500 = class00869.nu.W().y(y, var2.N(class04684.L)).y(R, var3);
      return var0.method_8652(var1, class00500, 3);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if ((var5 == class07211.field_11033 || var5 == class07211.field_11036) && !var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      if (var1.L(y)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      class00500 class00500x = var2.method_8320(class07209);
      class00500 class00500x = var2.method_8320(var3.method_10084());
      return (class00500x.N(this) || class00500x.N(class01210.ye)) && (class00500x.N(this) || class00500x.N(class00869.nL));
   }
}
