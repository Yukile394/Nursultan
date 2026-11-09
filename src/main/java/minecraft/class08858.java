package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderPass.RenderObject;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.mixinterface.RenderPassInterface;
import org.jspecify.annotations.Nullable;

public class class08858 implements RenderPass, RenderPassInterface {
   protected static final int N = 1;
   public static final boolean y;
   private final class08495 U;
   private final boolean E;
   private boolean W;
   @Nullable
   public class08870 L;
   protected final GpuBuffer[] u = new GpuBuffer[1];
   @Nullable
   protected GpuBuffer i;
   protected IndexType R = IndexType.INT;
   private final class08681 m = new class08681();
   protected final HashMap<String, GpuBufferSlice> M = new HashMap<>();
   public final HashMap<String, class08849> B = new HashMap<>();
   protected final Set<String> Z = new HashSet<>();
   protected int z;
   private CustomPass P;

   public int L() {
      return this.m.L();
   }

   public class08858(class08495 var1, boolean var2) {
      super();
      this.U = var1;
      this.E = var2;
   }

   public int i() {
      return this.m.i();
   }

   public void close() {
      if (!this.W) {
         if (this.z > 0) {
            throw new IllegalStateException("Render pass had debug groups left open!");
         }

         this.W = true;
         this.U.N();
      }
   }

   public int u() {
      return this.m.u();
   }

   public boolean y() {
      return this.m.y();
   }

   public boolean N() {
      return this.E;
   }

   public void setUniform(String var1, GpuBuffer var2) {
      this.M.put(var1, var2.slice());
      this.Z.add(var1);
   }

   public void setUniform(String var1, GpuBufferSlice var2) {
      int ix = this.U.y().getUniformOffsetAlignment();
      if (var2.offset() % ix > 0L) {
         throw new IllegalArgumentException("Uniform buffer offset must be aligned to " + ix);
      } else {
         this.M.put(var1, var2);
         this.Z.add(var1);
      }
   }

   public void setPipeline(RenderPipeline var1) {
      if (this.L == null || this.L.N() != var1) {
         this.Z.addAll(this.M.keySet());
         this.Z.addAll(this.B.keySet());
      }

      this.L = this.U.y().N(var1);
   }

   public void setIndexBuffer(@Nullable GpuBuffer var1, IndexType var2) {
      this.i = var1;
      this.R = var2;
   }

   public void bindTexture(String var1, @Nullable GpuTextureView var2, @Nullable class08188 var3) {
      if (var3 == null) {
         this.B.remove(var1);
      } else {
         this.B.put(var1, new class08849((class09006)var2, (class08193)var3));
      }

      this.Z.add(var1);
   }

   public void drawIndexed(int var1, int var2, int var3, int var4) {
      if (this.W) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.U.N(this, var1, var2, var3, this.R, var4);
      }
   }

   public void setVertexBuffer(int var1, GpuBuffer var2) {
      if (var1 >= 0 && var1 < 1) {
         this.u[var1] = var2;
      } else {
         throw new IllegalArgumentException("Vertex buffer slot is out of range: " + var1);
      }
   }

   public void enableScissor(int var1, int var2, int var3, int var4) {
      this.m.N(var1, var2, var3, var4);
   }

   public int R() {
      return this.m.R();
   }

   public void disableScissor() {
      this.m.N();
   }

   public void iris$setCustomPass(CustomPass var1) {
      this.P = var1;
   }

   public void popDebugGroup() {
      if (this.W) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else if (this.z == 0) {
         throw new IllegalStateException("Can't pop more debug groups than was pushed!");
      } else {
         this.z--;
         this.U.y().N().N();
      }
   }

   public void pushDebugGroup(Supplier<String> var1) {
      if (this.W) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.z++;
         this.U.y().N().N(var1);
      }
   }

   public CustomPass iris$getCustomPass() {
      return this.P;
   }

   public void draw(int var1, int var2) {
      if (this.W) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.U.N(this, var1, 0, var2, null, 1);
      }
   }

   public <T> void drawMultipleIndexed(Collection<RenderObject<T>> var1, @Nullable GpuBuffer var2, @Nullable IndexType var3, Collection<String> var4, T var5) {
      if (this.W) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.U.N(this, var1, var2, var3, var4, var5);
      }
   }
}
