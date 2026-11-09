package minecraft;

import com.google.common.collect.ImmutableList;

public interface class03428 {
   class03428 N();

   void N(class03457 var1, class03447<?> var2);

   default void N(class03457 var1, class00392... var2) {
      this.N(var1, class03447.N(ImmutableList.copyOf(var2)));
   }

   default void N(class03457 var1, String var2) {
      this.N(var1, class03447.N(var2));
   }

   default void N(class03457 var1, class00392 var2) {
      this.N(var1, class03447.N(var2.getString()));
   }
}
