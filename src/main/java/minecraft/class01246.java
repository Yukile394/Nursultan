package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Environment(EnvType.CLIENT)
public class class01246 extends class01291<class01256> implements FabricResourceReloader {
   private static final Logger N = LogUtils.getLogger();
   private static final class01894 y = class01894.y("gpu_warnlist.json");
   private ImmutableMap<String, String> L = ImmutableMap.of();
   private boolean u;
   private boolean i;
   private class01894 R;

   @Nullable
   private static JsonObject L(class01089 var0, class04643 var1) {
      try {
         JsonObject jsonobject;
         try (
            class08694 class08694 = var1.i("parse_json");
            BufferedReader bufferedreader = var0.i(y);
         ) {
            jsonobject = class08326.N(bufferedreader).getAsJsonObject();
         }

         return jsonobject;
      } catch (JsonSyntaxException | IOException ioexception) {
         N.warn("Failed to load GPU warnlist", ioexception);
         return null;
      }
   }

   public void L() {
      this.u = true;
   }

   @Nullable
   public String M() {
      return (String)this.L.get("renderer");
   }

   public class01246() {
      super();
   }

   @Nullable
   public String B() {
      return (String)this.L.get("version");
   }

   @Nullable
   public String Z() {
      return (String)this.L.get("vendor");
   }

   public boolean i() {
      return this.u && !this.i;
   }

   @Nullable
   public String z() {
      StringBuilder stringbuilder = new StringBuilder();
      this.L.forEach((var1x, var2) -> stringbuilder.append(var1x).append(": ").append(var2));
      return stringbuilder.isEmpty() ? null : stringbuilder.toString();
   }

   public void u() {
      this.i = true;
   }

   public boolean y() {
      return this.N() && !this.i;
   }

   public boolean N() {
      return !this.L.isEmpty();
   }

   protected class01256 y(class01089 var1, class04643 var2) {
      ArrayList arraylist = Lists.newArrayList();
      ArrayList arraylist1 = Lists.newArrayList();
      ArrayList arraylist2 = Lists.newArrayList();
      JsonObject jsonobject = L(var1, var2);
      if (jsonobject != null) {
         try (class08694 class08694 = var2.i("compile_regex")) {
            N(jsonobject.getAsJsonArray("renderer"), arraylist);
            N(jsonobject.getAsJsonArray("version"), arraylist1);
            N(jsonobject.getAsJsonArray("vendor"), arraylist2);
         }
      }

      return new class01256(arraylist, arraylist1, arraylist2);
   }

   protected void N(class01256 var1, class01089 var2, class04643 var3) {
      this.L = var1.N();
   }

   private static void N(JsonArray var0, List<Pattern> var1) {
      var0.forEach(var1x -> var1.add(Pattern.compile(var1x.getAsString(), 2)));
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

   public void R() {
      this.u = false;
      this.i = false;
   }
}
