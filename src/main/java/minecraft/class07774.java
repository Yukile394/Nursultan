package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class07774 extends class07781 {
   public static final MapCodec<class07774> y = y(class07774::new);
   public static final class08064<class07211> L = class07101.R;
   private static final Map<class07211, class00494> i = class00389.L(class00891.y(16.0, 8.0, 5.0, 16.0));

   public class07774(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, class07211.field_11043).y(u, true));
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5.b() == var1.L(L) && !var1.N(var2, var4) ? class00869.N.W() : var1;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = super.N(var1);
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211 : var1.i()) {
         if (class07211.z().L()) {
            class00500 = class00500.y(L, class07211.b());
            if (class00500.N((class05487)class07299, class07209)) {
               return class00500;
            }
         }
      }

      return null;
   }

   @Override
   public MapCodec<? extends class07774> N() {
      return y;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i.get(var1.L(L));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211 = var1.L(L);
      class07209 class07209 = var3.method_10093(class07211.b());
      return var2.method_8320(class07209).L(var2, class07209, class07211);
   }
}
