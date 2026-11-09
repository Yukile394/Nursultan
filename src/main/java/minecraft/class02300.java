package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class class02300 {
   public static final int N = -1;
   private final Object2IntMap<Class<?>> y = class07536.N(new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1));

   public int L(Class<?> var1) {
      int i = this.N(var1);
      int j = i == -1 ? 0 : i + 1;
      this.y.put(var1, j);
      return j;
   }

   public class02300() {
      super();
   }

   public int y(Class<?> var1) {
      return this.N(var1) + 1;
   }

   public int N(Class<?> var1) {
      int i = this.y.getInt(var1);
      if (i != -1) {
         return i;
      } else {
         Class oclass = var1;

         while ((oclass = oclass.getSuperclass()) != Object.class) {
            int j = this.y.getInt(oclass);
            if (j != -1) {
               return j;
            }
         }

         return -1;
      }
   }
}
