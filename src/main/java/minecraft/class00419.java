package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class00419 extends class00394 implements class06237, class07061, class08618 {
   private static final int m = 4;
   public static final List<List<class03556<class07084>>> N = List.of(
      List.of(class07047.N, class07047.L), List.of(class07047.U, class07047.B), List.of(class07047.i), List.of(class07047.z)
   );
   private static final Set<class03556<class07084>> P = N.stream().flatMap(Collection::stream).collect(Collectors.toSet());
   public static final int y = 0;
   public static final int L = 1;
   public static final int u = 2;
   public static final int i = 3;
   private static final int s = 10;
   private static final class00392 T = class00392.L("container.beacon");
   private static final String b = "primary_effect";
   private static final String j = "secondary_effect";
   List<class08633> R = new ArrayList<>();
   private List<class08633> v = new ArrayList<>();
   int M;
   private int n;
   @Nullable
   class03556<class07084> B;
   @Nullable
   class03556<class07084> Z;
   @Nullable
   private class00392 t;
   private class07044 G = class07044.N;
   private final class05845 l = new class00385(this);

   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   public class00392 method_5476() {
      return this.method_5477();
   }

   @Nullable
   @Override
   public class00392 method_5797() {
      return this.t;
   }

   @Override
   public class00392 method_5477() {
      return this.t != null ? this.t : T;
   }

   public class00419(class07209 var1, class00500 var2) {
      super(class00404.field_11890, var1, var2);
   }

   @Override
   public void y(class08329 var1) {
      var1.L("CustomName");
      var1.L("lock");
   }

   @Nullable
   private static class03556<class07084> y(class08299 var0, String var1) {
      return var0.<class03556<class07084>>N(var1, class04206.u.b()).filter(P::contains).orElse(null);
   }

   public void N(@Nullable class00392 var1) {
      this.t = var1;
   }

   @Nullable
   static class03556<class07084> N(@Nullable class03556<class07084> var0) {
      return P.contains(var0) ? var0 : null;
   }

   @Override
   public void N(class07299 var1) {
      super.N(var1);
      this.n = var1.method_31607() - 1;
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.B, this.t);
      if (!this.G.equals(class07044.N)) {
         var1.N(class02484.Nw, this.G);
      }
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.t = var1.method_58694(class02484.B);
      this.G = var1.a_(class02484.Nw, class07044.N);
   }

   @Override
   public List<class08633> N() {
      return (List<class08633>)(this.M == 0 ? ImmutableList.of() : this.R);
   }

   public static void N(class07299 var0, class07209 var1, class04891 var2) {
      var0.method_8396(null, var1, var2, class04911.field_15245, 1.0F, 1.0F);
   }

   private static void N(class07299 var0, class07209 var1, int var2, @Nullable class03556<class07084> var3, @Nullable class03556<class07084> var4) {
      if (!var0.method_8608() && var3 != null) {
         double d0 = var2 * 10 + 10;
         byte b0 = 0;
         if (var2 >= 4 && Objects.equals(var3, var4)) {
            b0 = 1;
         }

         int ix = (9 + var2 * 2) * 20;
         class00734 class00734 = new class00734(var1).M(d0).y(0.0, var0.method_31605(), 0.0);
         List<class08036> list = var0.N(class08036.class, class00734);

         for (class08036 class08036x : list) {
            class08036x.method_6092(new class07055(var3, ix, b0, true, true));
         }

         if (var2 >= 4 && !Objects.equals(var3, var4) && var4 != null) {
            for (class08036 class08036 : list) {
               class08036.method_6092(new class07055(var4, ix, 0, true, true));
            }
         }
      }
   }

   private static int N(class07299 var0, int var1, int var2, int var3) {
      int ix = 0;

      for (int jx = 1; jx <= 4; ix = jx++) {
         int k = var2 - jx;
         if (k < var0.method_31607()) {
            break;
         }

         boolean flag = true;

         for (int lx = var1 - jx; lx <= var1 + jx && flag; lx++) {
            for (int i1 = var3 - jx; i1 <= var3 + jx; i1++) {
               if (!var0.method_8320(new class07209(lx, k, i1)).N(class01210.yN)) {
                  flag = false;
                  break;
               }
            }
         }

         if (!flag) {
            break;
         }
      }

      return ix;
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00419 var3) {
      int ix = var1.method_10263();
      int jx = var1.method_10264();
      int k = var1.method_10260();
      class07209 class07209;
      if (var3.n < jx) {
         class07209 = var1;
         var3.v = Lists.newArrayList();
         var3.n = var1.method_10264() - 1;
      } else {
         class07209 = new class07209(ix, var3.n + 1, k);
      }

      class08633 class08633 = var3.v.isEmpty() ? null : var3.v.get(var3.v.size() - 1);
      int lx = var0.method_8624(class07830.field_13202, ix, k);

      for (int i1 = 0; i1 < 10 && class07209.method_10264() <= lx; i1++) {
         class00500 class00500 = var0.method_8320(class07209);
         if (class00500.i() instanceof class05700 var13) {
            int j1 = var13.y().L();
            if (var3.v.size() <= 1) {
               class08633 = new class08633(j1);
               var3.v.add(class08633);
            } else if (class08633 != null) {
               if (j1 == class08633.y()) {
                  class08633.N();
               } else {
                  class08633 = new class08633(class02566.M(class08633.y(), j1));
                  var3.v.add(class08633);
               }
            }
         } else {
            if (class08633 == null || class00500.z() >= 15 && !class00500.N(class00869.q)) {
               var3.v.clear();
               var3.n = lx;
               break;
            }

            class08633.N();
         }

         class07209 = class07209.method_10084();
         var3.n++;
      }

      int k1 = var3.M;
      if (var0.N() % 80L == 0L) {
         if (!var3.R.isEmpty()) {
            var3.M = N(var0, ix, jx, k);
         }

         if (var3.M > 0 && !var3.R.isEmpty()) {
            N(var0, var1, var3.M, var3.B, var3.Z);
            N(var0, var1, class04909.yD);
         }
      }

      if (var3.n >= lx) {
         var3.n = var0.method_31607() - 1;
         boolean flag = k1 > 0;
         var3.R = var3.v;
         if (!var0.method_8608()) {
            boolean flag1 = var3.M > 0;
            if (!flag && flag1) {
               N(var0, var1, class04909.yx);

               for (class04770 class04770 : var0.N(class04770.class, new class00734(ix, jx, k, ix, jx - 4, k).L(10.0, 5.0, 10.0))) {
                  class06912.W.N(class04770, var3.M);
               }
            } else if (flag && !flag1) {
               N(var0, var1, class04909.yh);
            }
         }
      }
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      N(var1, "primary_effect", this.B);
      N(var1, "secondary_effect", this.Z);
      var1.N("Levels", this.M);
      var1.y("CustomName", class03748.N, this.t);
      this.G.N(var1);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.B = y(var1, "primary_effect");
      this.Z = y(var1, "secondary_effect");
      this.t = N_10(var1, "CustomName");
      this.G = class07044.N(var1);
   }

   private static void N(class08329 var0, String var1, @Nullable class03556<class07084> var2) {
      if (var2 != null) {
         var2.i().ifPresent(var2x -> var0.N(var1, var2x.N().toString()));
      }
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   @Override
   public void r_() {
      N(this.z, this.U, class04909.yh);
      super.r_();
   }

   @Nullable
   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      if (this.G.N(var3)) {
         return new class07501(var1, var2, this.l, class05880.N(this.z, this.d()));
      } else {
         class07236.N(this.d().method_46558(), var3, this.method_5476());
         return null;
      }
   }
}
