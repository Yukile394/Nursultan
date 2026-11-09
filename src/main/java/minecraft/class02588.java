package minecraft;

@FunctionalInterface
public interface class02588 {
   class02588 N = (var0, var1) -> false;
   class02588 y = (var0, var1) -> var0.length() == var1;

   static class02588 y(int var0) {
      return switch (var0) {
         case -1 -> N;
         case 0 -> y;
         default -> N(var0);
      };
   }

   static class02588 N(int var0) {
      return (var1, var2) -> var2 >= var0;
   }

   boolean shouldIgnore(String var1, int var2);
}
