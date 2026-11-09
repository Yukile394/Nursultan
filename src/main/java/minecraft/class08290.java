package minecraft;

import Nursultan.class09109;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;

@Environment(EnvType.CLIENT)
public class class08290 extends class05703<class08301> implements FabricResourceReloader {
   private static final class03069 N = class03069.N("waypoint_style");
   private static final class08301 y = new class08301(0, 1, List.of(class08923.L()));
   private Map<class05946<class09109>, class08301> L = Map.of();
   private class01894 u;

   public class08290() {
      super(class08301.u, N);
   }

   public class08301 N(class05946<class09109> var1) {
      return this.L.getOrDefault(var1, y);
   }

   protected void N(Map<class01894, class08301> var1, class01089 var2, class04643 var3) {
      this.L = var1.entrySet().stream().collect(Collectors.toUnmodifiableMap(var0 -> class05946.N(class00058.N, (class01894)var0.getKey()), Entry::getValue));
   }

   public class01894 fabric$getId() {
      if (this.u == null) {
         if (this instanceof class08117) {
            this.u = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.u = Client.MODELS;
         } else if (this instanceof class03579) {
            this.u = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.u = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.u = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.u = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.u = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.u = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.u = Client.FONTS;
         } else if (this instanceof class08575) {
            this.u = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.u = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.u = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.u = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.u = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.u = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.u = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.u = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.u = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.u = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.u;
   }
}
