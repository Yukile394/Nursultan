package minecraft;

import java.util.List;

class class05311 extends class05328 {
   private static final class01894 L = class01894.y("recipe_book/furnace_overlay");
   private static final class01894 u = class01894.y("recipe_book/furnace_overlay_highlighted");
   private static final class01894 i = class01894.y("recipe_book/furnace_overlay_disabled");
   private static final class01894 R = class01894.y("recipe_book/furnace_overlay_disabled_highlighted");

   public class05311(class05299 var1, int var2, int var3, class00329 var4, class00265 var5, class00311 var6, boolean var7) {
      super((int)var1, var2, var3, (boolean)var4, var7, N(var5, var6));
   }

   private static List<class05303> N(class00265 var0, class00311 var1) {
      if (var0 instanceof class00240) {
         List<class06584> list = ((class00240)var0).y().N(var1);
         if (!list.isEmpty()) {
            return List.of(N(1, 1, list));
         }
      }

      return List.of();
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
