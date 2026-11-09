package minecraft;

import java.util.List;

public class class06274 extends class04972<class05670> {
   private static final class01894 N = class01894.y("container/furnace/lit_progress");
   private static final class01894 y = class01894.y("container/furnace/burn_progress");
   private static final class01894 L = class01894.y("textures/gui/container/furnace.png");
   private static final class00392 u = class00392.L("gui.recipebook.toggleRecipes.smeltable");
   private static final List<class05322> n = List.of(
      new class05322(class00296.field_54838),
      new class05322(class06570.bo, class06222.i),
      new class05322(class06570.y, class06222.R),
      new class05322(class06570.jW, class06570.Ty, class06222.M)
   );

   public class06274(class05670 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3, u, L, N, y, n);
   }
}
