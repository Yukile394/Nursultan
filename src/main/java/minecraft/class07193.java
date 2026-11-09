package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class07193 extends class07101 {
   public static final class08064<class06657> L = class06665.D;

   public class07193(class01362 var1) {
      super(var1);
   }

   protected static class07211 U(class00500 var0) {
      switch ((class06657)var0.L(L)) {
         case field_12473:
            return class07211.field_11033;
         case field_12475:
            return class07211.field_11036;
         default:
            return var0.L(R);
      }
   }

   public static boolean y(class05487 var0, class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10093(var2);
      return var0.method_8320(class07209).L(var0, class07209, var2.b());
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      for (class07211 class07211 : var1.i()) {
         class00500 class00500;
         if (class07211.z() == class07185.field_11052) {
            class00500 = this.W().y(L, class07211 == class07211.field_11036 ? class06657.field_12473 : class06657.field_12475).y(R, var1.method_8042());
         } else {
            class00500 = this.W().y(L, class06657.field_12471).y(R, class07211.b());
         }

         if (class00500.N((class05487)var1.method_8045(), var1.method_8037())) {
            return class00500;
         }
      }

      return null;
   }

   @Override
   protected abstract MapCodec<? extends class07193> N();

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return U(var1).b() == var5 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return y(var2, var3, U(var1).b());
   }
}
