package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class08945 extends class05765<class07475> {
   public static final int N = 60;
   private static final int y = 6000;
   private static final int L = 16;
   private static final int u = 10;
   private static final int i = 50;
   private static final int R = 1;
   private static final int Z = 140;
   private static final double z = 3.0;
   private static final double U = 0.5;
   private static final double E = 1.0;
   private static final double W = 2.0;
   private final float m;
   private final int P;
   private final int s;
   private final Predicate<class00500> T;
   private final Predicate<class00500> b;
   private final Predicate<class08948> j;
   private final Consumer<class07475> v;
   private final Map<class08969, class08993> n;
   @Nullable
   private class08948 t = null;
   private class08964 G;
   @Nullable
   private class08969 l;
   private int d;

   private class06889 L(class07475 var1) {
      return this.N(var1, var1.method_73189());
   }

   private void L(class07475 var1, class06695 var2) {
      var1.method_5673(class07085.field_6173, y(var2));
      var1.N(class07085.field_6173);
      var2.method_5431();
      this.y(var1);
   }

   private void L(class08948 var1, class07299 var2, class07475 var3) {
      if (!this.y(var1, var2)) {
         this.i(var3);
      }
   }

   private Optional<class08948> L(class04782 var1, class07475 var2) {
      class00734 class00734 = this.B(var2);
      Set<class06289> set = U(var2);
      Set<class06289> set1 = E(var2);
      List<class07321> list = class07321.N(new class07321(var2.method_24515()), Math.floorDiv(this.Z(var2), 16) + 1).toList();
      class08948 class08948x = null;
      double d0 = Float.MAX_VALUE;

      for (class07321 class07321 : list) {
         class00570 class00570 = var1.method_14178().N(class07321.B, class07321.Z);
         if (class00570 != null) {
            for (class00394 class00394 : class00570.o().values()) {
               if (class00394 instanceof class00379 class00379) {
                  double d1 = class00379.d().method_19770(var2.method_73189());
                  if (d1 < d0) {
                     class08948 class08948x = this.N(var2, var1, class00379, set, set1, class00734);
                     if (class08948x != null) {
                        class08948x = class08948x;
                        d0 = d1;
                     }
                  }
               }
            }
         }
      }

      return class08948x == null ? Optional.empty() : Optional.of(class08948x);
   }

   protected void L(class04782 var1, class07475 var2, long var3) {
      boolean flag = this.y(var1, var2);
      if (this.t == null) {
         this.u(var1, var2, var3);
      } else if (!flag) {
         if (this.G.equals(class08964.field_61251)) {
            this.L(this.t, var1, var2);
         }

         if (this.G.equals(class08964.field_61250)) {
            this.N(this.t, var1, var2);
         }

         if (this.G.equals(class08964.field_61252)) {
            this.y(this.t, var1, var2);
         }
      }
   }

   private void M(class07475 var1) {
      this.v.accept(var1);
      this.N(class08964.field_61250);
      this.l = null;
      this.d = 0;
   }

   private static boolean P(class07475 var0) {
      return var0.method_6047().R();
   }

   private void T(class07475 var1) {
      var1.f().W();
      var1.L(0.0F);
      var1.y(0.0F);
      var1.method_6125(0.0F);
      var1.method_18800(0.0, var1.method_18798().B, 0.0);
   }

   public class08945(
      float var1,
      Predicate<class00500> var2,
      Predicate<class00500> var3,
      int var4,
      int var5,
      Map<class08969, class08993> var6,
      Consumer<class07475> var7,
      Predicate<class08948> var8
   ) {
      super(
         ImmutableMap.of(
            class05378.NL,
            class05367.field_18458,
            class05378.Nu,
            class05367.field_18458,
            class05378.Ni,
            class05367.field_18457,
            class05378.NN,
            class05367.field_18457
         )
      );
      this.m = var1;
      this.T = var2;
      this.b = var3;
      this.P = var4;
      this.s = var5;
      this.v = var7;
      this.j = var8;
      this.n = var6;
      this.G = class08964.field_61250;
   }

   private class00734 B(class07475 var1) {
      int ix = this.Z(var1);
      return new class00734(var1.method_24515()).L(ix, this.z(var1), ix);
   }

   private int Z(class07475 var1) {
      return var1.method_5765() ? 1 : this.P;
   }

   private static class06584 i(class07475 var0, class06695 var1) {
      int ix = 0;
      class06584 class06584x = var0.method_6047();

      for (class06584 class06584x : var1) {
         if (class06584x.R()) {
            var1.method_5447(ix, class06584x);
            return class06584.E;
         }

         if (class06584.L(class06584x, class06584x) && class06584x.c() < class06584x.U()) {
            int jx = class06584x.U() - class06584x.c();
            int k = Math.min(jx, class06584x.c());
            class06584x.i(class06584x.c() + k);
            class06584x.i(class06584x.c() - jx);
            var1.method_5447(ix, class06584x);
            if (class06584x.R()) {
               return class06584.E;
            }
         }

         ix++;
      }

      return class06584x;
   }

   private void i(class07475 var1) {
      this.N(class08964.field_61250);
      this.R(var1);
   }

   private void s(class07475 var1) {
      this.N(var1);
      var1.method_18868().N(class05378.Ni, 140);
      var1.method_18868().y(class05378.NL);
      var1.method_18868().y(class05378.Nu);
   }

   private static double m(class07475 var0) {
      return W(var0) ? 1.0 : 0.5;
   }

   private static Set<class06289> U(class07475 var0) {
      return var0.method_18868().L(class05378.NL).orElse(Set.of());
   }

   private int z(class07475 var1) {
      return var1.method_5765() ? 1 : this.s;
   }

   private void u(class07475 var1) {
      this.T(var1);
      this.N(class08964.field_61251);
   }

   private void u(class07475 var1, class06695 var2) {
      class06584 class06584 = i(var1, var2);
      var2.method_5431();
      var1.method_5673(class07085.field_6173, class06584);
      if (class06584.R()) {
         this.y(var1);
      } else {
         this.N(var1);
      }
   }

   protected void u(class04782 var1, class07475 var2, long var3) {
      this.M(var2);
      class07623 class07623 = var2.f();
      if (class07623 instanceof class07655) {
         ((class07655)class07623).i(false);
      }
   }

   private static class06584 y(class06695 var0) {
      int ix = 0;

      for (class06584 class06584 : var0) {
         if (!class06584.R()) {
            int jx = Math.min(class06584.c(), 16);
            return var0.method_5434(ix, jx);
         }

         ix++;
      }

      return class06584.E;
   }

   protected void y(class07475 var1) {
      this.N(var1);
      var1.method_18868().y(class05378.NL);
      var1.method_18868().y(class05378.Nu);
   }

   private static boolean y(class07475 var0, class06695 var1) {
      class06584 class06584 = var0.method_6047();
      Iterator<class06584> iterator = var1.iterator();

      while (iterator.hasNext()) {
         if (class06584.y(iterator.next(), class06584)) {
            return true;
         }
      }

      return false;
   }

   private boolean y(class08948 var1, class07299 var2) {
      return this.N(var1, var2).anyMatch(this.j);
   }

   protected void y(class07475 var1, class07299 var2, class07209 var3) {
      HashSet hashset = new HashSet<>(U(var1));
      hashset.remove(new class06289(var2.method_27983(), var3));
      HashSet hashset1 = new HashSet<>(E(var1));
      hashset1.add(new class06289(var2.method_27983(), var3));
      if (hashset1.size() > 50) {
         this.s(var1);
      } else {
         var1.method_18868().N(class05378.NL, hashset, 6000L);
         var1.method_18868().N(class05378.Nu, hashset1, 6000L);
      }
   }

   private void y(class08969 var1) {
      this.l = var1;
   }

   private void y(class08948 var1, class07475 var2) {
      var2.method_18868().N(class05378.P, new class05744(var1.N()));
      this.T(var2);
      if (this.l != null) {
         Optional.ofNullable(this.n.get(this.l)).ifPresent(var3 -> var3.accept(var2, var1, this.d));
      }
   }

   protected boolean y(class04782 var1, class07475 var2, long var3) {
      return var2.method_18868().L(class05378.Ni).isEmpty() && !var2.Nk() && !var2.g_();
   }

   private boolean y(class04782 var1, class07475 var2) {
      if (!this.N((class07299)var1, var2)) {
         this.N(var2);
         Optional<class08948> optional = this.L(var1, var2);
         if (optional.isPresent()) {
            this.t = optional.get();
            this.M(var2);
            this.N(var2, var1, this.t.N());
            return true;
         } else {
            this.s(var2);
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean y(class07299 var1, class08948 var2) {
      return var2.L().equals(var1.method_8321(var2.N()));
   }

   protected void y(class08948 var1, class07299 var2, class07475 var3) {
      if (!this.N(2.0, var1, var2, var3, this.L(var3))) {
         this.M(var3);
      } else {
         this.d++;
         this.y(var1, var3);
         if (this.d >= 60) {
            this.N(var3, var1.y(), this::L, (var2x, var3x) -> this.N(var3), this::u, (var2x, var3x) -> this.N(var3));
            this.M(var3);
         }
      }
   }

   private static Set<class06289> E(class07475 var0) {
      return var0.method_18868().L(class05378.Nu).orElse(Set.of());
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   private void N(class08948 var1, class07475 var2) {
      this.N(var2, var1.y(), this.N(class08969.field_61245), this.N(class08969.field_61246), this.N(class08969.field_61247), this.N(class08969.field_61248));
      this.N(class08964.field_61252);
   }

   protected void N(class07475 var1) {
      this.d = 0;
      this.t = null;
      var1.f().W();
      var1.method_18868().y(class05378.m);
   }

   protected void N(class08948 var1, class07299 var2, class07475 var3) {
      if (this.N(3.0, var1, var2, var3, this.L(var3)) && this.y(var1, var2)) {
         this.u(var3);
      } else if (this.N(m(var3), var1, var2, var3, this.L(var3))) {
         this.N(var1, var3);
      } else {
         this.R(var3);
      }
   }

   protected void N(class04782 var1, class07475 var2, long var3) {
      class07623 class07623 = var2.f();
      if (class07623 instanceof class07655) {
         ((class07655)class07623).i(true);
      }
   }

   private boolean N(Set<class06289> var1, Set<class06289> var2, class08948 var3, class07299 var4) {
      return this.N(var3, var4).map(var1x -> new class06289(var4.method_27983(), var1x.N())).anyMatch(var2x -> var1.contains(var2x) || var2.contains(var2x));
   }

   protected boolean N(class04782 var1, class07475 var2) {
      return !var2.g_();
   }

   protected void N(class07475 var1, class07299 var2, class07209 var3) {
      HashSet hashset = new HashSet<>(U(var1));
      hashset.add(new class06289(var2.method_27983(), var3));
      if (hashset.size() > 10) {
         this.s(var1);
      } else {
         var1.method_18868().N(class05378.NL, hashset, 6000L);
      }
   }

   private boolean N(class07299 var1, class07475 var2) {
      if (this.t != null && this.N(var2, this.t.u()) && this.y(var1, this.t) && !this.N(var1, this.t)) {
         if (!this.G.equals(class08964.field_61250)) {
            return true;
         }

         if (this.N(var1, this.t, var2)) {
            return true;
         }

         this.y(var2, var1, this.t.N());
      }

      return false;
   }

   private boolean N(class07475 var1, class00500 var2) {
      return P(var1) ? this.T.test(var2) : this.b.test(var2);
   }

   private boolean N(class08948 var1) {
      class00394 class00394 = var1.L();
      return class00394 instanceof class07236 && ((class07236)class00394).Z();
   }

   private boolean N(double var1, class08948 var3, class07299 var4, class07475 var5, class06889 var6) {
      class00734 class00734x = var5.method_5829();
      class00734 class00734x = class00734.N(var6, class00734x.y(), class00734x.L(), class00734x.u());
      return var3.u().M(var4, var3.N()).method_1107().L(var1, 0.5, var1).N(var3.N()).L(class00734x);
   }

   private Stream<class08948> N(class08948 var1, class07299 var2) {
      if (var1.u().N(class00860.i, class06638.field_12569) != class06638.field_12569) {
         class08948 class08948 = class08948.N(class00860.y(var1.N(), var1.u()), var2);
         return class08948 != null ? Stream.of(var1, class08948) : Stream.of(var1);
      } else {
         return Stream.of(var1);
      }
   }

   private boolean N(class07299 var1, class08948 var2) {
      return class00860.N(var1, var2.N());
   }

   private class06889 N(class07475 var1, class06889 var2) {
      return var2.y(0.0, var1.method_5829().L() / 2.0, 0.0);
   }

   private class06889 N(@Nullable class00143 var1, class07475 var2) {
      class06889 class06889 = var1 == null || var1.u() == null ? var2.method_73189() : var1.u().u().method_61082();
      return this.N(var2, class06889);
   }

   private boolean N(class07299 var1, class08948 var2, class07475 var3) {
      class00143 class00143 = var3.f().Z() == null ? var3.f().N(var2.N(), 0) : var3.f().Z();
      class06889 class06889 = this.N(class00143, var3);
      boolean flag = this.N(m(var3), var2, var1, var3, class06889);
      return class00143 == null && !flag || this.N(var1, flag, class06889, var2, var3);
   }

   private static boolean N(class06695 var0) {
      return !var0.method_5442();
   }

   private static boolean N(class07475 var0, class06695 var1) {
      return var1.method_5442() || y(var0, var1);
   }

   private void N(class08964 var1) {
      this.G = var1;
   }

   private BiConsumer<class07475, class06695> N(class08969 var1) {
      return (var2, var3) -> this.y(var1);
   }

   private boolean N(class08948 var1, class07299 var2, class07475 var3, class06889 var4) {
      class06889 class06889 = var1.N().method_46558();
      return class07211.N()
         .map(var1x -> class06889.y(0.5 * var1x.P(), 0.5 * var1x.s(), 0.5 * var1x.T()))
         .map(var3x -> var2.N(new class05862(var4, var3x, class05849.field_17558, class05835.field_1348, var3)))
         .anyMatch(var1x -> var1x.N() == class07113.field_1332 && var1x.u().equals(var1.N()));
   }

   @Nullable
   private class08948 N(class07475 var1, class07299 var2, class00394 var3, Set<class06289> var4, Set<class06289> var5, class00734 var6) {
      class07209 class07209 = var3.d();
      if (!var6.i(class07209.method_10263(), class07209.method_10264(), class07209.method_10260())) {
         return null;
      } else {
         class08948 class08948 = class08948.N(var3, var2);
         if (class08948 == null) {
            return null;
         } else {
            return this.N(var1, class08948.u()) && !this.N(var4, var5, class08948, var2) && !this.N(class08948) ? class08948 : null;
         }
      }
   }

   private void N(
      class07475 var1,
      class06695 var2,
      BiConsumer<class07475, class06695> var3,
      BiConsumer<class07475, class06695> var4,
      BiConsumer<class07475, class06695> var5,
      BiConsumer<class07475, class06695> var6
   ) {
      if (P(var1)) {
         if (N(var2)) {
            var3.accept(var1, var2);
         } else {
            var4.accept(var1, var2);
         }
      } else if (N(var1, var2)) {
         var5.accept(var1, var2);
      } else {
         var6.accept(var1, var2);
      }
   }

   private boolean N(class07299 var1, boolean var2, class06889 var3, class08948 var4, class07475 var5) {
      return var2 && this.N(var4, var1, var5, var3);
   }

   private static boolean W(class07475 var0) {
      return var0.f().Z() != null && var0.f().Z().L();
   }

   private void R(class07475 var1) {
      if (this.t != null) {
         class06293.N(var1, this.t.N(), this.m, 0);
      }
   }
}
