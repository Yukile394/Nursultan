package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.util.Objects;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.attributes.common.ColorAttribute;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

final class class01456 implements class01391, VertexBufferWriter {
   private class01391 delegate;
   private int color;
   private boolean L;

   class01456(class01391 var1, int var2) {
      super();
      this.delegate = var1;
      this.color = var2;
      this.N(null);
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class01456 && Objects.equals(this.delegate, ((class01456)var1).delegate) && this.color == ((class01456)var1).color;
   }

   @Override
   public final String toString() {
      return "class01456[delegate=" + Objects.toString(this.delegate) + ", color=" + Integer.toString(this.color) + "]";
   }

   @Override
   public final int hashCode() {
      return (0 * 31 + Objects.hashCode(this.delegate)) * 31 + Integer.hashCode(this.color);
   }

   public int y() {
      return this.color;
   }

   public void push(MemoryStack var1, long var2, int var4, VertexFormat var5) {
      N(var2, var4, var5, this.color);
      VertexBufferWriter.of(this.delegate).push(var1, var2, var4, var5);
   }

   private static void N(long var0, int var2, VertexFormat var3, int var4) {
      long i = var3.getVertexSize();
      long j = var3.getOffset(VertexFormatElement.COLOR);

      for (int k = 0; k < var2; k++) {
         ColorAttribute.set(var0 + j, ColorARGB.toABGR(var4));
         var0 += i;
      }
   }

   public class01391 N() {
      return this.delegate;
   }

   private void N(CallbackInfo var1) {
      this.L = VertexBufferWriter.tryOf(this.delegate) != null;
   }

   @Override
   public class01391 method_1336(int var1, int var2, int var3, int var4) {
      return this;
   }

   @Override
   public class01391 method_22913(float var1, float var2) {
      this.delegate.method_22913(var1, var2);
      return this;
   }

   public boolean canUseIntrinsics() {
      return this.L;
   }

   @Override
   public class01391 method_22912(float var1, float var2, float var3) {
      this.delegate.method_22912(var1, var2, var3).method_39415(this.color);
      return this;
   }

   @Override
   public class01391 method_39415(int var1) {
      return this;
   }

   @Override
   public class01391 method_22914(float var1, float var2, float var3) {
      return this;
   }

   @Override
   public class01391 method_60796(int var1, int var2) {
      return this;
   }

   @Override
   public class01391 method_22921(int var1, int var2) {
      return this;
   }

   @Override
   public class01391 method_75298(float var1) {
      return this;
   }
}
