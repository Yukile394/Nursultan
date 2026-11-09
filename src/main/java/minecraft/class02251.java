package minecraft;

public interface class02251 {
   class05946<class02530> N = N("mob_spawn_equipment");
   class05946<class02530> y = N("pillager_spawn_crossbow");
   class05946<class02530> L = N("raid/pillager_post_wave_3");
   class05946<class02530> u = N("raid/pillager_post_wave_5");
   class05946<class02530> i = N("raid/vindicator");
   class05946<class02530> R = N("raid/vindicator_post_wave_5");
   class05946<class02530> M = N("enderman_loot_drop");

   static class05946<class02530> N(String var0) {
      return class05946.N(class04227.yi, class01894.y(var0));
   }

   static void N(class04116<class02530> var0) {
      class02055 class02055 = var0.N(class04227.yR);
      var0.N(N, new class02545(class02055.y(class02625.E), 5, 17));
      var0.N(y, new class02555(class02055.y(class07314.V), class02151.N(1)));
      var0.N(L, new class02555(class02055.y(class07314.K), class02151.N(1)));
      var0.N(u, new class02555(class02055.y(class07314.K), class02151.N(2)));
      var0.N(i, new class02555(class02055.y(class07314.m), class02151.N(1)));
      var0.N(R, new class02555(class02055.y(class07314.m), class02151.N(2)));
      var0.N(M, new class02555(class02055.y(class07314.t), class02151.N(1)));
   }
}
