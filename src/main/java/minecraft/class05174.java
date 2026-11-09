package minecraft;

import java.util.List;

class class05174 implements class05159 {
   public boolean N;

   class05174() {
      super();
   }

   @Override
   public void N() {
      this.N = false;
   }

   @Override
   public boolean N(class01224 var1, int var2, class05180 var3, class07209 var4, List<class04890> var5, class06069 var6) {
      class06993 class06993 = var3.U().u();
      int i = var6.y(4) + 1;
      class05180 class05180 = class05160.N(var5, class05160.N(var1, var3, new class07209(0, 0, -4), "bridge_piece", class06993, true));
      class05180.y(-1);
      byte b0 = 0;

      for (int j = 0; j < i; j++) {
         if (var6.Z()) {
            class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(0, b0, -4), "bridge_piece", class06993, true));
            b0 = 0;
         } else {
            if (var6.Z()) {
               class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(0, b0, -4), "bridge_steep_stairs", class06993, true));
            } else {
               class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(0, b0, -8), "bridge_gentle_stairs", class06993, true));
            }

            b0 = 4;
         }
      }

      if (!this.N && var6.y(10 - var2) == 0) {
         class05160.N(var5, class05160.N(var1, class05180, new class07209(-8 + var6.y(8), b0, -70 + var6.y(10)), "ship", class06993, true));
         this.N = true;
      } else if (!class05160.N(var1, class05160.N, var2 + 1, class05180, new class07209(-3, b0 + 1, -11), var5, var6)) {
         return false;
      }

      class05180 = class05160.N(var5, class05160.N(var1, class05180, new class07209(4, b0, 0), "bridge_end", class06993.N(class06993.field_11464), true));
      class05180.y(-1);
      return true;
   }
}
