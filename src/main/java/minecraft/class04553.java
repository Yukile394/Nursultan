package minecraft;

import Nursultan.class10434;
import Nursultan.class10457;
import com.google.common.base.Stopwatch;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class class04553 implements class04555 {
   private static final Logger N = LogUtils.getLogger();
   private final Set<class04530> y = new ObjectOpenHashSet();
   private final class04587 L = new class04587();

   public class04553(LongSupplier var1, boolean var2) {
      super();
      this.y.add(N(var1));
      if (var2) {
         this.y.addAll(N());
      }
   }

   @Override
   public Set<class04530> N(Supplier<class04657> var1) {
      this.y.addAll(this.L.N(var1));
      return this.y;
   }

   public static Set<class04530> N() {
      Builder builder = ImmutableSet.builder();

      try {
         class04574 class04574 = new class04574();
         IntStream.range(0, class04574.N)
            .mapToObj(var1x -> class04530.N("cpu#" + var1x, class02253.field_33881, () -> class04574.N(var1x)))
            .forEach(builder::add);
      } catch (Throwable throwable) {
         N.warn("Failed to query cpu, no cpu stats will be recorded", throwable);
      }

      builder.add(class04530.N("heap MiB", class02253.field_33878, () -> class03463.N(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())));
      builder.addAll(class02672.N.N());
      return builder.build();
   }

   public static class04530 N(LongSupplier var0) {
      Stopwatch stopwatch = Stopwatch.createUnstarted(new class10457(var0));
      ToDoubleFunction todoublefunction = var0x -> {
         if (var0x.isRunning()) {
            var0x.stop();
         }

         long i = var0x.elapsed(TimeUnit.NANOSECONDS);
         var0x.reset();
         return i;
      };
      class10434 class10434 = new class10434(2.0F);
      return class04530.N("ticktime", class02253.field_33877, todoublefunction, stopwatch).N(Stopwatch::start).N(class10434).N();
   }
}
