package minecraft;

public interface class01809 extends class06069 {
   float y = 5.9604645E-8F;
   double L = 1.110223E-16F;

   @Override
   default int M() {
      return this.N(32);
   }

   @Override
   default long B() {
      int i = this.N(32);
      int j = this.N(32);
      return ((long)i << 32) + j;
   }

   @Override
   default boolean Z() {
      return this.N(1) != 0;
   }

   @Override
   default double U() {
      int i = this.N(26);
      int j = this.N(27);
      return (((long)i << 27) + j) * 1.110223E-16F;
   }

   @Override
   default float z() {
      return this.N(24) * 5.9604645E-8F;
   }

   @Override
   default int y(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("Bound must be positive");
      } else if ((var1 & var1 - 1) == 0) {
         return (int)((long)var1 * this.N(31) >> 31);
      } else {
         int i;
         int j;
         do {
            i = this.N(31);
            j = i % var1;
         } while (i - j + (var1 - 1) < 0);

         return j;
      }
   }

   int N(int var1);
}
