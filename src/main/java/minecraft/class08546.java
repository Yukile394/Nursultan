package minecraft;

import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class08546<C extends class08542<C>, D> {
   private final Function<C, D> N;
   @Nullable
   private C y;
   @Nullable
   private D L;

   public class08546(Function<C, D> var1) {
      super();
      this.N = var1;
   }

   public D N(C var1) {
      if (var1 == this.y && this.L != null) {
         return this.L;
      } else {
         Object object = this.N.apply((C)var1);
         this.L = (D)object;
         this.y = (C)var1;
         var1.N(this);
         return (D)object;
      }
   }

   public void N() {
      this.L = null;
      this.y = null;
   }
}
