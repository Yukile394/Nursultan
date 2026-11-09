package minecraft;

import Nursultan.class09413;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.slf4j.Logger;

@Environment(EnvType.CLIENT)
public class class04866 implements class01081, AutoCloseable, FabricResourceReloader {
   static final Logger N = LogUtils.getLogger();
   private static final String R = "fonts.json";
   public static final class01894 y = class01894.y("missing");
   private static final class03069 M = class03069.N("font");
   private static final Gson B = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   final class04864 L;
   private final List<class06262> Z = new ArrayList<>();
   public final Map<class01894, class04864> u = new HashMap<>();
   private final class08627 z;
   private final class04879 U = new class04879(this, false);
   private final class04879 E = new class04879(this, true);
   private final class08117 W;
   private final Map<class01894, class00935> m = new HashMap<>();
   final class06615 i;
   private class01894 P;

   private static class06251 L() {
      return new class06251(new class04862(), class02263.y);
   }

   public class04866(class08627 var1, class08117 var2, class07949 var3) {
      super();
      this.z = var1;
      this.W = var2;
      this.L = this.N(y, List.of(L()), Set.of());
      this.i = new class06615(var3);
   }

   @Override
   public void close() {
      this.U.close();
      this.E.close();
      this.u.values().forEach(class04864::close);
      this.Z.forEach(class06262::close);
      this.L.close();
   }

   public class01590 y() {
      return new class01590(this.E);
   }

   private static Set<class02306> y(class05630 var0) {
      EnumSet enumset = EnumSet.noneOf(class02306.class);
      if (var0.NL().method_41753()) {
         enumset.add(class02306.field_49112);
      }

      if (var0.Nu().method_41753()) {
         enumset.add(class02306.field_49113);
      }

      return enumset;
   }

   private Map<class01894, List<class06251>> N(List<class04859> var1) {
      HashMap hashmap = new HashMap();
      class03495 class03495 = new class03495();
      var1.forEach(var1x -> class03495.N(var1x.N(), var1x));
      class03495.N((var1x, var2x) -> var2x.N(hashmap::get).ifPresent(var2xx -> hashmap.put(var1x, var2xx)));
      return hashmap;
   }

   private void N(List<class06251> var1, class06251 var2) {
      var1.add(0, var2);
      IntOpenHashSet intopenhashset = new IntOpenHashSet();

      for (class06251 class06251 : var1) {
         intopenhashset.addAll(class06251.N().N());
      }

      intopenhashset.forEach(var1x -> {
         if (var1x != 32) {
            Iterator iterator = Lists.reverse(var1).iterator();

            while (iterator.hasNext() && ((class06251)iterator.next()).N().N(var1x) == null) {
            }
         }
      });
   }

   private void N(class04843 var1, class04643 var2) {
      var2.N("closing");
      this.U.y();
      this.E.y();
      this.u.values().forEach(class04864::close);
      this.u.clear();
      this.Z.forEach(class06262::close);
      this.Z.clear();
      Set set = y((class05630)class06202.Nq().i_7);
      var2.y("reloading");
      var1.N().forEach((var2x, var3x) -> this.u.put(var2x, this.N(var2x, Lists.reverse(var3x), set)));
      this.Z.addAll(var1.y());
      var2.L();
      if (!this.u.containsKey((class01894)class06202.j_3)) {
         throw new IllegalStateException("Default font failed to load");
      } else {
         this.m.clear();
         this.W.N((var1x, var2x) -> this.m.put(var1x, new class00935(var2x)));
      }
   }

   public void N(class05630 var1) {
      Set set = y(var1);
      Iterator iterator = this.u.values().iterator();

      while (iterator.hasNext()) {
         ((class04864)iterator.next()).N(set);
      }
   }

