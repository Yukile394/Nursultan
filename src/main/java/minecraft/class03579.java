package minecraft;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class03579 implements class06141, FabricResourceReloader {
   private Map<class00404<?>, class03358<?, ?>> N = ImmutableMap.of();
   private final class01590 y;
   private final Supplier<class01140> L;
   private class06889 u;
   private final class01999 i;
   private final class08943 R;
   private final class02862 M;
   private final class01781 B;
   private final class08097 Z;
   private final class07949 z;
   private class01894 U;
   private static final String E = "Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderDispatcher;tryRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Ljava/lang/Runnable;)V";

   public class03579(
      class01590 var1, Supplier<class01140> var2, class01999 var3, class08943 var4, class02862 var5, class01781 var6, class08097 var7, class07949 var8
   ) {
      super();
      this.M = var5;
      this.R = var4;
      this.B = var6;
      this.y = var1;
      this.L = var2;
      this.i = var3;
      this.Z = var7;
      this.z = var8;
   }

   private void y(class00985 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(0);
      ImmediateState.isRenderingBEs = false;
   }

   private void N(class00985 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      Object2IntMap<class00500> object2intmap = WorldRenderingSettings.INSTANCE.getBlockStateIds();
      ImmediateState.isRenderingBEs = true;
      if (object2intmap != null && ImmediateState.isRenderingLevel) {
         int ix = object2intmap.applyAsInt(var1.M);
         CapturedRenderingState.INSTANCE.setCurrentBlockEntity(ix);
      }
   }

   public <S extends class00985> void N(S var1, class01421 var2, class01237 var3, class06959 var4) {
      class03358 class03358 = this.N(var1);
      this.N(var1, var2, var3, var4, null);
      class03358 class03358x = class03358;
      if (class03358x == null) {
         this.y(var1, var2, var3, var4, null);
      } else {
         try {
            class03358x.N(var1, var2, var3, var4);
         } catch (Throwable throwable) {
            class07080 class07080 = class07080.N(throwable, "Rendering Block Entity");
            class07074 class07074 = class07080.N("Block Entity Details");
            var1.N(class07074);
            throw new class07878(class07080);
         }

         this.y(var1, var2, var3, var4, null);
      }
   }

   @Nullable
   public <E extends class00394, S extends class00985> class03358<E, S> N(E var1) {
      return (class03358<E, S>)this.N.get(var1.O());
   }

   @Nullable
   public <E extends class00394, S extends class00985> S N(E var1, float var2, @Nullable class08141 var3) {
      class03358 class03358 = this.N(var1);
      if (class03358 == null) {
         return null;
      } else if (!var1.l() || !var1.O().method_20526(var1.w())) {
         return null;
      } else if (!class03358.N(var1, this.u)) {
         return null;
      } else {
         class06889 class06889 = this.u;
         class00985 class00985 = class03358.i();
         class03358.N(var1, class00985, var2, class06889, var3);
         return (S)class00985;
      }
   }

   public void N(class05363 var1) {
      this.u = var1.y();
   }

   @Nullable
   public <E extends class00394, S extends class00985> class03358<E, S> N(S var1) {
      return (class03358<E, S>)this.N.get(var1.B);
   }

   @Override
   public void method_14491(class01089 var1) {
      class04811 class04811 = new class04811(this, this.i, this.R, this.M, this.B, this.L.get(), this.y, this.Z, this.z);
      this.N = class04826.N(class04811);
   }

   public class01894 fabric$getId() {
      if (this.U == null) {
         if (this instanceof class08117) {
            this.U = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.U = Client.MODELS;
         } else if (this instanceof class03579) {
            this.U = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.U = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.U = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.U = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.U = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.U = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.U = Client.FONTS;
         } else if (this instanceof class08575) {
            this.U = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.U = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.U = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.U = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.U = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.U = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.U = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.U = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.U = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.U = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.U;
   }
}
