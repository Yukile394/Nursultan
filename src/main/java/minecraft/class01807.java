package minecraft;

import Nursultan.class09527;
import Nursultan.class09534;
import net.caffeinemc.mods.lithium.common.world.chunk.LithiumHashPalette;
import net.caffeinemc.mods.lithium.mixin.util.accessors.StrategyAccessor;

public abstract class class01807<T> implements StrategyAccessor {
   public static final class07373 N = class01822::N;
   public static final class07373 y = class00566::N;
   private static final class07373 W = class00567::N;
   public static final class06617 L = new class06621(N, 0);
   public static final class06617 u = new class06621(y, 1);
   public static final class06617 i = new class06621(y, 2);
   public static final class06617 R = new class06621(y, 3);
   public static final class06617 M = new class06621(y, 4);
   public static final class06617 B = new class06621(W, 5);
   public static final class06617 Z = new class06621(W, 6);
   public static final class06617 z = new class06621(W, 7);
   public static final class06617 U = new class06621(W, 8);
   private final class00750<T> m;
   private final class00551<T> P;
   protected final int E;
   private final int s;
   private final int T;
   private static final class07373 b = LithiumHashPalette::create;
   public static final class06617 j = new class06621(b, 3);
   public static final class06617 v = new class06621(b, 4);
   public static final class06617 n = new class06621(b, 5);
   public static final class06617 t = new class06621(b, 6);
   public static final class06617 G = new class06621(b, 7);
   public static final class06617 l = new class06621(b, 8);

   public class00551<T> L() {
      return this.P;
   }

   private static int L(int var0) {
      return class04995.R(var0);
   }

   public class01807(class00750<T> var1, int var2) {
      super();
      this.m = var1;
      this.P = new class00551<>(var1);
      this.E = L(var1.L());
      this.s = var2;
      this.T = 1 << var2 * 3;
   }

   protected class06617 y(int var1) {
      int ix = L(var1);
      return this.N(ix);
   }

   public static <T> class01807<T> y(class00750<T> var0) {
      return new class09534<>(var0, 2);
   }

   public class00750<T> y() {
      return this.m;
   }

   public static <T> class01807<T> N(class00750<T> var0) {
      return new class09527<>(var0, 4);
   }

   public int N() {
      return this.T;
   }

   public int N(int var1, int var2, int var3) {
      return (var2 << this.s | var3) << this.s | var1;
   }

   protected abstract class06617 N(int var1);
}
