package minecraft;

import Nursultan.class10318;
import java.util.function.Consumer;

public interface class04157 {
   class04157 N = new class04158();

   default boolean y(int var1, int var2) {
      return this.N(var1, var2, false);
   }

   void N(Consumer<class07321> var1);

   static boolean N(int var0, int var1, int var2, int var3, int var4) {
      return N(var0, var1, var2, var3, var4, false);
   }

   static boolean N(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      int i = var5 ? 2 : 1;
      long j = Math.max(0, Math.abs(var3 - var0) - i);
      long k = Math.max(0, Math.abs(var4 - var1) - i);
      long l = j * j + k * k;
      int i1 = var2 * var2;
      return l < i1;
   }

   static class04157 N(class07321 var0, int var1) {
      return new class10318(var0, var1);
   }

   static void N(class04157 var0, class04157 var1, Consumer<class07321> var2, Consumer<class07321> var3) {
      if (!var0.equals(var1)) {
         if (var0 instanceof class10318 class10318x && var1 instanceof class10318 class10318 && class10318x.N(class10318)) {
            int i = Math.min(class10318x.N(), class10318.N());
            int j = Math.min(class10318x.y(), class10318.y());
            int k = Math.max(class10318x.L(), class10318.L());
            int l = Math.max(class10318x.u(), class10318.u());

            for (int i1 = i; i1 <= k; i1++) {
               for (int j1 = j; j1 <= l; j1++) {
                  boolean flag = class10318x.N(i1, j1);
                  boolean flag1 = class10318.N(i1, j1);
                  if (flag != flag1) {
                     if (flag1) {
                        var2.accept(new class07321(i1, j1));
                     } else {
                        var3.accept(new class07321(i1, j1));
                     }
                  }
               }
            }
         } else {
            var0.N(var3);
            var1.N(var2);
         }
      }
   }

   default boolean N(class07321 var1) {
      return this.N(var1.B, var1.Z);
   }

   default boolean N(int var1, int var2) {
      return this.N(var1, var2, true);
   }

   boolean N(int var1, int var2, boolean var3);
}
