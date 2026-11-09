package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08573 extends DataFix {
   public class08573(Schema var1) {
      super(var1, false);
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      return class02269.N(var0, "CX", "CY", "CZ", "center")
         .renameField("Id", "id")
         .renameField("Started", "started")
         .renameField("Active", "active")
         .renameField("TicksActive", "ticks_active")
         .renameField("BadOmenLevel", "raid_omen_level")
         .renameField("GroupsSpawned", "groups_spawned")
         .renameField("PreRaidTicks", "cooldown_ticks")
         .renameField("PostRaidTicks", "post_raid_ticks")
         .renameField("TotalHealth", "total_health")
         .renameField("NumGroups", "group_count")
         .renameField("Status", "status")
         .renameField("HeroesOfTheVillage", "heroes_of_the_village");
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.renameAndFixField("Raids", "raids", var0x -> var0x.createList(var0x.asStream().map(class08573::y)))
         .renameField("Tick", "tick")
         .renameField("NextAvailableID", "next_id");
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "RaidRenamesDataFix",
         this.getInputSchema().getType(class06962.W),
         var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.update("data", class08573::N))
      );
   }
}
