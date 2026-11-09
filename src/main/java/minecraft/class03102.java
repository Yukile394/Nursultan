package minecraft;

@FunctionalInterface
public interface class03102 {
   class03102 N = new class03097();

   static class03102 N(class03102 var0, class03102 var1) {
      if (var0 == N) {
         return var1;
      } else {
         return var1 == N ? var0 : (var2, var3) -> {
            var0.onResult(var2, var3);
            var1.onResult(var2, var3);
         };
      }
   }

   default void N() {
      this.onResult(false, 0);
   }

   default void N(int var1) {
      this.onResult(true, var1);
   }

   void onResult(boolean var1, int var2);
}
