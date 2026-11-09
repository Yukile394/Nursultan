package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class05543 extends class00891 implements class06084 {
   public static final MapCodec<class05543> y = y(class05543::new);
   public static final class06667 L = class06665.q;
   private static final Map<class07211, class06667> N = class06901.B;
   protected static final class07211[] u = class07211.values();
   private final Function<class00500, class00494> i;
   private final boolean R;
   private final boolean M;
   private final boolean B;

   @Nullable
   public class00500 y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (!this.N(var2, var1, var3, var4)) {
         return null;
      } else {
         class00500 class00500;
         if (var1.N(this)) {
            class00500 = var1;
         } else if (var1.Y().N(class04684.L)) {
            class00500 = this.W().y(class06665.q, true);
         } else {
            class00500 = this.W();
         }

         return class00500.y(y(var4), true);
      }
   }

   public static boolean T(class00500 var0) {
      int ix = u.length;

      for (int j = 0; j < ix; j++) {
         class07211 class07211 = u[j];
         if (N(var0, class07211)) {
            return true;
         }
      }

      return false;
   }

   public class05543(class01362 var1) {
      super(var1);
      this.P(N(this.Q));
      this.i = this.i();
      this.R = class07221.field_11062.N().allMatch(this::N);
      this.M = class07221.field_11062.N().filter(class07185.field_11048).filter(this::N).count() % 2L == 0L;
      this.B = class07221.field_11062.N().filter(class07185.field_11051).filter(this::N).count() % 2L == 0L;
   }

   private Function<class00500, class00494> i() {
      Map<class07211, class00494> map = class00389.u(class00891.L(16.0, 0.0, 1.0));
      return this.N(var1x -> {
         class00494 class00494 = class00389.N();
         int ix = u.length;

         for (int j = 0; j < ix; j++) {
            class07211 class07211 = u[j];
            if (N(var1x, class07211)) {
               class00494 = class00389.N(class00494, map.get(class07211));
            }
         }

         return class00494.method_1110() ? class00389.y() : class00494;
      }, new class08092[]{L});
   }

   private static boolean b(class00500 var0) {
      int ix = u.length;

      for (int j = 0; j < ix; j++) {
         class07211 class07211 = u[j];
         if (!N(var0, class07211)) {
            return true;
         }
      }

      return false;
   }

   public static Set<class07211> U(class00500 var0) {
      if (!(var0.i() instanceof class05543)) {
         return Set.of();
      } else {
         EnumSet<class07211> enumset = EnumSet.noneOf(class07211.class);

         for (class07211 class07211 : class07211.values()) {
            if (N(var0, class07211)) {
               enumset.add(class07211);
            }
         }

         return enumset;
      }
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(L) ? class04684.L.N(false) : super.u(var1);
   }

   public static class06667 y(class07211 var0) {
      return N.get(var0);
   }

   public static boolean N(class07290 var0, class07211 var1, class07209 var2, class00500 var3) {
      return class00891.N(var3.B(var0, var2), var1.b()) || class00891.N(var3.M(var0, var2), var1.b());
   }

   public static boolean N(class07290 var0, class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10093(var2);
      class00500 class00500 = var0.method_8320(class07209);
      return N(var0, var2, class07209, class00500);
   }

   private class00500 N(class00500 var1, Function<class07211, class07211> var2) {
      class00500 class00500 = var1;
      int ix = u.length;

      for (int j = 0; j < ix; j++) {
         class07211 class07211 = u[j];
         if (this.N(class07211)) {
            class00500 = class00500.y(y((class07211)var2.apply(class07211)), var1.L(y(class07211)));
         }
      }

      return class00500;
   }

   public static boolean N(class00500 var0, class07211 var1) {
      class06667 class06667 = y(var1);
      return var0.N(class06667, false);
   }

   private static class00500 N(class00507<class00891, class00500> var0) {
      class00500 class00500 = ((class00500)var0.y()).y(L, false);

      for (class06667 class06667 : N.values()) {
         class00500 = class00500.L(class06667, false);
      }

      return class00500;
   }

   @Override
   protected MapCodec<? extends class05543> N() {
      return y;
   }

   private static class00500 N(class00500 var0, class06667 var1) {
      class00500 class00500 = var0.y(var1, false);
      return T(class00500) ? class00500 : class00869.N.W();
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.i.apply(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(L)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      if (!T(var1)) {
         return class00869.N.W();
      } else {
         return N(var1, var5) && !N(var2, var5, var6, var7) ? N(var1, y(var5)) : var1;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      int ix = u.length;

      for (int j = 0; j < ix; j++) {
         class07211 class07211 = u[j];
         if (this.N(class07211)) {
            var1.N(y(class07211));
         }
      }

      var1.N(L);
   }

   protected boolean N(class07211 var1) {
      return true;
   }

   public static byte N(Collection<class07211> var0) {
      byte b0 = 0;

      for (class07211 class07211 : var0) {
         b0 = (byte)(b0 | 1 << class07211.ordinal());
      }

      return b0;
   }

   public static Set<class07211> N(byte var0) {
      EnumSet<class07211> enumset = EnumSet.noneOf(class07211.class);

      for (class07211 class07211 : class07211.values()) {
         if ((var0 & (byte)(1 << class07211.ordinal())) > 0) {
            enumset.add(class07211);
         }
      }

      return enumset;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return !this.R ? var1 : this.N(var1, var2::N);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      if (var2 == class07111.field_11301 && !this.M) {
         return var1;
      } else {
         return var2 == class07111.field_11300 && !this.B ? var1 : this.N(var1, var2::y);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class00500 class00500 = class07299.method_8320(class07209);
      return Arrays.stream(var1.i())
         .map(var4x -> this.y(class00500, (class07290)class07299, class07209, var4x))
         .filter(Objects::nonNull)
         .findFirst()
         .orElse(null);
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      return !var2.method_8041().N(this.B()) || b(var1);
   }

   public boolean N(class07290 var1, class00500 var2, class07209 var3, class07211 var4) {
      if (this.N(var4) && (!var2.N(this) || !N(var2, var4))) {
         class07209 class07209 = var3.method_10093(var4);
         return N(var1, var4, class07209, var1.method_8320(class07209));
      } else {
         return false;
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      boolean flag = false;
      int ix = u.length;

      for (int j = 0; j < ix; j++) {
         class07211 class07211 = u[j];
         if (N(var1, class07211)) {
            if (!N(var2, var3, class07211)) {
               return false;
            }

            flag = true;
         }
      }

      return flag;
   }
}
