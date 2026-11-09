package minecraft;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class class00229 extends class00208 {
   public static final class05946<Consumer<class05523>> N = N("always_pass");
   public static final Consumer<class05523> y = class05523::u;

   public class00229() {
      super();
   }

   private static class05946<Consumer<class05523>> N(String var0) {
      return class05946.N(class04227.NJ, class01894.y(var0));
   }

   @Override
   public void N(BiConsumer<class05946<Consumer<class05523>>, Consumer<class05523>> var1) {
      var1.accept(N, y);
   }

   public static Consumer<class05523> N(class00751<Consumer<class05523>> var0) {
      N(new class00229());
      y(var0);
      return y;
   }
}
