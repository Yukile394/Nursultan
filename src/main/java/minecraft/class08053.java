package minecraft;

import org.jspecify.annotations.Nullable;

public interface class08053 {
   default class02452<class08066> y(class01894 var1) {
      class02452<class08066> class02452 = this.N(var1);
      if (class02452 == null) {
         throw new IllegalArgumentException("Missing target with id " + var1);
      } else {
         return class02452;
      }
   }

   void y(class01894 var1, class02452<class08066> var2);

   static class08053 N(class01894 var0, class02452<class08066> var1) {
      return new class08048(var1, var0);
   }

   @Nullable
   class02452<class08066> N(class01894 var1);
}
