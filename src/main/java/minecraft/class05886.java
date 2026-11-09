package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class05886 implements class01391, VertexBufferWriter {
   private final class01391 N;
   private final class01391 y;
   private boolean L;

   public class05886(class01391 var1, class01391 var2) {
      super();
      if (var1 == var2) {
         throw new IllegalArgumentException("Duplicate delegates");
      } else {
         this.N = var1;
         this.y = var2;
         this.N(null);
      }
   }

   public void push(MemoryStack var1, long var2, int var4, VertexFormat var5) {
      VertexBufferWriter.copyInto(VertexBufferWriter.of(this.N), var1, var2, var4, var5);
      VertexBufferWriter.copyInto(VertexBufferWriter.of(this.y), var1, var2, var4, var5);
   }

   @Override
   public void N(float var1, float var2, float var3, int var4, float var5, float var6, int var7, int var8, float var9, float var10, float var11) {
      this.N.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      this.y.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   private void N(CallbackInfo var1) {
      this.L = VertexBufferWriter.tryOf(this.N) != null && VertexBufferWriter.tryOf(this.y) != null;
   }

   @Override
   public class01391 method_1336(int var1, int var2, int var3, int var4) {
      this.N.method_1336(var1, var2, var3, var4);
      this.y.method_1336(var1, var2, var3, var4);
      return this;
   }

   @Override
   public class01391 method_22913(float var1, float var2) {
      this.N.method_22913(var1, var2);
      this.y.method_22913(var1, var2);
      return this;
   }

   public boolean canUseIntrinsics() {
      return this.L;
   }

   @Override
   public class01391 method_22912(float var1, float var2, float var3) {
      this.N.method_22912(var1, var2, var3);
      this.y.method_22912(var1, var2, var3);
      return this;
   }

   @Override
   public class01391 method_39415(int var1) {
      this.N.method_39415(var1);
      this.y.method_39415(var1);
      return this;
   }

   @Override
   public class01391 method_22914(float var1, float var2, float var3) {
      this.N.method_22914(var1, var2, var3);
      this.y.method_22914(var1, var2, var3);
      return this;
   }

   @Override
   public class01391 method_60796(int var1, int var2) {
      this.N.method_60796(var1, var2);
      this.y.method_60796(var1, var2);
      return this;
   }

   @Override
   public class01391 method_22921(int var1, int var2) {
      this.N.method_22921(var1, var2);
      this.y.method_22921(var1, var2);
      return this;
   }

   @Override
   public class01391 method_75298(float var1) {
      this.N.method_75298(var1);
      this.y.method_75298(var1);
      return this;
   }
}
