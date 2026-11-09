package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.stream.IntStream;
import net.irisshaders.iris.mixin.texture.SpriteContentsAnimatedTextureAccessor;

public class class02034 implements SpriteContentsAnimatedTextureAccessor {
   public final List<class02007> N;
   private final int u;
   public final boolean y;

   class02034(List<class02007> var1, int var2, boolean var3, boolean var4) {
      super();
      this.L = var1;
      this.N = var2;
      this.u = var3;
      this.y = var4;
   }

   int y(int var1) {
      return var1 / this.u;
   }

   public IntStream N() {
      return this.N.stream().mapToInt(var0 -> var0.getIndex()).distinct();
   }

   public class02011 N(GpuBufferSlice var1, int var2) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();
      GpuBufferSlice[] agpubufferslice = new GpuBufferSlice[this.L.field_40540.length];

      for (int i : this.N().toArray()) {
         GpuTexture gputexture = gpudevice.createTexture(
            () -> this.L.field_40536 + " animation frame " + i,
            5,
            TextureFormat.RGBA8,
            this.L.field_40537,
            this.L.field_40538,
            1,
            this.L.field_40540.length + 1
         );
         int j = this.N(i) * this.L.field_40537;
         int k = this.y(i) * this.L.field_40538;

         for (int l = 0; l < this.L.field_40540.length; l++) {
            RenderSystem.getDevice()
               .createCommandEncoder()
               .writeToTexture(gputexture, this.L.field_40540[l], l, 0, 0, 0, this.L.field_40537 >> l, this.L.field_40538 >> l, j >> l, k >> l);
         }

         int2objectopenhashmap.put(i, RenderSystem.getDevice().createTextureView(gputexture));
      }

      for (int i1 = 0; i1 < this.L.field_40540.length; i1++) {
         agpubufferslice[i1] = var1.slice(i1 * var2, var2);
      }

      return new class02011(this.L, this, int2objectopenhashmap, agpubufferslice);
   }

   int N(int var1) {
      return var1 % this.u;
   }
}
