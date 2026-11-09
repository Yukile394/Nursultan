package minecraft;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiPredicate;
import net.caffeinemc.mods.lithium.mixin.ai.useless_sensors.SensorAccessor;

public abstract class class05355<E extends class07438> implements SensorAccessor {
   private static final class06069 N = class06069.i();
   private static final int y = 20;
   private static final int L = 16;
   private static final class01328 u = class01328.y().N(16.0);
   private static final class01328 i = class01328.y().N(16.0).i();
   private static final class01328 R = class01328.N().N(16.0);
   private static final class01328 M = class01328.N().N(16.0).i();
   private static final class01328 B = class01328.N().N(16.0).u();
   private static final class01328 Z = class01328.N().N(16.0).u().i();
   private final int z;
   private long U;

   public static boolean L(class04782 var0, class07438 var1, class07438 var2) {
      return var1.method_18868().y(class05378.s, var2) ? Z.N(var0, var1, var2) : B.N(var0, var1, var2);
   }

   public class05355(int var1) {
      super();
      this.z = var1;
      this.U = N.y(var1);
   }

   public class05355() {
      this(20);
   }

   public static boolean y(class04782 var0, class07438 var1, class07438 var2) {
      return var1.method_18868().y(class05378.s, var2) ? M.N(var0, var1, var2) : R.N(var0, var1, var2);
   }

   public final void y(class04782 var1, E var2) {
      if (--this.U <= 0L) {
         this.U = this.z;
         this.N((E)var2);
         this.N(var1, (E)var2);
      }
   }

   static <T, U> BiPredicate<T, U> N(int var0, BiPredicate<T, U> var1) {
      AtomicInteger atomicinteger = new AtomicInteger(0);
      return (var3, var4) -> {
         if (var1.test(var3, var4)) {
            atomicinteger.set(var0);
            return true;
         } else {
            return atomicinteger.decrementAndGet() >= 0;
         }
      };
   }

   private void N(E var1) {
      double d0 = var1.method_45325(class05298.P);
      u.N(d0);
      i.N(d0);
      R.N(d0);
      M.N(d0);
      B.N(d0);
      Z.N(d0);
   }

   protected abstract void N(class04782 var1, E var2);

   public abstract Set<class05378<?>> N();

   public static boolean N(class04782 var0, class07438 var1, class07438 var2) {
      return var1.method_18868().y(class05378.s, var2) ? i.N(var0, var1, var2) : u.N(var0, var1, var2);
   }

   public static BiPredicate<class04782, class07438> N(class07438 var0, int var1) {
      return N(var1, (var1x, var2) -> y(var1x, var0, var2));
   }
}
