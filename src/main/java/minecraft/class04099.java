package minecraft;

import org.jspecify.annotations.Nullable;

public interface class04099 {
   default boolean y(class00500 var1, class07211 var2) {
      return this.N(var1) || this.N(var1, var2);
   }

   default boolean N(class00500 var1, class07211 var2) {
      return class05543.N(var1, var2);
   }

   default boolean N(class00500 var1) {
      return false;
   }

   default boolean N(class07284 var1, class04089 var2, class00500 var3, boolean var4) {
      class00500 class00500 = this.N(var3, var1, var2.N(), var2.y());
      if (class00500 != null) {
         if (var4) {
            var1.method_8500(var2.N()).u(var2.N());
         }

         return var1.method_8652(var2.N(), class00500, 2);
      } else {
         return false;
      }
   }

   default class04072[] N() {
      return class04090.N;
   }

   boolean N(class07290 var1, class07209 var2, class04089 var3);

   @Nullable
   class00500 N(class00500 var1, class07290 var2, class07209 var3, class07211 var4);
}
