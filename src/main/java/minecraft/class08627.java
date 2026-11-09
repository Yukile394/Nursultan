package minecraft;

import com.mojang.logging.LogUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.pbr.format.TextureFormatLoader;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08627 implements class01081, AutoCloseable, FabricResourceReloader {
   private static final Logger y = LogUtils.getLogger();
   public static final class01894 N = class01894.y("");
   private final Map<class01894, class08918> L = new HashMap<>();
   private final Set<class08629> u = new HashSet<>();
   private final class01089 i;
   private class01894 R;

   public void L(class01894 var1) {
      class08918 class08918 = this.L.remove(var1);
      if (class08918 != null) {
         this.y(var1, class08918);
      }
   }

   public class08627(class01089 var1) {
      super();
      this.i = var1;
      class08280 class08280 = class08923.N();
      this.N(class08923.L(), new class08829(() -> "(intentionally-)Missing Texture", class08280));
   }

   @Override
   public void close() {
      this.L.forEach(this::y);
      this.L.clear();
      this.u.clear();
      this.N(null);
   }

   private class08354 y(class01894 var1, class08361 var2) {
      try {
         return N(this.i, var1, var2);
      } catch (Exception exception) {
         y.error("Failed to load texture {} into slot {}", new Object[]{var2.method_65859(), var1, exception});
         return class08354.N();
      }
   }

   private void y(class01894 var1, class08918 var2) {
      this.u.remove(var2);

      try {
         var2.close();
      } catch (Exception exception) {
         y.warn("Failed to close texture {}", var1, exception);
      }
   }

   public class08918 y(class01894 var1) {
      class08918 class08918 = this.L.get(var1);
      if (class08918 != null) {
         return class08918;
      } else {
         class00349 class00349 = new class00349(var1);
         this.N(var1, (class08361)class00349);
         return class00349;
      }
   }

   private void N(Path var1, CallbackInfo var2) {
      PBRTextureManager.INSTANCE.dumpTextures(var1);
   }

   private void N(List var1, Void var2, CallbackInfo var3) {
      TextureFormatLoader.reload(this.i);
      PBRTextureManager.INSTANCE.clear();
      CapturedRenderingState.INSTANCE.incrementTextureReloadCount();
   }

   private void N(CallbackInfo var1) {
      PBRTextureManager.INSTANCE.close();
   }

   public void N() {
      Iterator iterator = this.u.iterator();

      while (iterator.hasNext()) {
         ((class08629)iterator.next()).y();
      }
   }

   public void N(class01894 var1, class08918 var2) {
      class08918 class08918 = this.L.put(var1, var2);
      if (class08918 != var2) {
         if (class08918 != null) {
            this.y(var1, class08918);
         }

         if (var2 instanceof class08629 class08629) {
            this.u.add(class08629);
         }
      }
   }

   public void N(class01894 var1) {
      this.N(var1, (class08918)(new class00349(var1)));
   }

   public void N(class01894 var1, class08361 var2) {
      try {
         var2.method_65857(this.y(var1, var2));
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Uploading texture");
         class07074 class07074 = class07080.N("Uploaded texture");
         class07074.N("Resource location", var2.method_65859());
         class07074.N("Texture id", var1);
         throw new class07878(class07080);
      }

      this.N(var1, (class08918)var2);
   }

   private static class08354 N(class01089 var0, class01894 var1, class08361 var2) throws IOException {
      try {
         return var2.method_65809(var0);
      } catch (FileNotFoundException filenotfoundexception) {
         if (var1 != N) {
            y.warn("Missing resource {} referenced from {}", var2.method_65859(), var1);
         }

         return class08354.N();
      }
   }

   private static class08639 N(class01089 var0, class01894 var1, class08361 var2, Executor var3) {
      return new class08639(var2, CompletableFuture.supplyAsync(() -> {
         try {
            return N(var0, var1, var2);
         } catch (IOException ioexception) {
            throw new UncheckedIOException(ioexception);
         }
      }, var3));
   }

   public void N(Path var1) {
      try {
         Files.createDirectories(var1);
      } catch (IOException ioexception) {
         y.error("Failed to create directory {}", var1, ioexception);
         this.N(var1, null);
         return;
      }

      this.L.forEach((var1x, var2) -> {
         if (var2 instanceof class03609 class03609) {
            try {
               class03609.method_49712(var1x, var1);
            } catch (Exception exception) {
               y.error("Failed to dump texture {}", var1x, exception);
            }
         }
      });
      this.N(var1, null);
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

   @Override
   public CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      class01089 class01089 = var1.N();
      ArrayList arraylist = new ArrayList();
      this.L.forEach((var3x, var4x) -> {
         if (var4x instanceof class08361 class08361) {
            arraylist.add(N(class01089, var3x, class08361, var2));
         }
      });
      return CompletableFuture.allOf(arraylist.stream().map(class08639::y).toArray(var0 -> new CompletableFuture[var0]))
         .thenCompose(var3::N)
         .thenAcceptAsync(var2x -> {
            class01891.N(this.i);

            for (class08639 class08639 : arraylist) {
               class08639.N().method_65857(class08639.y().join());
            }

            this.N(arraylist, var2x, null);
         }, var4);
   }
}
