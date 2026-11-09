package minecraft;

import org.jspecify.annotations.Nullable;

class class08048 implements class08053 {
   private class02452<class08066> L;

   class08048(class02452 var1, class01894 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = this.N;
   }

   @Override
   public void y(class01894 var1, class02452<class08066> var2) {
      if (var1.equals(this.y)) {
         this.L = var2;
      } else {
         throw new IllegalArgumentException("No target with id " + var1);
      }
   }

   @Nullable
   @Override
   public class02452<class08066> N(class01894 var1) {
      return var1.equals(this.y) ? this.L : null;
   }
}
