package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06761 extends class00864 {
   public static final MapCodec<class06761> N = y(class06761::new);
   public static final class08064<class08059> y = class06665.NB;

   public class06761(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class08059.field_12607));
   }

   public static class00500 y(class05487 var0, class07209 var1, class00500 var2) {
      return var2.y(class06665.q) ? var2.y(class06665.q, var0.z(var1)) : var2;
   }

   protected static void y(class07299 var0, class07209 var1, class00500 var2, class08036 var3) {
      if (var2.L(y) == class08059.field_12609) {
         class07209 class07209 = var1.method_10074();
         class00500 class00500x = var0.method_8320(class07209);
         if (class00500x.N(var2.i()) && class00500x.L(y) == class08059.field_12607) {
            class00500 class00500x = class00500x.Y().y(class04684.L) ? class00869.K.W() : class00869.N.W();
            var0.method_8652(class07209, class00500x, 35);
            var0.method_8444(var3, 2001, class07209, class00891.W(class00500x));
         }
      }
   }

   @Override
   public void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4, @Nullable class00394 var5, class06584 var6) {
      super.N(var1, var2, var3, class00869.N.W(), var5, var6);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class08059 class08059 = var1.L(y);
      if (var5.z() != class07185.field_11052
         || class08059 == class08059.field_12607 != (var5 == class07211.field_11036)
         || var7.N(this) && var7.L(y) != class08059) {
         return class08059 == class08059.field_12607 && var5 == class07211.field_11033 && !var1.N(var2, var4)
            ? class00869.N.W()
            : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         return class00869.N.W();
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected long N(class00500 var1, class07209 var2) {
      return class04995.y(var2.method_10263(), var2.method_10087(var1.L(y) == class08059.field_12607 ? 0 : 1).method_10264(), var2.method_10260());
   }

   @Override
   public MapCodec<? extends class06761> N() {
      return N;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      class07209 class07209 = var2.method_10084();
      var1.method_8652(class07209, y(var1, class07209, this.W().y(y, class08059.field_12609)), 3);
   }

   public static void N(class07284 var0, class00500 var1, class07209 var2, int var3) {
      class07209 class07209 = var2.method_10084();
      var0.method_8652(var2, y(var0, var2, var1.y(y, class08059.field_12607)), var3);
      var0.method_8652(class07209, y(var0, class07209, var1.y(y, class08059.field_12609)), var3);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07209 class07209 = var1.method_8037();
      class07299 class07299 = var1.method_8045();
      return class07209.method_10264() < class07299.method_31600() && class07299.method_8320(class07209.method_10084()).N(var1) ? super.N(var1) : null;
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608()) {
         if (var4.method_66324()) {
            y(var1, var2, var3, var4);
         } else {
            N(var3, var1, var2, null, var4, var4.method_6047());
         }
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      if (var1.L(y) != class08059.field_12609) {
         return super.a_(var1, var2, var3);
      } else {
         class00500 class00500 = var2.method_8320(var3.method_10074());
         return class00500.N(this) && class00500.L(y) == class08059.field_12607;
      }
   }
}
