package minecraft;

import org.jspecify.annotations.Nullable;

public interface class00340 extends class00368<Void> {
   void N(class03662 var1, class01421 var2, class01237 var3, int var4, int var5, boolean var6, int var7);

   default void N(@Nullable Void var1, class03662 var2, class01421 var3, class01237 var4, int var5, int var6, boolean var7, int var8) {
      this.N(var2, var3, var4, var5, var6, var7, var8);
   }

   @Nullable
   default Void y(class06584 var1) {
      return null;
   }
}
