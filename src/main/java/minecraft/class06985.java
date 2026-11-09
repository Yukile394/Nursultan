package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public record class06985(
   RenderPipeline pipeline,
   class08679 textureSetup,
   Matrix3x2f pose,
   int tileWidth,
   int tileHeight,
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
      return this.tileHeight;
   }

   public int M() {
      return this.y1;
   }

   public class06985(
      RenderPipeline var1,
      class08679 var2,
      Matrix3x2f var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      @Nullable class03255 var15
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, N(var6, var7, var8, var9, var3, var15));
   }

   public class06985(
      RenderPipeline pipeline,
      class08679 textureSetup,
      Matrix3x2f pose,
      int tileWidth,
      int tileHeight,
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
      this.tileWidth = tileWidth;
      this.tileHeight = tileHeight;
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
      return this.u0;
   }

   public float Z() {
      return this.u1;
   }

   public int i() {
      return this.y0;
   }

   public float U() {
      return this.v1;
   }

   public float z() {
      return this.v0;
   }

   public int u() {
      return this.x0;
   }

   public int y() {
      return this.tileWidth;
   }

   public int E() {
      return this.color;
   }

   public Matrix3x2f N() {
      return this.pose;
   }

   @Nullable
   private static class03255 N(int var0, int var1, int var2, int var3, Matrix3x2f var4, @Nullable class03255 var5) {
      class03255 class03255 = new class03255(var0, var1, var2 - var0, var3 - var1).y(var4);
      return var5 != null ? var5.y(class03255) : class03255;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.bounds;
   }

   public int R() {
      return this.x1;
   }

   @Override
   public void method_70917(class01391 var1) {
      int i = this.R() - this.u();
      int j = this.M() - this.i();

      for (int k = 0; k < i; k += this.y()) {
         int i1 = i - k;
         int l;
         float f;
         if (this.y() <= i1) {
            l = this.y();
            f = this.Z();
         } else {
            l = i1;
            f = class04995.B((float)i1 / this.y(), this.B(), this.Z());
         }

         for (int j1 = 0; j1 < j; j1 += this.L()) {
            int l1 = j - j1;
            int k1;
            float f1;
            if (this.L() <= l1) {
               k1 = this.L();
               f1 = this.U();
            } else {
               k1 = l1;
               f1 = class04995.B((float)l1 / this.L(), this.z(), this.U());
            }

            int i2 = this.u() + k;
            int j2 = this.u() + k + l;
            int k2 = this.i() + j1;
            int l2 = this.i() + j1 + k1;
            var1.N(this.N(), i2, k2).method_22913(this.B(), this.z()).method_39415(this.E());
            var1.N(this.N(), i2, l2).method_22913(this.B(), f1).method_39415(this.E());
            var1.N(this.N(), j2, l2).method_22913(f, f1).method_39415(this.E());
            var1.N(this.N(), j2, k2).method_22913(f, this.z()).method_39415(this.E());
         }
      }
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
