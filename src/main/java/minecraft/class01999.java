package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import net.caffeinemc.mods.sodium.mixin.frapi.BlockRenderDispatcherAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockRenderManager;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class01999 implements class06141, BlockRenderDispatcherAccessor, FabricBlockRenderManager, FabricResourceReloader {
   private final class03770 N;
   private final class08097 y;
   private final class02020 L;
   @Nullable
   private class03760 u;
   private final class06069 i = class06069.u();
   private final List<class08877> R = new ArrayList<>();
   private final class01587 M;
   private class01894 B;

   public class01999(class03770 var1, class08097 var2, class01587 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.M = var3;
      this.L = new class02020(this.M);
   }

   public class02020 y() {
      return this.L;
   }

   private void N(class00500 var1, class07209 var2, class07295 var3, class01421 var4, class01391 var5, CallbackInfo var6, class08887 var7) {
      this.L.render(var3, var7, var1, var2, var4, var1x -> var5, true, var1.y(var2), class01384.u);
      var6.cancel();
   }

   private void N(
      class01423 var1,
      class01391 var2,
      class08887 var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      class00500 var9,
      class01421 var10,
      class01407 var11,
      int var12,
      int var13
   ) {
      FabricBlockModelRenderer.render(
         var1,
         var1x -> var11.method_73477(RenderLayerHelper.getEntityBlockLayer(var1x)),
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         class02730.field_52611,
         class07209.field_10980,
         var9
      );
   }

   private void N(
      class01423 var1,
      class01407 var2,
      class08887 var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      class07295 var9,
      class07209 var10,
      class00500 var11
   ) {
      FabricBlockModelRenderer.render(
         var1, var1x -> var2.method_73477(RenderLayerHelper.getEntityBlockLayer(var1x)), var3, var4, var5, var6, var7, var8, var9, var10, var11
      );
   }

   public void N(class07209 var1, class07295 var2, class01391 var3, class00500 var4, class04688 var5) {
      try {
         Objects.requireNonNull(this.u).N(var2, var1, var3, var4, var5);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Tesselating liquid in world");
         class07074.N(class07080.N("Block being tesselated"), var2, var1, var4);
         throw new class07878(class07080);
      }
   }

   public void N(class00500 var1, class07209 var2, class07295 var3, class01421 var4, class01391 var5, boolean var6, List<class08877> var7) {
      try {
         this.L.N(var3, var7, var1, var2, var4, var5, var6, class01384.u);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Tesselating block in world");
         class07074.N(class07080.N("Block being tesselated"), var3, var2, var1);
         throw new class07878(class07080);
      }
   }

   public void N(class00500 var1, class07209 var2, class07295 var3, class01421 var4, class01391 var5) {
      if (var1.b() == class06898.field_11458) {
         class08887 class08887 = this.N.y(var1);
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var2, var3, var4, var5, callbackinfo, class08887);
         if (!callbackinfo.isCancelled()) {
            this.i.N(var1.y(var2));
            this.R.clear();
            class08887.method_68513(this.i, this.R);
            this.L.N(var3, this.R, var1, var2, var4, var5, true, class01384.u);
         }
      }
   }

   public class03770 N() {
      return this.N;
   }

   public void N(class00500 var1, class01421 var2, class01407 var3, int var4, int var5) {
      if (var1.b() != class06898.field_11455) {
         class08887 class08887 = this.N(var1);
         int ix = this.M.N(var1, null, null, 0);
         float f = (ix >> 16 & 0xFF) / 255.0F;
         float f1 = (ix >> 8 & 0xFF) / 255.0F;
         float f2 = (ix & 0xFF) / 255.0F;
         class01423 class01423x = var2.L();
         class01391 class01391 = var3.method_73477(class05885.L(var1));
         class01423 class01423x = class01423x;
         this.N(class01423x, class01391, class08887, f, f1, f2, var4, var5, var1, var2, var3, var4, var5);
      }
   }

   public class08887 N(class00500 var1) {
      return this.N.y(var1);
   }

   @Override
   public void method_14491(class01089 var1) {
      this.u = new class03760(this.y);
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
}
