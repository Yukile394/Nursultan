package minecraft;

import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public interface class08647 extends class08320 {
   Matrix3x2f N = new Matrix3x2f();

   int M();

   int B();

   @Nullable
   class03255 Z();

   int i();

   default Matrix3x2f E() {
      return N;
   }

   float N();

   @Nullable
   static class03255 N(int var0, int var1, int var2, int var3, @Nullable class03255 var4) {
      class03255 class03255 = new class03255(var0, var1, var2 - var0, var3 - var1);
      return var4 != null ? var4.y(class03255) : class03255;
   }

   int R();
}
