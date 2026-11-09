package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Objects;
import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

final class class05881 implements class01391, VertexBufferWriter {
   private class01391[] delegates;
   private boolean y;

   class05881(class01391[] var1) {
      super();

      for (int i = 0; i < var1.length; i++) {
         for (int j = i + 1; j < var1.length; j++) {
            if (var1[i] == var1[j]) {
               throw new IllegalArgumentException("Duplicate delegates");
            }
         }
      }

      this.delegates = var1;
      this.N(null);
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class05881 && Objects.equals(this.delegates, ((class05881)var1).delegates);
   }

   @Override
   public final String toString() {
      return "class05881[delegates=" + Objects.toString(this.delegates) + "]";
   }

   @Override
   public final int hashCode() {
      return 0 * 31 + Objects.hashCode(this.delegates);
   }

   private boolean y() {
      class01391[] aclass01391 = this.delegates;
      int i = aclass01391.length;

      for (int j = 0; j < i; j++) {
         if (VertexBufferWriter.tryOf(aclass01391[j]) == null) {
            return false;
         }
      }

      return true;
   }

   public void push(MemoryStack var1, long var2, int var4, VertexFormat var5) {
      class01391[] aclass01391 = this.delegates;
      int i = aclass01391.length;

      for (int j = 0; j < i; j++) {
         VertexBufferWriter.copyInto(VertexBufferWriter.of(aclass01391[j]), var1, var2, var4, var5);
      }
   }

   public class01391[] N() {
      return this.delegates;
   }

   private void N(Consumer<class01391> var1) {
      for (class01391 class01391 : this.delegates) {
         var1.accept(class01391);
      }
   }

   private void N(CallbackInfo var1) {
      this.y = this.y();
   }

   @Override
   public void N(float var1, float var2, float var3, int var4, float var5, float var6, int var7, int var8, float var9, float var10, float var11) {
      this.N((Consumer<class01391>)(var11x -> var11x.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11)));
   }

   @Override
   public class01391 method_1336(int var1, int var2, int var3, int var4) {
      this.N((Consumer<class01391>)(var4x -> var4x.method_1336(var1, var2, var3, var4)));
      return this;
   }

   @Override
   public class01391 method_22913(float var1, float var2) {
      this.N((Consumer<class01391>)(var2x -> var2x.method_22913(var1, var2)));
      return this;
   }

   public boolean canUseIntrinsics() {
      return this.y;
   }

   @Override
   public class01391 method_22912(float var1, float var2, float var3) {
      this.N((Consumer<class01391>)(var3x -> var3x.method_22912(var1, var2, var3)));
      return this;
   }

   @Override
   public class01391 method_39415(int var1) {
      this.N((Consumer<class01391>)(var1x -> var1x.method_39415(var1)));
      return this;
   }

   @Override
   public class01391 method_22914(float var1, float var2, float var3) {
      this.N((Consumer<class01391>)(var3x -> var3x.method_22914(var1, var2, var3)));
      return this;
   }

   @Override
   public class01391 method_60796(int var1, int var2) {
      this.N((Consumer<class01391>)(var2x -> var2x.method_60796(var1, var2)));
      return this;
   }

   @Override
   public class01391 method_22921(int var1, int var2) {
      this.N((Consumer<class01391>)(var2x -> var2x.method_22921(var1, var2)));
      return this;
   }

   @Override
   public class01391 method_75298(float var1) {
      this.N((Consumer<class01391>)(var1x -> var1x.method_75298(var1)));
      return this;
   }
}
