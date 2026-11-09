package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import org.slf4j.Logger;

public class class01116 implements class01136<class07049> {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "Entities";
   private static final String L = "Position";
   private final class04782 u;
   private final class06172 i;
   private final LongSet R = new LongOpenHashSet();
   private final class08214 M;

   public class01116(class06172 var1, class04782 var2, Executor var3) {
      super();
      this.i = var1;
      this.u = var2;
      this.M = new class08214(var3, "entity-deserializer");
   }

   @Override
   public void close() throws IOException {
      this.i.close();
   }

   private void y(CompletableFuture<?> var1, class07321 var2) {
      var1.exceptionally(var2x -> {
         N.error("Failed to load entity chunk {}", var2, var2x);
         this.u.method_8503().N(var2x, this.i.m(), var2);
         return null;
      });
   }

   private static class01130<class07049> y(class07321 var0) {
      return new class01130<>(var0, List.of());
   }

   @Override
   public void N(class01130<class07049> var1) {
      class07321 class07321 = var1.N();
      if (var1.L()) {
         if (this.R.add(class07321.y())) {
            this.N(this.i.N(class07321, class05918.N), class07321);
         }
      } else {
         try (class04495 class04495 = new class04495(class08050.N(class07321), N)) {
            class07741 class07741 = new class07741();
            var1.y().forEach(var2x -> {
               class08303 class08303 = class08303.N(class04495.N_46(var2x.method_71370()), var2x.method_56673());
               if (var2x.method_5662(class08303)) {
                  class07001 class07001x = class08303.y();
                  class07741.add(class07001x);
               }
            });
            class07001 class07001 = class07717.i(new class07001());
            class07001.N("Entities", class07741);
            class07001.N("Position", class07321.N, class07321);
            this.N(this.i.N(class07321, class07001), class07321);
            this.R.remove(class07321.y());
         }
      }
   }

   @Override
   public void N(boolean var1) {
      this.i.y(var1).join();
      this.M.N();
   }

   private void N(CompletableFuture<?> var1, class07321 var2) {
      var1.exceptionally(var2x -> {
         N.error("Failed to store entity chunk {}", var2, var2x);
         this.u.method_8503().y(var2x, this.i.m(), var2);
         return null;
      });
   }

   @Override
   public CompletableFuture<class01130<class07049>> N(class07321 var1) {
      if (this.R.contains(var1.y())) {
         return CompletableFuture.completedFuture(y(var1));
      } else {
         CompletableFuture<Optional<class07001>> completablefuture = this.i.u(var1);
         this.y(completablefuture, var1);
         return completablefuture.thenApplyAsync(var2x -> {
            if (var2x.isEmpty()) {
               this.R.add(var1.y());
               return y(var1);
            } else {
               try {
                  class07321 class07321 = var2x.get().<class07321>N_15("Position", class07321.N).orElseThrow();
                  if (!Objects.equals(var1, class07321)) {
                     N.error("Chunk file at {} is in the wrong location. (Expected {}, got {})", new Object[]{var1, var1, class07321});
                     this.u.method_8503().N(class07321, var1, this.i.m());
                  }
               } catch (Exception exception) {
                  N.warn("Failed to parse chunk {} position info", var1, exception);
                  this.u.method_8503().N(exception, this.i.m(), var1);
               }

               class07001 class07001 = this.i.N(var2x.get(), -1);

               class01130 class01130;
               try (class04495 class04495 = new class04495(class08050.N(var1), N)) {
                  class08299 class08299 = class08308.N(class04495, this.u.method_30349(), class07001);
                  class08319 class08319 = class08299.u("Entities");
                  List<class07049> list = class07078.N(class08319, this.u, class06113.field_52444).toList();
                  class01130 = new class01130<>(var1, list);
               }

               return class01130;
            }
         }, this.M::N);
      }
   }
}
