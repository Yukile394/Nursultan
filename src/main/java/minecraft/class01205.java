package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class class01205 {
   protected final Object2IntMap<class04907<?>> N = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public class01205() {
      super();
      this.N.defaultReturnValue(0);
   }

   public void y(class08036 var1, class04907<?> var2, int var3) {
      int i = (int)Math.min((long)this.N(var2) + var3, 2147483647L);
      this.N(var1, var2, i);
   }

   public <T> int N(class04922<T> var1, T var2) {
      return var1.N(var2) ? this.N(var1.y(var2)) : 0;
   }

   public int N(class04907<?> var1) {
      return this.N.getInt(var1);
   }

   public void N(class08036 var1, class04907<?> var2, int var3) {
      this.N.put(var2, var3);
   }
}
