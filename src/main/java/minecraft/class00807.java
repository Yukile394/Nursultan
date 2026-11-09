package minecraft;

import org.jspecify.annotations.Nullable;

public interface class00807 {
   default boolean method_8649(class07049 var1) {
      return false;
   }

   default boolean N(class07209 var1, boolean var2, @Nullable class07049 var3) {
      return this.method_30093(var1, var2, var3, 512);
   }

   default boolean N(class07209 var1, boolean var2) {
      return this.N(var1, var2, null);
   }

   default boolean method_8652(class07209 var1, class00500 var2, int var3) {
      return this.method_30092(var1, var2, var3, 512);
   }

   boolean method_30092(class07209 var1, class00500 var2, int var3, int var4);

   boolean method_8650(class07209 var1, boolean var2);

   boolean method_30093(class07209 var1, boolean var2, @Nullable class07049 var3, int var4);
}
