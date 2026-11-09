package minecraft;

import java.util.List;
import java.util.function.BooleanSupplier;

class class06367<T> implements class06363<T> {
   class06367(BooleanSupplier var1, List var2, List var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public List<T> y() {
      return this.L;
   }

   @Override
   public List<T> N() {
      return this.N.getAsBoolean() ? this.y : this.L;
   }
}
