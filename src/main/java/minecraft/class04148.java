package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public abstract class class04148<T> extends class07028<T> {
   private final Function<T, class05946<T>> N;

   public class04148(class01996 var1, class05946<? extends class00751<T>> var2, CompletableFuture<class01929> var3, Function<T, class05946<T>> var4) {
      super(var1, var2, var3);
      this.N = var4;
   }

   public class04148(
      class01996 var1,
      class05946<? extends class00751<T>> var2,
      CompletableFuture<class01929> var3,
      CompletableFuture<class07034<T>> var4,
      Function<T, class05946<T>> var5
   ) {
      super(var1, var2, var3, var4);
      this.N = var5;
   }

   public class08292<T, T> N(class03530<T> var1) {
      return class08292.<T>N(this.method_27169(var1)).N(this.N);
   }
}
