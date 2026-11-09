package minecraft;

import org.jspecify.annotations.Nullable;

public interface class07190 {
   @Nullable
   class00394 N(class07209 var1, class00500 var2);

   @Nullable
   default <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return null;
   }

   @Nullable
   default <T extends class00394> class01187 N(class04782 var1, T var2) {
      return var2 instanceof class01171 ? ((class01171)var2).B() : null;
   }
}
