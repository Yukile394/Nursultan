package minecraft;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Environment(EnvType.CLIENT)
public class class09033 extends class01291<class09023> implements FabricResourceReloader {
   public static final class01894 N = class01894.y("empty");
   public static final class00002 y = new class00002(N, class06042.N(1.0F), class06042.N(1.0F), 1, class00022.field_5474, false, false, 16);
   public static final class01894 L = class01894.y("intentionally_empty");
   public static final class00137 u = new class00137(L, null);
   public static final class00002 i = new class00002(L, class06042.N(1.0F), class06042.N(1.0F), 1, class00022.field_5474, false, false, 16);
   static Logger R = LogUtils.getLogger();
   private static final String M = "sounds.json";
   private static final Gson B = new GsonBuilder().registerTypeAdapter(class00012.class, new class00004()).create();
   private static final TypeToken<Map<String, class00012>> Z = new class08999();
   private final Map<class01894, class00137> z = Maps.newHashMap();
   private final class09038 U;
   private final Map<class01894, class01079> E = new HashMap<>();
   private class01894 W;

   public Collection<class01894> L() {
      return this.z.keySet();
   }

   public boolean L(class00044 var1) {
      return this.U.y(var1);
   }

   public void M() {
      this.U.i();
   }

   public class09033(class05630 var1) {
      super();
      this.U = new class09038(this, var1, class02857.N(this.E));
   }

   public String B() {
      return this.U.R();
   }

   public void Z() {
      this.U.N();
   }

   public void i() {
      this.U.y();
   }

   public void u() {
      this.U.u();
   }

   public void y(class00122 var1) {
      this.U.y(var1);
   }

   public class03836 y() {
      return this.U.B();
   }

   public void y(class00044 var1) {
      this.U.N(var1);
   }

   public void N(class00122 var1) {
      this.U.N(var1);
   }

   public List<String> N() {
      return this.U.M();
   }

   public void N(class04911 var1, float var2) {
      this.U.N(var1, var2);
   }

   public void N(class00034 var1) {
      this.U.N(var1);
   }

   protected class09023 y(class01089 var1, class04643 var2) {
      class09023 class09023 = new class09023();

      try (class08694 class08694x = var2.i("list")) {
         class09023.N(var1);
      }

      for (String s : var1.N()) {
         try (class08694 class08694 = var2.i(s)) {
            for (class01079 class01079 : var1.N(class01894.N(s, "sounds.json"))) {
               var2.N(class01079.method_14480());

               try (BufferedReader bufferedreader = class01079.method_43039()) {
                  var2.N("parse");
                  Map map = class05001.y(B, bufferedreader, Z);
                  var2.y("register");

                  for (Entry entry : map.entrySet()) {
                     class09023.N(class01894.N(s, (String)entry.getKey()), (class00012)entry.getValue());
                  }

                  var2.L();
               } catch (RuntimeException runtimeexception) {
                  R.warn("Invalid {} in resourcepack: '{}'", new Object[]{"sounds.json", class01079.method_14480(), runtimeexception});
               }

               var2.L();
            }
         } catch (IOException ioexception) {
         }
      }

      return class09023;
   }

   protected void N(class09023 var1, class01089 var2, class04643 var3) {
      var1.N(this.z, this.E, this.U);
      if (class07529.ND) {
         for (class01894 class01894x : this.z.keySet()) {
            class00137 class00137 = this.z.get(class01894x);
            if (!class00390.y(class00137.N()) && class04206.y.u(class01894x)) {
               R.error("Missing subtitle {} for sound event: {}", class00137.N(), class01894x);
            }
         }
      }

      if (R.isDebugEnabled()) {
         for (class01894 class01894x : this.z.keySet()) {
            if (!class04206.y.u(class01894x)) {
               R.debug("Not having sound event for: {}", class01894x);
            }
         }
      }

      this.U.N();
   }

   public void N(@Nullable class01894 var1, @Nullable class04911 var2) {
      this.U.N(var1, var2);
   }

   public void N(class04911... var1) {
      this.U.N(var1);
   }

   public void N(class05363 var1) {
      this.U.N(var1);
   }

   public void N(class00044 var1, int var2) {
      this.U.N(var1, var2);
   }

   public class09026 N(class00044 var1) {
      return this.U.L(var1);
   }

   public void N(class04911 var1) {
      this.U.N(var1);
   }

   public void N(boolean var1) {
      this.U.N(var1);
   }

   static boolean N(class00002 var0, class01894 var1, class02857 var2) {
      class01894 class01894 = var0.y();
      if (var2.method_14486(class01894).isEmpty()) {
         R.warn("File {} does not exist, cannot add it to event {}", class01894, var1);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   public class00137 N(class01894 var1) {
      return this.z.get(var1);
   }

   public class01894 fabric$getId() {
      if (this.W == null) {
         if (this instanceof class08117) {
            this.W = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.W = Client.MODELS;
         } else if (this instanceof class03579) {
            this.W = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.W = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.W = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.W = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.W = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.W = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.W = Client.FONTS;
         } else if (this instanceof class08575) {
            this.W = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.W = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.W = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.W = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.W = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.W = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.W = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.W = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.W = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.W = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.W;
   }

   public void R() {
      this.U.L();
   }
}
