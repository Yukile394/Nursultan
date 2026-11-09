package minecraft;

import Nursultan.class09110;
import Nursultan.class09112;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class00049 implements AutoCloseable {
   public static final int N = new Std140SizeCalculator().putMat4f().putVec4().putVec3().putMat4f().get();
   public static final int y = new Std140SizeCalculator().putMat4f().putFloat().putIVec2().putIVec3().get();
   private static final int L = 2;
   private final class00091<class09110> u = new class00091<>("Dynamic Transforms UBO", N, 2);
   private final class00091<class09112> i = new class00091<>("Chunk Sections UBO", y, 2);

   public class00049() {
      super();
   }

   @Override
   public void close() {
      this.u.close();
      this.i.close();
   }

   public GpuBufferSlice N(Matrix4fc var1, Vector4fc var2, Vector3fc var3, Matrix4fc var4) {
      return this.u.N(new class09110(new Matrix4f(var1), new Vector4f(var2), new Vector3f(var3), new Matrix4f(var4)));
   }

   public GpuBufferSlice[] N(class09112... var1) {
      return this.i.N(var1);
   }

   public GpuBufferSlice[] N(class09110... var1) {
      return this.u.N(var1);
   }

   public void N() {
      this.u.N();
      this.i.N();
   }
}
