package minecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.MonthDay;
import java.util.List;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class class06176 extends class01291<List<class00392>> implements FabricResourceReloader {
   private static final class00405 u = class00405.N.N(-256);
   public static final class00392 N = N("Merry X-mas!");
   public static final class00392 y = N("Happy new year!");
   public static final class00392 L = N("OOoooOOOoooo! Spooky!");
   private static final class01894 i = class01894.y("texts/splashes.txt");
   private static final class06069 R = class06069.u();
   private List<class00392> M = List.of();
   private final class04771 B;
   private class01894 Z;

   public class06176(class04771 var1) {
      super();
      this.B = var1;
   }

   private static class00392 N(String var0) {
      return class00392.y(var0).y(u);
   }

   protected List<class00392> y(class01089 var1, class04643 var2) {
      try {
         List list;
         try (BufferedReader bufferedreader = class06202.Nq().Nm().i(i)) {
            list = bufferedreader.lines().map(String::trim).filter(var0 -> var0.hashCode() != 125780783).map(class06176::N).toList();
         }

         return list;
      } catch (IOException ioexception) {
         return List.of();
      }
   }

   protected void N(List<class00392> var1, class01089 var2, class04643 var3) {
      this.M = List.copyOf(var1);
   }

   @Nullable
   public class03510 N() {
      MonthDay monthday = class06842.N();
      if (monthday.equals(class06842.L)) {
         return class03510.N;
      } else if (monthday.equals(class06842.u)) {
         return class03510.y;
      } else if (monthday.equals(class06842.N)) {
         return class03510.L;
      } else if (this.M.isEmpty()) {
         return null;
      } else {
         return this.B != null && R.y(this.M.size()) == 42
            ? new class03510(N(this.B.L().toUpperCase(Locale.ROOT) + " IS YOU"))
            : new class03510(this.M.get(R.y(this.M.size())));
      }
   }

   public class01894 fabric$getId() {
      if (this.Z == null) {
         if (this instanceof class08117) {
            this.Z = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.Z = Client.MODELS;
         } else if (this instanceof class03579) {
            this.Z = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.Z = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.Z = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.Z = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.Z = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.Z = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.Z = Client.FONTS;
         } else if (this instanceof class08575) {
            this.Z = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.Z = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.Z = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.Z = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.Z = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.Z = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.Z = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.Z = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.Z = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.Z = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.Z;
   }
}
