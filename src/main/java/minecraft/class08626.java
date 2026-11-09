package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.Map.Entry;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.common.util.AnimationStateExtended;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.ExtendedTextureAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinder;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinderImpl;
import net.caffeinemc.mods.sodium.client.render.texture.SpriteFinderCache;
import net.caffeinemc.mods.sodium.mixin.core.render.texture.TextureAtlasAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.api.renderer.v1.sprite.FabricSpriteAtlasTexture;
import net.fabricmc.fabric.impl.renderer.SpriteFinderImpl;
import net.irisshaders.iris.pbr.TextureTracker;
import net.irisshaders.iris.pbr.texture.PBRAtlasHolder;
import net.irisshaders.iris.pbr.texture.TextureAtlasExtension;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class08626
   extends class08918
   implements class03609,
   class08629,
   ExtendedTextureAtlas,
   TextureAtlasAccessor,
   FabricSpriteAtlasTexture,
   net.irisshaders.iris.mixin.texture.TextureAtlasAccessor,
   TextureAtlasExtension {
   private static final Logger u = LogUtils.getLogger();
   @Deprecated
   public static final class01894 N = class01894.y("textures/atlas/blocks.png");
   @Deprecated
   public static final class01894 y = class01894.y("textures/atlas/items.png");
   @Deprecated
   public static final class01894 L = class01894.y("textures/atlas/particles.png");
   private List<class08388> i;
   private List<class02011> R;
   private Map<class01894, class08388> M;
   @Nullable
   private class08388 B;
   private final class01894 Z;
   private final int z;
   private int U;
   private int E;
   private int W;
   private int m;
   private GpuTextureView[] P;
   @Nullable
   private GpuBuffer s;
   @Nullable
   private volatile SpriteFinder T;
   private PBRAtlasHolder b;
   private boolean j = false;
   private final Map v = Map.of(
      (Supplier)() -> SodiumExtraClientMod.options().animationSettings.water,
      List.of(class01894.N("minecraft", "block/water_still"), class01894.N("minecraft", "block/water_flow")),
      (Supplier)() -> SodiumExtraClientMod.options().animationSettings.lava,
      List.of(class01894.N("minecraft", "block/lava_still"), class01894.N("minecraft", "block/lava_flow")),
      (Supplier)() -> SodiumExtraClientMod.options().animationSettings.portal,
      List.of(class01894.N("minecraft", "block/nether_portal")),
      (Supplier)() -> SodiumExtraClientMod.options().animationSettings.fire,
      List.of(
         class01894.N("minecraft", "block/fire_0"),
         class01894.N("minecraft", "block/fire_1"),
         class01894.N("minecraft", "block/soul_fire_0"),
         class01894.N("minecraft", "block/soul_fire_1"),
         class01894.N("minecraft", "block/campfire_fire"),
         class01894.N("minecraft", "block/campfire_log_lit"),
         class01894.N("minecraft", "block/soul_campfire_fire"),
         class01894.N("minecraft", "block/soul_campfire_log_lit")
      ),
      (Supplier)() -> SodiumExtraClientMod.options().animationSettings.blockAnimations,
      List.of(
         class01894.N("minecraft", "block/magma"),
         class01894.N("minecraft", "block/lantern"),
         class01894.N("minecraft", "block/sea_lantern"),
         class01894.N("minecraft", "block/soul_lantern"),
         class01894.N("minecraft", "block/kelp"),
         class01894.N("minecraft", "block/kelp_plant"),
         class01894.N("minecraft", "block/seagrass"),
         class01894.N("minecraft", "block/tall_seagrass_top"),
         class01894.N("minecraft", "block/tall_seagrass_bottom"),
         class01894.N("minecraft", "block/warped_stem"),
         class01894.N("minecraft", "block/crimson_stem"),
         class01894.N("minecraft", "block/blast_furnace_front_on"),
         class01894.N("minecraft", "block/smoker_front_on"),
         class01894.N("minecraft", "block/stonecutter_saw"),
         class01894.N("minecraft", "block/prismarine"),
         class01894.N("minecraft", "block/respawn_anchor_top"),
         class01894.N("minecraft", "entity/conduit/wind"),
         class01894.N("minecraft", "entity/conduit/wind_vertical")
      ),
      (Supplier)() -> SodiumExtraClientMod.options().animationSettings.sculkSensor,
      List.of(
         class01894.N("minecraft", "block/sculk"),
         class01894.N("minecraft", "block/sculk_catalyst_top_bloom"),
         class01894.N("minecraft", "block/sculk_catalyst_side_bloom"),
         class01894.N("minecraft", "block/sculk_shrieker_inner_top"),
         class01894.N("minecraft", "block/sculk_vein"),
         class01894.N("minecraft", "block/sculk_shrieker_can_summon_inner_top"),
         class01894.N("minecraft", "block/sculk_sensor_tendril_inactive"),
         class01894.N("minecraft", "block/sculk_sensor_tendril_active"),
         class01894.N("minecraft", "vibration")
      )
   );

   public class08388 L() {
      return Objects.requireNonNull(this.B, "Atlas not initialized");
   }

   int M() {
      return this.U;
   }

   public class08626(class01894 var1) {
      super();
      this.i = List.of();
      this.R = List.of();
      this.M = Map.of();
      this.P = new GpuTextureView[0];
      this.Z = var1;
      this.z = RenderSystem.getDevice().getMaxTextureSize();
   }

   int B() {
      return this.E;
   }

   private void Z() {
      GpuDevice gpudevice = RenderSystem.getDevice();
      int ix = class04995.i(class01991.field_64235, RenderSystem.getDevice().getUniformOffsetAlignment());
      int jx = ix * this.m;
      class08188 class08188 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST, true);
      List<class08388> list = this.i.stream().filter(var0 -> !var0.method_76321()).toList();
      ArrayList arraylist = new ArrayList();
      ByteBuffer bytebuffer = MemoryUtil.memAlloc(list.size() * jx);

      for (int k = 0; k < list.size(); k++) {
         class08388 class08388 = list.get(k);
         class08388.method_76320(bytebuffer, k * jx, this.W, this.U, this.E, ix);
         GpuTexture gputexture = gpudevice.createTexture(
            () -> class08388.method_45851().method_45816().toString(),
            5,
            TextureFormat.RGBA8,
            class08388.method_45851().method_45807(),
            class08388.method_45851().method_45815(),
            1,
            this.m
         );
         GpuTextureView[] agputextureview = new GpuTextureView[this.m];

         for (int l = 0; l <= this.W; l++) {
            class08388.method_4584(gputexture, l);
            agputextureview[l] = gpudevice.createTextureView(gputexture);
         }

         arraylist.add(agputextureview);
      }

      GpuBuffer gpubuffer = gpudevice.createBuffer(() -> "SpriteAnimationInfo", 128, bytebuffer);

      try {
         for (int i1 = 0; i1 < this.m; i1++) {
            RenderPass renderpass = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Animate " + this.Z, this.P[i1], OptionalInt.empty());

            try {
               renderpass.setPipeline(class08394.yR);

               for (int j1 = 0; j1 < list.size(); j1++) {
                  renderpass.bindTexture("Sprite", ((GpuTextureView[])arraylist.get(j1))[i1], class08188);
                  renderpass.setUniform("SpriteAnimationInfo", gpubuffer.slice(j1 * jx + i1 * ix, class01991.field_64235));
                  renderpass.draw(0, 6);
               }
            } catch (Throwable throwable2) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable1) {
                     throwable2.addSuppressed(throwable1);
                  }
               }

               throw throwable2;
            }

            if (renderpass != null) {
               renderpass.close();
            }
         }
      } catch (Throwable throwable3) {
         if (gpubuffer != null) {
            try {
               gpubuffer.close();
            } catch (Throwable throwable) {
               throwable3.addSuppressed(throwable);
            }
         }

         throw throwable3;
      }

      if (gpubuffer != null) {
         gpubuffer.close();
      }

      for (GpuTextureView[] agputextureview1 : arraylist) {
         for (GpuTextureView gputextureview : agputextureview1) {
            gputextureview.close();
            gputextureview.texture().close();
         }
      }

      MemoryUtil.memFree(bytebuffer);
      this.z();
   }

   public class01894 i() {
      return this.Z;
   }

   @Override
   public void close() {
      super.close();
      GpuTextureView[] var1 = this.P;
      int ix = var1.length;

      for (int jx = 0; jx < ix; jx++) {
         var1[jx].close();
      }

      for (class02011 class02011 : this.R) {
         class02011.close();
      }

      if (this.s != null) {
         this.s.close();
         this.s = null;
      }
   }

   private void z() {
      if (this.R.stream().anyMatch(class02011::y)) {
         for (int ix = 0; ix <= this.W; ix++) {
            RenderPass renderpass = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Animate " + this.Z, this.P[ix], OptionalInt.empty());

            try {
               for (class02011 class02011 : this.R) {
                  if (class02011.y()) {
                     class02011.N(renderpass, class02011.N(ix));
                  }
               }
            } catch (Throwable throwable1) {
               if (renderpass != null) {
                  try {
                     renderpass.close();
                  } catch (Throwable throwable) {
                     throwable1.addSuppressed(throwable);
                  }
               }

               throw throwable1;
            }

            if (renderpass != null) {
               renderpass.close();
            }
         }
      }
   }

   public void u() {
      this.i.forEach(class08388::close);
      this.i = List.of();
      this.R = List.of();
      this.M = Map.of();
      this.B = null;
   }

   private void y(CallbackInfo var1) {
      TextureTracker.INSTANCE.trackTexture(this.field_56974.iris$getGlId(), this);
   }

   @Override
   public void y() {
      this.N();
   }

   private void y(class02008 var1, CallbackInfo var2) {
      if (this.Z.equals(N)) {
         SpriteFinderCache.resetSpriteFinder();
         this.j = true;
      } else if (this.Z.equals(y)) {
         SpriteFinderCache.resetItemSpriteFinder();
         this.j = false;
      }
   }

   private boolean y(class01894 var1) {
      if (var1 != null) {
         for (Entry entry : this.v.entrySet()) {
            if (((List)entry.getValue()).contains(var1)) {
               return (Boolean)((Supplier)entry.getKey()).get();
            }
         }
      }

      return true;
   }

   private void N(CallbackInfoReturnable var1) {
      class08388 class08388 = (class08388)var1.getReturnValue();
      if (class08388 != null) {
         SpriteUtil.INSTANCE.markSpriteActive(class08388);
      }
   }

   private void N(int var1, int var2, int var3) {
      u.info("Created: {}x{}x{} {}-atlas", new Object[]{var1, var2, var3, this.Z});
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.close();
      this.field_56974 = gpudevice.createTexture(this.Z::toString, 15, TextureFormat.RGBA8, var1, var2, 1, var3 + 1);
      this.field_60597 = gpudevice.createTextureView(this.field_56974);
      this.U = var1;
      this.E = var2;
      this.W = var3;
      this.m = var3 + 1;
      this.P = new GpuTextureView[this.m];

      for (int ix = 0; ix <= this.W; ix++) {
         this.P[ix] = gpudevice.createTextureView(this.field_56974, ix, 1);
      }
   }

   public void N(class02011 var1) {
      if (var1 instanceof AnimationStateExtended animationstateextended
         && SodiumExtraClientMod.options().animationSettings.animation
         && this.y(animationstateextended.sodium_extra$getSprite().method_45851().method_45816())) {
         var1.N();
      }
   }

   public void N(class02008 var1) {
      this.N(var1.N(), var1.y(), var1.L());
      this.u();
      this.field_63613 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST);
      this.M = Map.copyOf(var1.i());
      this.B = this.M.get(class08923.L());
      if (this.B == null) {
         throw new IllegalStateException("Atlas '" + this.Z + "' (" + this.M.size() + " sprites) has no missing texture sprite");
      } else {
         ArrayList arraylist = new ArrayList();
         ArrayList arraylist1 = new ArrayList();
         int ix = (int)var1.i().values().stream().filter(class08388::method_76321).count();
         int jx = class04995.i(class01991.field_64235, RenderSystem.getDevice().getUniformOffsetAlignment());
         int k = jx * this.m;
         ByteBuffer bytebuffer = MemoryUtil.memAlloc(ix * k);
         int l = 0;

         for (class08388 var10 : var1.i().values()) {
            if (var10.method_76321()) {
               var10.method_76320(bytebuffer, l * k, this.W, this.U, this.E, jx);
               l++;
            }
         }

         GpuBuffer gpubuffer = l > 0 ? RenderSystem.getDevice().createBuffer(() -> this.Z + " sprite UBOs", 128, bytebuffer) : null;
         l = 0;

         for (class08388 class08388x : var1.i().values()) {
            arraylist.add(class08388x);
            if (class08388x.method_76321() && gpubuffer != null) {
               GpuBufferSlice gpubufferslice = gpubuffer.slice(l * k, k);
               class02011 class02011 = this.N(class08388x, gpubufferslice, jx);
               l++;
               if (class02011 != null) {
                  arraylist1.add(class02011);
               }
            }
         }

         this.s = gpubuffer;
         this.i = arraylist;
         this.R = List.copyOf(arraylist1);
         this.Z();
         if (class07529.o) {
            Path path = TextureUtil.getDebugTexturePath();

            try {
               Files.createDirectories(path);
               this.method_49712(this.Z, path);
            } catch (Exception exception) {
               u.warn("Failed to dump atlas contents to {}", path);
            }
         }

         this.N(var1, null);
         this.y(null);
         this.y(var1, null);
      }
   }

   public class02011 N(class08388 var1, GpuBufferSlice var2, int var3) {
      class02011 class02011 = var1.method_76319(var2, var3);
      class02011.sodium_extra$setSprite(var1);
      return class02011;
   }

   private void N(class02008 var1, CallbackInfo var2) {
      this.T = var1.fabric_spriteFinderNullable();
   }

   public void N() {
      if (this.field_56974 != null) {
         for (class02011 class02011 : this.R) {
            this.N(class02011);
         }

         this.z();
         this.N(null);
      }
   }

   private static void N(Path var0, String var1, Map<class01894, class08388> var2) {
      Path path = var0.resolve(var1 + ".txt");

      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(path)) {
         for (Entry entry : var2.entrySet().stream().sorted(Entry.comparingByKey()).toList()) {
            class08388 class08388 = (class08388)entry.getValue();
            bufferedwriter.write(
               String.format(
                  Locale.ROOT,
                  "%s\tx=%d\ty=%d\tw=%d\th=%d%n",
                  entry.getKey(),
                  class08388.method_35806(),
                  class08388.method_35807(),
                  class08388.method_45851().method_45807(),
                  class08388.method_45851().method_45815()
               )
            );
         }
      } catch (IOException ioexception) {
         u.warn("Failed to write file {}", path, ioexception);
      }
   }

   public class08388 N(class01894 var1) {
      class08388 class08388 = this.M.getOrDefault(var1, this.B);
      if (class08388 == null) {
         throw new IllegalStateException("Tried to lookup sprite, but atlas is not initialized");
      } else {
         this.N(new CallbackInfoReturnable("", false, class08388));
         return class08388;
      }
   }

   private void N(CallbackInfo var1) {
      if (this.b != null) {
         this.b.cycleAnimationFrames();
      }
   }

   public SpriteFinder spriteFinder() {
      Object object = this.T;
      if (object == null) {
         synchronized (this) {
            object = this.T;
            if (object == null) {
               if (this.B == null) {
                  throw new IllegalStateException("Tried to create sprite finder, but atlas is not initialized");
               }

               this.T = (SpriteFinder)(object = new SpriteFinderImpl(this.M, this.B));
            }
         }
      }

      return (SpriteFinder)object;
   }

   @Override
   public void method_49712(class01894 var1, Path var2) throws IOException {
      String sx = var1.L();
      TextureUtil.writeAsPNG(var2, sx, this.method_68004(), this.W, var0 -> var0);
      N(var2, sx, this.M);
   }

   public PBRAtlasHolder getPBRHolder() {
      return this.b;
   }

   public int R() {
      return this.z;
   }

   public PBRAtlasHolder getOrCreatePBRHolder() {
      if (this.b == null) {
         this.b = new PBRAtlasHolder();
      }

      return this.b;
   }

   public SodiumSpriteFinder sodium$getSpriteFinder() {
      return new SodiumSpriteFinderImpl(this.M, this.B, this.j ? SodiumQuadAtlas.BLOCK : SodiumQuadAtlas.ITEM);
   }
}
