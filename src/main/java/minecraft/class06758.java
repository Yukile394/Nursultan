package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.IdentityHashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06758 extends class07796 {
   private static final Logger i = LogUtils.getLogger();
   public static final MapCodec<class06758> N = y(class06758::new);
   public static final class08064<class07211> y = class06760.y;
   public static final class06667 L = class06665.J;
   private static final class07206 R = new class07206();
   public static final Map<class06581, class00755> u = new IdentityHashMap<>();
   private static final int M = 4;

   public class06758(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   public static class00737 N(class07210 var0, double var1, class06889 var3) {
      class07211 class07211 = var0.u().L(y);
      return var0.N().y(var1 * class07211.P() + var3.N(), var1 * class07211.s() + var3.y(), var1 * class07211.T() + var3.L());
   }

   public static class00737 N(class07210 var0) {
      return N(var0, 0.7, class06889.L);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.L().b());
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   public MapCodec<? extends class06758> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   protected class00755 N(class07299 var1, class06584 var2) {
      if (!var2.N(var1.method_45162())) {
         return R;
      } else {
         class00755 class00755 = u.get(var2.B());
         return class00755 != null ? class00755 : N(var2);
      }
   }

   protected void N(class04782 var1, class00500 var2, class07209 var3) {
      class07243 class07243 = var1.N(var3, class00404.field_11887).orElse(null);
      if (class07243 == null) {
         i.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", var3);
      } else {
         class07210 class07210 = new class07210(var1, var3, var2, class07243);
         int ix = class07243.N(var1.field_9229);
         if (ix < 0) {
            var1.N(1001, var3, 0);
            var1.N(class01194.N, var3, class01164.N(class07243.w()));
         } else {
            class06584 class06584 = class07243.method_5438(ix);
            class00755 class00755 = this.N(var1, class06584);
            if (class00755 != class00755.L) {
               class07243.method_5447(ix, class00755.dispense(class07210, class06584));
            }
         }
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var2.method_8321(var3) instanceof class07243 class07243) {
         var4.method_17355(class07243);
         var4.method_7281(class07243 instanceof class07247 ? class01235.Ni : class01235.NM);
      }

      return class07082.N;
   }

   public static void N(class07310 var0) {
      u.put(var0.B(), new class04438(var0.B()));
   }

   public static void N(class07310 var0, class00755 var1) {
      u.put(var0.B(), var1);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07243(var1, var2);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      this.N(var2, var1, var3);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      boolean flag = var2.W(var3) || var2.W(var3.method_10084());
      boolean flag1 = var1.L(L);
      if (flag && !flag1) {
         var2.N(var3, this, 4);
         var2.method_8652(var3, var1.y(L, true), 2);
      } else if (!flag && flag1) {
         var2.method_8652(var3, var1.y(L, false), 2);
      }
   }

   private static class00755 N(class06584 var0) {
      return (class00755)(var0.L(class02484.o) ? class08711.N : R);
   }
}
