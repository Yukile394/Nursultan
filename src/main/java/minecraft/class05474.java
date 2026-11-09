package minecraft;

import Nursultan.class10513;

public interface class05474 {
   static class05474 L(int var0, int var1) {
      return new class10513(var1, var0);
   }

   default boolean L(int var1) {
      return var1 >= this.method_31607() && var1 <= this.method_31600();
   }

   int method_31607();

   default int method_31604(int var1) {
      return var1 + this.method_32891();
   }

   default int method_31600() {
      return this.method_31607() + this.method_31605() - 1;
   }

   default boolean method_31606(class07209 var1) {
      return this.method_31601(var1.method_10264());
   }

   default int method_32891() {
      return class01296.N(this.method_31607());
   }

   default int method_32890() {
      return this.method_31597() - this.method_32891() + 1;
   }

   default int method_31597() {
      return class01296.N(this.method_31600());
   }

   default boolean method_31601(int var1) {
      return var1 < this.method_31607() || var1 > this.method_31600();
   }

   default int method_31603(int var1) {
      return var1 - this.method_32891();
   }

   int method_31605();

   default int method_31602(int var1) {
      return this.method_31603(class01296.N(var1));
   }
}
