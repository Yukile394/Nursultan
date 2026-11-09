package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class07797 extends class00891 implements class06084 {
   public static final class06667 u = class06665.q;
   private static final class00494 N = class00891.y(12.0, 0.0, 4.0);

   protected static boolean L(class00500 var0, class07290 var1, class07209 var2) {
      if (var0.L(u)) {
         return true;
      } else {
         for (class07211 class07211 : class07211.values()) {
            if (var1.method_8316(var2.method_10093(class07211)).N(class01231.N)) {
               return true;
            }
         }

         return false;
      }
   }

   protected class07797(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(u, true));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5 == class07211.field_11033 && !this.a_(var1, var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u);
   }

   protected void N(class00500 var1, class07290 var2, class08713 var3, class06069 var4, class07209 var5) {
      if (!L(var1, var2, var5)) {
         var3.N(var5, this, 60 + var4.y(40));
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(u, class04688.N(class01231.N) && class04688.R() == 8);
   }

   @Override
   protected abstract MapCodec<? extends class07797> N();

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return var2.method_8320(class07209).L(var2, class07209, class07211.field_11036);
   }
}
