package minecraft;

import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

class class04112<T> extends class03529<T> {
   @Nullable
   Supplier<T> N;

   protected class04112(class02042<T> var1, @Nullable class05946<T> var2) {
      super(class03527.field_36454, var1, var2, null);
   }

   @Override
   public void y(T var1) {
      super.y((T)var1);
      this.N = null;
   }

   @Override
   public T N() {
      if (this.N != null) {
         this.y(this.N.get());
      }

      return super.N();
   }
}
