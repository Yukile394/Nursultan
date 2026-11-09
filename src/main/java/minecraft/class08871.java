package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import org.jspecify.annotations.Nullable;

public final class class08871 implements AutoCloseable {
   private GpuBuffer N;
   @Nullable
   private GpuBuffer y;
   private int L;
   private IndexType u;

   public int L() {
      return this.L;
   }

   public class08871(GpuBuffer var1, @Nullable GpuBuffer var2, int var3, IndexType var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public void close() {
      this.N.close();
      if (this.y != null) {
         this.y.close();
      }
   }

   public IndexType u() {
      return this.u;
   }

   public void y(GpuBuffer var1) {
      this.N = var1;
   }

   @Nullable
   public GpuBuffer y() {
      return this.y;
   }

   public void N_21(int var1) {
      this.L = var1;
   }

   public void N_89(@Nullable GpuBuffer var1) {
      this.y = var1;
   }

   public void N(IndexType var1) {
      this.u = var1;
   }

   public GpuBuffer N() {
      return this.N;
   }
}
