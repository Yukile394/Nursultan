package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06882 extends class06896 {
   public static final MapCodec<class06882> N = y(class06882::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06896.i;

   public class06882(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, true));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(L) && var1.L(y) != var4 ? 15 : 0;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Nullable
   @Override
   protected class02733 N(class07299 var1, class00500 var2) {
      return class02752.N(var1, var2.L(y).b(), class07211.field_11036);
   }

   @Override
   public MapCodec<class06882> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00651.U(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.b() == var1.L(y) && !var1.N(var2, var4) ? class00869.N.W() : var1;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = class00869.LH.N(var1);
      return class00500 == null ? null : this.W().y(y, class00500.L(y));
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(L)) {
         class07211 class07211 = var1.L(y).b();
         double d0 = 0.27;
         double d1 = var3.method_10263() + 0.5 + (var4.U() - 0.5) * 0.2 + 0.27 * class07211.P();
         double d2 = var3.method_10264() + 0.7 + (var4.U() - 0.5) * 0.2 + 0.22;
         double d3 = var3.method_10260() + 0.5 + (var4.U() - 0.5) * 0.2 + 0.27 * class07211.T();
         var2.method_8406(class07138.y, d1, d2, d3, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean N(class07299 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(y).b();
      return var1.L(var2.method_10093(class07211), class07211);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return class00651.y(var2, var3, var1.L(y));
   }
}
