package minecraft;

import Nursultan.class10082;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.SpriteContentsExtension;
import net.caffeinemc.mods.sodium.client.util.NativeImageHelper;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.texture.SpriteContentsAccessor;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator.Provider;
import net.irisshaders.iris.pbr.texture.PBRSpriteHolder;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01991
   implements class08387,
   AutoCloseable,
   SpriteContentsExtension,
   net.caffeinemc.mods.sodium.client.render.texture.SpriteContentsExtension,
   SpriteContentsAccessor,
   net.irisshaders.iris.pbr.SpriteContentsExtension,
   net.irisshaders.iris.pbr.texture.SpriteContentsExtension {
   private static final Logger field_40535 = LogUtils.getLogger();
   public static final int field_64235 = new Std140SizeCalculator().putMat4f().putMat4f().putFloat().putFloat().putInt().get();
   final class01894 field_40536;
   final int field_40537;
   final int field_40538;
   private class08280 field_40539;
   class08280[] field_40540;
   private final class02034 field_40541;
   private final List<class10082<?>> field_61860;
   private final class06846 field_64084;
   private final float field_64677;
   private PBRSpriteHolder pbrHolder;
   private boolean active;
   public boolean sodium$hasTransparentPixels = false;
   public boolean sodium$hasTranslucentPixels = false;

   public class02011 method_45818(GpuBufferSlice var1, int var2) {
      return this.field_40541 != null ? this.field_40541.N(var1, var2) : null;
   }

   public void method_45809(GpuTexture var1, int var2) {
      RenderSystem.getDevice()
         .createCommandEncoder()
         .writeToTexture(var1, this.field_40540[var2], var2, 0, 0, 0, this.field_40537 >> var2, this.field_40538 >> var2, 0, 0);
   }

   public class01991(class01894 var1, class02002 var2, class08280 var3) {
      this(var1, var2, var3, Optional.empty(), List.of(), Optional.empty());
   }

   public class01991(class01894 var1, class02002 var2, class08280 var3, Optional<class08393> var4, List<class10082<?>> var5, Optional<class08500> var6) {
      super();
      this.field_40536 = var1;
      this.field_40537 = var2.N();
      this.field_40538 = var2.y();
      this.field_61860 = var5;
      this.field_40541 = var4.<class02034>map(var3x -> this.method_45812(var2, var3.N(), var3.y(), var3x)).orElse(null);
      this.wrapOperation$cmm000$sodium$beforeGenerateMipLevels(this, var3, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_7764, net.minecraft.class_1011]");
         ((class01991)var0[0]).field_40539 = (class08280)var0[1];
         return (Void)null;
      });
      this.field_40540 = new class08280[]{this.field_40539};
      this.field_64084 = var6.map(class08500::L).orElse(class06846.field_64076);
      this.field_64677 = var6.map(class08500::u).orElse(0.0F);
   }

   @Override
   public String toString() {
      return "SpriteContents{name="
         + this.field_40536
         + ", frameCount="
         + this.method_45819()
         + ", height="
         + this.field_40538
         + ", width="
         + this.field_40537
         + "}";
   }

   @Override
   public void close() {
      class08280[] aclass08280 = this.field_40540;
      int i = aclass08280.length;

      for (int j = 0; j < i; j++) {
         aclass08280[j].close();
      }

      this.handler$bhj001$iris$onTailClose(null);
   }

   public <T> Optional<T> method_73021(class02968<T> var1) {
      Iterator iterator = this.field_61860.iterator();

      while (iterator.hasNext()) {
         Optional optional = ((class10082)iterator.next()).N(var1);
         if (optional.isPresent()) {
            return optional;
         }
      }

      return Optional.empty();
   }

   private void wrapOperation$cmm000$sodium$beforeGenerateMipLevels(class01991 var1, class08280 var2, Operation var3) {
      this.scanSpriteContents(var2);
      var3.call(new Object[]{var1, var2});
   }

   public boolean method_73020() {
      return this.method_45819() > 1;
   }

   @Override
   public int method_45807() {
      return this.field_40537;
   }

   @Override
   public int method_45815() {
      return this.field_40538;
   }

   @Override
   public class01894 method_45816() {
      return this.field_40536;
   }

   public PBRSpriteHolder getPBRHolder() {
      return this.pbrHolder;
   }

   private class08280[] redirect$bhf000$iris$redirectMipmapGeneration(class01894 var1, class08280[] var2, int var3, class06846 var4, float var5) {
      if (this instanceof Provider) {
         CustomMipmapGenerator custommipmapgenerator = ((Provider)this).getMipmapGenerator();
         if (custommipmapgenerator != null) {
            try {
               return custommipmapgenerator.generateMipLevels(var2, var3);
            } catch (Exception exception) {
               Iris.logger.error("ERROR MIPMAPPING", exception);
            }
         }
      }

      return class05929.N(var1, var2, var3, var4, var5);
   }

   private void handler$bhj000$iris$onTailMarkActive(CallbackInfo var1) {
      PBRSpriteHolder pbrspriteholder = this.getPBRHolder();
      if (pbrspriteholder != null) {
         class08388 class08388x = pbrspriteholder.getNormalSprite();
         class08388 class08388x = pbrspriteholder.getSpecularSprite();
         if (class08388x != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class08388x);
         }

         if (class08388x != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class08388x);
         }
      }
   }

   public boolean sodium$hasTransparentPixels() {
      return this.sodium$hasTransparentPixels;
   }

   public boolean sodium$hasTranslucentPixels() {
      return this.sodium$hasTranslucentPixels;
   }

   private void handler$bhj001$iris$onTailClose(CallbackInfo var1) {
      if (this.pbrHolder != null) {
         this.pbrHolder.close();
      }
   }

   public void method_45808(int var1) {
      try {
         float f = this.field_64677;
         class06846 class06846 = this.field_64084;
         class08280[] aclass08280 = this.field_40540;
         class01894 class01894 = this.field_40536;
         this.field_40540 = this.redirect$bhf000$iris$redirectMipmapGeneration(class01894, aclass08280, var1, class06846, f);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Generating mipmaps for frame");
         class07074 class07074 = class07080.N("Frame being iterated");
         class07074.N("Sprite name", this.field_40536);
         class07074.N("Sprite size", () -> this.field_40537 + " x " + this.field_40538);
         class07074.N("Sprite frames", () -> this.method_45819() + " frames");
         class07074.N("Mipmap levels", var1);
         class07074.N("Original image size", () -> this.field_40539.N() + "x" + this.field_40539.y());
         throw new class07878(class07080);
      }
   }

   public boolean method_45810(int var1, int var2, int var3) {
      int i = var2;
      int j = var3;
      if (this.field_40541 != null) {
         i = var2 + this.field_40541.N(var1) * this.field_40537;
         j = var3 + this.field_40541.y(var1) * this.field_40538;
      }

      return class02566.y(this.field_40539.N(i, j)) == 0;
   }

   private int method_45819() {
      return this.field_40541 != null ? this.field_40541.N.size() : 1;
   }

   private void scanSpriteContents(class08280 var1) {
      long i = NativeImageHelper.getPointerRGBA(var1);
      int j = var1.y() * var1.N();

      for (int k = 0; k < j; k++) {
         int l = ColorABGR.unpackAlpha(MemoryUtil.memGetInt(i + k * 4L));
         if (l <= 25) {
            this.sodium$hasTransparentPixels = true;
         } else if (l < 255) {
            this.sodium$hasTranslucentPixels = true;
         }
      }

      this.sodium$hasTransparentPixels = this.sodium$hasTransparentPixels | this.sodium$hasTranslucentPixels;
   }

   public IntStream method_45817() {
      return this.field_40541 != null ? this.field_40541.N() : IntStream.of(1);
   }

   private class02034 method_45812(class02002 var1, int var2, int var3, class08393 var4) {
      int i = var2 / var1.N();
      int j = var3 / var1.y();
      int k = i * j;
      int l = var4.u();
      ArrayList arraylist;
      if (var4.N().isEmpty()) {
         arraylist = new ArrayList(k);

         for (int i1 = 0; i1 < k; i1++) {
            arraylist.add(new class02007(i1, l));
         }
      } else {
         List list = var4.N().get();
         arraylist = new ArrayList(list.size());

         for (class08421 class08421 : list) {
            arraylist.add(new class02007(class08421.N(), class08421.N(l)));
         }

         int j1 = 0;
         IntOpenHashSet intopenhashset = new IntOpenHashSet();

         for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); j1++) {
            class02007 class02007 = (class02007)iterator.next();
            boolean flag = true;
            if (class02007.y() <= 0) {
               field_40535.warn("Invalid frame duration on sprite {} frame {}: {}", new Object[]{this.field_40536, j1, class02007.y()});
               flag = false;
            }

            if (class02007.getIndex() < 0 || class02007.getIndex() >= k) {
               field_40535.warn("Invalid frame index on sprite {} frame {}: {}", new Object[]{this.field_40536, j1, class02007.getIndex()});
               flag = false;
            }

            if (flag) {
               intopenhashset.add(class02007.getIndex());
            } else {
               iterator.remove();
            }
         }

         int[] aint = IntStream.range(0, k).filter(var1x -> !intopenhashset.contains(var1x)).toArray();
         if (aint.length > 0) {
            field_40535.warn("Unused frames in sprite {}: {}", this.field_40536, Arrays.toString(aint));
         }
      }

      return arraylist.size() <= 1 ? null : new class02034(this, (int)List.copyOf(arraylist), (boolean)i, var4.i());
   }

   public boolean sodium$hasAnimation() {
      return this.field_40541 != null;
   }

   public PBRSpriteHolder getOrCreatePBRHolder() {
      if (this.pbrHolder == null) {
         this.pbrHolder = new PBRSpriteHolder();
      }

      return this.pbrHolder;
   }

   public boolean sodium$isActive() {
      return this.active;
   }

   public void sodium$setActive(boolean var1) {
      this.active = var1;
      this.handler$bhj000$iris$onTailMarkActive(null);
   }
}
