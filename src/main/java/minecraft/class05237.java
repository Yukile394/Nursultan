package minecraft;

import com.mojang.blaze3d.textures.GpuTexture;

public interface class05237 {
   default float L() {
      return 7.0F - this.R();
   }

   default float i() {
      return 0.0F;
   }

   default float u() {
      return this.L() + this.method_2032() / this.method_2035();
   }

   default float y() {
      return this.N() + this.method_2031() / this.method_2035();
   }

   default float N() {
      return this.i();
   }

   default float R() {
      return 7.0F;
   }

   int method_2031();

   int method_2032();

   void method_2030(int var1, int var2, GpuTexture var3);

   boolean method_2033();

   float method_2035();
}