   private CompletableFuture<Optional<class06262>> N(class04841 var1, class06246 var2, class01089 var3, Executor var4) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of(var2.load(var3));
         } catch (Exception exception) {
            N.warn("Failed to load builder {}, rejecting", var1, exception);
            return Optional.empty();
         }
      }, var4);
   }

   private CompletableFuture<class04843> N(class01089 var1, Executor var2) {
      ArrayList arraylist = new ArrayList();

      for (Entry entry : M.y(var1).entrySet()) {
         class01894 class01894 = M.y((class01894)entry.getKey());
         arraylist.add(CompletableFuture.supplyAsync(() -> {
            List list = N((List<class01079>)entry.getValue(), class01894);
            class04859 class04859 = new class04859(class01894);

            for (Pair pair : list) {
               class04841 class04841 = (class04841)pair.getFirst();
               class02263 class02263 = ((class06261)pair.getSecond()).y();
               ((class06261)pair.getSecond()).N().y().ifLeft(var6x -> {
                  CompletableFuture completablefuture = this.N(class04841, var6x, var1, var2);
                  class04859.N(class04841, class02263, completablefuture);
               }).ifRight(var3xx -> class04859.N(class04841, class02263, var3xx));
            }

            return class04859;
         }, var2));
      }

      return class07536.L(arraylist)
         .thenCompose(
            var2x -> {
               List list = var2x.stream().flatMap(class04859::u).collect(class07536.y());
               class06251 class06251 = L();
               list.add(CompletableFuture.completedFuture(Optional.of(class06251.N())));
               return class07536.L(list)
                  .thenCompose(
                     var4x -> {
                        Map map = this.N(var2x);
                        return CompletableFuture.allOf(
                              map.values()
                                 .stream()
                                 .map(var3xx -> CompletableFuture.runAsync(() -> this.N(var3xx, class06251), var2))
                                 .toArray(var0 -> new CompletableFuture[var0])
                           )
                           .thenApply(var2xxx -> {
                              List list1 = var4x.stream().flatMap(Optional::stream).toList();
                              return new class04843(map, list1);
                           });
                     }
                  );
            }
         );
   }

   private class04864 N(class01894 var1, List<class06251> var2, Set<class02306> var3) {
      class04690 class04690 = new class04690(this.z, var1);
      class04864 class04864 = new class04864(class04690);
      class04864.N(var2, var3);
      return class04864;
   }

   class08985 N(class09413 var1) {
      class00935 class00935 = this.m.get(var1.N());
      return class00935 == null ? this.L.N(false) : class00935.N(var1.y());
   }

   class04864 N(class01894 var1) {
      return this.u.getOrDefault(var1, this.L);
   }

   public class01590 N() {
      return new class01590(this.U);
   }

   private static List<Pair<class04841, class06261>> N(List<class01079> var0, class01894 var1) {
      ArrayList arraylist = new ArrayList();

      for (class01079 class01079 : var0) {
         try (BufferedReader bufferedreader = class01079.method_43039()) {
            JsonElement jsonelement = (JsonElement)B.fromJson(bufferedreader, JsonElement.class);
            class04886 class04886 = (class04886)class04886.y.parse(JsonOps.INSTANCE, jsonelement).getOrThrow(JsonParseException::new);
            List list = class04886.N();

            for (int ix = list.size() - 1; ix >= 0; ix--) {
               class04841 class04841 = new class04841(var1, class01079.method_14480(), ix);
               arraylist.add(Pair.of(class04841, (class06261)list.get(ix)));
            }
         } catch (Exception exception) {
            N.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{var1, "fonts.json", class01079.method_14480(), exception});
         }
      }

      return arraylist;
   }

   public class01894 fabric$getId() {
      if (this.P == null) {
         if (this instanceof class08117) {
            this.P = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.P = Client.MODELS;
         } else if (this instanceof class03579) {
            this.P = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.P = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.P = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.P = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.P = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.P = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.P = Client.FONTS;
         } else if (this instanceof class08575) {
            this.P = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.P = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.P = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.P = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.P = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.P = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.P = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.P = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.P = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.P = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.P;
   }

   @Override
   public CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      return this.N(var1.N(), var2).thenCompose(var3::N).thenAcceptAsync(var1x -> this.N(var1x, class08700.N()), var4);
   }
}
