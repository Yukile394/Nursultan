package minecraft;

public interface class08657 {
   int N = 182;
   int y = 5;
   int L = 24;
   class08657 u = new class08653();

   void y(class01054 var1, class02233 var2);

   default int y(class08844 var1) {
      return var1.s() - 24 - 5;
   }

   default int N(class08844 var1) {
      return (var1.P() - 182) / 2;
   }

   static void N(class01054 var0, class01590 var1, int var2) {
      class05216 class05216 = class00392.N("gui.experience.level", var2);
      int i = (var0.N() - var1.N(class05216)) / 2;
      int j = var0.y() - 24 - 9 - 2;
      var0.N(var1, class05216, i + 1, j, -16777216, false);
      var0.N(var1, class05216, i - 1, j, -16777216, false);
      var0.N(var1, class05216, i, j + 1, -16777216, false);
      var0.N(var1, class05216, i, j - 1, -16777216, false);
      var0.N(var1, class05216, i, j, -8323296, false);
   }

   void N(class01054 var1, class02233 var2);
}
