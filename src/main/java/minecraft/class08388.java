package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.TextureAtlasSpriteExtension;
import net.irisshaders.iris.mixin.texture.TextureAtlasSpriteAccessor;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08388 implements AutoCloseable, TextureAtlasSpriteExtension, TextureAtlasSpriteAccessor {
   private final class01894 field_40552;
   private final class01991 field_40553;
   private final int field_5258;
   private final int field_5256;
   private final float field_5270;
   private final float field_5269;
   private final float field_5268;
   private final float field_5267;
   private final int field_64248;
   private boolean hasUnknownImageContents;

   public class08388(class01894 var1, class01991 var2, int var3, int var4, int var5, int var6, int var7) {
      super();
      this.field_40552 = var1;
      this.field_40553 = var2;
      this.field_64248 = var7;
      this.field_5258 = var5;
      this.field_5256 = var6;
      this.field_5270 = (float)(var5 + var7) / var3;
      this.field_5269 = (float)(var5 + var7 + var2.method_45807()) / var3;
      this.field_5268 = (float)(var6 + var7) / var4;
      this.field_5267 = (float)(var6 + var7 + var2.method_45815()) / var4;
   }

   @Override
   public String toString() {
      return "TextureAtlasSprite{contents='"
         + this.field_40553
         + "', u0="
         + this.field_5270
         + ", u1="
         + this.field_5269
         + ", v0="
         + this.field_5268
         + ", v1="
         + this.field_5267
         + "}";
   }

   @Override
   public void close() {
      this.field_40553.close();
   }

   public float method_4580(float var1) {
      float f = this.field_5269 - this.field_5270;
      return this.field_5270 + f * var1;
   }

   public float method_4570(float var1) {
      float f = this.field_5267 - this.field_5268;
      return this.field_5268 + f * var1;
   }

   public float method_4594() {
      return this.field_5270;
   }

   public float method_4575() {
      return this.field_5267;
   }

   public float method_4593() {
      return this.field_5268;
   }

   public float method_4577() {
      return this.field_5269;
   }

   private class02011 wrapOperation$cmn000$sodium$hookTickerInstantiation(class01991 var1, GpuBufferSlice var2, int var3, Operation var4) {
      class02011 class02011 = (class02011)var4.call(new Object[]{var1, var2, var3});
      if (class02011 != null && !class02011.class.equals(class02011.getClass())) {
         this.hasUnknownImageContents = true;
      }

      return class02011;
   }

   public class01894 method_45852() {
      return this.field_40552;
   }

   public class01991 method_45851() {
      return this.field_40553;
   }

   public int method_35806() {
      return this.field_5258;
   }

   public boolean method_76321() {
      return this.field_40553.method_73020();
   }

   public void method_76320(ByteBuffer var1, int var2, int var3, int var4, int var5, int var6) {
      for (int i = 0; i <= var3; i++) {
         Std140Builder.intoBuffer(MemoryUtil.memSlice(var1, var2 + i * var6, var6))
            .putMat4f(new Matrix4f().ortho2D(0.0F, var4 >> i, 0.0F, var5 >> i))
            .putMat4f(
               new Matrix4f()
                  .translate(this.field_5258 >> i, this.field_5256 >> i, 0.0F)
                  .scale(this.field_40553.method_45807() + this.field_64248 * 2 >> i, this.field_40553.method_45815() + this.field_64248 * 2 >> i, 1.0F)
            )
            .putFloat((float)this.field_64248 / this.field_40553.method_45807())
            .putFloat((float)this.field_64248 / this.field_40553.method_45815())
            .putInt(i);
      }
   }

   public int method_35807() {
      return this.field_5256;
   }

   public void method_4584(GpuTexture var1, int var2) {
      this.field_40553.method_45809(var1, var2);
   }

   public class02011 method_76319(GpuBufferSlice var1, int var2) {
      class01991 class01991 = this.field_40553;
      return this.wrapOperation$cmn000$sodium$hookTickerInstantiation(class01991, var1, var2, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_7764, com.mojang.blaze3d.buffers.GpuBufferSlice, int]");
         return ((class01991)var0[0]).method_45818((GpuBufferSlice)var0[1], (Integer)var0[2]);
      });
   }

   public class01391 method_24108(class01391 var1) {
      this.handler$cmk000$sodium$markSpriteAsActive(null);
      return new class05899(var1, this);
   }

   public boolean sodium$hasUnknownImageContents() {
      return this.hasUnknownImageContents;
   }

   private void handler$cmk000$sodium$markSpriteAsActive(CallbackInfoReturnable var1) {
      SpriteUtil.INSTANCE.markSpriteActive(this);
   }
}
