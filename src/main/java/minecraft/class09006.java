package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import org.jspecify.annotations.Nullable;

public class class09006 extends GpuTextureView {
   private static final int N = -1;
   private boolean y;
   private int L = -1;
   private int u = -1;
   @Nullable
   private Int2IntMap i;

   public class09006(class08893 var1, int var2, int var3) {
      super(var1, var2, var3);
      var1.y();
   }

   public void close() {
      if (!this.y) {
         this.y = true;
         this.texture().L();
         if (this.L != -1) {
            GlStateManager._glDeleteFramebuffers(this.L);
         }

         if (this.i != null) {
            IntIterator intiterator = this.i.values().iterator();

            while (intiterator.hasNext()) {
               GlStateManager._glDeleteFramebuffers((Integer)intiterator.next());
            }
         }
      }
   }

   private int N(class08882 var1, int var2) {
      int ix = var1.y();
      var1.N(ix, this.texture().N, var2, this.baseMipLevel(), 0);
      return ix;
   }

   public int N(class08882 var1, @Nullable GpuTexture var2) {
      int ix = var2 == null ? 0 : ((class08893)var2).N;
      if (this.u == ix) {
         return this.L;
      } else if (this.L == -1) {
         this.L = this.N(var1, ix);
         this.u = ix;
         return this.L;
      } else {
         if (this.i == null) {
            this.i = new Int2IntArrayMap();
         }

         return this.i.computeIfAbsent(ix, var2x -> this.N(var1, var2x));
      }
   }

   public boolean isClosed() {
      return this.y;
   }
}
