package minecraft;

import Nursultan.class10190;
import com.mojang.logging.LogUtils;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.trackers.StateIdTracker;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockItemTracker;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03914 {
   public static final PrintStream N = System.out;
   private static volatile boolean L;
   private static final Logger u = LogUtils.getLogger();
   public static final AtomicLong y = new AtomicLong(-1L);

   public static void L() {
      N((Supplier<String>)(() -> "validate"));
      if (class07529.ND) {
         y().forEach(var0 -> u.error("Missing translations: {}", var0));
         class07686.y();
      }

      class05316.N();
   }

   public class03914() {
      super();
   }

   private static void u() {
      if (u.isDebugEnabled()) {
         System.setErr(new class03466("STDERR", System.err));
         System.setOut(new class03466("STDOUT", N));
      } else {
         System.setErr(new class01846("STDERR", System.err));
         System.setOut(new class01846("STDOUT", N));
      }
   }

   private static RuntimeException y(Supplier<String> var0) {
      try {
         String s = (String)var0.get();
         return new IllegalArgumentException("Not bootstrapped (called from " + s + ")");
      } catch (Exception exception) {
         IllegalArgumentException illegalargumentexception = new IllegalArgumentException("Not bootstrapped (failed to resolve location)");
         illegalargumentexception.addSuppressed(exception);
         return illegalargumentexception;
      }
   }

   public static Set<String> y() {
      TreeSet treeset = new TreeSet();
      N(class04206.v, class07468::L, treeset);
      N(class04206.M, class07078::R, treeset);
      N(class04206.u, class07084::R, treeset);
      N(class04206.B, class06581::z, treeset);
      N(class04206.i, class01354::w, treeset);
      N(class04206.E, var0x -> "stat." + var0x.toString().replace(':', '.'), treeset);
      N(treeset);
      return treeset;
   }

   private static void N(CallbackInfo var0) {
      class00891 class00891 = class00869.N;
      class04651 class04651 = class04684.N;
      class06581 class06581 = class06570.N;
      StateIdTracker.register(class04206.i, class00891.U, var0x -> var0x.E().N());
      StateIdTracker.register(class04206.L, class04651.L, var0x -> var0x.R().N());
      BlockItemTracker.register(class04206.B);
      RegistrySyncManager.bootstrapRegistries();
   }

   private static <T> void N(Iterable<T> var0, Function<T, String> var1, Set<String> var2) {
      class07018 class07018 = class07018.y();
      var0.forEach(var3x -> {
         String s = (String)var1.apply(var3x);
         if (!class07018.N(s)) {
            var2.add(s);
         }
      });
   }

   public static void N() {
      if (!L) {
         L = true;
         Instant instant = Instant.now();
         if (class04206.NF.M().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
         } else {
            class00756.y();
            class05836.y();
            if (class07078.N(class07078.Ly) == null) {
               throw new IllegalStateException("Failed loading EntityTypes");
            } else {
               class06767.N();
               class00755.N();
               class04823.N();
               R();
               class03771.N();
               N(null);
               u();
               y.set(Duration.between(instant, Instant.now()).toMillis());
            }
         }
      }
   }

   private static void N(Set<String> var0) {
      class07018 class07018 = class07018.y();
      new class07305(class03794.i.N()).N(new class10190(class07018, var0));
   }

   public static void N(Supplier<String> var0) {
      if (!L) {
         throw y(var0);
      }
   }

   public static void N(String var0) {
      N.println(var0);
   }

   private static void R() {
      class04206.y();
   }
}
