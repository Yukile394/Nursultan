package minecraft;

import org.jspecify.annotations.Nullable;

public record class02319<S, T>(class02341<S, T> action, class02315<S> child) implements class02324<S, T> {
   public class02319(class02341<S, T> action, class02315<S> child) {
      super();
      this.action = action;
      this.child = child;
   }

   @Nullable
   @Override
   public T y(class02325<S> var1) {
      class02332 class02332 = var1.N();
      class02332.N();

      Object object;
      try {
         if (!this.child.N(var1, class02332, class02328.N)) {
            return null;
         }

         object = this.action.run(var1);
      } finally {
         class02332.y();
      }

      return (T)object;
   }

   public class02315<S> y() {
      return this.child;
   }

   public class02341<S, T> N() {
      return this.action;
   }
}
