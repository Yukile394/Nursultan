package minecraft;

import Nursultan.class10883;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@Environment(EnvType.CLIENT)
public class class08212 extends class01291<class08204> implements AutoCloseable, FabricResourceReloader {
   static final Logger N = LogUtils.getLogger();
   public static final int y = 32768;
   public static final String L = "shaders";
   private static final String R = "shaders/include/";
   private static final class03069 M = class03069.N("post_effect");
   final class08627 u;
   private final Consumer<Exception> B;
   private class08231 Z = new class08231(this, class08204.L);
   final class00056 i = new class00056("post", 0.1F, 1000.0F, false);
   private class01894 z;

   public class08212(class08627 var1, Consumer<Exception> var2) {
      super();
      this.u = var1;
      this.B = var2;
   }

   @Override
   public void close() {
      this.Z.close();
      this.i.close();
   }

   private void N(Exception var1) {
      if (!this.Z.y) {
         this.B.accept(var1);
         this.Z.y = true;
      }
   }

   @Nullable
   public class08086 N(class01894 var1, Set<class01894> var2) {
      try {
         return this.Z.N(var1, var2);
      } catch (class10883 class10883) {
         N.error("Failed to load post chain: {}", var1, class10883);
         this.Z.N.put(var1, Optional.empty());
         this.N(class10883);
         return null;
      }
   }

   @Nullable
   public String N(class01894 var1, ShaderType var2) {
      return this.Z.N(var1, var2);
   }

   private static void N(class01894 var0, class01079 var1, ShaderType var2, Map<class01894, class01079> var3, Builder<class08205, String> var4) {
      class01894 class01894 = var2.idConverter().y(var0);
      class02770 class02770 = N(var3, var0);

      try (BufferedReader bufferedreader = var1.method_43039()) {
         String s = IOUtils.toString(bufferedreader);
         var4.put(new class08205(class01894, var2), String.join("", class02770.N(s)));
      } catch (IOException ioexception) {
         N.error("Failed to load shader source at {}", var0, ioexception);
      }
   }

   protected class08204 y(class01089 var1, class04643 var2) {
      Builder builder = ImmutableMap.builder();
      Map map = var1.y("shaders", class08212::N);

      for (Entry entry : map.entrySet()) {
         class01894 class01894 = (class01894)entry.getKey();
         ShaderType shadertype = ShaderType.byLocation(class01894);
         if (shadertype != null) {
            N(class01894, (class01079)entry.getValue(), shadertype, map, builder);
         }
      }

      Builder builder1 = ImmutableMap.builder();

      for (Entry entry1 : M.N(var1).entrySet()) {
         N((class01894)entry1.getKey(), (class01079)entry1.getValue(), builder1);
      }

      return new class08204(builder.build(), builder1.build());
   }

   private static void N(class01894 var0, class01079 var1, Builder<class01894, class02414> var2) {
      class01894 class01894 = M.y(var0);

      try (BufferedReader bufferedreader = var1.method_43039()) {
         JsonElement jsonelement = class08326.N(bufferedreader);
         var2.put(class01894, (class02414)class02414.N.parse(JsonOps.INSTANCE, jsonelement).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException ioexception) {
         N.error("Failed to parse post chain at {}", var0, ioexception);
      }
   }

   private static boolean N(class01894 var0) {
      return ShaderType.byLocation(var0) != null || var0.N().endsWith(".glsl");
   }

   protected void N(class08204 var1, class01089 var2, class04643 var3) {
      class08231 class08231 = new class08231(this, var1);
      HashSet hashset = new HashSet<>(class08394.N());
      ArrayList arraylist = new ArrayList();
      GpuDevice gpudevice = RenderSystem.getDevice();
      gpudevice.clearPipelineCache();

      for (RenderPipeline renderpipeline : hashset) {
         if (!gpudevice.precompilePipeline(renderpipeline, class08231::N).isValid()) {
            arraylist.add(renderpipeline.getLocation());
         }
      }

      if (!arraylist.isEmpty()) {
         gpudevice.clearPipelineCache();
         throw new RuntimeException(
            "Failed to load required shader programs:\n" + arraylist.stream().map(var0 -> " - " + var0).collect(Collectors.joining("\n"))
         );
      } else {
         this.Z.close();
         this.Z = class08231;
      }
   }

   private static class02770 N(Map<class01894, class01079> var0, class01894 var1) {
      class01894 class01894 = var1.N(class06290::L);
      return new class08210(class01894, var0);
   }

   public class01894 fabric$getId() {
      if (this.z == null) {
         if (this instanceof class08117) {
            this.z = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.z = Client.MODELS;
         } else if (this instanceof class03579) {
            this.z = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.z = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.z = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.z = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.z = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.z = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.z = Client.FONTS;
         } else if (this instanceof class08575) {
            this.z = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.z = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.z = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.z = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.z = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.z = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.z = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.z = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.z = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.z = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.z;
   }

   @Override
   public String method_22322() {
      return "Shader Loader";
   }
}
