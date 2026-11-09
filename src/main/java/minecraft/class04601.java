package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04601 {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("mco.util.time.now");
   private static final int L = 60;
   private static final int u = 3600;
   private static final int i = 86400;

   public class04601() {
      super();
   }

   public static Consumer<class05097> N(Function<class05097, class05096> var0, String var1) {
      return N(var0).andThen(var1x -> N.error(var1, var1x));
   }

   public static Consumer<class05097> N(Function<class05097, class05096> var0) {
      return var2 -> var0x.execute(() -> var0x.N((class05096)var0.apply(var2)));
   }

   public static class00392 N(Instant var0) {
      return N(System.currentTimeMillis() - var0.toEpochMilli());
   }

   public static void N(class01054 var0, int var1, int var2, int var3, UUID var4) {
      class07923 class07923 = class06202.Nq().Nn().N(class02689.N(var4));
      class03933.N(var0, class07923.y(), var1, var2, var3);
   }

   public static <T> CompletableFuture<T> N(class04621<T> var0, @Nullable Consumer<class05097> var1) {
      return CompletableFuture.supplyAsync(() -> {
         class05111 class05111 = class05111.N();

         try {
            return (T)var0.apply(class05111);
         } catch (Throwable throwable) {
            if (throwable instanceof class05097 class05097) {
               if (var1 != null) {
                  var1.accept(class05097);
               }
            } else {
               N.error("Unhandled exception", throwable);
            }

            throw new RuntimeException(throwable);
         }
      }, class07536.z());
   }

   public static class00392 N(long var0) {
      if (var0 < 0L) {
         return y;
      } else {
         long ix = var0 / 1000L;
         if (ix < 60L) {
            return class00392.N("mco.time.secondsAgo", ix);
         } else if (ix < 3600L) {
            long l = ix / 60L;
            return class00392.N("mco.time.minutesAgo", l);
         } else if (ix < 86400L) {
            long k = ix / 3600L;
            return class00392.N("mco.time.hoursAgo", k);
         } else {
            long j = ix / 86400L;
            return class00392.N("mco.time.daysAgo", j);
         }
      }
   }
}
