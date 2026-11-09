package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class04138<E, F, Value> implements class04140<E, class04139<F, Value>> {
   public class04138(class04109 var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return this.N();
   }

   @Nullable
   public class04139<F, Value> N(class04782 var1, E var2, long var3) {
      class01289<?> class01289 = var2.method_18868();
      Optional optional = class01289.u(this.N.N());
      return optional == null ? null : this.N.N(class01289, optional);
   }

   @Override
   public String N() {
      return "M[" + this.N + "]";
   }
}
