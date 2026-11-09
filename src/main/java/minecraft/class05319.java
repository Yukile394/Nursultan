package minecraft;

import java.util.ArrayList;
import java.util.List;

class class05319 extends class05328 {
   private static final class01894 L = class01894.y("recipe_book/crafting_overlay");
   private static final class01894 u = class01894.y("recipe_book/crafting_overlay_highlighted");
   private static final class01894 i = class01894.y("recipe_book/crafting_overlay_disabled");
   private static final class01894 R = class01894.y("recipe_book/crafting_overlay_disabled_highlighted");
   private static final int M = 3;
   private static final int B = 3;

   public class05319(class05299 var1, int var2, int var3, class00329 var4, class00265 var5, class00311 var6, boolean var7) {
      super((int)var1, var2, var3, (boolean)var4, var7, N(var5, var6));
   }

   private static List<class05303> N(class00265 var0, class00311 var1) {
      ArrayList arraylist = new ArrayList();
      switch (var0) {
         case class00326 class00326:
            class02604.N(3, 3, class00326.y(), class00326.L(), class00326.R(), (var2x, var3, var4, var5x) -> {
               List<class06584> list2 = var2x.N(var1);
               if (!list2.isEmpty()) {
                  arraylist.add(N(var4, var5x, list2));
               }
            });
            break;
         case class00315 class00315:
            label19: {
               List<class00299> list = ((class00315)var0).y();

               for (int ix = 0; ix < list.size(); ix++) {
                  List<class06584> list1 = list.get(ix).N(var1);
                  if (!list1.isEmpty()) {
                     arraylist.add(N(ix % 3, ix / 3, list1));
                  }
               }
               break label19;
            }
         default:
      }

      return arraylist;
   }

   @Override
   protected class01894 N(boolean var1) {
      if (var1) {
         return this.method_25367() ? u : L;
      } else {
         return this.method_25367() ? R : i;
      }
   }
}
