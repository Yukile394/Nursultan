package minecraft;

import java.util.function.Consumer;

public class class03128<T extends class01711<T>> implements class01742<T> {
   private final Consumer<class01744<T>> N;
   private final class03102 y;

   public class03128(Consumer<class01744<T>> var1, class03102 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void execute(class01752<T> var1, class03099 var2) {
      int i = var2.L() + 1;
      class03099 class03099 = new class03099(i, this.y, var1.y(i));
      this.N.accept(class01744.N(var1, class03099));
   }
}
