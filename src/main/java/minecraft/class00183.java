package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.ExtraModelKey;
import net.fabricmc.fabric.api.client.model.loading.v1.FabricBakedModelManager;
import net.fabricmc.fabric.api.client.model.loading.v1.UnbakedModelDeserializer;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingEventDispatcher;
import net.fabricmc.fabric.impl.client.model.loading.ModelLoadingPluginManager;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class00183 implements class01081, FabricBakedModelManager, FabricResourceReloader {
   public static final class01894 N = class01894.y("block_or_item");
   private static final Logger y = LogUtils.getLogger();
   private static final class03069 L = class03069.N("models");
   private Map<class01894, class08910> u = Map.of();
   private Map<class01894, class08906> i = Map.of();
   private final class08117 R;
   private final class07949 M;
   private final class03770 B;
   private final class01587 Z;
   private class01140 z = class01140.N;
   private class08836 U = class08836.N;
   private class08881 E;
   private Object2IntMap<class00500> W = Object2IntMaps.emptyMap();
   @Nullable
   private volatile CompletableFuture m;
   @Nullable
   private Map P;
   private class01894 s;

   public class08836 L() {
      return this.U;
   }

   private Function L(Function var1) {
      CompletableFuture completablefuture = this.m;
      return completablefuture == null ? var1 : var2x -> {
         ModelLoadingEventDispatcher.CURRENT.set((ModelLoadingEventDispatcher)completablefuture.join());

         Object object;
         try {
            object = var1.apply(var2x);
         } finally {
            ModelLoadingEventDispatcher.CURRENT.remove();
         }

         return object;
      };
   }

   private CompletableFuture L(CompletableFuture var1) {
      return var1.thenCombine(this.m, (var0, var1x) -> var1x.modifyBlockModelsOnLoad(var0));
   }

   @Nullable
   public Object getModel(ExtraModelKey var1) {
      return this.P == null ? null : this.P.get(var1);
   }

   public class00183(class01587 var1, class08117 var2, class07949 var3) {
      super();
      this.Z = var1;
      this.R = var2;
      this.M = var3;
      this.B = new class03770(this);
   }

   public Supplier<class01140> u() {
      return () -> this.z;
   }

   public class03770 y() {
      return this.B;
   }

   public class08906 y(class01894 var1) {
      return this.i.getOrDefault(var1, class08906.N);
   }

   private CompletableFuture y(CompletableFuture var1) {
      return var1.thenCombine(this.m, (var0, var1x) -> var1x.modifyModelsOnLoad(var0));
   }

   private Function y(Function var1) {
      return this.L(var1);
   }

   private void N(class01073 var1, Executor var2, class01080 var3, Executor var4, CallbackInfoReturnable var5) {
      this.m = ModelLoadingPluginManager.preparePlugins(var1, var2).thenApplyAsync(ModelLoadingEventDispatcher::new, var2);
   }

   private static void N(Map var0, class02572 var1, class00370 var2, CallbackInfoReturnable var3, class08273 var4) {
      ModelLoadingEventDispatcher modelloadingeventdispatcher = (ModelLoadingEventDispatcher)ModelLoadingEventDispatcher.CURRENT.get();
      if (modelloadingeventdispatcher != null) {
         modelloadingeventdispatcher.getExtraModels().values().forEach(var4::N);
      }
   }

   private void N(CallbackInfo var1, class08890 var2) {
      this.P = var2.fabric_getExtraModels();
   }

   private static class04237 N(Reader var0) {
      return null;
   }

   private static Object N(Object var0, Reader var1) {
      return UnbakedModelDeserializer.deserialize(var1);
   }

   private CompletableFuture N(CompletableFuture var1) {
      return var1.thenApplyAsync(var1x -> {
         this.m = null;
         return var1x;
      });
   }

   private Function N(Function var1) {
      return this.L(var1);
   }

   private static Map<class00500, class08887> N(Map<class00500, class08887> var0, class08887 var1) {
      IdentityHashMap identityhashmap1;
      try (class08694 class08694 = class08700.N().i("block state dispatch")) {
         IdentityHashMap identityhashmap = new IdentityHashMap(var0);
         Iterator iterator = class04206.i.iterator();

         while (iterator.hasNext()) {
            ((class00891)iterator.next()).E().N().forEach(var2x -> {
               if (var0.putIfAbsent(var2x, var1) == null) {
                  y.warn("Missing model for variant: '{}'", var2x);
               }
            });
         }

         identityhashmap1 = identityhashmap;
      }

      return identityhashmap1;
   }

   private static Object2IntMap<class00500> N(class01587 var0, class02572 var1) {
      Object2IntMap object2intmap;
      try (class08694 class08694 = class08700.N().i("block groups")) {
         object2intmap = class08279.N(var0, var1);
      }

      return object2intmap;
   }

   private void N(class00144 var1) {
      class08890 class08890 = var1.N();
      this.u = class08890.L();
      this.i = class08890.u();
      this.W = var1.y();
      this.E = class08890.N();
      this.B.N(var1.L());
      this.U = var1.i();
      this.z = var1.u();
      this.N(null, class08890);
   }

   public boolean N(class00500 var1, class00500 var2) {
      if (var1 == var2) {
         return false;
      } else {
         int ix = this.W.getInt(var1);
         if (ix != -1) {
            int j = this.W.getInt(var2);
            if (ix == j) {
               class04688 class04688x = var1.Y();
               class04688 class04688x = var2.Y();
               return class04688x != class04688x;
            }
         }

         return true;
      }
   }

   public class08887 N() {
      return this.E.y();
   }

   public class08910 N(class01894 var1) {
      return this.u.getOrDefault(var1, this.E.L());
   }

   private static CompletableFuture<Map<class01894, class00167>> N(class01089 var0, Executor var1) {
      return CompletableFuture.<Map>supplyAsync(() -> L.N(var0), var1)
         .thenCompose(
            var1x -> {
               ArrayList arraylist = new ArrayList(var1x.size());

               for (Entry entry : var1x.entrySet()) {
                  arraylist.add(CompletableFuture.supplyAsync(() -> {
                     class01894 class01894 = L.y((class01894)entry.getKey());

                     try {
                        Pair pair;
                        try (BufferedReader bufferedreader = ((class01079)entry.getValue()).method_43039()) {
                           class04237 class04237 = N(bufferedreader);
                           pair = Pair.of(class01894, N(class04237, bufferedreader));
                        }

                        return pair;
                     } catch (Exception exception) {
                        y.error("Failed to load model {}", entry.getKey(), exception);
                        return null;
                     }
                  }, var1));
               }

               return class07536.L(arraylist)
                  .thenApply(var0xx -> var0xx.stream().filter(Objects::nonNull).collect(Collectors.toUnmodifiableMap(Pair::getFirst, Pair::getSecond)));
            }
         );
   }

   private static class00181 N(Map<class01894, class00167> var0, class02572 var1, class00370 var2) {
      class00181 class00181;
      try (class08694 class08694 = class08700.N().i("dependencies")) {
         class08273 class08273 = new class08273(var0, class08256.N());
         class08273.N(class02093.y, new class02093());
         var1.N().values().forEach(class08273::N);
         var2.N().values().forEach(var1x -> class08273.N(var1x.N()));
         class08529 class08529 = class08273.N();
         N(var0, var1, var2, null, class08273);
         class00181 = new class00181(class08529, class08273.y());
      }

      return class00181;
   }

   private static CompletableFuture<class00144> N(
      class02008 var0, class02008 var1, class08874 var2, Object2IntMap<class00500> var3, class01140 var4, class08836 var5, Executor var6
   ) {
      Multimap multimap = Multimaps.synchronizedMultimap(HashMultimap.create());
      Multimap multimap1 = Multimaps.synchronizedMultimap(HashMultimap.create());
      return var2.N(new class00175(var0, var1, multimap, multimap1), var6)
         .thenApply(
            var5x -> {
               multimap.asMap()
                  .forEach(
                     (var0xx, var1xx) -> y.warn(
                        "Missing textures in model {}:\n{}",
                        var0xx,
                        var1xx.stream().sorted(class05913.N).map(var0xxx -> "    " + var0xxx.N() + ":" + var0xxx.y()).collect(Collectors.joining("\n"))
                     )
                  );
               multimap1.asMap()
                  .forEach(
                     (var0xx, var1xx) -> y.warn(
                        "Missing texture references in model {}:\n{}",
                        var0xx,
                        var1xx.stream().sorted().map(var0xxx -> "    " + var0xxx).collect(Collectors.joining("\n"))
                     )
                  );
               Map map = N(var5x.y(), var5x.N().y());
               return new class00144(var5x, var3, map, var4, var5);
            }
         );
   }

   public class01894 fabric$getId() {
      if (this.s == null) {
         if (this instanceof class08117) {
            this.s = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.s = Client.MODELS;
         } else if (this instanceof class03579) {
            this.s = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.s = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.s = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.s = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.s = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.s = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.s = Client.FONTS;
         } else if (this instanceof class08575) {
            this.s = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.s = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.s = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.s = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.s = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.s = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.s = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.s = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.s = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.s = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.s;
   }

   @Override
   public final CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      this.N(var1, var2, var3, var4, null);
      class01089 class01089 = var1.N();
      CompletableFuture completablefuture = CompletableFuture.supplyAsync(class01140::N, var2);
      CompletableFuture completablefuture1 = completablefuture.thenApplyAsync(var1x -> class08836.N(new class00359(var1x, this.R, this.M)), var2);
      CompletableFuture completablefuture2 = this.y(N(class01089, var2));
      CompletableFuture completablefuture3 = this.L(class02603.N(class01089, var2));
      CompletableFuture completablefuture4 = class00361.N(class01089, var2);
      CompletableFuture completablefuture9 = CompletableFuture.allOf(completablefuture2, completablefuture3, completablefuture4);
      Function function = var3x -> N(
         (Map<class01894, class00167>)completablefuture2.join(), (class02572)completablefuture3.join(), (class00370)completablefuture4.join()
      );
      CompletableFuture completablefuture5 = completablefuture9.thenApplyAsync(this.N(function), var2);
      CompletableFuture completablefuture6 = completablefuture3.thenApplyAsync(var1x -> N(this.Z, var1x), var2);
      class08124 class08124 = var1.N(class08117.N);
      CompletableFuture completablefuture7 = class08124.N(class08589.u);
      CompletableFuture completablefuture8 = class08124.N(class08589.i);
      completablefuture9 = CompletableFuture.allOf(
         completablefuture7,
         completablefuture8,
         completablefuture5,
         completablefuture6,
         completablefuture3,
         completablefuture4,
         completablefuture,
         completablefuture1,
         completablefuture2
      );
      function = var11x -> {
         class02008 class02008x = (class02008)completablefuture7.join();
         class02008 class02008x = (class02008)completablefuture8.join();
         class00181 class00181 = (class00181)completablefuture5.join();
         Object2IntMap object2intmap = (Object2IntMap)completablefuture6.join();
         SetView setview = Sets.difference(((Map)completablefuture2.join()).keySet(), class00181.y().keySet());
         if (!setview.isEmpty()) {
            y.debug("Unreferenced models: \n{}", setview.stream().sorted().map(var0 -> "\t" + var0 + "\n").collect(Collectors.joining()));
         }

         class08874 class08874 = new class08874(
            (class01140)completablefuture.join(),
            this.R,
            this.M,
            ((class02572)completablefuture3.join()).N(),
            ((class00370)completablefuture4.join()).N(),
            class00181.y(),
            class00181.N()
         );
         return N(class02008x, class02008x, class08874, object2intmap, (class01140)completablefuture.join(), (class08836)completablefuture1.join(), var2);
      };
      return this.N(completablefuture9.thenComposeAsync(this.y(function), var2).thenCompose(var3::N).thenAcceptAsync(this::N, var4));
   }
}
