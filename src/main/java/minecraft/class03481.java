package minecraft;

import org.jspecify.annotations.Nullable;

public interface class03481 {
   default boolean L() {
      return false;
   }

   default boolean i() {
      return false;
   }

   default void u() {
   }

   class01190 y();

   default int N(float var1) {
      return class04995.y(var1);
   }

   default boolean N(class03556<class01194> var1, class01164 var2) {
      if (!var1.N(this.R())) {
         return false;
      } else {
         class07049 class07049 = var2.N();
         if (class07049 != null) {
            if (class07049.method_7325()) {
               return false;
            }

            if (class07049.method_21749() && var1.N(class06370.u)) {
               if (this.L() && class07049 instanceof class04770 class04770) {
                  class06912.Nu.N(class04770);
               }

               return false;
            }

            if (class07049.method_33189()) {
               return false;
            }
         }

         return var2.y() != null ? !var2.y().N(class01210.S) : true;
      }
   }

   int N();

   void N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class07049 var4, @Nullable class07049 var5, float var6);

   boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, class01164 var4);

   default class03530<class01194> R() {
      return class06370.N;
   }
}
