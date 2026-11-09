package minecraft;

import Nursultan.class09443;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Server;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.slf4j.Logger;

public class class05961 implements class01081, FabricResourceReloader {
   private static final Logger y = LogUtils.getLogger();
   public static final class05946<class00751<class07684<class07701>>> N = class05946.N(class01894.y("function"));
   private static final class03069 L = new class03069(class04227.L(N), ".mcfunction");
   private volatile Map<class01894, class07684<class07701>> u = ImmutableMap.of();
   private final class01214<class07684<class07701>> i = new class01214<>((var1x, var2x) -> this.N(var1x), class04227.u(N));
   private volatile Map<class01894, List<class07684<class07701>>> R = Map.of();
   private final class08152 M;
   private final CommandDispatcher<class07701> B;
   private class01894 Z;

   public class05961(class08152 var1, CommandDispatcher<class07701> var2) {
      super();
      this.M = var1;
      this.B = var2;
   }

   public Iterable<class01894> y() {
      return this.R.keySet();
   }

   public List<class07684<class07701>> y(class01894 var1) {
      return this.R.getOrDefault(var1, List.of());
   }

   public Map<class01894, class07684<class07701>> N() {
      return this.u;
   }

   public Optional<class07684<class07701>> N(class01894 var1) {
      return Optional.ofNullable(this.u.get(var1));
   }

   private static List<String> N(class01079 var0) {
      try {
         List<String> list;
         try (BufferedReader bufferedreader = var0.method_43039()) {
            list = bufferedreader.lines().toList();
         }

         return list;
      } catch (IOException ioexception) {
         throw new CompletionException(ioexception);
      }
   }

   public class01894 fabric$getId() {
      if (this.Z == null) {
         if (this instanceof class06482) {
            this.Z = Server.RECIPES;
         } else if (this instanceof class04478) {
            this.Z = Server.ADVANCEMENTS;
         } else if (this instanceof class05961) {
            this.Z = Server.FUNCTIONS;
         } else {
            this.Z = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.Z;
   }

   @Override
   public CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      class01089 class01089 = var1.N();
      CompletableFuture completablefuture = CompletableFuture.supplyAsync(() -> this.i.N(class01089), var2);
      CompletableFuture completablefuture1 = CompletableFuture.<Map<class01894, class01079>>supplyAsync(() -> L.N(class01089), var2).thenCompose(var2x -> {
         HashMap hashmap = Maps.newHashMap();
         class07701 class07701 = class07686.N(this.M);

         for (Entry entry : var2x.entrySet()) {
            class01894 class01894x = (class01894)entry.getKey();
            class01894 class01894x = L.y(class01894x);
            hashmap.put(class01894x, CompletableFuture.supplyAsync(() -> {
               List<String> list = N((class01079)entry.getValue());
               return class07684.N(class01894, this.B, class07701, list);
            }, var2));
         }

         CompletableFuture[] acompletablefuture = hashmap.values().toArray(new CompletableFuture[0]);
         return CompletableFuture.allOf(acompletablefuture).handle((var1xx, var2xx) -> hashmap);
      });
      return completablefuture.thenCombine(completablefuture1, Pair::of).thenCompose(var3::N).thenAcceptAsync(var1x -> {
         Map map = (Map)var1x.getSecond();
         Builder builder = ImmutableMap.builder();
         map.forEach((var1xx, var2x) -> var2x.handle((var2xx, var3x) -> {
            if (var3x != null) {
               y.error("Failed to load function {}", var1xx, var3x);
            } else {
               builder.put(var1xx, var2xx);
            }

            return null;
         }).join());
         this.u = builder.build();
         this.R = this.i.N((Map<class01894, List<class09443>>)var1x.getFirst());
      }, var4);
   }
}
