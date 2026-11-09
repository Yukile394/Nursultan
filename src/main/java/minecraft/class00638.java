package minecraft;

public interface class00638 {
   class00648 y();

   class00423 N();

   default void N(class07080 var1) {
      class07074 class07074 = var1.N("Connection");
      class07074.N("Protocol", () -> this.y().N());
      class07074.N("Flow", () -> this.N().toString());
      this.N(var1, class07074);
   }

   default void N(class07080 var1, class07074 var2) {
   }

   default class02570 N(class00392 var1, Throwable var2) {
      return new class02570(var1);
   }

   boolean method_48106();

   void method_10839(class02570 var1);

   default void method_59807(class00381 var1, Exception var2) throws class07878 {
      throw class00417.N(var2, var1, this);
   }

   default boolean method_52413(class00381<?> var1) {
      return this.method_48106();
   }
}
