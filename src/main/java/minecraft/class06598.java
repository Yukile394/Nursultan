package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.function.Supplier;
import org.joml.Matrix4f;

record class06598(Supplier<class07923> skin, boolean hat, float x, float y, int color, int shadowColor, float shadowOffset, class00405 style)
   implements class06596 {
   public Supplier<class07923> L() {
      return this.skin;
   }

   @Override
   public int M() {
      return this.color;
   }

   class06598(Supplier<class07923> skin, boolean hat, float x, float y, int color, int shadowColor, float shadowOffset, class00405 style) {
      super();
      this.skin = skin;
      this.hat = hat;
      this.x = x;
      this.y = y;
      this.color = color;
      this.shadowColor = shadowColor;
      this.shadowOffset = shadowOffset;
      this.style = style;
   }

   @Override
   public int B() {
      return this.shadowColor;
   }

   @Override
   public float Z() {
      return this.shadowOffset;
   }

   @Override
   public float i() {
      return this.x;
   }

   @Override
   public class00405 z() {
      return this.style;
   }

   public boolean u() {
      return this.hat;
   }

   @Override
   public GpuTextureView y() {
      return this.skin.get().u();
   }

   @Override
   public RenderPipeline N() {
      return this.skin.get().i().u();
   }

   @Override
   public class07311 N(class01583 var1) {
      return this.skin.get().i().N(var1);
   }

   @Override
   public void N(Matrix4f var1, class01391 var2, int var3, float var4, float var5, float var6, int var7) {
      float f = var4 + this.U();
      float f1 = var4 + this.W();
      float f2 = var5 + this.E();
      float f3 = var5 + this.m();
      N(var1, var2, var3, f, f1, f2, f3, var6, var7, 8.0F, 8.0F, 8, 8, 64, 64);
      if (this.hat) {
         N(var1, var2, var3, f, f1, f2, f3, var6, var7, 40.0F, 8.0F, 8, 8, 64, 64);
      }
   }

   private static void N(
      Matrix4f var0,
      class01391 var1,
      int var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      float var9,
      float var10,
      int var11,
      int var12,
      int var13,
      int var14
   ) {
      float f = (var9 + 0.0F) / var13;
      float f1 = (var9 + var11) / var13;
      float f2 = (var10 + 0.0F) / var14;
      float f3 = (var10 + var12) / var14;
      var1.N(var0, var3, var5, var7).method_22913(f, f2).method_39415(var8).method_60803(var2);
      var1.N(var0, var3, var6, var7).method_22913(f, f3).method_39415(var8).method_60803(var2);
      var1.N(var0, var4, var6, var7).method_22913(f1, f3).method_39415(var8).method_60803(var2);
      var1.N(var0, var4, var5, var7).method_22913(f1, f2).method_39415(var8).method_60803(var2);
   }

   @Override
   public float R() {
      return this.y;
   }
}
