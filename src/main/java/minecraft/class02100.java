package minecraft;

import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;

public class class02100 {
   private static final int N = 2;

   public class02100() {
      super();
   }

   public static void N(class03734 var0, Predicate<class03734> var1, class02098 var2) {
      class03734 class03734 = var0.u();
      ObjectArrayList objectarraylist = new ObjectArrayList();

      for (int i = 0; i <= 2; i++) {
         objectarraylist.push(class02115.field_41740);
      }

      N(class03734, objectarraylist, var1, var2);
   }

   private static boolean N(class03734 var0, Stack<class02115> var1, Predicate<class03734> var2, class02098 var3) {
      boolean flag = var2.test(var0);
      class02115 class02115 = N(var0.N(), flag);
      boolean flag1 = flag;
      var1.push(class02115);

      for (class03734 class03734 : var0.i()) {
         flag1 |= N(class03734, var1, var2, var3);
      }

      boolean flag2 = flag1 || N(var1);
      var1.pop();
      var3.accept(var0, flag2);
      return flag1;
   }

   private static boolean N(Stack<class02115> var0) {
      for (int i = 0; i <= 2; i++) {
         class02115 class02115 = (class02115)var0.peek(i);
         if (class02115 == class02115.field_41738) {
            return true;
         }

         if (class02115 == class02115.field_41739) {
            return false;
         }
      }

      return false;
   }

   private static class02115 N(class07151 var0, boolean var1) {
      Optional<class06513> optional = var0.L();
      if (optional.isEmpty()) {
         return class02115.field_41739;
      } else if (var1) {
         return class02115.field_41738;
      } else {
         return optional.get().z() ? class02115.field_41739 : class02115.field_41740;
      }
   }
}
