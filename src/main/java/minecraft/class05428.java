package minecraft;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class class05428 {
   public static final class01343 N = N(class05388::N, class05433.L);
   public static final class01343 y = N(class05388::N, class05433.u);
   public static final class01343 L = N(class05388::N, class05433.i);
   public static final class01343 u = N(class05388::m, class05433.z);
   public static final class01343 i = N(class05388::m, class05433.U);
   public static final class01343 R = N(class05388::v, class05433.m);
   public static final class01343 M = N(class05388::P, class05433.W);
   public static final class01343 B = N(class05388::g, class05433.s);
   public static final class01343 Z = N(class05388::O, class05433.T);
   public static final class01343 z = N(class05388::Z, class05433.Nd);
   public static final class01343 U = N(class05388::u, class05433.Nw);
   public static final class01343 E = N(class05388::z, class05433.Nk);
   public static final class01343 W = N(class05388::z, class05433.NY);
   public static final class01343 m = N(class05388::z, class05433.NQ);
   public static final class01343 P = N(class05388::z, class05433.NO);
   public static final class01343 s = N(class05388::y, class05433.Ng);
   public static final class01343 T = N(class05388::y, class05433.NI);
   public static final class01343 b = N(class05388::y, class05433.NJ);
   public static final class01343 j = N(class05388::y, class05433.No);
   public static final class01343 v = N(class05388::E, class05433.NV);
   public static final class01343 n = N(class05388::W, class05433.Nq);
   public static final class01343 t = N(class05388::J, class05433.yM);
   public static final class01343 G = N(class05388::N, class05433.Nu);
   public static final class01343 l = N(class05388::k, class05433.yb);
   public static final class01343 d = N(class05388::k, class05433.yj);
   public static final class01343 w = N(class05388::y, class05433.yv);
   public static final class01343 k = N(class05388::y, class05433.yK);
   public static final class01343 Y = N(class05388::T, class05433.z);
   public static final class01343 Q = N(class05388::T, class05433.U);
   public static final class01343 O = N(class05388::n, class05433.m);
   public static final class01343 g = N(class05388::t, class05433.z);
   private final class05388 I;
   private final class05403 J;

   private class05428(class05388 var1, class05403 var2) {
      super();
      this.I = var1;
      this.J = var2;
   }

   public class05388 y() {
      return this.I;
   }

   public static class01343 N(Function<class00891, class05388> var0, class05403 var1) {
      return var2 -> new class05428((class05388)var0.apply(var2), var1);
   }

   public static class05428 N(class01894 var0) {
      return new class05428(class05388.y(var0), class05433.L);
   }

   public class01894 N(class00891 var1, String var2, BiConsumer<class01894, class08819> var3) {
      return this.J.N(var1, var2, this.I, var3);
   }

   public class05403 N() {
      return this.J;
   }

   public class01894 N(class00891 var1, BiConsumer<class01894, class08819> var2) {
      return this.J.N(var1, this.I, var2);
   }

   public class05428 N(Consumer<class05388> var1) {
      var1.accept(this.I);
      return this;
   }
}
