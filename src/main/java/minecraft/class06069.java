package minecraft;

import io.netty.util.internal.ThreadLocalRandom;

public interface class06069 {
   @Deprecated
   double N = 2.297;

   class01818 L();

   default void L(int var1) {
      for (int i = 0; i < var1; i++) {
         this.M();
      }
   }

   int M();

   long B();

   boolean Z();

   @Deprecated
   static class06069 i() {
      return new class03633(class04043.N());
   }

   double U();

   float z();

   static class06069 u() {
      return y(class04043.N());
   }

   default int y(int var1, int var2) {
      if (var1 >= var2) {
         throw new IllegalArgumentException("bound - origin is non positive");
      } else {
         return var1 + this.y(var2 - var1);
      }
   }

   class06069 y();

   static class06069 y(long var0) {
      return new class06075(var0);
   }

   int y(int var1);

   double E();

   void N(long var1);

   default int N(int var1, int var2) {
      return this.y(var2 - var1 + 1) + var1;
   }

   default double N(double var1, double var3) {
      return var1 + var3 * (this.U() - this.U());
   }

   default float N(float var1, float var2) {
      return var1 + var2 * (this.z() - this.z());
   }

   static class06069 R() {
      return new class01833(ThreadLocalRandom.current().nextLong());
   }
}
