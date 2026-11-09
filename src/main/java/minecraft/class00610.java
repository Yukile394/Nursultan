package minecraft;

public interface class00610<T> {
   static class00610<Integer> L() {
      return class02566::N;
   }

   T apply(float var1, T var2, T var3);

   static <T> class00610<T> y(float var0) {
      return (var1, var2, var3) -> var1 >= var0 ? var3 : var2;
   }

   static <T> class00610<T> y() {
      return (var0, var1, var2) -> var1;
   }

   static class00610<Float> N() {
      return class04995::B;
   }

   static class00610<Float> N(float var0) {
      return (var1, var2, var3) -> {
         float f = class04995.R(var3 - var2);
         return Math.abs(f) >= var0 ? var3 : var2 + var1 * f;
      };
   }
}
