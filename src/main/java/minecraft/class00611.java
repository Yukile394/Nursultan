package minecraft;

import org.jspecify.annotations.Nullable;

public interface class00611 {
   class00611 N = new class00590();

   <Value> Value N(class00607<Value> var1);

   <Value> Value N(class00607<Value> var1, class06889 var2, @Nullable class00602 var3);

   default <Value> Value N(class00607<Value> var1, class06889 var2) {
      return this.N(var1, var2, null);
   }

   default <Value> Value N(class00607<Value> var1, class07209 var2) {
      return this.N(var1, class06889.y(var2));
   }
}
