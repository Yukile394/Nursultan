package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.TextureAttribute;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05899 implements class01391, VertexBufferWriter {
   private final class01391 N;
   private final class08388 y;
   private boolean L;
   private float u;
   private float i;
   private float R;
   private float M;

   public class05899(class01391 var1, class08388 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N(var1, var2, null);
   }

   public void push(MemoryStack var1, long var2, int var4, VertexFormat var5) {
      N(var2, var4, var5, this.u, this.i, this.R, this.M);
      VertexBufferWriter.of(this.N).push(var1, var2, var4, var5);
   }

   @Override
   public void N(float var1, float var2, float var3, int var4, float var5, float var6, int var7, int var8, float var9, float var10, float var11) {
      this.N.N(var1, var2, var3, var4, this.y.method_4580(var5), this.y.method_4570(var6), var7, var8, var9, var10, var11);
   }

   private static void N(long var0, int var2, VertexFormat var3, float var4, float var5, float var6, float var7) {
      long ix = var3.getVertexSize();
      long j = var3.getOffset(VertexFormatElement.UV0);
      float f = var6 - var4;
      float f1 = var7 - var5;

      for (int k = 0; k < var2; k++) {
         float f2 = TextureAttribute.getU(var0 + j);
         float f3 = TextureAttribute.getV(var0 + j);
         float f4 = var4 + f * f2;
         float f5 = var5 + f1 * f3;
         TextureAttribute.put(var0 + j, f4, f5);
         var0 += ix;
      }
   }

   private void N(class01391 var1, class08388 var2, CallbackInfo var3) {
      this.u = var2.method_4594();
      this.i = var2.method_4593();
      this.R = var2.method_4577();
      this.M = var2.method_4575();
      this.L = VertexBufferWriter.tryOf(this.N) != null;
   }

   @Override
   public class01391 method_1336(int var1, int var2, int var3, int var4) {
      return this.N.method_1336(var1, var2, var3, var4);
   }

   @Override
   public class01391 method_22913(float var1, float var2) {
      return this.N.method_22913(this.y.method_4580(var1), this.y.method_4570(var2));
   }

   public boolean canUseIntrinsics() {
      return this.L;
   }

   @Override
   public class01391 method_22912(float var1, float var2, float var3) {
      return this.N.method_22912(var1, var2, var3);
   }

   @Override
   public class01391 method_39415(int var1) {
      return this.N.method_39415(var1);
   }

   @Override
   public class01391 method_22914(float var1, float var2, float var3) {
      return this.N.method_22914(var1, var2, var3);
   }

   @Override
   public class01391 method_60796(int var1, int var2) {
      return this.N.method_60796(var1, var2);
   }

   @Override
   public class01391 method_22921(int var1, int var2) {
      return this.N.method_22921(var1, var2);
   }

   @Override
   public class01391 method_75298(float var1) {
      this.N.method_75298(var1);
      return this;
   }
}
