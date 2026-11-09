package minecraft;

import Nursultan.class11345;
import com.mojang.jtracy.TracyClient;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public final class class08700 {
   private static final ThreadLocal<class08714> N = ThreadLocal.withInitial(class08714::new);
   private static final ThreadLocal<class04643> y = new ThreadLocal<>();
   private static final AtomicInteger L = new AtomicInteger();

   private static class04643 L(class04643 var0) {
      return class04643.N(L(), var0);
   }

   private static class04643 L() {
      return (class04643)(TracyClient.isAvailable() ? N.get() : class04687.N);
   }

   private class08700() {
      super();
   }

   private static void y() {
      class04643 class04643 = y.get();
      if (class04643 == null) {
         throw new IllegalStateException("Profiler was not active");
      } else {
         y.remove();
         L.decrementAndGet();
         class04643.y();
      }
   }

   private static void y(class04643 var0) {
      if (y.get() != null) {
         throw new IllegalStateException("Profiler is already active");
      } else {
         class04643 class04643 = L(var0);
         y.set(class04643);
         L.incrementAndGet();
         class04643.N();
      }
   }

   public static class11345 N(class04643 var0) {
      y(var0);
      return class08700::y;
   }

   public static class04643 N() {
      return L.get() == 0 ? L() : Objects.requireNonNullElseGet(y.get(), class08700::L);
   }
}
