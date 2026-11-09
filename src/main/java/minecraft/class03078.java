package minecraft;

import Nursultan.class10081;
import com.google.gson.JsonElement;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.event.registry.DynamicRegistrySetupCallback;
import net.fabricmc.fabric.impl.item.EnchantmentUtil;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistryViewImpl;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03078 {
   private static final Logger u = LogUtils.getLogger();
   private static final Comparator<class05946<?>> i = Comparator.<class05946<?>, class01894>comparing(class05946::y).thenComparing(class05946::N);
   private static final class02819 R = new class02819(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<class02298>, class02819> M = class07536.y_4(var0 -> {
      Lifecycle lifecycle = var0.<Boolean>map(class02298::N).map(var0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new class02819(var0, lifecycle);
   });
   public static final List<class02965<?>> N = List.of(
      new class02965<>(class04227.yu, class07376.B),
      new class02965<>(class04227.NA, class00780.N),
      new class02965<>(class04227.NC, class00629.N),
      new class02965<>(class04227.ND, class07829.N),
      new class02965<>(class04227.Nh, class03238.N),
      new class02965<>(class04227.ys, class04336.N),
      new class02965<>(class04227.yj, class04748.L),
      new class02965<>(class04227.yb, class04412.N),
      new class02965<>(class04227.yT, class05235.L),
      new class02965<>(class04227.yv, class05281.N),
      new class02965<>(class04227.yE, class05943.N),
      new class02965<>(class04227.yW, class05056.L),
      new class02965<>(class04227.yy, class03877.u),
      new class02965<>(class04227.yO, class04382.N),
      new class02965<>(class04227.yM, class04086.N),
      new class02965<>(class04227.yk, class03246.N),
      new class02965<>(class04227.yw, class03252.N),
      new class02965<>(class04227.yl, class04513.y),
      new class02965<>(class04227.yY, class02505.N, true),
      new class02965<>(class04227.yQ, class08519.N, true),
      new class02965<>(class04227.yP, class08642.N, true),
      new class02965<>(class04227.yB, class04068.N, true),
      new class02965<>(class04227.Nf, class03648.N, true),
      new class02965<>(class04227.Nr, class08403.N, true),
      new class02965<>(class04227.NS, class08423.N, true),
      new class02965<>(class04227.Nx, class07589.N, true),
      new class02965<>(class04227.ym, class00693.N, true),
      new class02965<>(class04227.yN, class03689.N),
      new class02965<>(class04227.yU, class03573.N),
      new class02965<>(class04227.NF, class00412.N),
      new class02965<>(class04227.yR, class07304.y),
      new class02965<>(class04227.yi, class02530.N),
      new class02965<>(class04227.yz, class02206.N),
      new class02965<>(class04227.yZ, class04449.N),
      new class02965<>(class04227.yn, class00225.N),
      new class02965<>(class04227.yt, class00201.y),
      new class02965<>(class04227.yL, class09037.L),
      new class02965<>(class04227.yG, class07587.y)
   );
   public static final List<class02965<?>> y = List.of(new class02965<>(class04227.yI, class01255.N));
   public static List<class02965<?>> L = List.of(
      new class02965<>(class04227.NA, class00780.y),
      new class02965<>(class04227.NC, class00629.N),
      new class02965<>(class04227.yk, class03246.N),
      new class02965<>(class04227.yw, class03252.N),
      new class02965<>(class04227.yY, class02505.y, true),
      new class02965<>(class04227.yQ, class08519.y, true),
      new class02965<>(class04227.yP, class08642.y, true),
      new class02965<>(class04227.yB, class04068.y, true),
      new class02965<>(class04227.Nf, class03648.y, true),
      new class02965<>(class04227.Nr, class08403.y, true),
      new class02965<>(class04227.NS, class08423.y, true),
      new class02965<>(class04227.Nx, class07589.y, true),
      new class02965<>(class04227.ym, class00693.N, true),
      new class02965<>(class04227.yu, class07376.Z),
      new class02965<>(class04227.yN, class03689.N),
      new class02965<>(class04227.NF, class00412.N),
      new class02965<>(class04227.yR, class07304.y),
      new class02965<>(class04227.yz, class02206.N),
      new class02965<>(class04227.yZ, class04449.N),
      new class02965<>(class04227.yn, class00225.N),
      new class02965<>(class04227.yt, class00201.y),
      new class02965<>(class04227.yL, class09037.L),
      new class02965<>(class04227.yG, class07587.L)
   );
   private static final ThreadLocal B = ThreadLocal.withInitial(() -> false);
   private static final ThreadLocal Z = new ThreadLocal();

   private static class07878 L(Map<class05946<?>, Exception> var0) {
      class07080 class07080 = class07080.N(new IllegalStateException("Failed to load registries due to errors"), "Registry Loading");
      class07080.N("Loading info")
         .N(
            "Errors",
            () -> {
               StringBuilder stringbuilder = new StringBuilder();
               var0.entrySet()
                  .stream()
                  .sorted(Entry.comparingByKey(i))
                  .forEach(
                     var1x -> stringbuilder.append("\n\t\t")
                        .append(((class05946)var1x.getKey()).y())
                        .append("/")
                        .append(((class05946)var1x.getKey()).N())
                        .append(": ")
                        .append(((Exception)var1x.getValue()).getMessage())
                  );
               return stringbuilder.toString();
            }
         );
      return new class07878(class07080);
   }

   public class03078() {
      super();
   }

   private static void y(class01089 var0, class03542 var1, class07099 var2, Decoder var3, Map var4, CallbackInfo var5) {
      Z.remove();
   }

   private static void y(Map<class05946<?>, Exception> var0) {
      StringWriter stringwriter = new StringWriter();
      PrintWriter printwriter = new PrintWriter(stringwriter);
      var0.entrySet()
         .stream()
         .collect(
            Collectors.groupingBy(var0x -> ((class05946)var0x.getKey()).y(), Collectors.toMap(var0x -> ((class05946)var0x.getKey()).N(), Entry::getValue))
         )
         .entrySet()
         .stream()
         .sorted(Entry.comparingByKey())
         .forEach(var1x -> {
            printwriter.printf(Locale.ROOT, "> Errors in registry %s:%n", var1x.getKey());
            ((Map)var1x.getValue()).entrySet().stream().sorted(Entry.comparingByKey()).forEach(var1xx -> {
               printwriter.printf(Locale.ROOT, ">> Errors in element %s:%n", var1xx.getKey());
               ((Exception)var1xx.getValue()).printStackTrace(printwriter);
            });
         });
      printwriter.flush();
      u.error("Registry loading errors:\n{}", stringwriter);
   }

   public static class01022 N(Map<class05946<? extends class00751<?>>, class02982> var0, class02857 var1, List<class01921<?>> var2, List<class02965<?>> var3) {
      return N((var2x, var3x) -> var2x.N(var0, var1, var3x), var2, var3);
   }

   private static class03529 N(
      class07099 var0,
      class05946 var1,
      Object var2,
      class02819 var3,
      Operation var4,
      class07099 var5,
      Decoder var6,
      class03519 var7,
      class05946 var8,
      class01079 var9,
      class02819 var10
   ) {
      if (var2 instanceof class07304 class07304x) {
         class07304 class07304x = EnchantmentUtil.modify(var1, class07304x, EnchantmentUtil.determineSource(var9));
         if (class07304x != null) {
            var2 = class07304x;
            var3 = new class02819(Optional.empty(), var3.y());
         }
      }

      return (class03529)var4.call(new Object[]{var0, var8, var2, var3});
   }

   private static class01022 N(Object var0, List var1, List var2, Operation var3) {
      class01022 class01022;
      try {
         B.set(true);
         class01022 = (class01022)var3.call(new Object[]{var0, var1, var2});
      } finally {
         B.set(false);
      }

      return class01022;
   }

   public static class01022 N(class01089 var0, List<class01921<?>> var1, List<class02965<?>> var2) {
      return N((class02996)(var1x, var2x) -> var1x.N(var0, var2x), var1, var2, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 3, "[net.minecraft.class_7655$class_7656, java.util.List, java.util.List]");
         return N((class02996)var0x[0], (List<class01921<?>>)var0x[1], (List<class02965<?>>)var0x[2]);
      });
   }

   private static void N(
      class07099 var0, Decoder var1, class03519 var2, class05946 var3, class01079 var4, class02819 var5, CallbackInfo var6, Reader var7, JsonElement var8
   ) throws IOException {
      class03542 class03542 = (class03542)Z.get();
      if (class03542 != null) {
         if (var8.isJsonObject() && !ResourceConditionsImpl.applyResourceConditions(var8.getAsJsonObject(), var3.y().toString(), var3.N(), class03542)) {
            var7.close();
            var6.cancel();
         }
      }
   }

   private static void N(class01089 var0, class03542 var1, class07099 var2, Decoder var3, Map var4, CallbackInfo var5) {
      Z.set(var1);
   }

   private static void N(Object var0, List var1, List var2, CallbackInfoReturnable var3, List var4) {
      if ((Boolean)B.get()) {
         IdentityHashMap identityhashmap = new IdentityHashMap(var4.size());

         for (class02992 class02992 : var4) {
            identityhashmap.put(class02992.y().i(), class02992.y());
         }

         ((DynamicRegistrySetupCallback)DynamicRegistrySetupCallback.EVENT.invoker()).onRegistrySetup(new DynamicRegistryViewImpl(identityhashmap));
      }
   }

   private static class07878 N(Map<class05946<?>, Exception> var0) {
      y(var0);
      return L(var0);
   }

   private static <T> class03515<T> N(class01921<T> var0) {
      return new class03515<>(var0, var0, var0.R());
   }

   static <E> void N(
      Map<class05946<? extends class00751<?>>, class02982> var0,
      class02857 var1,
      class03542 var2,
      class07099<E> var3,
      Decoder<E> var4,
      Map<class05946<?>, Exception> var5
   ) {
      class02982 class02982 = (class02982)var0.get(var3.i());
      if (class02982 != null) {
         class03519 class03519x = class03519.N(class07713.N, var2);
         class03519 class03519x = class03519.N(JsonOps.INSTANCE, var2);
         class03069 class03069 = class03069.N(var3.i());

         for (class02017 class02017 : class02982.N()) {
            class05946 class05946 = class05946.N(var3.i(), class02017.N());
            Optional<class07709> optional = class02017.y();
            if (optional.isPresent()) {
               try {
                  DataResult dataresult = var4.parse(class03519x, optional.get());
                  Object object = dataresult.getOrThrow();
                  var3.N(class05946, object, R);
               } catch (Exception exception) {
                  var5.put(class05946, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", optional.get()), exception));
               }
            } else {
               class01894 class01894 = class03069.N(class02017.N());

               try {
                  class01079 class01079 = var1.L(class01894);
                  N(var3, var4, class03519x, class05946, class01079, R);
               } catch (Exception exception1) {
                  var5.put(class05946, new IllegalStateException("Failed to parse local data", exception1));
               }
            }
         }

         class01214.N(class02982.y(), var3);
      }
   }

   static <E> void N(class01089 var0, class03542 var1, class07099<E> var2, Decoder<E> var3, Map<class05946<?>, Exception> var4) {
      N(var0, var1, var2, var3, var4, null);
      class03069 class03069 = class03069.N(var2.i());
      class03519 class03519 = class03519.N(JsonOps.INSTANCE, var1);

      for (Entry entry : class03069.N(var0).entrySet()) {
         class01894 class01894 = (class01894)entry.getKey();
         class05946 class05946 = class05946.N(var2.i(), class03069.y(class01894));
         class01079 class01079 = (class01079)entry.getValue();
         class02819 class02819 = M.apply(class01079.method_56936());

         try {
            N(var2, var3, class03519, class05946, class01079, class02819);
         } catch (Exception exception) {
            var4.put(
               class05946,
               new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", class01894, class01079.method_14480()), exception)
            );
         }
      }

      class01214.N(var0, var2);
      y(var0, var1, var2, var3, var4, null);
   }

   private static <E> void N(class07099<E> var0, Decoder<E> var1, class03519<JsonElement> var2, class05946<E> var3, class01079 var4, class02819 var5) throws IOException {
      try (BufferedReader bufferedreader = var4.method_43039()) {
         JsonElement jsonelement = class08326.N(bufferedreader);
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         N(var0, var1, var2, var3, var4, var5, callbackinfo, bufferedreader, jsonelement);
         if (callbackinfo.isCancelled()) {
            return;
         }

         DataResult dataresult = var1.parse(var2, jsonelement);
         Object object = dataresult.getOrThrow();
         N(
            var0,
            var3,
            object,
            var5,
            var0x -> {
               WrapOperationRuntime.checkArgumentCount(
                  var0x, 4, "[net.minecraft.class_2385, net.minecraft.class_5321, java.lang.Object, net.minecraft.class_9248]"
               );
               return ((class07099)var0x[0]).N((class05946<Object>)var0x[1], var0x[2], (class02819)var0x[3]);
            },
            var0,
            var1,
            var2,
            var3,
            var4,
            var5
         );
      }
   }

   private static class01022 N(class02996 var0, List<class01921<?>> var1, List<class02965<?>> var2) {
      HashMap hashmap = new HashMap();
      List list = var2.stream().map(var1x -> var1x.N(Lifecycle.stable(), hashmap)).collect(Collectors.toUnmodifiableList());
      class03542 class03542 = N(var1, list);
      Consumer consumer = var2x -> var0.apply(var2x, class03542);
      N(var0, var1, var2, null, list);
      list.forEach(consumer);
      list.forEach(var1x -> {
         class07099 class07099 = var1x.y();

         try {
            class07099.W();
         } catch (Exception exception) {
            hashmap.put(class07099.i(), exception);
         }

         if (var1x.N().L() && class07099.L() == 0) {
            hashmap.put(class07099.i(), new IllegalStateException("Registry must be non-empty: " + class07099.i().N()));
         }
      });
      if (!hashmap.isEmpty()) {
         throw N(hashmap);
      } else {
         return new class01014(list.stream().map(class02992::y).toList()).method_40316();
      }
   }

   private static class03542 N(List<class01921<?>> var0, List<class02992<?>> var1) {
      HashMap hashmap = new HashMap();
      var0.forEach(var1x -> hashmap.put(var1x.i(), N(var1x)));
      var1.forEach(var1x -> hashmap.put(var1x.y().i(), N(var1x.y())));
      return new class10081(hashmap);
   }

   private static <T> class03515<T> N(class07099<T> var0) {
      return new class03515<>(var0, var0.s(), var0.R());
   }
}
