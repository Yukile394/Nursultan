package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06081 extends class00891 implements class06084 {
   public static final MapCodec<class06081> N = y(class06081::new);
   private static final class06667 y = class06665.q;
   private static final class00494 L = class00891.y(12.0, 10.0, 16.0);

   public class06081(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(y) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   public MapCodec<class06081> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11036 && !this.a_(var1, var2, var4)) {
         return class00869.N.W();
      } else {
         if (var1.L(y)) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = super.N(var1);
      if (class00500 != null) {
         class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
         return class00500.y(y, class04688.N() == class04684.L);
      } else {
         return null;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10084();
      return var2.method_8320(class07209).L(var2, class07209, class07211.field_11033);
   }
}
