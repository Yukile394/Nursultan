package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import org.joml.Matrix4f;

record class05274(float x, float y, int color, int shadowColor, class05272 glyph, class00405 style, float boldOffset, float shadowOffset) implements class07915 {

   boolean L() {
      return this.M() != 0;
   }

   public int M() {
      return this.shadowColor;
   }

   @Override
   public float T() {
      return this.x + this.glyph.y.N(this.style.L());
   }

   class05274(float x, float y, int color, int shadowColor, class05272 glyph, class00405 style, float boldOffset, float shadowOffset) {
      super();
      this.x = x;
      this.y = y;
      this.color = color;
      this.shadowColor = shadowColor;
      this.glyph = glyph;
      this.style = style;
      this.boldOffset = boldOffset;
      this.shadowOffset = shadowOffset;
   }

   public class05272 B() {
      return this.glyph;
   }

   public float Z() {
      return this.boldOffset;
   }

   public float i() {
      return this.y;
   }

   @Override
   public float m() {
      return this.glyph.u(this);
   }

   public float j() {
      return this.shadowOffset;
   }

   @Override
   public float U() {
      return this.glyph.N(this);
   }

   @Override
   public class00405 z() {
      return this.style;
   }

   public float u() {
      return this.x;
   }

   @Override
   public GpuTextureView y() {
      return this.glyph.u;
   }

   @Override
   public float E() {
      return this.glyph.y(this);
   }

   @Override
   public void N(Matrix4f var1, class01391 var2, int var3, boolean var4) {
      this.glyph.N(this, var1, var2, var3, var4);
   }

   @Override
   public class07311 N(class01583 var1) {
      return this.glyph.L.N(var1);
   }

   @Override
   public RenderPipeline N() {
      return this.glyph.L.u();
   }

   @Override
   public float W() {
      return this.glyph.L(this);
   }

   public int R() {
      return this.color;
   }
}
