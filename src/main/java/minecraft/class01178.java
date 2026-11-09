package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class01178<T extends class01187> {
   private final T N;
   @Nullable
   private class01296 y;

   public void L(class04782 var1) {
      this.N.N().N(var1).map(class01296::N).ifPresent(var2 -> {
         if (this.y == null || !this.y.equals(var2)) {
            N(var1, this.y, var1xx -> var1xx.y(this.N));
            this.y = var2;
            N(var1, this.y, var1xx -> var1xx.N(this.N));
         }
      });
   }

   public class01178(T var1) {
      super();
      this.N = (T)var1;
   }

   public void y(class04782 var1) {
      N(var1, this.y, var1x -> var1x.y(this.N));
   }

   private static void N(class05487 var0, @Nullable class01296 var1, Consumer<class01166> var2) {
      if (var1 != null) {
         class08050 class08050 = var0.method_8402(var1.N(), var1.L(), class00549.m, false);
         if (class08050 != null) {
            var2.accept(class08050.N(var1.y()));
         }
      }
   }

   public void N(class04782 var1) {
      this.L(var1);
   }

   public T N() {
      return this.N;
   }
}
