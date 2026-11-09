package minecraft;

public interface class07342<T> {
   static <T> class07342<T> N() {
      return (var0, var1) -> {
         throw new IllegalArgumentException("Unexpected palette resize, bits = " + var0 + ", added value = " + var1);
      };
   }

   int onResize(int var1, T var2);
}
