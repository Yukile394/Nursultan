package minecraft;

import com.google.gson.JsonElement;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents.Loaded;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents.Modify;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents.Replace;
import net.fabricmc.fabric.impl.loot.FabricLootTable;
import net.fabricmc.fabric.impl.loot.LootUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02314 {
   private static final Logger N = LogUtils.getLogger();
   private static final class02819 y = new class02819(Optional.empty(), Lifecycle.experimental());
   private static final WeakHashMap L = new WeakHashMap();

   public class02314() {
      super();
   }

   private static void N(class03347 var0, class01089 var1, class03519 var2, CallbackInfoReturnable var3) {
      if (var0 == class03347.L) {
         class00751 class00751 = (class00751)var3.getReturnValue();
         ((Loaded)LootTableEvents.ALL_LOADED.invoker()).onLootTablesLoaded(var1, class00751);
         LootUtil.SOURCES.remove();
         class00751.z().forEach(var0x -> ((FabricLootTable)var0x.N()).fabric$setRegistryEntry(var0x));
      }
   }

   private static Object N(Object var0, class01894 var1, class03519 var2) {
      if (var0 instanceof class05074 class05074x) {
         class05946 class05946 = class05946.N(class04227.yJ, var1);
         class01929 class01929 = (class01929)L.get(var2);
         LootTableSource loottablesource = ((Map)LootUtil.SOURCES.get()).getOrDefault(var1, LootTableSource.DATA_PACK);
         class05074 class05074x = ((Replace)LootTableEvents.REPLACE.invoker()).replaceLootTable(class05946, class05074x, loottablesource, class01929);
         if (class05074x != null) {
            class05074x = class05074x;
            loottablesource = LootTableSource.REPLACED;
         }

         class05062 class05062 = FabricLootTableBuilder.copyOf(class05074x);
         ((Modify)LootTableEvents.MODIFY.invoker()).modifyLootTable(class05946, class05062, loottablesource, class01929);
         return class05062.L();
      } else {
         return var0;
      }
   }

   private static void N(class03347 var0, class01089 var1, class03519 var2, CallbackInfoReturnable var3, Map var4) {
      var4.replaceAll((var1x, var2x) -> N(var2x, var1x, var2));
   }

   private static CompletableFuture N(CompletableFuture var0, Function var1, Executor var2, Operation var3, class03519 var4) {
      return (CompletableFuture)var3.call(new Object[]{var0.thenApply(var1x -> {
         L.remove(var4);
         return (List)var1x;
      }), var1, var2});
   }

   private static class03519 N(class01929 var0, DynamicOps var1, Operation var2) {
      class03519 class03519 = (class03519)var2.call(new Object[]{var0, var1});
      L.put(class03519, var0);
      return class03519;
   }

   private static <T> CompletableFuture<class07099<?>> N(class03347<T> var0, class03519<JsonElement> var1, class01089 var2, Executor var3) {
      return CompletableFuture.supplyAsync(() -> {
         class00731 class00731 = new class00731(var0.y(), Lifecycle.experimental());
         HashMap hashmap = new HashMap();
         class05703.N(var2, var0.y(), var1, var0.L(), hashmap);
         BiConsumer biconsumer = (var2xx, var3x) -> class00731.N(class05946.N(var0.y(), var2xx), var3x, y);
         N(var0, var2, var1, null, hashmap);
         hashmap.forEach(biconsumer);
         class01214.N(var2, class00731);
         N(var0, var2, var1, new CallbackInfoReturnable("", false, class00731));
         return class00731;
      }, var3);
   }

   public static CompletableFuture<class02347> N(class02003<class02969> var0, List<class00720<?>> var1, class01089 var2, Executor var3) {
      class01929 class01929 = class01929.N(class01214.N(var0.y(class02969.field_39974), var1).stream());
      JsonOps jsonops = JsonOps.INSTANCE;
      class03519 class03519 = N(class01929, jsonops, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_7225$class_7874, com.mojang.serialization.DynamicOps]");
         return ((class01929)var0x[0]).N((DynamicOps)var0x[1]);
      });
      CompletableFuture completablefuture1 = class07536.L(class03347.N().map(var3x -> N((class03347<?>)var3x, class03519, var2, var3)).toList());
      Function function = var2x -> N(var0, class01929, var2x);
      CompletableFuture completablefuture = completablefuture1;
      Operation operation = var0x -> {
         WrapOperationRuntime.checkArgumentCount(
            var0x, 3, "[java.util.concurrent.CompletableFuture, java.util.function.Function, java.util.concurrent.Executor]"
         );
         return ((CompletableFuture)var0x[0]).thenApplyAsync((Function)var0x[1], (Executor)var0x[2]);
      };
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(class03519);
      completablefuture1 = N(completablefuture, function, var3, operation, localrefimpl);
      class03519 = (class03519)localrefimpl.dispose();
      return completablefuture1;
   }

   private static CompletableFuture N(CompletableFuture var0, Function var1, Executor var2, Operation var3, LocalRef var4) {
      return N(var0, var1, var2, var3, (class03519)var4.get());
   }

   private static <T> void N(class05561 var0, class03347<T> var1, class01929 var2) {
      var2.y(var1.y()).z().forEach(var2x -> var1.N(var0, var2x.B(), var2x.N()));
   }

   private static class02003<class02969> N(class02003<class02969> var0, List<class07099<?>> var1) {
      return var0.N(class02969.field_39974, new class01014(var1).method_40316());
   }

   private static void N(class01929 var0) {
      class04482 class04482 = new class04482();
      class05561 class05561 = new class05561(class04482, class06925.b, var0);
      class03347.N().forEach(var2x -> N(class05561, (class03347<?>)var2x, var0));
      class04482.N((var0x, var1x) -> N.warn("Found loot table element validation problem in {}: {}", var0x, var1x.N()));
   }

   private static class01929 N(class01929 var0, class01929 var1) {
      return class01929.N(Stream.concat(var0.L(), var1.L()));
   }

   private static class02347 N(class02003<class02969> var0, class01929 var1, List<class07099<?>> var2) {
      class02003<class02969> class02003 = N(var0, var2);
      class01929 class01929 = N(var1, class02003.N(class02969.field_39974));
      N(class01929);
      return new class02347(class02003, class01929);
   }
}
