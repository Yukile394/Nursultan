package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public record class08656(
   RenderPipeline pipeline,
   class08679 textureSetup,
   Matrix3x2fc pose,
   int x0,
   int y0,
   int x1,
   int y1,
   int col1,
   int col2,
   class03255 scissorArea,
   class03255 bounds
) implements class08669 {
   public int L() {
      return this.y0;
   }

   public int M() {
      return this.col2;
   }

   public class08656(
      RenderPipeline var1, class08679 var2, Matrix3x2fc var3, int var4, int var5, int var6, int var7, int var8, int var9, @Nullable class03255 var10
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, N(var4, var5, var6, var7, var3, var10));
   }

   public class08656(
      RenderPipeline pipeline,
      class08679 textureSetup,
      Matrix3x2fc pose,
      int x0,
      int y0,
      int x1,
      int y1,
      int col1,
      int col2,
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
      this.col1 = col1;
      this.col2 = col2;
      this.scissorArea = scissorArea;
      this.bounds = bounds;
   }

   public int i() {
      return this.y1;
   }

   public int u() {
      return this.x1;
   }

   public int y() {
      return this.x0;
   }

   public Matrix3x2fc N() {
      return this.pose;
   }

   @Nullable
   private static class03255 N(int var0, int var1, int var2, int var3, Matrix3x2fc var4, @Nullable class03255 var5) {
      class03255 class03255 = new class03255(var0, var1, var2 - var0, var3 - var1).y(var4);
      return var5 != null ? var5.y(class03255) : class03255;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.bounds;
   }

   public int R() {
      return this.col1;
   }

   @Override
   public void method_70917(class01391 var1) {
      var1.N(this.N(), this.y(), this.L()).method_39415(this.R());
      var1.N(this.N(), this.y(), this.i()).method_39415(this.M());
      var1.N(this.N(), this.u(), this.i()).method_39415(this.M());
      var1.N(this.N(), this.u(), this.L()).method_39415(this.R());
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
