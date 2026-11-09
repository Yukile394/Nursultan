package minecraft;

import Nursultan.class11660;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedExtraModel;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08874 {
   public static final class05913 N = class05911.m.N("fire_0");
   public static final class05913 y = class05911.m.N("fire_1");
   public static final class05913 L = class05911.m.N("lava_still");
   public static final class05913 u = class05911.m.N("lava_flow");
   public static final class05913 i = class05911.m.N("water_still");
   public static final class05913 R = class05911.m.N("water_flow");
   public static final class05913 M = class05911.m.N("water_overlay");
   public static final class05913 B = new class05913(class05911.L, class01894.y("entity/banner_base"));
   public static final class05913 Z = new class05913(class05911.u, class01894.y("entity/shield_base"));
   public static final class05913 z = new class05913(class05911.u, class01894.y("entity/shield_base_nopattern"));
   public static final int U = 10;
   public static final List<class01894> E = IntStream.range(0, 10).mapToObj(var0 -> class01894.y("block/destroy_stage_" + var0)).collect(Collectors.toList());
   public static final List<class01894> W = E.stream()
      .map(var0 -> var0.N((UnaryOperator<String>)(var0x -> "textures/" + var0x + ".png")))
      .collect(Collectors.toList());
   public static final List<class07311> m = W.stream().map(class06851::v).collect(Collectors.toList());
   static final Logger P = LogUtils.getLogger();
   private final class01140 b;
   private final class08097 j;
   private final class07949 v;
   private final Map<class00500, class08889> n;
   private final Map<class01894, class08839> t;
   final Map<class01894, class08529> s;
   final class08529 T;
   @Nullable
   private ModelLoadingEventDispatcher G;

   public class08874(
      class01140 var1,
      class08097 var2,
      class07949 var3,
      Map<class00500, class08889> var4,
      Map<class01894, class08839> var5,
      Map<class01894, class08529> var6,
      class08529 var7
   ) {
      super();
      this.b = var1;
      this.j = var2;
      this.v = var3;
      this.n = var4;
      this.t = var5;
      this.s = var6;
      this.T = var7;
      this.N(null);
   }

   private class08910 N(class08895 var1, class08905 var2, Operation var3, class01894 var4) {
      return this.G == null ? (class08910)var3.call(new Object[]{var1, var2}) : this.G.modifyItemModel(var1, var4, var2, var3);
   }

   private static class08887 N(class08889 var0, class00500 var1, class02028 var2, Operation var3) {
      ModelLoadingEventDispatcher modelloadingeventdispatcher = (ModelLoadingEventDispatcher)ModelLoadingEventDispatcher.CURRENT.get();
      return modelloadingeventdispatcher == null
         ? (class08887)var3.call(new Object[]{var0, var1, var2})
         : modelloadingeventdispatcher.modifyBlockModel(var0, var1, var2, var3);
   }

   private CompletableFuture N(CompletableFuture var1, Executor var2, class08860 var3) {
      if (this.G == null) {
         return var1;
      } else {
         CompletableFuture completablefuture = class08404.N(this.G.getExtraModels(), (var1x, var2x) -> {
            try {
               return var2x.bake(var3);
            } catch (Exception exception) {
               P.warn("Unable to bake extra model: '{}'", var1x, exception);
               return null;
            }
         }, var2);
         return var1.thenCombine(completablefuture, (var0, var1x) -> {
            var0.fabric_setExtraModels(var1x);
            return var0;
         });
      }
   }

   private void N(CallbackInfo var1) {
      this.G = (ModelLoadingEventDispatcher)ModelLoadingEventDispatcher.CURRENT.get();
   }

   private class08910 N(class08895 var1, class08905 var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (class01894)var4.get());
   }

   private BiFunction N(BiFunction var1) {
      return this.G == null ? var1 : (var2, var3) -> {
         ModelLoadingEventDispatcher.CURRENT.set(this.G);
         class08887 class08887 = (class08887)var1.apply(var2, var3);
         ModelLoadingEventDispatcher.CURRENT.remove();
         return class08887;
      };
   }

   public CompletableFuture<class08890> N(class02601 var1, Executor var2) {
      class11660 class11660 = new class11660();
      class08881 class08881 = class08881.N(this.T, var1, class11660);
      class08860 class08860 = new class08860(this, var1, class11660, class08881);
      Map map = this.n;
      BiFunction bifunction = (var1x, var2x) -> {
         try {
            return N(var2x, var1x, class08860, var0x -> {
               WrapOperationRuntime.checkArgumentCount(var0x, 3, "[net.minecraft.class_1087$class_9979, net.minecraft.class_2680, net.minecraft.class_7775]");
               return ((class08889)var0x[0]).method_65542((class00500)var0x[1], (class02028)var0x[2]);
            });
         } catch (Exception exception) {
            P.warn("Unable to bake model: '{}': {}", var1x, exception);
            return null;
         }
      };
      CompletableFuture completablefuture = class08404.N(map, this.N(bifunction), var2);
      CompletableFuture completablefuture1 = class08404.N(this.t, (var3x, var4x) -> {
         try {
            class08905 class08905 = new class08905(class08860, this.b, this.j, this.v, class08881.L(), var4x.L());
            class08895 class08895 = var4x.N();
            Operation operation = var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_10439$class_10441, net.minecraft.class_10439$class_10440]");
               return ((class08895)var0[0]).method_65587((class08905)var0[1]);
            };
            LocalRefImpl localrefimpl = new LocalRefImpl();
            localrefimpl.init(var3x);
            class08910 class08910 = this.N(class08895, class08905, operation, localrefimpl);
            var3x = (class01894)localrefimpl.dispose();
            return class08910;
         } catch (Exception exception) {
            P.warn("Unable to bake item model: '{}'", var3x, exception);
            return null;
         }
      }, var2);
      HashMap hashmap = new HashMap(this.t.size());
      this.t.forEach((var1x, var2x) -> {
         class08906 class08906 = var2x.y();
         if (!class08906.equals(class08906.N)) {
            hashmap.put(var1x, class08906);
         }
      });
      return this.N(completablefuture.thenCombine(completablefuture1, (var2x, var3x) -> new class08890(class08881, var2x, var3x, hashmap)), var2, class08860);
   }
}
