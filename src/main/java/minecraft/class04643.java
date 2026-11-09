package minecraft;

import Nursultan.class10463;
import java.util.function.Supplier;

public interface class04643 {
   String y = "root";

   void L();

   default void L(String var1) {
   }

   default class08694 L(Supplier<String> var1) {
      this.N(var1);
      return new class08694(this);
   }

   default class08694 i(String var1) {
      this.N(var1);
      return new class08694(this);
   }

   default void u(Supplier<String> var1) {
      this.N(var1, 1);
   }

   void y(Supplier<String> var1);

   void y();

   void y(String var1);

   static class04643 N(class04643 var0, class04643 var1) {
      if (var0 == class04687.N) {
         return var1;
      } else {
         return (class04643)(var1 == class04687.N ? var0 : new class10463(var0, var1));
      }
   }

   void N(class02253 var1);

   void N(String var1, int var2);

   void N(Supplier<String> var1, int var2);

   void N();

   void N(String var1);

   void N(Supplier<String> var1);

   default void N(long var1) {
   }

   default void N(int var1) {
   }

   default void R(String var1) {
      this.N(var1, 1);
   }
}
