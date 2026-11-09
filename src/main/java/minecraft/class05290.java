package minecraft;

import org.jspecify.annotations.Nullable;

public class class05290<T extends Throwable> {
   @Nullable
   private T N;

   public class05290() {
      super();
   }

   public void N(T var1) {
      if (this.N == null) {
         this.N = (T)var1;
      } else {
         this.N.addSuppressed(var1);
      }
   }

   public void N() throws T {
      if (this.N != null) {
         throw this.N;
      }
   }
}
