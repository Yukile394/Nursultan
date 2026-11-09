package minecraft;

import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.AliasGroupBuilder;
import net.fabricmc.fabric.impl.datagen.FabricTagBuilder;
import net.fabricmc.fabric.impl.datagen.TagAliasGenerator;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07028<T> implements class07135 {
   protected final class01997 field_39380;
   private final CompletableFuture<class01929> field_43107;
   private final CompletableFuture<Void> field_43108 = new CompletableFuture<>();
   private final CompletableFuture<class07034<T>> field_43093;
   public final class05946<? extends class00751<T>> field_40957;
   public final Map<class01894, class01225> field_11481 = Maps.newLinkedHashMap();
   private class01997 tagAliasPathResolver;

   public class07028(class01996 var1, class05946<? extends class00751<T>> var2, CompletableFuture<class01929> var3) {
      this(var1, var2, var3, CompletableFuture.completedFuture(class07034.N()));
   }

   protected class07028(class01996 var1, class05946<? extends class00751<T>> var2, CompletableFuture<class01929> var3, CompletableFuture<class07034<T>> var4) {
      super();
      this.field_39380 = var1.method_60918(var2);
      this.field_40957 = var2;
      this.field_43093 = var4;
      this.field_43107 = var3;
      this.m_handler$zdf000$fabric_data_generation_api_v1$initPathResolver_68(var1, var2, var3, var4, null);
   }

   @Override
   public String method_10321() {
      return "Tags for " + this.field_40957.N();
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return this.method_49651()
         .thenApply(var1x -> {
            this.field_43108.complete(null);
            return (class01929)var1x;
         })
         .thenCombineAsync(this.field_43093, (var0, var1x) -> new class07006<>(var0, (class07034<T>)var1x), class07536.B())
         .thenCompose(
            var2 -> {
               class01921 class01921 = var2.N().y(this.field_40957);
               Predicate predicate = var2x -> class01921.N(class05946.N(this.field_40957, var2x)).isPresent();
               Predicate predicate1 = var2x -> this.field_11481.containsKey(var2x) || var2.y().N(class03530.N(this.field_40957, var2x));
               CompletableFuture[] acompletablefuture = this.field_11481
                  .entrySet()
                  .stream()
                  .map(
                     var5x -> {
                        class01894 class01894 = var5x.getKey();
                        class01225 class01225 = var5x.getValue();
                        List<class01215> list = class01225.y();
                        List<class01215> list1 = list.stream().filter(var2xx -> !var2xx.method_32832(predicate, predicate1)).toList();
                        if (!list1.isEmpty()) {
                           throw new IllegalArgumentException(
                              String.format(
                                 Locale.ROOT,
                                 "Couldn't define tag %s as it is missing following references: %s",
                                 class01894,
                                 list1.stream().map(Objects::toString).collect(Collectors.joining(","))
                              )
                           );
                        } else {
                           Path path = this.field_39380.N(class01894);
                           class01929 class01929 = var2.N();
                           boolean flag = false;
                           return class07135.N(
                              var1,
                              class01929,
                              class03932.N,
                              new class03932(list, this.m_modify$zdf000$fabric_data_generation_api_v1$addReplaced_66(flag, class01225)),
                              path
                           );
                        }
                     }
                  )
                  .toArray(CompletableFuture[]::new);
               Operation operation = var0 -> {
                  WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.util.concurrent.CompletableFuture[]]");
                  return CompletableFuture.allOf((CompletableFuture<?>[])var0[0]);
               };
               LocalRefImpl localrefimpl = new LocalRefImpl();
               localrefimpl.init(var1);
               CompletableFuture completablefuture = this.m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders$mixinextras$bridge$23_69(
                  acompletablefuture, operation, localrefimpl
               );
               var1 = (class04476)localrefimpl.dispose();
               return completablefuture;
            }
         );
   }

   private boolean m_modify$zdf000$fabric_data_generation_api_v1$addReplaced_66(boolean var1, class01225 var2) {
      return var2 instanceof FabricTagBuilder ? var2.fabric_isReplaced() : var1;
   }

   private CompletableFuture m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders_67(
      CompletableFuture[] var1, Operation var2, class04476 var3
   ) {
      if (!(this instanceof FabricTagProvider)) {
         return (CompletableFuture)var2.call(new Object[]{var1});
      } else {
         Map map = ((FabricTagProvider)this).getAliasGroupBuilders();
         CompletableFuture[] acompletablefuture = Arrays.copyOf(var1, var1.length + map.size());
         int i = var1.length;

         for (Entry entry : map.entrySet()) {
            acompletablefuture[i++] = TagAliasGenerator.writeTagAlias(
               var3, this.tagAliasPathResolver, this.field_40957, (class01894)entry.getKey(), ((AliasGroupBuilder)entry.getValue()).getTags()
            );
         }

         return (CompletableFuture)var2.call(new Object[]{acompletablefuture});
      }
   }

   protected abstract void method_10514(class01929 var1);

   public class01225 method_27169(class03530<T> var1) {
      return this.field_11481.computeIfAbsent(var1.y(), var0 -> class01225.N());
   }

   public CompletableFuture<class07034<T>> method_49662() {
      return this.field_43108.thenApply(var1 -> var1x -> Optional.ofNullable(this.field_11481.get(var1x.y())));
   }

   protected CompletableFuture<class01929> method_49651() {
      return this.field_43107.thenApply(var1 -> {
         this.field_11481.clear();
         this.method_10514(var1);
         return (class01929)var1;
      });
   }

   private void m_handler$zdf000$fabric_data_generation_api_v1$initPathResolver_68(
      class01996 var1, class05946 var2, CompletableFuture var3, CompletableFuture var4, CallbackInfo var5
   ) {
      this.tagAliasPathResolver = var1.method_45973(class02024.field_39367, TagAliasGenerator.getDirectory(var2));
   }

   private CompletableFuture m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders$mixinextras$bridge$23_69(
      CompletableFuture[] var1, Operation var2, LocalRef var3
   ) {
      return this.m_wrapOperation$zdf000$fabric_data_generation_api_v1$addTagAliasGroupBuilders_67(var1, var2, (class04476)var3.get());
   }
}
