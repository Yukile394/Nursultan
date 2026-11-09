package minecraft;

import java.util.List;

public class class02411 extends class05306<class02763> {
   private static final class01883 B = new class01883(
      class01894.y("recipe_book/filter_enabled"),
      class01894.y("recipe_book/filter_disabled"),
      class01894.y("recipe_book/filter_enabled_highlighted"),
      class01894.y("recipe_book/filter_disabled_highlighted")
   );
   private static final class00392 Z = class00392.L("gui.recipebook.toggleRecipes.craftable");
   private static final List<class05322> z = List.of(
      new class05322(class00296.field_54837),
      new class05322(class06570.TV, class06570.TQ, class06222.L),
      new class05322(class06570.iA, class06222.N),
      new class05322(class06570.jW, class06570.sS, class06222.u),
      new class05322(class06570.WY, class06222.y)
   );

   public class02411(class02763 var1) {
      super(var1, z);
   }

   @Override
   protected class01883 y() {
      return B;
   }

   private boolean y(class00265 var1) {
      int i = this.R.b();
      int j = this.R.j();

      return switch (var1) {
         case class00326 class00326 -> i >= class00326.y() && j >= class00326.L();
         case class00315 class00315 -> i * j >= class00315.y().size();
         default -> false;
      };
   }

   @Override
   protected void N(class05287 var1, class02741 var2) {
      var1.N(var2, this::y);
   }

   @Override
   protected boolean N(class06937 var1) {
      return this.R.W() == var1 || this.R.m().contains(var1);
   }

   @Override
   protected void N(class02429 var1, class00265 var2, class00311 var3) {
      var1.y(this.R.W(), var3, ((class00265)var2).u());
      switch (var2) {
         case class00326 class00326:
            List<class06937> list1 = this.R.m();
            class02604.N(this.R.b(), this.R.j(), class00326.y(), class00326.L(), class00326.R(), (var3x, var4, var5, var6x) -> {
               class06937 class06937 = list1.get(var4);
               var1.N(class06937, var3, var3x);
            });
            break;
         case class00315 var7:
            label15: {
               List<class06937> list = this.R.m();
               int i = Math.min(var7.y().size(), list.size());

               for (int j = 0; j < i; j++) {
                  var1.N(list.get(j), var3, var7.y().get(j));
               }
               break label15;
            }
         default:
      }
   }

   @Override
   protected class00392 R() {
      return Z;
   }
}
