package minecraft;

public interface class04460 {
   int N = 256;
   float y = 7.0F;
   class05946<class04449> L = N("ponder_goat_horn");
   class05946<class04449> u = N("sing_goat_horn");
   class05946<class04449> i = N("seek_goat_horn");
   class05946<class04449> R = N("feel_goat_horn");
   class05946<class04449> M = N("admire_goat_horn");
   class05946<class04449> B = N("call_goat_horn");
   class05946<class04449> Z = N("yearn_goat_horn");
   class05946<class04449> z = N("dream_goat_horn");

   private static class05946<class04449> N(String var0) {
      return class05946.N(class04227.yZ, class01894.y(var0));
   }

   static void N(class04116<class04449> var0, class05946<class04449> var1, class03556<class04891> var2, float var3, float var4) {
      class05216 class05216 = class00392.L(class07536.N("instrument", var1.N()));
      var0.N(var1, new class04449(var2, var3, var4, class05216));
   }

   static void N(class04116<class04449> var0) {
      N(var0, L, (class03556<class04891>)class04909.PO.get(0), 7.0F, 256.0F);
      N(var0, u, (class03556<class04891>)class04909.PO.get(1), 7.0F, 256.0F);
      N(var0, i, (class03556<class04891>)class04909.PO.get(2), 7.0F, 256.0F);
      N(var0, R, (class03556<class04891>)class04909.PO.get(3), 7.0F, 256.0F);
      N(var0, M, (class03556<class04891>)class04909.PO.get(4), 7.0F, 256.0F);
      N(var0, B, (class03556<class04891>)class04909.PO.get(5), 7.0F, 256.0F);
      N(var0, Z, (class03556<class04891>)class04909.PO.get(6), 7.0F, 256.0F);
      N(var0, z, (class03556<class04891>)class04909.PO.get(7), 7.0F, 256.0F);
   }
}
