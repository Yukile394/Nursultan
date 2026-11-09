package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.system.MemoryStack;

public class class01559 implements AutoCloseable {
   private static final Vector3f y = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f L = new Vector3f(-0.2F, 1.0F, 0.7F).normalize();
   private static final Vector3f u = new Vector3f(0.2F, 1.0F, -0.7F).normalize();
   private static final Vector3f i = new Vector3f(-0.2F, -1.0F, 0.7F).normalize();
   private static final Vector3f R = new Vector3f(0.2F, -1.0F, 1.0F).normalize();
   private static final Vector3f M = new Vector3f(-0.2F, -1.0F, 0.0F).normalize();
   public static final int N = new Std140SizeCalculator().putVec3().putVec3().get();
   private final GpuBuffer B;
   private final long Z;

   public class01559() {
      super();
      GpuDevice gpudevice = RenderSystem.getDevice();
      this.Z = class04995.i(N, gpudevice.getUniformOffsetAlignment());
      this.B = gpudevice.createBuffer(() -> "Lighting UBO", 136, this.Z * class01540.values().length);
      Matrix4f matrix4f = new Matrix4f().rotationY((float) (-Math.PI / 8)).rotateX((float) (Math.PI * 3.0 / 4.0));
      this.N(class01540.field_60026, matrix4f.transformDirection(y, new Vector3f()), matrix4f.transformDirection(L, new Vector3f()));
      Matrix4f matrix4f1 = new Matrix4f()
         .scaling(1.0F, -1.0F, 1.0F)
         .rotateYXZ(1.0821041F, 3.2375858F, 0.0F)
         .rotateYXZ((float) (-Math.PI / 8), (float) (Math.PI * 3.0 / 4.0), 0.0F);
      this.N(class01540.field_60027, matrix4f1.transformDirection(y, new Vector3f()), matrix4f1.transformDirection(L, new Vector3f()));
      this.N(class01540.field_60028, R, M);
      Matrix4f matrix4f2 = new Matrix4f();
      this.N(class01540.field_60029, matrix4f2.transformDirection(R, new Vector3f()), matrix4f2.transformDirection(M, new Vector3f()));
   }

   @Override
   public void close() {
      this.B.close();
   }

   public void N(class01540 var1) {
      RenderSystem.setShaderLights(this.B.slice(var1.ordinal() * this.Z, N));
   }

   private void N(class01540 var1, Vector3f var2, Vector3f var3) {
      MemoryStack memorystack = MemoryStack.stackPush();

      try {
         ByteBuffer bytebuffer = Std140Builder.onStack(memorystack, N).putVec3(var2).putVec3(var3).get();
         RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.B.slice(var1.ordinal() * this.Z, this.Z), bytebuffer);
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
   }

   public void N(class07334 var1) {
      switch (var1) {
         case field_64380:
            this.N(class01540.field_60025, y, L);
            break;
         case field_64381:
            this.N(class01540.field_60025, u, i);
      }
   }
}
