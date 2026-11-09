package minecraft;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public interface class08960 {
   class07211 M(class00500 var1);

   boolean B(class00500 var1);

   int u();

   private boolean N(int var1, int var2) {
      return var1 > 0 && var2 + var1 <= this.u();
   }

   default void N(class07284 var1, class07209 var2, class00500 var3, class00500 var4) {
      if (this.B(var3)) {
         if (!this.N(var3, var4)) {
            class08952 class08952 = this.N(var1, var2, this.M(var3));
            class08972 class08972 = class08972.field_61446;
            int i = class08952.N().N() ? this.N(var1, class08952.N().L()).size() : 0;
            int j = class08952.y().N() ? this.N(var1, class08952.y().L()).size() : 0;
            int k = 1;
            if (this.N(i, k)) {
               class08972 = class08972.u();
               class08952.N().u();
               k += i;
            }

            if (this.N(j, k)) {
               class08972 = class08972.L();
               class08952.y().i();
            }

            this.N(var1, var2, class08972);
         }
      }
   }

   private class08952 N(class07284 var1, class07209 var2, class07211 var3) {
      return new class08952(this, var1, var3, var2, new HashMap<>());
   }

   private boolean N(class00500 var1, class00500 var2) {
      boolean flag = this.R(var1).N();
      boolean flag1 = this.B(var2) && this.R(var2).N();
      return flag || flag1;
   }

   private void N(IntFunction<class08976> var1, class08972 var2, Consumer<class07209> var3) {
      for (int i = 1; i < this.u(); i++) {
         class08976 class08976 = (class08976)var1.apply(i);
         if (class08976.N(var2)) {
            var3.accept(class08976.L());
         }

         if (class08976.y()) {
            break;
         }
      }
   }

   default List<class07209> N(class07284 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      if (!this.B(class00500)) {
         return List.of();
      } else {
         class08952 class08952 = this.N(var1, var2, this.M(class00500));
         LinkedList linkedlist = new LinkedList();
         linkedlist.add(var2);
         this.N(class08952::N, class08972.field_61449, linkedlist::addFirst);
         this.N(class08952::y, class08972.field_61447, linkedlist::addLast);
         return linkedlist;
      }
   }

   default void N(class07284 var1, class07209 var2, class08972 var3) {
      class00500 class00500 = var1.method_8320(var2);
      if (this.R(class00500) != var3) {
         var1.method_8652(var2, this.N(class00500, var3), 3);
      }
   }

   class00500 N(class00500 var1, class08972 var2);

   class08972 R(class00500 var1);

   default void a_(class07284 var1, class07209 var2, class00500 var3) {
      class08952 class08952 = this.N(var1, var2, this.M(var3));
      class08952.N().R();
      class08952.y().M();
   }
}
