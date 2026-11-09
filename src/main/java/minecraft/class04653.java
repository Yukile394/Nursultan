package minecraft;

import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;

public class class04653 {
   private final class07290 y;
   private final class07209 L;
   private final Short2ObjectMap<class00500> u;
   private final Short2BooleanMap i;

   private short L(class07209 var1) {
      int ix = var1.method_10263() - this.L.method_10263();
      int j = var1.method_10260() - this.L.method_10260();
      return (short)((ix + 128 & 0xFF) << 8 | j + 128 & 0xFF);
   }

   class04653(class05787 var1, class07290 var2, class07209 var3) {
      super();
      this.N = var1;
      this.u = new Short2ObjectOpenHashMap();
      this.i = new Short2BooleanOpenHashMap();
      this.y = var2;
      this.L = var3;
   }

   public boolean y(class07209 var1) {
      return this.i.computeIfAbsent(this.L(var1), var2 -> {
         class00500 class00500x = this.N(var1, var2);
         class07209 class07209 = var1.method_10074();
         class00500 class00500x = this.y.method_8320(class07209);
         return this.N.N(this.y, var1, class00500x, class07209, class00500x);
      });
   }

   public class00500 N(class07209 var1) {
      return this.N(var1, this.L(var1));
   }

   private class00500 N(class07209 var1, short var2) {
      return (class00500)this.u.computeIfAbsent(var2, var2x -> this.y.method_8320(var1));
   }
}
