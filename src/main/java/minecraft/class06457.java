package minecraft;

@FunctionalInterface
interface class06457 {
   class06457 N = var0 -> 1.0F;

   static class06457 N(int var0) {
      return var1 -> {
         double d0 = (var0 - var1.N()) / 200.0;
         d0 = 1.0 - d0;
         d0 *= 10.0;
         d0 = class04995.N(d0, 0.0, 1.0);
         d0 *= d0;
         return (float)d0;
      };
   }

   float calculate(class06419 var1);
}
