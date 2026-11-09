package minecraft;

public interface class01955 extends class06695 {
   default class06584 U() {
      return this.N(this.method_5444());
   }

   class06584 N();

   void N(class06584 var1);

   default class06584 N(int var1) {
      return this.N().N(var1);
   }

   @Override
   default void method_5448() {
      this.U();
   }

   @Override
   default void method_5447(int var1, class06584 var2) {
      if (var1 == 0) {
         this.N(var2);
      }
   }

   @Override
   default class06584 method_5434(int var1, int var2) {
      return var1 != 0 ? class06584.E : this.N(var2);
   }

   @Override
   default class06584 method_5441(int var1) {
      return this.method_5434(var1, this.method_5444());
   }

   @Override
   default boolean method_5442() {
      return this.N().R();
   }

   @Override
   default class06584 method_5438(int var1) {
      return var1 == 0 ? this.N() : class06584.E;
   }

   @Override
   default int method_5439() {
      return 1;
   }
}
