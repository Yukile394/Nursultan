package minecraft;

import java.util.Map;

public class class04914 {
   private static final int L = 32;
   static final class07209 N = new class07209(4, 0, 15);
   private static final class01894[] u = new class01894[]{
      class01894.y("shipwreck/with_mast"),
      class01894.y("shipwreck/sideways_full"),
      class01894.y("shipwreck/sideways_fronthalf"),
      class01894.y("shipwreck/sideways_backhalf"),
      class01894.y("shipwreck/rightsideup_full"),
      class01894.y("shipwreck/rightsideup_fronthalf"),
      class01894.y("shipwreck/rightsideup_backhalf"),
      class01894.y("shipwreck/with_mast_degraded"),
      class01894.y("shipwreck/rightsideup_full_degraded"),
      class01894.y("shipwreck/rightsideup_fronthalf_degraded"),
      class01894.y("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final class01894[] i = new class01894[]{
      class01894.y("shipwreck/with_mast"),
      class01894.y("shipwreck/upsidedown_full"),
      class01894.y("shipwreck/upsidedown_fronthalf"),
      class01894.y("shipwreck/upsidedown_backhalf"),
      class01894.y("shipwreck/sideways_full"),
      class01894.y("shipwreck/sideways_fronthalf"),
      class01894.y("shipwreck/sideways_backhalf"),
      class01894.y("shipwreck/rightsideup_full"),
      class01894.y("shipwreck/rightsideup_fronthalf"),
      class01894.y("shipwreck/rightsideup_backhalf"),
      class01894.y("shipwreck/with_mast_degraded"),
      class01894.y("shipwreck/upsidedown_full_degraded"),
      class01894.y("shipwreck/upsidedown_fronthalf_degraded"),
      class01894.y("shipwreck/upsidedown_backhalf_degraded"),
      class01894.y("shipwreck/sideways_full_degraded"),
      class01894.y("shipwreck/sideways_fronthalf_degraded"),
      class01894.y("shipwreck/sideways_backhalf_degraded"),
      class01894.y("shipwreck/rightsideup_full_degraded"),
      class01894.y("shipwreck/rightsideup_fronthalf_degraded"),
      class01894.y("shipwreck/rightsideup_backhalf_degraded")
   };
   static final Map<String, class05946<class05074>> y = Map.of("map_chest", class06273.J, "treasure_chest", class06273.q, "supply_chest", class06273.o);

   public class04914() {
      super();
   }

   public static class04940 N(class01224 var0, class07209 var1, class06993 var2, class03860 var3, class06069 var4, boolean var5) {
      class01894 class01894 = class07536.N((class01894[])(var5 ? u : i), var4);
      class04940 class04940 = new class04940(var0, class01894, var1, var2, var5);
      var3.N(class04940);
      return class04940;
   }
}
