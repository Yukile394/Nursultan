package minecraft;

import com.mojang.jtracy.MemoryPool;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import net.irisshaders.iris.vertices.MojangBufferAccessor;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.MemoryUtil.MemoryAllocator;
import org.slf4j.Logger;

public class class02579 implements AutoCloseable, MojangBufferAccessor {
   private static final MemoryPool y = TracyClient.createMemoryPool("ByteBufferBuilder");
   private static final Logger L = LogUtils.getLogger();
   private static final MemoryAllocator u = MemoryUtil.getAllocator(false);
   private static final long i = 4294967295L;
   private static final int R = 2097152;
   private static final int M = -1;
   long N;
   private long B;
   private final long Z;
   private long z;
   private long U;
   private int E;
   private int W;

   public void L() {
      this.R();
      if (this.E > 0) {
         this.i();
         this.E = 0;
      }
   }

   boolean L(int var1) {
      return var1 == this.W;
   }

   public class02579(int var1, long var2) {
      super();
      this.B = var1;
      this.Z = var2;
      this.N = u.malloc(var1);
      y.malloc(this.N, var1);
      if (this.N == 0L) {
         throw new OutOfMemoryError("Failed to allocate " + var1 + " bytes");
      }
   }

   public class02579(int var1) {
      this(var1, 4294967295L);
   }

   private void i() {
      long ix = this.z - this.U;
      if (ix > 0L) {
         MemoryUtil.memCopy(this.N + this.U, this.N, ix);
      }

      this.z = ix;
      this.U = 0L;
      this.W++;
   }

   @Override
   public void close() {
      if (this.N != 0L) {
         y.free(this.N);
         u.free(this.N);
         this.N = 0L;
         this.W = -1;
      }
   }

   void u() {
      if (--this.E <= 0) {
         this.i();
      }
   }

   public long y(int var1) {
      long ix = this.z;
      long j = Math.addExact(ix, (long)var1);
      this.N(j);
      this.z = j;
      return Math.addExact(this.N, ix);
   }

   private void y(long var1) {
      y.free(this.N);
      this.N = u.realloc(this.N, var1);
      y.malloc(this.N, (int)Math.min(var1, 2147483647L));
      L.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", this.B, var1);
      if (this.N == 0L) {
         throw new OutOfMemoryError("Failed to resize buffer from " + this.B + " bytes to " + var1 + " bytes");
      } else {
         this.B = var1;
      }
   }

   public void y() {
      if (this.E > 0) {
         L.warn("Clearing BufferBuilder with unused batches");
      }

      this.L();
   }

   public static class02579 N(int var0) {
      return new class02579(var0, var0);
   }

   private void N(long var1) {
      if (var1 > this.B) {
         if (var1 > this.Z) {
            throw new IllegalArgumentException("Maximum capacity of ByteBufferBuilder (" + this.Z + ") exceeded, required " + var1);
         }

         long ix = Math.min(this.B, 2097152L);
         long j = class04995.N(this.B + ix, var1, this.Z);
         this.y(j);
      }
   }

   public class02613 N() {
      this.R();
      long ix = this.U;
      long j = this.z - ix;
      if (j == 0L) {
         return null;
      } else if (j > 2147483647L) {
         throw new IllegalStateException("Cannot build buffer larger than 2147483647 bytes (was " + j + ")");
      } else {
         this.U = this.z;
         this.E++;
         return new class02613(this, ix, (int)j, this.W);
      }
   }

   private void R() {
      if (this.N == 0L) {
         throw new IllegalStateException("Buffer has been freed");
      }
   }

   public long getPointer() {
      return this.N;
   }
}
