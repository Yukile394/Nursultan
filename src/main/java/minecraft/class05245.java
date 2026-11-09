package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import org.joml.Matrix4f;

public record class05245(class05272 glyph, float x0, float y0, float x1, float y1, float depth, int color, int shadowColor, float shadowOffset)
   implements class00941 {

   boolean L() {
      return this.P() != 0;
   }

   public float M() {
      return this.x1;
   }

   public int P() {
      return this.shadowColor;
   }

   public class05245(class05272 glyph, float x0, float y0, float x1, float y1, float depth, int color, int shadowColor, float shadowOffset) {
      this.glyph = glyph;
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
      this.depth = depth;
      this.color = color;
      this.shadowColor = shadowColor;
      this.shadowOffset = shadowOffset;
   }

   public float B() {
      return this.y1;
   }

   public float Z() {
      return this.depth;
   }

   public float i() {
      return this.x0;
   }

   public float s() {
      return this.shadowOffset;
   }

   @Override
   public float m() {
      return this.y1 + (this.L() ? this.shadowOffset : 0.0F);
   }

   @Override
   public float U() {
      return this.x0;
   }

   public int z() {
      return this.color;
   }

   public class05272 u() {
      return this.glyph;
   }

   @Override
   public GpuTextureView y() {
      return this.glyph.u;
   }

   @Override
   public float E() {
      return this.y0;
   }

   @Override
   public class07311 N(class01583 var1) {
      return this.glyph.L.N(var1);
   }

   @Override
   public void N(Matrix4f var1, class01391 var2, int var3, boolean var4) {
      this.glyph.N(this, var1, var2, var3, false);
   }

   @Override
   public RenderPipeline N() {
      return this.glyph.L.u();
   }

   @Override
   public float W() {
      return this.x1 + (this.L() ? this.shadowOffset : 0.0F);
   }

   public float R() {
      return this.y0;
   }
}
