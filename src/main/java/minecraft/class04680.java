package minecraft;

import org.jspecify.annotations.Nullable;

public interface class04680 {
   Object y = new Object();
   int L = 160;
   int u = 32;

   default int L() {
      return 160;
   }

   default int M() {
      return class04995.R(this.u(), 32);
   }

   class04650 i();

   default int u() {
      return 32;
   }

   default void y() {
   }

   default float N(int var1) {
      return var1 * this.u();
   }

   void N(class06086 var1, long var2);

   default float N(int var1, float var2) {
      return var1 - this.L() * var2;
   }

   void N(class01054 var1, class01590 var2, long var3);

   default Object R() {
      return y;
   }

   @Nullable
   default class04891 I_() {
      return null;
   }
}
