package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import java.nio.IntBuffer;
import org.lwjgl.system.MemoryUtil;

class class06235 implements class05237 {
   class06235(class06248 var1) {
      super();
      this.N = var1;
   }

   @Override
   public int method_2031() {
      return this.N.y();
   }

   @Override
   public int method_2032() {
      return 16;
   }

   @Override
   public void method_2030(int var1, int var2, GpuTexture var3) {
      IntBuffer intbuffer = MemoryUtil.memAllocInt(this.N.y() * 16);
      class06268.N(intbuffer, this.N.L(), this.N.u(), this.N.i());
      intbuffer.rewind();
      RenderSystem.getDevice()
         .createCommandEncoder()
         .writeToTexture(var3, MemoryUtil.memByteBuffer(intbuffer), class08247.field_4997, 0, 0, var1, var2, this.N.y(), 16);
      MemoryUtil.memFree(intbuffer);
   }

   @Override
   public boolean method_2033() {
      return true;
   }

   @Override
   public float method_2035() {
      return 2.0F;
   }
}
