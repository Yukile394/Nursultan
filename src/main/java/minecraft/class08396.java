package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.visuals.features.force_unicode_font.UnicodeFontFix1_12_2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Stream;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import jerozgen.languagereload.mixin.LanguageManagerAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08396 implements class06141, LanguageManagerAccessor, FabricResourceReloader {
   private static Logger N = LogUtils.getLogger();
   private static final class08430 y = new class08430("US", "English", false);
   private Map<String, class08430> L = ImmutableMap.of("en_us", y);
   private String u;
   private final Consumer<class08429> i;
   private class01894 R;

   public class08396(String var1, Consumer<class08429> var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   private void y(class01089 var1, CallbackInfo var2) {
      UnicodeFontFix1_12_2.updateUnicodeFontOverride(ViaFabricPlus.getImpl().getTargetVersion());
   }

   public SortedMap<String, class08430> y() {
      return new TreeMap<>(this.L);
   }

   @Nullable
   public class08430 y(String var1) {
      return this.L.get(var1);
   }

   private static void N(String var0, Locale var1) {
      LanguageReload.LOGGER.info("Set language to {} (mapped from {})", var0, var1.toLanguageTag());
      LanguageReload.setLanguage(var0);
   }

   private static Map<String, class08430> N(Stream<class01622> var0) {
      HashMap hashmap = Maps.newHashMap();
      var0.forEach(var1x -> {
         try {
            class08507 class08507 = var1x.method_14407(class08507.L);
            if (class08507 != null) {
               class08507.N().forEach(hashmap::putIfAbsent);
            }
         } catch (IOException | RuntimeException runtimeexception) {
            N.warn("Unable to parse language metadata section of resourcepack: {}", var1x.method_14409(), runtimeexception);
         }
      });
      return ImmutableMap.copyOf(hashmap);
   }

   boolean N(List var1, Object var2) {
      if (Config.getInstance().language.equals("*")) {
         return true;
      } else if (this.L.isEmpty()) {
         return var1.add((String)var2);
      } else {
         Lists.reverse(Config.getInstance().fallbacks).stream().filter(var1x -> Objects.nonNull(this.y(var1x))).forEach(var1::add);
         return true;
      }
   }

   public String N() {
      return this.u;
   }

   public void N(String var1) {
      this.u = var1;
   }

   void N(class01089 var1, CallbackInfo var2) {
      if (LanguageReload.shouldSetSystemLanguage) {
         LanguageReload.shouldSetSystemLanguage = false;
         LanguageReload.LOGGER.info("Language is not set. Setting it to system language");
         Locale locale = Locale.getDefault();
         List list = this.L.keySet().stream().filter(var1x -> var1x.split("_")[0].equalsIgnoreCase(locale.getLanguage())).toList();
         int ix = list.size();
         if (ix > 1) {
            list.stream().filter(var1x -> {
               String[] astring = var1x.split("_");
               return astring.length < 2 ? false : astring[1].equalsIgnoreCase(locale.getCountry());
            }).findFirst().ifPresent(var1x -> N(var1x, locale));
         } else if (ix == 1) {
            N((String)list.getFirst(), locale);
         }
      }
   }

   boolean N(boolean var1) {
      return Config.getInstance().language.equals("*") || this.L.isEmpty();
   }

   @Override
   public void method_14491(class01089 var1) {
      this.L = N(var1.y());
      ArrayList arraylist = new ArrayList(2);
      boolean flag = y.u();
      this.N(var1, null);
      String s = "en_us";
      this.N(arraylist, s);
      if (!this.N(this.u.equals("en_us"))) {
         class08430 class08430 = this.L.get(this.u);
         if (class08430 != null) {
            arraylist.add(this.u);
            flag = class08430.u();
         }
      }

      class08429 class08429 = class08429.N(var1, arraylist, flag);
      class08392.N(class08429);
      class07018.N(class08429);
      this.i.accept(class08429);
      this.y(var1, null);
   }

   public class01894 fabric$getId() {
      if (this.R == null) {
         if (this instanceof class08117) {
            this.R = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.R = Client.MODELS;
         } else if (this instanceof class03579) {
            this.R = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.R = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.R = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.R = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.R = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.R = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.R = Client.FONTS;
         } else if (this instanceof class08575) {
            this.R = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.R = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.R = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.R = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.R = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.R = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.R = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.R = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.R = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.R = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.R;
   }
}
