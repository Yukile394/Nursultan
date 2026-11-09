package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.math.LongMath;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;
import java.io.BufferedReader;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class class03520 extends class01291<Map<String, List<class03547>>> implements AutoCloseable, FabricResourceReloader {
   private static final Codec<Map<String, List<class03547>>> N = Codec.unboundedMap(
      Codec.STRING,
      RecordCodecBuilder.create(
            var0 -> var0.group(
                  Codec.LONG.optionalFieldOf("delay", 0L).forGetter(class03547::N),
                  Codec.LONG.fieldOf("period").forGetter(class03547::y),
                  Codec.STRING.fieldOf("title").forGetter(class03547::L),
                  Codec.STRING.fieldOf("message").forGetter(class03547::u)
               )
               .apply(var0, class03547::new)
         )
         .listOf()
   );
   private static Logger y = LoggerFactory.getLogger("minecraft.class03520");
   private final class01894 L;
   private final Object2BooleanFunction<String> u;
   @Nullable
   private Timer i;
   @Nullable
   private class03540 R;
   private class01894 M;

   public class03520(class01894 var1, Object2BooleanFunction<String> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public void close() {
      this.N();
   }

   protected void N(Map<String, List<class03547>> var1, class01089 var2, class04643 var3) {
      List list = var1.entrySet()
         .stream()
         .filter(var1x -> (Boolean)this.u.apply((String)var1x.getKey()))
         .map(Entry::getValue)
         .flatMap(Collection::stream)
         .collect(Collectors.toList());
      if (list.isEmpty()) {
         this.N();
      } else if (list.stream().anyMatch(var0 -> var0.y() == 0L)) {
         class07536.y("A periodic notification in " + this.L + " has a period of zero minutes");
         this.N();
      } else {
         long ix = this.N(list);
         long j = this.N(list, ix);
         if (this.i == null) {
            this.i = new Timer();
         }

         if (this.R == null) {
            this.R = new class03540(list, ix, j);
         } else {
            this.R = this.R.N(list, j);
         }

         this.i.scheduleAtFixedRate(this.R, TimeUnit.MINUTES.toMillis(ix), TimeUnit.MINUTES.toMillis(j));
      }
   }

   protected Map<String, List<class03547>> y(class01089 var1, class04643 var2) {
      try {
         Map map;
         try (BufferedReader bufferedreader = var1.i(this.L)) {
            map = (Map)N.parse(JsonOps.INSTANCE, class08326.N(bufferedreader)).result().orElseThrow();
         }

         return map;
      } catch (Exception exception) {
         y.warn("Failed to load {}", this.L, exception);
         return ImmutableMap.of();
      }
   }

   private long N(List<class03547> var1) {
      return var1.stream().mapToLong(var0 -> var0.N()).min().orElse(0L);
   }

   private long N(List<class03547> var1, long var2) {
      return var1.stream()
         .mapToLong(var2x -> LongMath.gcd(var2x.N() - var2, var2x.y()))
         .reduce(LongMath::gcd)
         .orElseThrow(() -> new IllegalStateException("Empty notifications from: " + this.L));
   }

   private void N() {
      if (this.i != null) {
         this.i.cancel();
      }
   }

   public class01894 fabric$getId() {
      if (this.M == null) {
         if (this instanceof class08117) {
            this.M = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.M = Client.MODELS;
         } else if (this instanceof class03579) {
            this.M = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.M = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.M = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.M = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.M = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.M = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.M = Client.FONTS;
         } else if (this instanceof class08575) {
            this.M = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.M = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.M = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.M = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.M = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.M = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.M = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.M = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.M = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.M = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.M;
   }
}
