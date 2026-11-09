package minecraft;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class class00702<T extends class00699> {
   private static class00702<?>[] E = new class00702[0];
   public static final class00702<class00697> N = N(class00697.class, "HoldingPattern");
   public static final class00702<class00686> y = N(class00686.class, "StrafePlayer");
   public static final class00702<class00715> L = N(class00715.class, "LandingApproach");
   public static final class00702<class00705> u = N(class00705.class, "Landing");
   public static final class00702<class00694> i = N(class00694.class, "Takeoff");
   public static final class00702<class00706> R = N(class00706.class, "SittingFlaming");
   public static final class00702<class00716> M = N(class00716.class, "SittingScanning");
   public static final class00702<class00707> B = N(class00707.class, "SittingAttacking");
   public static final class00702<class00708> Z = N(class00708.class, "ChargingPlayer");
   public static final class00702<class00713> z = N(class00713.class, "Dying");
   public static final class00702<class00689> U = N(class00689.class, "Hover");
   private final Class<? extends class00699> W;
   private final int m;
   private final String P;

   public static int L() {
      return E.length;
   }

   private class00702(int var1, Class<? extends class00699> var2, String var3) {
      super();
      this.m = var1;
      this.W = var2;
      this.P = var3;
   }

   @Override
   public String toString() {
      return this.P + " (#" + this.m + ")";
   }

   public int y() {
      return this.m;
   }

   public class00699 N(class00690 var1) {
      try {
         Constructor<? extends class00699> constructor = this.N();
         return constructor.newInstance(var1);
      } catch (Exception exception) {
         throw new Error(exception);
      }
   }

   private static <T extends class00699> class00702<T> N(Class<T> var0, String var1) {
      class00702 class00702 = new class00702(E.length, var0, var1);
      E = Arrays.copyOf(E, E.length + 1);
      E[class00702.y()] = class00702;
      return class00702;
   }

   protected Constructor<? extends class00699> N() throws NoSuchMethodException {
      return this.W.getConstructor(class00690.class);
   }

   public static class00702<?> N(int var0) {
      return var0 >= 0 && var0 < E.length ? E[var0] : N;
   }
}
