package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class00325 extends class07796 {
   public static final MapCodec<class00325> N = y(class00325::new);
   public static final class08064<class07185> y = class06665.V;
   public static final class08064<class08630> L = class06665.yI;
   public static final class06667 u = class06665.G;

   private static class00500 L(class00500 var0, class07299 var1, class07209 var2) {
      boolean flag = N(var0, var1, var2);
      boolean flag1 = var0.L(L) == class08630.field_55831;
      return flag && flag1 ? var0.y(L, var1.method_75728().N(class00608.e, var2) ? class08630.field_55833 : class08630.field_55832) : var0;
   }

   public class00325(class01362 var1) {
      super(var1);
      this.P(this.W().y(y, class07185.field_11052).y(L, class08630.field_55831).y(u, false));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var2.method_8321(var3) instanceof class00327 class00327 && var4 instanceof class02756 class02756 && var4.y().N()) {
         class00327.N(class02756.U());
         if (var4.L() instanceof class08036 class08036 && var4.y().N()) {
            this.N(class08036, var1, var2, var3);
         }
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return class07004.y(var1, var2);
   }

   @Override
   public MapCodec<class00325> N() {
      return N;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      if (var1.L(L) == class08630.field_55831) {
         return 0;
      } else {
         return var2.method_8321(var3) instanceof class00327 class00327 ? class00327.L() : 0;
      }
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   private void N(class08036 var1, class00500 var2, class07299 var3, class07209 var4) {
      if (!var1.method_66324() && !var1.method_7325() && var2.L(u) && var3 instanceof class04782 class04782) {
         this.N(class04782, var4, var3.field_9229.N(20, 24));
      }
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      class00394 class00394 = var1.method_8321(var2);
      if (class00394 instanceof class00327) {
         ((class00327)class00394).N(var4.method_48923().N(var4));
         this.N(var4, var3, var1, var2);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      var3.N(var4, this, 1);
      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var2.method_75728().N(class00608.e, var3)) {
         if (var1.L(L) != class08630.field_55831) {
            if (var4.y(16) == 0 && N(var2, var3)) {
               var2.method_8486(var3.method_10263(), var3.method_10264(), var3.method_10260(), class04909.Bg, class04911.field_15245, 1.0F, 1.0F, false);
            }
         }
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      if (var1.method_8608()) {
         return null;
      } else {
         return var2.L(L) != class08630.field_55831 ? N(var3, class00404.field_54774, class00327::N) : null;
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00327(var1, var2);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return L(this.W().y(y, var1.method_8038().z()), var1.method_8045(), var1.method_8037());
   }

   private static boolean N(class07284 var0, class07209 var1) {
      for (class07211 class07211 : class07211.values()) {
         class07209 class07209 = var1.method_10093(class07211);
         if (!var0.method_8320(class07209).N(class01210.v)) {
            return false;
         }
      }

      return true;
   }

   public static boolean N(class00500 var0, class05487 var1, class07209 var2) {
      class07185 class07185 = var0.L(y);

      for (class07211 class07211 : class07185.R()) {
         class00500 class00500 = var1.method_8320(var2.method_10093(class07211));
         if (!class00500.N(class01210.v) || class00500.L(y) != class07185) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class00500 class00500 = L(var1, var2, var3);
      if (class00500 != var1) {
         var2.method_8652(var3, class00500, 3);
      }
   }
}
