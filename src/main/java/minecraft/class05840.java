package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import org.lwjgl.util.freetype.FT_Face;

class class05840 implements class05237 {
   class05840(class05861 var1) {
      super();
      this.N = var1;
   }

   @Override
   public float i() {
      return this.N.L;
   }

   @Override
   public float R() {
      return this.N.u;
   }

   @Override
   public int method_2031() {
      return this.N.N;
   }

   @Override
   public int method_2032() {
      return this.N.y;
   }

   @Override
   public void method_2030(int var1, int var2, GpuTexture var3) {
      FT_Face ft_face = this.N.R.y();

      try (class08280 class08280 = new class08280(class08247.field_4998, this.N.N, this.N.y, false)) {
         if (class08280.N(ft_face, this.N.i)) {
            RenderSystem.getDevice().createCommandEncoder().writeToTexture(var3, class08280, 0, 0, var1, var2, this.N.N, this.N.y, 0, 0);
         }
      }
   }

   @Override
   public boolean method_2033() {
      return false;
   }

   @Override
   public float method_2035() {
      return this.N.R.N;
   }
}
