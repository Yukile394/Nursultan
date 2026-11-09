package minecraft;

import java.util.function.Consumer;

public interface class03695 extends class02102 {
   default void N() {
      this.N(var0 -> {
         if (var0 instanceof class03695) {
            ((class03695)var0).N();
         }
      });
   }

   void N(Consumer<class02102> var1);

   @Override
   default void method_48206(Consumer<class06478> var1) {
      this.N(var1x -> var1x.method_48206(var1));
   }
}
