package minecraft;

import org.jspecify.annotations.Nullable;

class class00597<Value> {
   private Value y;
   @Nullable
   private Value L;

   public class00597(class00607<Value> var1, class00607 var2) {
      super();
      this.N = var1;
      Object object = this.N(var2);
      this.y = (Value)object;
      this.L = (Value)object;
   }

   public Value N(class00607<Value> var1, float var2) {
      if (this.L == null) {
         this.L = this.N(var1);
      }

      return var1.N().M().apply(var2, this.y, this.L);
   }

   public boolean N() {
      if (this.L == null) {
         return true;
      } else {
         this.y = this.L;
         this.L = null;
         return false;
      }
   }

   private Value N(class00607<Value> var1) {
      return (Value)(this.N.N != null && this.N.y != null ? this.N.N.method_75728().N(var1, this.N.y, this.N.L) : var1.y());
   }
}
