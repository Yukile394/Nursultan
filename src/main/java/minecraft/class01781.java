package minecraft;

import Nursultan.class11792;
import baritone.utils.accessor.IEntityRenderManager;
import com.google.common.collect.ImmutableMap;
import com.viaversion.viafabricplus.features.entity.r1_8_boat.BoatRenderer1_8;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Client;
import net.fabricmc.fabric.impl.client.rendering.ArmorRendererRegistryImpl;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Quaternionf;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01781 implements class06141, class11792, IEntityRenderManager, FabricResourceReloader {
   private Map<class07078<?>, class04507<?, ?>> i = ImmutableMap.of();
   private Map<class04208, class08287<class04477>> R = Map.of();
   private Map<class04208, class08287<class06603>> M = Map.of();
   public final class08627 N;
   @Nullable
   public class05363 y;
   public class07049 L;
   private final class08943 B;
   private final class01083 Z;
   private final class01999 z;
   private final class03049 U;
   private final class08117 E;
   private final class01590 W;
   public final class05630 u;
   private final Supplier<class01140> m;
   private final class08718 P;
   private final class07949 s;
   private class01894 T;
   private static final String b = "renderShadow(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;Lnet/minecraft/world/entity/Entity;FFLnet/minecraft/world/level/LevelReader;F)V";
   private static final String j = "Lnet/minecraft/client/renderer/entity/EntityRenderDispatcher;renderBlockShadow(Lcom/mojang/blaze3d/vertex/PoseStack$Pose;Lcom/mojang/blaze3d/vertex/VertexConsumer;Lnet/minecraft/world/level/chunk/ChunkAccess;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;DDDFF)V";
   private static final NamespacedId v;
   private static final NamespacedId n;
   private static int t;
   private static final NamespacedId G;
   private static final NamespacedId l;
   private static final Object2ObjectMap d;
   private BoatRenderer1_8 w;

   private static boolean L() {
      WorldRenderingPipeline worldrenderingpipeline = Iris.getPipelineManager().getPipelineNullable();
      return worldrenderingpipeline != null && worldrenderingpipeline.shouldDisableVanillaEntityShadows();
   }

   public class01781(
      class06202 var1,
      class08627 var2,
      class08943 var3,
      class01083 var4,
      class01999 var5,
      class08117 var6,
      class01590 var7,
      class05630 var8,
      Supplier<class01140> var9,
      class08718 var10,
      class07949 var11
   ) {
      super();
      this.N = var2;
      this.B = var3;
      this.Z = var4;
      this.E = var6;
      this.s = var11;
      this.U = new class03049(var1, this, var3);
      this.z = var5;
      this.W = var7;
      this.u = var8;
      this.m = var9;
      this.P = var10;
   }

   public <E extends class07049> class08800 y(E var1, float var2) {
      class04507 class04507 = this.N(var1);

      try {
         return class04507.method_62425(var1, var2);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Extracting render state for an entity in world");
         class07074 class07074 = class07080.N("Entity being extracted");
         var1.method_5819(class07074);
         this.N(class04507, class07080).N("Delta", var2);
         throw new class07878(class07080);
      }
   }

   private void y(class08800 var1, class06959 var2, double var3, double var5, double var7, class01421 var9, class01237 var10, CallbackInfo var11) {
      CapturedRenderingState.INSTANCE.setCurrentEntity(0);
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
   }

   public double y(class07049 var1) {
      return this.y.y().M(var1.method_73189());
   }

   public class03049 y() {
      return this.U;
   }

   private void y(class01089 var1, CallbackInfo var2, class04832 var3) {
      this.w = new BoatRenderer1_8(var3);
   }

   private void N(class08800 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && var1 instanceof class08790) {
         var2.setReturnValue(this.w);
      }
   }

   public <E extends class07049> int N(E var1, float var2) {
      return this.N(var1).method_24088(var1, var2);
   }

   private void N(class01089 var1, CallbackInfo var2, class04832 var3) {
      ArmorRendererRegistryImpl.createArmorRenderers(var3);
   }

   private void N(class08800 var1, class06959 var2, double var3, double var5, double var7, class01421 var9, class01237 var10, CallbackInfo var11) {
      Object2IntFunction<NamespacedId> object2intfunction = WorldRenderingSettings.INSTANCE.getEntityIds();
      if (object2intfunction != null && ImmediateState.isRenderingLevel) {
         int ix;
         if (var1 instanceof class08283 && ((class08283)var1).y && WorldRenderingSettings.INSTANCE.hasVillagerConversionId()) {
            ix = object2intfunction.applyAsInt(l);
         } else {
            label35: {
               if (var1 instanceof class08468 class08468) {
                  class07049 class07049 = class06202.Nq().F();
                  if (class07049 instanceof class04477 && ((class04477)class07049).method_5628() == class08468.NO) {
                     if (object2intfunction.containsKey(G)) {
                        ix = object2intfunction.getInt(G);
                     } else {
                        ix = object2intfunction.applyAsInt((NamespacedId)d.computeIfAbsent(var1.U, var1x -> {
                           class01894 class01894 = class04206.M.y(var1.U);
                           return new NamespacedId(class01894.y(), class01894.N());
                        }));
                     }
                     break label35;
                  }
               }

               ix = object2intfunction.applyAsInt((NamespacedId)d.computeIfAbsent(var1.U, var1x -> {
                  class01894 class01894 = class04206.M.y(var1.U);
                  return new NamespacedId(class01894.y(), class01894.N());
               }));
            }
         }

         CapturedRenderingState.INSTANCE.setCurrentEntity(ix);
      }
   }

   @Override
   public void N(class07049 var1, class06959 var2, double var3, double var5, double var7, float var9, class01421 var10, class01237 var11) {
      double d0 = class04995.u((double)var9, var1.field_6014, var1.method_23317()) - var3;
      double d1 = class04995.u((double)var9, var1.field_6036, var1.method_23318()) - var5;
      double d2 = class04995.u((double)var9, var1.field_5969, var1.method_23321()) - var7;
      class04507 class04507 = this.N(var1);
      class08800 class08800 = class04507.method_62425(var1, var9);
      class06889 class06889x = class08800.k;
      int ix = class08800.l;
      class08800.k = null;
      class08800.l = 0;
      class06889 class06889x = class04507.method_23169(class08800);
      double d3 = d0 + class06889x.N();
      double d4 = d1 + class06889x.y();
      double d5 = d2 + class06889x.L();
      var10.N();
      var10.N(d3, d4, d5);
      class04507.method_3936(class08800, var10, var11, var2);
      if (!(var1 instanceof class08036)) {
         var10.N(-class06889x.N(), -class06889x.y(), -class06889x.L());
      }

      var10.y();
      class08800.k = class06889x;
      class08800.l = ix;
   }

   private static boolean N(class01237 var0, class01421 var1, float var2, List var3) {
      return !L();
   }

   private <S extends class08800> class07074 N(class04507<?, S> var1, class07080 var2) {
      class07074 class07074 = var2.N("Renderer details");
      class07074.N("Assigned renderer", var1);
      return class07074;
   }

   public <S extends class08800> void N(S var1, class06959 var2, double var3, double var5, double var7, class01421 var9, class01237 var10) {
      class04507 class04507 = this.N(var1);

      try {
         class06889 class06889 = class04507.method_23169(var1);
         double d2 = var3 + class06889.N();
         double d0 = var5 + class06889.y();
         double d1 = var7 + class06889.L();
         var9.N();
         this.N(var1, var2, var3, var5, var7, var9, var10, null);
         var9.N(d2, d0, d1);
         class04507.method_3936(var1, var9, var10, var2);
         if (var1.t) {
            var10.N(var9, var1, class04995.N(class04995.B, var2.i, new Quaternionf()));
         }

         if (var1 instanceof class08468) {
            var9.N(-class06889.N(), -class06889.y(), -class06889.L());
         }

         if (!var1.O.isEmpty()) {
            List<class08453> list = var1.O;
            float f = var1.Q;
            if (N(var10, var9, f, list)) {
               var10.N(var9, f, list);
            }
         }

         if (!(var1 instanceof class08468)) {
            var9.N(-class06889.N(), -class06889.y(), -class06889.L());
         }

         this.y(var1, var2, var3, var5, var7, var9, var10, null);
         var9.y();
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Rendering entity in world");
         class07074 class07074 = class07080.N("EntityRenderState being rendered");
         var1.N(class07074);
         this.N(class04507, class07080);
         throw new class07878(class07080);
      }
   }

   private <T extends class06600 & class06618> class08287<T> N(Map<class04208, class08287<T>> var1, T var2) {
      class04208 class04208 = ((class06618)var2).Z().u();
      class08287 class08287 = (class08287)var1.get(class04208);
      return class08287 != null ? class08287 : (class08287)var1.get(class04208.field_41123);
   }

   public void N(class05363 var1, class07049 var2) {
      this.y = var1;
      this.L = var2;
   }

   public <S extends class08800> class04507<?, ? super S> N(S var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class04507<?, ? super S>)callbackinforeturnable.getReturnValue();
      } else if (var1 instanceof class08468) {
         class04208 class04208 = ((class08468)var1).N.u();
         class04507<class04477, class08468> class04507 = (class04507<class04477, class08468>)this.R.get(class04208);
         return class04507 != null ? class04507 : (class04507)this.R.get(class04208.field_41123);
      } else {
         return (class04507<?, ? super S>)this.i.get(var1.U);
      }
   }

   public <T extends class07049> class04507<? super T, ?> N(T var1) {
      return (class04507<? super T, ?>)(switch (var1) {
         case class04477 class04477 -> this.N((Map<class04208, class08287<T>>)this.R, (T)class04477);
         case class06603 class06603 -> this.N((Map<class04208, class08287<T>>)this.M, (T)class06603);
         default -> (class04507)this.i.get(((class07049)var1).method_5864());
      });
   }

   public <E extends class07049> boolean N(E var1, class01383 var2, double var3, double var5, double var7) {
      return this.N(var1).method_3933(var1, var2, var3, var5, var7);
   }

   public class08287<class04477> N(class04477 var1) {
      return this.N(this.R, var1);
   }

   public void N() {
      this.y = null;
   }

   @Override
   public void method_14491(class01089 var1) {
      class04832 class04832 = new class04832(this, this.B, this.Z, this.z, var1, this.m.get(), this.P, this.E, this.W, this.s);
      this.i = class04808.N(class04832);
      this.R = class04808.y(class04832);
      this.M = class04808.y(class04832);
      this.N(var1, null, class04832);
      this.y(var1, null, class04832);
   }

   public double renderPosY() {
      return this.y.y().B;
   }

   public double renderPosX() {
      return this.y.y().M;
   }

   public double renderPosZ() {
      return this.y.y().Z;
   }

   public class01894 fabric$getId() {
      if (this.T == null) {
         if (this instanceof class08117) {
            this.T = Client.ATLAS;
         } else if (this instanceof class00183) {
            this.T = Client.MODELS;
         } else if (this instanceof class03579) {
            this.T = Client.BLOCK_ENTITY_RENDERERS;
         } else if (this instanceof class01999) {
            this.T = Client.BLOCK_RENDER_MANAGER;
         } else if (this instanceof class02416) {
            this.T = Client.CLOUD_CELLS;
         } else if (this instanceof class08521) {
            this.T = Client.DRY_FOLIAGE_COLORMAP;
         } else if (this instanceof class08718) {
            this.T = Client.EQUIPMENT_MODELS;
         } else if (this instanceof class01781) {
            this.T = Client.ENTITY_RENDERERS;
         } else if (this instanceof class04866) {
            this.T = Client.FONTS;
         } else if (this instanceof class08575) {
            this.T = Client.FOLIAGE_COLORMAP;
         } else if (this instanceof class08543) {
            this.T = Client.GRASS_COLORMAP;
         } else if (this instanceof class08396) {
            this.T = Client.LANGUAGES;
         } else if (this instanceof class00951) {
            this.T = Client.PARTICLES;
         } else if (this instanceof class08212) {
            this.T = Client.SHADERS;
         } else if (this instanceof class06176) {
            this.T = Client.SPLASH_TEXTS;
         } else if (this instanceof class09033) {
            this.T = Client.SOUNDS;
         } else if (this instanceof class08627) {
            this.T = Client.TEXTURES;
         } else if (this instanceof class08290) {
            this.T = Client.WAYPOINT_STYLE_ASSETS;
         } else {
            this.T = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.T;
   }
}
