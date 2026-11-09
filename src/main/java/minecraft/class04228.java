package minecraft;

import java.io.IOException;
import org.jspecify.annotations.Nullable;

class class04228<T> implements class04239<T> {
   private volatile long L;

   class04228(class04220 var1, class04239 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Override
   public void close() throws IOException {
      this.y.y();
   }

   @Nullable
   @Override
   public T N() throws IOException {
      Object object;
      try {
         this.y.N.position(this.L);
         object = this.N.N();
      } finally {
         this.L = this.y.N.position();
      }

      return (T)object;
   }
}
