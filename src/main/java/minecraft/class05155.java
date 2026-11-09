package minecraft;

import java.util.List;

class class05155 implements class05159 {
   class05155() {
      super();
   }

   @Override
   public void N() {
   }

   @Override
   public boolean N(class01224 var1, int var2, class05180 var3, class07209 var4, List<class04890> var5, class06069 var6) {
      class06993 class06993 = var3.U().u();
      class05180 class05180x = class05160.N(var5, class05160.N(var1, var3, new class07209(-3, 4, -3), "fat_tower_base", class06993, true));
      class05180x = class05160.N(var5, class05160.N(var1, class05180x, new class07209(0, 4, 0), "fat_tower_middle", class06993, true));

      for (int i = 0; i < 2 && var6.y(3) != 0; i++) {
         class05180x = class05160.N(var5, class05160.N(var1, class05180x, new class07209(0, 8, 0), "fat_tower_middle", class06993, true));

         for (class05034<class06993, class07209> class05034 : class05160.i) {
            if (var6.Z()) {
               class05180 class05180x = class05160.N(var5, class05160.N(var1, class05180x, class05034.y(), "bridge_end", class06993.N(class05034.N()), true));
               class05160.N(var1, class05160.u, var2 + 1, class05180x, null, var5, var6);
            }
         }
      }

      class05180x = class05160.N(var5, class05160.N(var1, class05180x, new class07209(-2, 8, -2), "fat_tower_top", class06993, true));
      return true;
   }
}
