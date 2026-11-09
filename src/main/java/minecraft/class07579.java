package minecraft;

import org.jspecify.annotations.Nullable;

public interface class07579<T, R> extends class06841<R> {
   @Nullable
   R N(T var1);

   @Override
   class07491<? extends T> N();

   @Nullable
   @Override
   default R N(class05908 var1) {
      Object object = var1.L(this.N());
      return object != null ? this.N((T)object) : null;
   }
}
