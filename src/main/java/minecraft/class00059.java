package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryStack;

public class class00059 implements AutoCloseable {
   public static final int N = new Std140SizeCalculator().putIVec3().putVec3().putVec2().putFloat().putFloat().putInt().putInt().get();
   private final GpuBuffer y = RenderSystem.getDevice().createBuffer(() -> "Global Settings UBO", 136, N);

   public class00059() {
      super();
   }

   @Override
   public void close() {
      this.y.close();
   }

   public void N(int var1, int var2, double var3, long var5, class02233 var7, int var8, class05363 var9, boolean var10) {
      class06889 class06889 = var9.y();
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         int i = class04995.N(class06889.M);
         int j = class04995.N(class06889.B);
         int k = class04995.N(class06889.Z);
         ByteBuffer bytebuffer = Std140Builder.onStack(memorystack, N)
            .putIVec3(i, j, k)
            .putVec3((float)(i - class06889.M), (float)(j - class06889.B), (float)(k - class06889.Z))
            .putVec2(var1, var2)
            .putFloat((float)var3)
            .putFloat(((float)(var5 % 24000L) + var7.N(false)) / 24000.0F)
            .putInt(var8)
            .putInt(var10 ? 1 : 0)
            .get();
         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.y.slice(), bytebuffer);
      } catch (Throwable throwable1) {
         if (memorystack != null) {
            try {
               memorystack.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }
         }

         throw throwable1;
      }

      if (memorystack != null) {
         memorystack.close();
      }

      RenderSystem.setGlobalSettingsUniform(this.y);
   }
}
