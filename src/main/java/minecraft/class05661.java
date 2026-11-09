package minecraft;

import java.util.List;

public class class05661 extends class04972<class06096> {
   private static final class01894 N = class01894.y("container/blast_furnace/lit_progress");
   private static final class01894 y = class01894.y("container/blast_furnace/burn_progress");
   private static final class01894 L = class01894.y("textures/gui/container/blast_furnace.png");
   private static final class00392 u = class00392.L("gui.recipebook.toggleRecipes.blastable");
   private static final List<class05322> n = List.of(
      new class05322(class00296.field_54839), new class05322(class06570.Nn, class06222.B), new class05322(class06570.Tq, class06570.bk, class06222.Z)
   );

   public class05661(class06096 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3, u, L, N, y, n);
   }
}
