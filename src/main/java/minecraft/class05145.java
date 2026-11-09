package minecraft;

import java.util.List;

class class05145 implements class05159 {
   class05145() {
      super();
   }

   @Override
   public void N() {
   }

   @Override
   public boolean N(class01224 var1, int var2, class05180 var3, class07209 var4, List<class04890> var5, class06069 var6) {
      if (var2 > 8) {
         return false;
      } else {
         class06993 class06993 = var3.U().u();
         class05180 class05180 = class05160.N(var5, class05160.N(var1, var3, var4, "base_floor", class06993, true));
         int i = var6.y(3);
         if (i == 0) {
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(-1, 4, -1), "base_roof", class06993, true));
         } else if (i == 1) {
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(-1, 0, -1), "second_floor_2", class06993, false));
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(-1, 8, -1), "second_roof", class06993, false));
            class05160.N(var1, class05160.L, var2 + 1, class05180, null, var5, var6);
         } else if (i == 2) {
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(-1, 0, -1), "second_floor_2", class06993, false));
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(-1, 4, -1), "third_floor_2", class06993, false));
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(-1, 8, -1), "third_roof", class06993, true));
            class05160.N(var1, class05160.L, var2 + 1, class05180, null, var5, var6);
         }

         return true;
      }
   }
}
