package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public record class08661(
   RenderPipeline pipeline,
   class08679 textureSetup,
   Matrix3x2f pose,
   int x0,
   int y0,
   int x1,
   int y1,
   float u0,
   float u1,
   float v0,
   float v1,
   int color,
   class03255 scissorArea,
   class03255 bounds
) implements class08669 {
   public int L() {
      return this.y0;
   }

   public float M() {
      return this.u1;
   }

   public class08661(
      RenderPipeline var1,
      class08679 var2,
      Matrix3x2f var3,
      int var4,
      int var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      @Nullable class03255 var13
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, N(var4, var5, var6, var7, var3, var13));
   }

   public class08661(
      RenderPipeline pipeline,
      class08679 textureSetup,
      Matrix3x2f pose,
      int x0,
      int y0,
      int x1,
      int y1,
      float u0,
      float u1,
      float v0,
      float v1,
      int color,
      @Nullable class03255 scissorArea,
      @Nullable class03255 bounds
   ) {
      super();
      this.pipeline = pipeline;
      this.textureSetup = textureSetup;
      this.pose = pose;
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
      this.u0 = u0;
      this.u1 = u1;
      this.v0 = v0;
      this.v1 = v1;
      this.color = color;
      this.scissorArea = scissorArea;
      this.bounds = bounds;
   }

   public float B() {
      return this.v0;
   }

   public float Z() {
      return this.v1;
   }

   public int i() {
      return this.y1;
   }

   public int z() {
      return this.color;
   }

   public int u() {
      return this.x1;
   }

   public int y() {
      return this.x0;
   }

   @Nullable
   private static class03255 N(int var0, int var1, int var2, int var3, Matrix3x2f var4, @Nullable class03255 var5) {
      class03255 class03255 = new class03255(var0, var1, var2 - var0, var3 - var1).y(var4);
      return var5 != null ? var5.y(class03255) : class03255;
   }

   public Matrix3x2f N() {
      return this.pose;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.bounds;
   }

   public float R() {
      return this.u0;
   }

   @Override
   public void method_70917(class01391 var1) {
      var1.N(this.N(), this.y(), this.L()).method_22913(this.R(), this.B()).method_39415(this.z());
      var1.N(this.N(), this.y(), this.i()).method_22913(this.R(), this.Z()).method_39415(this.z());
      var1.N(this.N(), this.u(), this.i()).method_22913(this.M(), this.Z()).method_39415(this.z());
      var1.N(this.N(), this.u(), this.L()).method_22913(this.M(), this.B()).method_39415(this.z());
   }

   @Override
   public RenderPipeline comp_4055() {
      return this.pipeline;
   }

   @Override
   public class08679 comp_4056() {
      return this.textureSetup;
   }

   @Nullable
   @Override
   public class03255 comp_4069() {
      return this.scissorArea;
   }
}
