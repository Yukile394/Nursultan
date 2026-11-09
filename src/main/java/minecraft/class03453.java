package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import org.jspecify.annotations.Nullable;

public class class03453 extends class08066 {
   public static final int Z = 854;
   public static final int z = 480;
   static final class03433 U = new class03433(854, 480);

   private void L(int var1, int var2) {
      class03433 class03433 = this.u(var1, var2);
      if (this.i != null && this.M != null) {
         this.N = class03433.N;
         this.y = class03433.y;
      } else {
         throw new IllegalStateException("Missing color and/or depth textures");
      }
   }

   public class03453(int var1, int var2) {
      super("Main", true);
      this.L(var1, var2);
   }

   private class03433 u(int var1, int var2) {
      RenderSystem.assertOnRenderThread();

      for (class03433 class03433 : class03433.N(var1, var2)) {
         if (this.i != null) {
            this.i.close();
            this.i = null;
         }

         if (this.R != null) {
            this.R.close();
            this.R = null;
         }

         if (this.M != null) {
            this.M.close();
            this.M = null;
         }

         if (this.B != null) {
            this.B.close();
            this.B = null;
         }

         this.i = this.N(class03433);
         this.M = this.y(class03433);
         if (this.i != null && this.M != null) {
            this.R = RenderSystem.getDevice().createTextureView(this.i);
            this.B = RenderSystem.getDevice().createTextureView(this.M);
            return class03433;
         }
      }

      throw new RuntimeException(
         "Unrecoverable GL_OUT_OF_MEMORY ("
            + (this.i == null ? "missing color" : "have color")
            + ", "
            + (this.M == null ? "missing depth" : "have depth")
            + ")"
      );
   }

   @Nullable
   private GpuTexture y(class03433 var1) {
      try {
         return RenderSystem.getDevice().createTexture(() -> this.L + " / Depth", 15, TextureFormat.DEPTH32, var1.N, var1.y, 1, 1);
      } catch (class08391 class08391) {
         return null;
      }
   }

   @Nullable
   private GpuTexture N(class03433 var1) {
      try {
         return RenderSystem.getDevice().createTexture(() -> this.L + " / Color", 15, TextureFormat.RGBA8, var1.N, var1.y, 1, 1);
      } catch (class08391 class08391) {
         return null;
      }
   }
}
