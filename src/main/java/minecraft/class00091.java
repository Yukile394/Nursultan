package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00091<T extends class00063> implements AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private final List<class00084> y = new ArrayList<>();
   private final int L;
   private class00084 u;
   private int i;
   private int R;
   @Nullable
   private T M;
   private final String B;

   public class00091(String var1, int var2, int var3) {
      super();
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.L = class04995.i(var2, gpudevice.getUniformOffsetAlignment());
      this.R = class04995.L(var3);
      this.i = 0;
      this.u = new class00084(() -> var1 + " x" + this.L, 130, this.L * this.R);
      this.B = var1;
   }

   @Override
   public void close() {
      Iterator iterator = this.y.iterator();

      while (iterator.hasNext()) {
         ((class00084)iterator.next()).close();
      }

      this.u.close();
   }

   public GpuBufferSlice[] N(T[] var1) {
      if (var1.length == 0) {
         return new GpuBufferSlice[0];
      } else {
         if (this.i + var1.length > this.R) {
            int ix = class04995.L(Math.max(this.R + 1, var1.length));
            N.info("Resizing {}, capacity limit of {} reached during a single frame. New capacity will be {}.", new Object[]{this.B, this.R, ix});
            this.N(ix);
         }

         int k = this.i * this.L;
         GpuBufferSlice[] agpubufferslice = new GpuBufferSlice[var1.length];
         MappedView mappedview = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.u.y().slice(k, var1.length * this.L), false, true);

         try {
            ByteBuffer bytebuffer = mappedview.data();

            for (int j = 0; j < var1.length; j++) {
               class00063 class00063 = var1[j];
               agpubufferslice[j] = this.u.y().slice(k + j * this.L, this.L);
               bytebuffer.position(j * this.L);
               class00063.N(bytebuffer);
            }
         } catch (Throwable throwable1) {
            if (mappedview != null) {
               try {
                  mappedview.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (mappedview != null) {
            mappedview.close();
         }

         this.i += var1.length;
         this.M = (T)var1[var1.length - 1];
         return agpubufferslice;
      }
   }

   private void N(int var1) {
      this.R = var1;
      this.i = 0;
      this.M = null;
      this.y.add(this.u);
      this.u = new class00084(() -> this.B + " x" + this.L, 130, this.L * this.R);
   }

   public void N() {
      this.i = 0;
      this.M = null;
      this.u.L();
      if (!this.y.isEmpty()) {
         Iterator iterator = this.y.iterator();

         while (iterator.hasNext()) {
            ((class00084)iterator.next()).close();
         }

         this.y.clear();
      }
   }

   public GpuBufferSlice N(T var1) {
      if (this.M != null && this.M.equals(var1)) {
         return this.u.y().slice((this.i - 1) * this.L, this.L);
      } else {
         if (this.i >= this.R) {
            int ix = this.R * 2;
            N.info("Resizing {}, capacity limit of {} reached during a single frame. New capacity will be {}.", new Object[]{this.B, this.R, ix});
            this.N(ix);
         }

         int j = this.i * this.L;
         MappedView mappedview = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.u.y().slice(j, this.L), false, true);

         try {
            var1.N(mappedview.data());
         } catch (Throwable throwable1) {
            if (mappedview != null) {
               try {
                  mappedview.close();
               } catch (Throwable throwable) {
                  throwable1.addSuppressed(throwable);
               }
            }

            throw throwable1;
         }

         if (mappedview != null) {
            mappedview.close();
         }

         this.i++;
         this.M = (T)var1;
         return this.u.y().slice(j, this.L);
      }
   }
}
