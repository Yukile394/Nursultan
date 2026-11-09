package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class08117 implements class01081, class08097, AutoCloseable, FabricResourceReloader {
   private static final Logger y = LogUtils.getLogger();
   private static final List<class08126> L = List.of(
      new class08126(class05911.M, class08589.N, false),
      new class08126(class05911.L, class08589.y, false),
      new class08126(class05911.y, class08589.L, false),
      new class08126(class08626.N, class08589.u, true),
      new class08126(class08626.y, class08589.i, false),
      new class08126(class05911.R, class08589.R, false),
      new class08126(class05911.B, class08589.M, false),
      new class08126(class05911.Z, class08589.B, false, Set.of(class01677.L)),
      new class08126(class05911.z, class08589.Z, false),
      new class08126(class05911.U, class08589.z, false),
      new class08126(class08626.L, class08589.U, false),
      new class08126(class05911.u, class08589.E, false),
      new class08126(class05911.N, class08589.W, false),
      new class08126(class05911.i, class08589.m, false),
      new class08126(class05911.E, class08589.P, false)
   );
   public static final class01092<class08124> N = new class01092<>();
   private final Map<class01894, class08119> u = new HashMap<>();
   private final Map<class01894, class08119> i = new HashMap<>();
   private Map<class05913, class08388> R = Map.of();
   private int M;
   private class01894 B;

   public class08117(class08627 var1, int var2) {
      super();

      for (class08126 class08126 : L) {
         class08626 class08626 = new class08626(class08126.N());
         var1.N(class08126.N(), class08626);
         class08119 class08119 = new class08119(class08626, class08126);
         this.u.put(class08126.N(), class08119);
         this.i.put(class08126.y(), class08119);
      }

      this.M = var2;
   }

   @Override
   public void close() {
      this.R = Map.of();
      this.i.values().forEach(class08119::close);
      this.i.clear();
      this.u.clear();
   }

   private void N(class05913 var1, CallbackInfoReturnable var2) {
      if (var2.getReturnValue() != null) {
         SpriteUtil.INSTANCE.markSpriteActive((class08388)var2.getReturnValue());
      }
   }

   @Override
   public class08388 N(class05913 var1) {
      class08388 class08388xx = this.R.get(var1);
      if (class08388xx != null) {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, class08388xx);
         this.N(var1, callbackinforeturnable);
         return class08388xx;
      } else {
         class01894 class01894 = var1.N();
         class08119 class08119 = this.u.get(class01894);
         if (class08119 == null) {
            throw new IllegalArgumentException("Invalid atlas texture id: " + class01894);
         } else {
            class08388 class08388x;
            class08388 class08388xx = class08388x = class08119.N().L();
            CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", false, class08388x);
            this.N(var1, callbackinforeturnable1);
            return class08388xx;
         }
      }
   }

   public void N(int var1) {
      this.M = var1;
   }

   public void N(BiConsumer<class01894, class08626> var1) {
      this.i.forEach((var1x, var2) -> var1.accept(var1x, var2.N()));
   }

   public class08626 N(class01894 var1) {
      class08119 class08119 = this.i.get(var1);
      if (class08119 == null) {
         throw new IllegalArgumentException("Invalid atlas id: " + var1);
      } else {
         return class08119.N();
      }
   }

   private void N(class08124 var1) {
      this.R = var1.N();
      HashMap hashmap = new HashMap();
      this.R
         .forEach(
            (var1x, var2x) -> {
               if (!var1x.y().equals(class08923.L())) {
                  class08388 class08388 = hashmap.putIfAbsent(var1x.y(), var2x);
                  if (class08388 != null) {
                     y.warn(
                        "Duplicate sprite {} from atlas {}, already defined in atlas {}. This will be rejected in a future version",
                        new Object[]{var1x.y(), var1x.N(), class08388.method_45852()}
                     );
                  }
               }
            }
         );
   }

   public class01894 fabric$getId() {
      if (this.B == null) {
         if (this instanceof class08117) {
            this.B = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.B = Client.MODELS;
         } else if (this instanceof class03579) {
            this.B = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.B = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.B = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.B = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.B = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.B = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.B = Client.FONTS;
         } else if (this instanceof class08575) {
            this.B = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.B = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.B = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.B = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.B = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.B = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.B = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.B = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.B = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.B = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.B;
   }

   @Override
   public CompletableFuture<Void> method_25931(class01073 var1, Executor var2, class01080 var3, Executor var4) {
      class08124 class08124 = var1.N(N);
      class01089 class01089 = var1.N();
      class08124.N.forEach(var3x -> var3x.N().N(class01089, var2, this.M).whenComplete((var1xx, var2xx) -> {
         if (var1xx != null) {
            var3x.y().complete(var1xx);
         } else {
            var3x.y().completeExceptionally(var2xx);
         }
      }));
      return class08124.y.thenCompose(var3::N).thenAcceptAsync(var2x -> this.N(class08124), var4);
   }

   @Override
   public void prepareSharedState(class01073 var1) {
      int ix = this.i.size();
      ArrayList arraylist = new ArrayList(ix);
      HashMap hashmap = new HashMap(ix);
      ArrayList arraylist1 = new ArrayList(ix);
      this.i.forEach((var3x, var4x) -> {
         CompletableFuture completablefuturex = new CompletableFuture();
         hashmap.put(var3x, completablefuturex);
         arraylist.add(new class08104(var4x, completablefuturex));
         arraylist1.add(completablefuturex.thenCompose(class02008::R));
      });
      CompletableFuture completablefuture = CompletableFuture.allOf(arraylist1.toArray(var0 -> new CompletableFuture[var0]));
      var1.N(N, new class08124(arraylist, hashmap, completablefuture));
   }
}
