package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01390 implements class01391, VertexBufferWriter {
   private final class01391 N;
   private final Matrix4f y;
   private final Matrix3f L;
   private final float u;
   private final Vector3f i = new Vector3f();
   private final Vector3f R = new Vector3f();
   private float M;
   private float B;
   private float Z;
   private boolean z;

   public class01390(class01391 var1, class01423 var2, float var3) {
      super();
      this.N = var1;
      this.y = new Matrix4f(var2.N()).invert();
      this.L = new Matrix3f(var2.y()).invert();
      this.u = var3;
      this.N(null);
   }

   public void push(MemoryStack var1, long var2, int var4, VertexFormat var5) {
      N(var2, var4, var5, this.L, this.y, this.u);
      VertexBufferWriter.of(this.N).push(var1, var2, var4, var5);
   }

   private static void N(long var0, int var2, VertexFormat var3, Matrix3f var4, Matrix4f var5, float var6) {
      long ix = var3.getVertexSize();
      int j = var3.getOffset(VertexFormatElement.POSITION);
      int k = var3.getOffset(VertexFormatElement.COLOR);
      int l = var3.getOffset(VertexFormatElement.NORMAL);
      int i1 = var3.getOffset(VertexFormatElement.UV0);
      int j1 = ColorABGR.pack(1.0F, 1.0F, 1.0F, 1.0F);
      Vector3f vector3f = new Vector3f(Float.NaN);
      Vector4f vector4f = new Vector4f(Float.NaN);

      for (int k1 = 0; k1 < var2; k1++) {
         vector4f.x = MemoryUtil.memGetFloat(var0 + j + 0L);
         vector4f.y = MemoryUtil.memGetFloat(var0 + j + 4L);
         vector4f.z = MemoryUtil.memGetFloat(var0 + j + 8L);
         vector4f.w = 1.0F;
         int l1 = MemoryUtil.memGetInt(var0 + l);
         vector3f.x = NormI8.unpackX(l1);
         vector3f.y = NormI8.unpackY(l1);
         vector3f.z = NormI8.unpackZ(l1);
         Vector3f vector3f1 = var4.transform(vector3f);
         class07211 class07211 = class07211.N(vector3f1.x(), vector3f1.y(), vector3f1.z());
         Vector4f vector4f1 = var5.transform(vector4f);
         vector4f1.rotateY((float) Math.PI);
         vector4f1.rotateX((float) (-Math.PI / 2));
         vector4f1.rotate(class07211.y());
         float f = -vector4f1.x() * var6;
         float f1 = -vector4f1.y() * var6;
         ColorAttribute.set(var0 + k, j1);
         TextureAttribute.put(var0 + i1, f, f1);
         var0 += ix;
      }
   }

   private void N(CallbackInfo var1) {
      this.z = VertexBufferWriter.tryOf(this.N) != null;
   }

   @Override
   public class01391 method_1336(int var1, int var2, int var3, int var4) {
      this.N.method_39415(-1);
      return this;
   }

   @Override
   public class01391 method_22913(float var1, float var2) {
      return this;
   }

   public boolean canUseIntrinsics() {
      return this.z;
   }

   @Override
   public class01391 method_22912(float var1, float var2, float var3) {
      this.M = var1;
      this.B = var2;
      this.Z = var3;
      this.N.method_22912(var1, var2, var3);
      return this;
   }

   @Override
   public class01391 method_39415(int var1) {
      this.N.method_39415(-1);
      return this;
   }

   @Override
   public class01391 method_22914(float var1, float var2, float var3) {
      this.N.method_22914(var1, var2, var3);
      Vector3f vector3f = this.L.transform(var1, var2, var3, this.R);
      class07211 class07211 = class07211.N(vector3f.x(), vector3f.y(), vector3f.z());
      Vector3f vector3f1 = this.y.transformPosition(this.M, this.B, this.Z, this.i);
      vector3f1.rotateY((float) Math.PI);
      vector3f1.rotateX((float) (-Math.PI / 2));
      vector3f1.rotate(class07211.y());
      this.N.method_22913(-vector3f1.x() * this.u, -vector3f1.y() * this.u);
      return this;
   }

   @Override
   public class01391 method_60796(int var1, int var2) {
      this.N.method_60796(var1, var2);
      return this;
   }

   @Override
   public class01391 method_22921(int var1, int var2) {
      this.N.method_22921(var1, var2);
      return this;
   }

   @Override
   public class01391 method_75298(float var1) {
      this.N.method_75298(var1);
      return this;
   }
}
