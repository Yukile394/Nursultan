package minecraft;

import java.io.IOException;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;

@Environment(EnvType.CLIENT)
public class class08575 extends class01291<int[]> implements FabricResourceReloader {
   private static final class01894 N = class01894.y("textures/colormap/foliage.png");
   private class01894 y;

   public class08575() {
      super();
   }

   protected void N(int[] var1, class01089 var2, class04643 var3) {
      class07289.N(var1);
   }

   protected int[] y(class01089 var1, class04643 var2) {
      try {
         return class04662.N(var1, N);
      } catch (IOException ioexception) {
         throw new IllegalStateException("Failed to load foliage color texture", ioexception);
      }
   }

   public class01894 fabric$getId() {
      if (this.y == null) {
         if (this instanceof class08117) {
            this.y = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.y = Client.MODELS;
         } else if (this instanceof class03579) {
            this.y = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.y = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.y = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.y = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.y = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.y = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.y = Client.FONTS;
         } else if (this instanceof class08575) {
            this.y = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.y = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.y = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.y = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.y = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.y = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.y = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.y = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.y = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.y = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.y;
   }
}
