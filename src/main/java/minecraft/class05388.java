package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class class05388 {
   private final Map<class05418, class01894> N = Maps.newHashMap();
   private final Set<class05418> y = Sets.newHashSet();

   public static class05388 w(class00891 var0) {
      return new class05388().N(class05418.O, N(var0, "_1"));
   }

   public class05388 L(class05418 var1, class01894 var2) {
      class05388 class05388 = new class05388();
      class05388.N.putAll(this.N);
      class05388.y.addAll(this.y);
      class05388.N(var1, var2);
      return class05388;
   }

   public static class05388 L(class00891 var0, class00891 var1) {
      return new class05388()
         .N(class05418.L, N(var0, "_front"))
         .N(class05418.P, V(var1))
         .N(class05418.m, N(var0, "_top"))
         .N(class05418.z, N(var0, "_front"))
         .N(class05418.E, N(var0, "_side"))
         .N(class05418.U, N(var0, "_side"))
         .N(class05418.W, N(var0, "_front"));
   }

   public static class05388 L(class01894 var0) {
      return u(class05418.s, var0);
   }

   public static class01894 L(class06581 var0) {
      return class04206.B.y(var0).R("item/");
   }

   public static class05388 L(class00891 var0) {
      return u(class05418.s, V(var0));
   }

   public static class05388 L(class01894 var0, class01894 var1) {
      return new class05388().N(class05418.q, var0).N(class05418.K, var1);
   }

   public static class05388 M(class00891 var0) {
      return new class05388().N(class05418.b, V(var0)).N(class05418.T, N(var0, "_emissive"));
   }

   public static class05388 M(class01894 var0) {
      return u(class05418.Y, var0);
   }

   public static class05388 P(class00891 var0) {
      return new class05388().N(class05418.Z, N(var0, "_side")).N(class05418.R, N(var0, "_top"));
   }

   public static class05388 K(class00891 var0) {
      return new class05388().N(class05418.q, V(var0));
   }

   public static class05388 T(class00891 var0) {
      return new class05388().N(class05418.Z, V(var0)).N(class05418.u, N(var0, "_top")).N(class05418.L, V(var0));
   }

   public static class05388 Q(class00891 var0) {
      return new class05388().N(class05418.Z, N(var0, "_side")).N(class05418.M, N(var0, "_front")).N(class05418.B, N(var0, "_back"));
   }

   public class05388() {
      super();
   }

   public static class05388 B(class00891 var0) {
      return u(class05418.v, V(var0));
   }

   public static class05388 B(class01894 var0) {
      return new class05388().N(class05418.L, var0);
   }

   public static class05388 I(class00891 var0) {
      return new class05388().N(class05418.Z, N(var0, "_side")).N(class05418.M, N(var0, "_front")).N(class05418.u, N(var0, "_end"));
   }

   public static class05388 J(class00891 var0) {
      return new class05388().N(class05418.R, N(var0, "_top"));
   }

   public static class05388 Z(class00891 var0) {
      return u(class05418.n, V(var0));
   }

   public static class05388 Z(class01894 var0) {
      return new class05388().N(class05418.o, var0);
   }

   public static class01894 V(class00891 var0) {
      return class04206.i.y(var0).R("block/");
   }

   public static class05388 i(class00891 var0) {
      return new class05388().N(class05418.s, V(var0)).N(class05418.T, N(var0, "_emissive"));
   }

   public static class05388 i(class01894 var0) {
      return u(class05418.v, var0);
   }

   public static class05388 b(class00891 var0) {
      return new class05388().N(class05418.y, V(var0)).N(class05418.Z, N(var0, "_side")).N(class05418.R, N(var0, "_top"));
   }

   public static class05388 s(class00891 var0) {
      return new class05388().N(class05418.b, N(var0, "_plant")).N(class05418.Z, N(var0, "_side")).N(class05418.R, N(var0, "_top"));
   }

   public static class05388 n(class00891 var0) {
      class01894 class01894 = V(var0);
      return new class05388().N(class05418.j, class01894).N(class05418.Z, class01894).N(class05418.R, N(var0, "_top")).N(class05418.i, N(var0, "_bottom"));
   }

   public static class05388 l(class00891 var0) {
      return new class05388().N(class05418.L, V(var0));
   }

   public static class05388 d(class00891 var0) {
      return new class05388().N(class05418.O, N(var0, "_0"));
   }

   public static class05388 m(class00891 var0) {
      return new class05388().N(class05418.Z, N(var0, "_side")).N(class05418.u, N(var0, "_top"));
   }

   public static class05388 o(class00891 var0) {
      return new class05388().N(class05418.e, N(var0, "_log_lit")).N(class05418.O, N(var0, "_fire"));
   }

   public static class05388 k(class00891 var0) {
      return new class05388().N(class05418.g, V(var0));
   }

   public static class05388 t(class00891 var0) {
      class01894 class01894 = V(var0);
      return new class05388().N(class05418.y, class01894).N(class05418.j, class01894).N(class05418.Z, class01894).N(class05418.u, N(var0, "_top"));
   }

   public static class05388 g(class00891 var0) {
      return new class05388().N(class05418.Z, N(var0, "_side")).N(class05418.M, N(var0, "_front")).N(class05418.R, N(var0, "_top"));
   }

   public static class05388 v(class00891 var0) {
      return new class05388().N(class05418.Z, N(var0, "_side")).N(class05418.R, N(var0, "_top")).N(class05418.i, N(var0, "_bottom"));
   }

   public static class05388 j(class00891 var0) {
      return new class05388().N(class05418.y, V(var0)).N(class05418.L, N(var0, "_particle"));
   }

   public static class05388 q(class00891 var0) {
      return new class05388().N(class05418.A, V(var0)).N(class05418.l, V(var0));
   }

   public static class05388 U(class00891 var0) {
      return u(class05418.w, V(var0));
   }

   public static class05388 U(class01894 var0) {
      return new class05388().N(class05418.q, var0);
   }

   public static class05388 z(class00891 var0) {
      return new class05388().N(class05418.p, V(var0)).N(class05418.w, N(var0, "_stem"));
   }

   public static class05388 z(class01894 var0) {
      return new class05388()
         .N(class05418.L, N(class00869.MZ, "_side"))
         .N(class05418.Z, N(class00869.MZ, "_side"))
         .N(class05418.R, N(class00869.MZ, "_top"))
         .N(class05418.i, N(class00869.MZ, "_bottom"))
         .N(class05418.c, N(class00869.MZ, "_inner"))
         .N(class05418.X, var0);
   }

   public static class05388 u(class01894 var0) {
      return u(class05418.b, var0);
   }

   public static class05388 u(class05418 var0, class01894 var1) {
      return new class05388().N(var0, var1);
   }

   public static class05388 u(class00891 var0) {
      return u(class05418.Z, V(var0));
   }

   public static class05388 u(class00891 var0, class00891 var1) {
      return new class05388()
         .N(class05418.L, N(var0, "_front"))
         .N(class05418.P, V(var1))
         .N(class05418.m, N(var0, "_top"))
         .N(class05418.z, N(var0, "_front"))
         .N(class05418.U, N(var0, "_front"))
         .N(class05418.E, N(var0, "_side"))
         .N(class05418.W, N(var0, "_side"));
   }

   public class05388 y(class05418 var1, class05418 var2) {
      this.N.put(var2, this.N.get(var1));
      this.y.add(var2);
      return this;
   }

   public static class05388 y(class00891 var0) {
      return N(V(var0));
   }

   public static class05388 y(String var0) {
      return new class05388()
         .N(class05418.L, N(class00869.mu, var0 + "_north"))
         .N(class05418.i, N(class00869.mu, var0 + "_bottom"))
         .N(class05418.R, N(class00869.mu, var0 + "_top"))
         .N(class05418.z, N(class00869.mu, var0 + "_north"))
         .N(class05418.U, N(class00869.mu, var0 + "_south"))
         .N(class05418.E, N(class00869.mu, var0 + "_east"))
         .N(class05418.W, N(class00869.mu, var0 + "_west"))
         .N(class05418.F, N(class00869.mu, var0 + "_tentacles"));
   }

   public class05388 y(class05418 var1, class01894 var2) {
      this.N.put(var1, var2);
      this.y.add(var1);
      return this;
   }

   public static class05388 y(class00891 var0, class00891 var1) {
      return new class05388().N(class05418.G, V(var0)).N(class05418.l, N(var1, "_top"));
   }

   public static class05388 y(class06581 var0) {
      return new class05388().N(class05418.q, L(var0));
   }

   public static class05388 y(class01894 var0, class01894 var1) {
      return new class05388().N(class05418.R, var0).N(class05418.i, var1);
   }

   public static class05388 y(class01894 var0) {
      return new class05388().N(class05418.N, var0);
   }

   public static class05388 E(class00891 var0) {
      return u(class05418.t, V(var0));
   }

   public static class05388 N(class00891 var0, class00891 var1) {
      return new class05388().N(class05418.w, V(var0)).N(class05418.k, V(var1));
   }

   public Stream<class05418> N() {
      return this.y.stream();
   }

   public static class05388 N(class01894 var0, class01894 var1, class01894 var2) {
      return new class05388().N(class05418.q, var0).N(class05418.K, var1).N(class05418.V, var2);
   }

   public class05388 N(class05418 var1, class05418 var2) {
      this.N.put(var2, this.N.get(var1));
      return this;
   }

   public static class05388 N(class01894 var0, class01894 var1) {
      return new class05388().N(class05418.Z, var0).N(class05418.u, var1);
   }

   public static class05388 N(boolean var0) {
      String s = var0 ? "_can_summon" : "";
      return new class05388()
         .N(class05418.L, N(class00869.bS, "_bottom"))
         .N(class05418.Z, N(class00869.bS, "_side"))
         .N(class05418.R, N(class00869.bS, "_top"))
         .N(class05418.a, N(class00869.bS, s + "_inner_top"))
         .N(class05418.i, N(class00869.bS, "_bottom"));
   }

   public static class05388 N(class06581 var0) {
      return new class05388().N(class05418.L, L(var0));
   }

   public static class01894 N(class06581 var0, String var1) {
      return class04206.B.y(var0).N((UnaryOperator<String>)(var1x -> "item/" + var1x + var1));
   }

   public class05388 N(class05418 var1, class01894 var2) {
      this.N.put(var1, var2);
      return this;
   }

   public static class01894 N(class00891 var0, String var1) {
      return class04206.i.y(var0).N((UnaryOperator<String>)(var1x -> "block/" + var1x + var1));
   }

   public static class05388 N(class00891 var0) {
      return y(V(var0));
   }

   public class01894 N(class05418 var1) {
      for (class05418 class05418 = var1; class05418 != null; class05418 = class05418.y()) {
         class01894 class01894 = this.N.get(class05418);
         if (class01894 != null) {
            return class01894;
         }
      }

      throw new IllegalStateException("Can't find texture for slot " + var1);
   }

   public static class05388 N(String var0) {
      return new class05388()
         .N(class05418.L, N(class00869.mL, var0 + "_north"))
         .N(class05418.i, N(class00869.mL, var0 + "_bottom"))
         .N(class05418.R, N(class00869.mL, var0 + "_top"))
         .N(class05418.z, N(class00869.mL, var0 + "_north"))
         .N(class05418.U, N(class00869.mL, var0 + "_south"))
         .N(class05418.E, N(class00869.mL, var0 + "_east"))
         .N(class05418.W, N(class00869.mL, var0 + "_west"));
   }

   public static class05388 N(class00891 var0, String var1, String var2) {
      return new class05388().N(class05418.Z, N(var0, var1)).N(class05418.R, N(var0, var2)).N(class05418.i, N(var0, "_bottom"));
   }

   public static class05388 N(class01894 var0) {
      return new class05388().N(class05418.y, var0);
   }

   public static class05388 N(class00891 var0, boolean var1) {
      return new class05388()
         .N(class05418.L, N(class00869.ie, "_side"))
         .N(class05418.i, N(class00869.ie, "_bottom"))
         .N(class05418.R, N(class00869.ie, "_top"))
         .N(class05418.Z, N(class00869.ie, "_side"))
         .N(class05418.H, N(var0, var1 ? "_lit" : ""));
   }

   public static class05388 N(class00891 var0, String var1, String var2, String var3, String var4) {
      return new class05388().N(class05418.M, N(var0, var1)).N(class05418.Z, N(var0, var2)).N(class05418.R, N(var0, var3)).N(class05418.i, N(var0, var4));
   }

   public static class05388 W(class00891 var0) {
      return u(class05418.d, V(var0));
   }

   public static class05388 R(class00891 var0) {
      return u(class05418.b, V(var0));
   }

   public static class05388 R(class01894 var0) {
      return u(class05418.n, var0);
   }

   public static class05388 O(class00891 var0) {
      return new class05388()
         .N(class05418.Z, N(var0, "_side"))
         .N(class05418.M, N(var0, "_front"))
         .N(class05418.R, N(var0, "_top"))
         .N(class05418.i, N(var0, "_bottom"));
   }

   public static class05388 G(class00891 var0) {
      return new class05388().N(class05418.R, N(var0, "_top")).N(class05418.i, N(var0, "_bottom"));
   }

   public static class05388 Y(class00891 var0) {
      return new class05388().N(class05418.o, V(var0));
   }
}
