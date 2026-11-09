package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;

class class05651 implements class05237 {
   class05651(class05656 var1) {
      super();
      this.N = var1;
   }

   @Override
   public float R() {
      return this.N.Z();
   }

   @Override
   public int method_2031() {
      return this.N.R();
   }

   @Override
   public int method_2032() {
      return this.N.M();
   }

   @Override
   public void method_2030(int var1, int var2, GpuTexture var3) {
      RenderSystem.getDevice().createCommandEncoder().writeToTexture(var3, this.N.L(), 0, 0, var1, var2, this.N.R(), this.N.M(), this.N.u(), this.N.i());
   }

   @Override
   public boolean method_2033() {
      return this.N.L().L().N() > 1;
   }

   @Override
   public float method_2035() {
      return 1.0F / this.N.y();
   }
}
