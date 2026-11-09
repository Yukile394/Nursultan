package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;
import org.slf4j.Logger;

public class class01897 {
   private static final Logger N = LogUtils.getLogger();

   public class01897() {
      super();
   }

   private static List N(List var0) {
      return DynamicRegistries.getDynamicRegistries();
   }

   public static <D, R> CompletableFuture<R> N(class01908 var0, class01933<D> var1, class01922<D, R> var2, Executor var3, Executor var4) {
      try {
         Pair<class03776, class03554> pair = var0.N().N();
         class03554 class03554 = (class03554)pair.getSecond();
         class02003<class02969> class02003 = class02969.N();
         List<class00720<?>> list = class01214.N(class03554, class02003.N(class02969.field_39971));
         List<class01921<?>> list1 = class01214.N(class02003.y(class02969.field_39972), list);
         class01022 class01022x = class03078.N(class03554, list1, N(class03078.N));
         List list2 = Stream.concat(list1.stream(), class01022x.L()).toList();
         class01022 class01022x = class03078.N(class03554, list2, class03078.y);
         class03776 class03776 = (class03776)pair.getFirst();
         class01929 class01929 = class01929.N(list2.stream());
         class03981 class03981 = var1.get(new class01930(class03554, class03776, class01929, class01022x));
         class02003<class02969> class02003x = class02003.N(class02969.field_39972, class01022x, class03981.y());
         return class01248.N(class03554, class02003x, list, class03776.y(), var0.y(), var0.L(), var3, var4).whenComplete((var1x, var2x) -> {
            if (var2x != null) {
               class03554.close();
            }
         }).thenApplyAsync(var4x -> {
            var4x.M();
            return (R)var2.create(class03554, var4x, class02003, class03981.N());
         }, var4);
      } catch (Exception exception) {
         return CompletableFuture.failedFuture(exception);
      }
   }
}
