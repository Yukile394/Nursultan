package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;

class class01907 implements class05237 {
   class01907(class01923 var1) {
      super();
      this.N = var1;
   }

   @Override
   public int method_2031() {
      return this.N.field_37900.N();
   }

   @Override
   public int method_2032() {
      return this.N.field_37900.y();
   }

   @Override
   public void method_2030(int var1, int var2, GpuTexture var3) {
      RenderSystem.getDevice()
         .createCommandEncoder()
         .writeToTexture(var3, this.N.field_37900, 0, 0, var1, var2, this.N.field_37900.N(), this.N.field_37900.y(), 0, 0);
   }

   @Override
   public boolean method_2033() {
      return true;
   }

   @Override
   public float method_2035() {
      return 1.0F;
   }
}
