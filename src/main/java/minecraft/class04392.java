package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class class04392 extends class00891 implements class06084 {
   public static final MapCodec<class04392> N = y(class04392::new);
   public static final int y = 15;
   public static final class08071 L = class06665.Nf;
   public static final class06667 u = class06665.q;
   public static final ToIntFunction<class00500> i = var0 -> var0.L(L);

   public class04392(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 15).y(u, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected float y(class00500 var1, class07290 var2, class07209 var3) {
      return 1.0F;
   }

   @Override
   protected boolean y(class00500 var1) {
      return var1.Y().W();
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var4.method_7338()) {
         var2.method_8652(var3, var1.N(L), 2);
         return class07082.y;
      } else {
         return class07082.L;
      }
   }

   @Override
   public MapCodec<class04392> N() {
      return N;
   }

   public static class06584 N(class06584 var0, int var1) {
      var0.N(class02484.Nl, class02841.N.N(L, var1));
      return var0;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return N(super.N(var1, var2, var3, var4), var3.L(L));
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return var4.N(class06570.Zt) ? class00389.y() : class00389.N();
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }
}
