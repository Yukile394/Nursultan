package minecraft;

import Nursultan.class10758;
import java.util.function.Consumer;

public class class07088 implements class02026 {
   public class07088() {
      super();
   }

   @Override
   public void N(class01929 var1, Consumer<class03711> var2) {
      class01921 class01921 = var1.y(class04227.I);
      class03711 class03711xxx = class07165.N()
         .N(
            class00869.MP,
            class00392.L("advancements.end.root.title"),
            class00392.L("advancements.end.root.description"),
            class01894.y("gui/advancements/backgrounds/end"),
            class07296.field_1254,
            false,
            false,
            false
         )
         .N("entered_end", class00767.N(class07299.field_25181))
         .N(var2, "end/root");
      class03711 class03711x = class07165.N()
         .N(class03711xxx)
         .N(
            class00869.BI,
            class00392.L("advancements.end.kill_dragon.title"),
            class00392.L("advancements.end.kill_dragon.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("killed_dragon", class00825.N(class00810.N().N(class01921, class07078.f)))
         .N(var2, "end/kill_dragon");
      class03711 class03711xx = class07165.N()
         .N(class03711x)
         .N(
            class06570.nz,
            class00392.L("advancements.end.enter_end_gateway.title"),
            class00392.L("advancements.end.enter_end_gateway.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("entered_end_gateway", class00858.N(class00869.EY))
         .N(var2, "end/enter_end_gateway");
      class07165.N()
         .N(class03711x)
         .N(
            class06570.ln,
            class00392.L("advancements.end.respawn_dragon.title"),
            class00392.L("advancements.end.respawn_dragon.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("summoned_dragon", class07691.N(class00810.N().N(class01921, class07078.f)))
         .N(var2, "end/respawn_dragon");
      class03711 class03711xxx = class07165.N()
         .N(class03711xx)
         .N(
            class00869.Ej,
            class00392.L("advancements.end.find_end_city.title"),
            class00392.L("advancements.end.find_end_city.description"),
            null,
            class07296.field_1254,
            true,
            true,
            false
         )
         .N("in_city", class07682.N(class00818.y(var1.y(class04227.yj).y(class04433.T))))
         .N(var2, "end/find_end_city");
      class07165.N()
         .N(class03711x)
         .N(
            class06570.lQ,
            class00392.L("advancements.end.dragon_breath.title"),
            class00392.L("advancements.end.dragon_breath.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("dragon_breath", class00843.N(class06570.lQ))
         .N(var2, "end/dragon_breath");
      class07165.N()
         .N(class03711xxx)
         .N(
            class06570.lp,
            class00392.L("advancements.end.levitate.title"),
            class00392.L("advancements.end.levitate.description"),
            null,
            class07296.field_1250,
            true,
            true,
            false
         )
         .N(class10758.N(50))
         .N("levitated", class00840.N(class00761.y(class00816.y(50.0))))
         .N(var2, "end/levitate");
      class07165.N()
         .N(class03711xxx)
         .N(
            class06570.sT,
            class00392.L("advancements.end.elytra.title"),
            class00392.L("advancements.end.elytra.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("elytra", class00843.N(class06570.sT))
         .N(var2, "end/elytra");
      class07165.N()
         .N(class03711x)
         .N(
            class00869.Ms,
            class00392.L("advancements.end.dragon_egg.title"),
            class00392.L("advancements.end.dragon_egg.description"),
            null,
            class07296.field_1249,
            true,
            true,
            false
         )
         .N("dragon_egg", class00843.N(class00869.Ms))
         .N(var2, "end/dragon_egg");
   }
}
