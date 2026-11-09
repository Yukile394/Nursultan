package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class00318 extends class00891 implements class00873 {
   public static final MapCodec<class00318> N = y(class00318::new);
   public static final class06667 y = class06665.u;
   public static final class08064<class06008> L = class06665.NN;
   public static final class08064<class06008> u = class06665.r;
   public static final class08064<class06008> i = class06665.Ny;
   public static final class08064<class06008> R = class06665.NL;
   public static final Map<class07211, class08064<class06008>> M = ImmutableMap.copyOf(
      Maps.newEnumMap(Map.of(class07211.field_11043, L, class07211.field_11034, u, class07211.field_11035, i, class07211.field_11039, R))
   );
   private final Function<class00500, class00494> B;

   public Function<class00500, class00494> L() {
      Map map = class00389.L(class00891.N(16.0, 0.0, 10.0, 0.0, 1.0));
      Map map1 = class00389.u(class00891.L(16.0, 0.0, 1.0));
      return this.N(var2x -> {
         class00494 class00494 = var2x.L(y) ? (class00494)map1.get(class07211.field_11033) : class00389.N();

         for (Entry entry : M.entrySet()) {
            switch ((class06008)var2x.L((class08092)entry.getValue())) {
               case field_22178:
               default:
                  break;
               case field_22179:
                  class00494 = class00389.N(class00494, (class00494)map.get(entry.getKey()));
                  break;
               case field_22180:
                  class00494 = class00389.N(class00494, (class00494)map1.get(entry.getKey()));
            }
         }

         return class00494.method_1110() ? class00389.y() : class00494;
      });
   }

   public class00318(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, true).y(L, class06008.field_22178).y(u, class06008.field_22178).y(i, class06008.field_22178).y(R, class06008.field_22178));
      this.B = this.L();
   }

   private static boolean U(class00500 var0) {
      if (var0.L(y)) {
         return true;
      } else {
         for (class08064 class08064 : M.values()) {
            if (var0.L(class08064) != class06008.field_22178) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return var1.L(y) ? this.B.apply(this.W()) : class00389.N();
   }

   @Override
   protected boolean y(class00500 var1) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var3.L(y) && !N(var1, var2, () -> true).P();
   }

   @Nullable
   public static class08064<class06008> N(class07211 var0) {
      return M.get(var0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return switch (var2) {
         case field_11300 -> (class00500)var1.y(L, var1.L(i)).y(i, var1.L(L));
         case field_11301 -> (class00500)var1.y(u, var1.L(R)).y(R, var1.L(u));
         default -> super.N(var1, var2);
      };
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return switch (var2) {
         case field_11464 -> (class00500)var1.y(L, var1.L(i)).y(u, var1.L(R)).y(i, var1.L(L)).y(R, var1.L(u));
         case field_11465 -> (class00500)var1.y(L, var1.L(u)).y(u, var1.L(i)).y(i, var1.L(R)).y(R, var1.L(L));
         case field_11463 -> (class00500)var1.y(L, var1.L(R)).y(u, var1.L(L)).y(i, var1.L(u)).y(R, var1.L(i));
         default -> var1;
      };
   }

   @Override
   public MapCodec<class00318> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class00500 class00500 = N(var1, var3, () -> true);
      if (!class00500.P()) {
         var1.method_8652(var3.method_10084(), class00500, 3);
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   public static void N(class07284 var0, class07209 var1, class06069 var2, int var3) {
      class00500 class00500xx = N(class00869.nC.W(), var0, var1, true);
      var0.method_8652(var1, class00500xx, var3);
      class00500 class00500x = N(var0, var1, var2::Z);
      if (!class00500x.P()) {
         var0.method_8652(var1.method_10084(), class00500x, var3);
         class00500 class00500xx = N(class00500xx, var0, var1, true);
         var0.method_8652(var1, class00500xx, var3);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return N(this.W(), var1.method_8045(), var1.method_8037(), true);
   }

   private static class00500 N(class00500 var0, class07290 var1, class07209 var2, boolean var3) {
      class00500 class00500x = null;
      class00500 class00500x = null;
      var3 |= var0.L(y);

      for (class07211 class07211 : class07221.field_11062) {
         class08064 class08064 = N(class07211);
         class06008 class06008 = N(var1, var2, class07211) ? (var3 ? class06008.field_22179 : var0.L(class08064)) : class06008.field_22178;
         if (class06008 == class06008.field_22179) {
            if (class00500x == null) {
               class00500x = var1.method_8320(var2.method_10084());
            }

            if (class00500x.N(class00869.nC) && class00500x.L(class08064) != class06008.field_22178 && !class00500x.L(y)) {
               class06008 = class06008.field_22180;
            }

            if (!var0.L(y)) {
               if (class00500x == null) {
                  class00500x = var1.method_8320(var2.method_10074());
               }

               if (class00500x.N(class00869.nC) && class00500x.L(class08064) == class06008.field_22178) {
                  class06008 = class06008.field_22178;
               }
            }
         }

         var0 = var0.y(class08064, class06008);
      }

      return var0;
   }

   private static boolean N(class07290 var0, class07209 var1, class07211 var2) {
      return var2 == class07211.field_11036 ? false : class05543.N(var0, var1, var2);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.B.apply(var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i, R);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         return class00869.N.W();
      } else {
         class00500 class00500 = N(var1, var2, var4, false);
         return !U(class00500) ? class00869.N.W() : class00500;
      }
   }

   private static class00500 N(class07290 var0, class07209 var1, BooleanSupplier var2) {
      class07209 class07209 = var1.method_10084();
      class00500 class00500x = var0.method_8320(class07209);
      boolean flag = class00500x.N(class00869.nC);
      if ((!flag || !class00500x.L(y)) && (flag || class00500x.d())) {
         class00500 class00500x = N(class00869.nC.W().y(y, false), var0, var1.method_10084(), true);
         Iterator iterator = class07221.field_11062.iterator();

         while (iterator.hasNext()) {
            class08064 class08064 = N((class07211)iterator.next());
            if (class00500x.L(class08064) != class06008.field_22178 && !var2.getAsBoolean()) {
               class00500x = class00500x.y(class08064, class06008.field_22178);
            }
         }

         return U(class00500x) && class00500x != class00500x ? class00500x : class00869.N.W();
      } else {
         return class00869.N.W();
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (!var1.method_8608()) {
         class06069 class06069 = var1.method_8409();
         class00500 class00500 = N(var1, var2, class06069::Z);
         if (!class00500.P()) {
            var1.method_8652(var2.method_10084(), class00500, 3);
         }
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3.method_10074());
      return var1.L(y) ? !class00500.P() : class00500.N(this) && class00500.L(y);
   }
}
