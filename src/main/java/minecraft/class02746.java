package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

class class02746<T> extends class02760<T> {
   final int N;
   private final class02418<T> u;
   @Nullable
   private T i;

   public class02746(int var1, String var2, class02748 var3, class02418<T> var4) {
      super(var2, var3);
      this.N = var1;
      this.u = var4;
   }

   public void y(class02762 var1) {
      if (this.i == null) {
         throw new IllegalStateException("Tried to release physical resource that was not allocated");
      } else {
         var1.N(this.u, this.i);
         this.i = null;
      }
   }

   @Override
   public T N() {
      return Objects.requireNonNull(this.i, "Resource is not currently available");
   }

   public void N(class02762 var1) {
      if (this.i != null) {
         throw new IllegalStateException("Tried to acquire physical resource, but it was already assigned");
      } else {
         this.i = var1.N(this.u);
      }
   }
}
