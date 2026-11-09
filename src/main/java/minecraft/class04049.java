package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class04049 implements class04018 {
   protected final class04039 L;
   private long N;
   @Nullable
   public Boolean u;

   protected abstract long L();

   protected class04049(class04039 var1) {
      super();
      this.L = var1;
      this.N = this.L() - 1L;
   }

   @Override
   public boolean y() {
      long i = this.L();
      if (i == this.N) {
         if (this.u == null) {
            throw new IllegalStateException("Update triggered but the result is null");
         } else {
            return this.u;
         }
      } else {
         this.N = i;
         this.u = this.N();
         return this.u;
      }
   }

   protected abstract boolean N();
}
