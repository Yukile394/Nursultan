package minecraft;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import net.irisshaders.iris.mixinterface.GpuTextureInterface;
import org.jspecify.annotations.Nullable;

public class class08893 extends GpuTexture implements GpuTextureInterface {
   private static final int L = -1;
   public final int N;
   private int u = -1;
   private int i = -1;
   @Nullable
   private Int2IntMap R;
   protected boolean y;
   private int M;
   private boolean B;

   public void L() {
      this.M--;
      if (this.y && this.M == 0) {
         this.u();
      }
   }

   public class08893(int var1, String var2, TextureFormat var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.N = var8;
   }

   public void close() {
      if (!this.y) {
         this.y = true;
         if (this.M == 0) {
            this.u();
         }
      }
   }

   private void u() {
      GlStateManager._deleteTexture(this.N);
      if (this.u != -1) {
         GlStateManager._glDeleteFramebuffers(this.u);
      }

      if (this.R != null) {
         IntIterator intiterator = this.R.values().iterator();

         while (intiterator.hasNext()) {
            GlStateManager._glDeleteFramebuffers((Integer)intiterator.next());
         }
      }
   }

   public void y() {
      this.M++;
   }

   public int N() {
      return this.N;
   }

   private int N(class08882 var1, int var2) {
      int ix = var1.y();
      var1.N(ix, this.N, var2, 0, 0);
      return ix;
   }

   public int N(class08882 var1, @Nullable GpuTexture var2) {
      int ix = var2 == null ? 0 : ((class08893)var2).N;
      if (this.i == ix) {
         return this.u;
      } else if (this.u == -1) {
         this.u = this.N(var1, ix);
         this.i = ix;
         return this.u;
      } else {
         if (this.R == null) {
            this.R = new Int2IntArrayMap();
         }

         return this.R.computeIfAbsent(ix, var2x -> this.N(var1, var2x));
      }
   }

   public int iris$getGlId() {
      return this.N();
   }

   public boolean isClosed() {
      return this.y;
   }

   public void iris$markMipmapNonLinear() {
      this.B = true;
   }
}
