package minecraft;

import java.util.List;

public class class05055 extends class05306<class07476> {
   private static final class01883 B = new class01883(
      class01894.y("recipe_book/furnace_filter_enabled"),
      class01894.y("recipe_book/furnace_filter_disabled"),
      class01894.y("recipe_book/furnace_filter_enabled_highlighted"),
      class01894.y("recipe_book/furnace_filter_disabled_highlighted")
   );
   private final class00392 Z;

   public class05055(class07476 var1, class00392 var2, List<class05322> var3) {
      super(var1, var3);
      this.Z = var2;
   }

   @Override
   protected class01883 y() {
      return B;
   }

   @Override
   protected void N(class05287 var1, class02741 var2) {
      var1.N(var2, var0 -> var0 instanceof class00240);
   }

   @Override
   protected void N(class02429 var1, class00265 var2, class00311 var3) {
      var1.y(this.R.E(), var3, var2.u());
      if (var2 instanceof class00240 class00240) {
         var1.N(this.R.T.get(0), var3, class00240.y());
         class06937 class06937 = this.R.T.get(1);
         if (class06937.i().R()) {
            var1.N(class06937, var3, class00240.L());
         }
      }
   }

   @Override
   protected boolean N(class06937 var1) {
      return switch (var1.u) {
         case 0, 1, 2 -> true;
         default -> false;
      };
   }

   @Override
   protected class00392 R() {
      return this.Z;
   }
}
