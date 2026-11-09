package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class class04320 {
   private static final Logger N = LogUtils.getLogger();
   private static final LoadingCache<class04782, class04313> y = CacheBuilder.newBuilder()
      .weakKeys()
      .expireAfterAccess(5L, TimeUnit.MINUTES)
      .build(new class04301());

   public class04320() {
      super();
   }

   public static void y() {
      N.debug("Logging feature counts:");
      y.asMap()
         .forEach(
            (var0, var1) -> {
               String s = var0.method_27983().N().toString();
               boolean flag = var0.method_8503().Nj();
               class00751 class00751 = var0.method_30349().L(class04227.ys);
               String s1 = (flag ? "running" : "dead") + " " + s;
               int i = var1.y().intValue();
               N.debug("{} total_chunks: {}", s1, i);
               var1.N()
                  .forEach(
                     (var3x, var4x) -> N.debug(
                        "{} {} {} {} {} {}",
                        new Object[]{
                           s1,
                           String.format(Locale.ROOT, "%10d", var4x),
                           String.format(Locale.ROOT, "%10f", (double)var4x / i),
                           var3x.y().flatMap(class00751::u).map(class05946::N),
                           var3x.N().y(),
                           var3x.N()
                        }
                     )
                  );
            }
         );
   }

   public static void N(class04782 var0, class03238<?, ?> var1, Optional<class04336> var2) {
      try {
         ((class04313)y.get(var0)).N().computeInt(new class04318(var1, var2), (var0x, var1x) -> var1x == null ? 1 : var1x + 1);
      } catch (Exception exception) {
         N.error("Failed to increment feature count", exception);
      }
   }

   public static void N(class04782 var0) {
      try {
         ((class04313)y.get(var0)).y().increment();
      } catch (Exception exception) {
         N.error("Failed to increment chunk count", exception);
      }
   }

   public static void N() {
      y.invalidateAll();
      N.debug("Cleared feature counts");
   }
}
