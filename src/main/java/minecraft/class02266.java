package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class02266 extends DataFix {
   private static final List<String> N = List.of(
      "minecraft:witch", "minecraft:ravager", "minecraft:pillager", "minecraft:illusioner", "minecraft:evoker", "minecraft:vindicator"
   );

   public class02266(Schema var1) {
      super(var1, true);
   }

   private void y(List<TypeRewriteRule> var1) {
      var1.add(this.N(class06962.G, "minecraft:beehive", Map.of("FlowerPos", "flower_pos")));
      var1.add(this.N(class06962.G, "minecraft:end_gateway", Map.of("ExitPortal", "exit_portal")));
   }

   private Typed<?> N(Typed<?> var1, Map<String, String> var2) {
      return var1.update(DSL.remainderFinder(), var1x -> {
         for (Entry entry : var2.entrySet()) {
            var1x = var1x.renameAndFixField((String)entry.getKey(), (String)entry.getValue(), class02269::N);
         }

         return var1x;
      });
   }

   private void N(List<TypeRewriteRule> var1) {
      var1.add(this.N(class06962.o, "minecraft:bee", Map.of("HivePos", "hive_pos", "FlowerPos", "flower_pos")));
      var1.add(this.N(class06962.o, "minecraft:end_crystal", Map.of("BeamTarget", "beam_target")));
      var1.add(this.N(class06962.o, "minecraft:wandering_trader", Map.of("WanderTarget", "wander_target")));

      for (String s : N) {
         var1.add(this.N(class06962.o, s, Map.of("PatrolTarget", "patrol_target")));
      }

      var1.add(
         this.fixTypeEverywhereTyped(
            "BlockPos format in Leash for mobs",
            this.getInputSchema().getType(class06962.o),
            var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.renameAndFixField("Leash", "leash", class02269::N))
         )
      );
   }

   private TypeRewriteRule N(TypeReference var1, String var2, Map<String, String> var3) {
      String s = "BlockPos format in " + var3.keySet() + " for " + var2 + " (" + var1.typeName() + ")";
      OpticFinder opticfinder = DSL.namedChoice(var2, this.getInputSchema().getChoiceType(var1, var2));
      return this.fixTypeEverywhereTyped(s, this.getInputSchema().getType(var1), var3x -> var3x.updateTyped(opticfinder, var2xx -> this.N(var2xx, var3)));
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.update("frames", var0 -> var0.createList(var0.asStream().map(var0x -> {
         var0x = var0x.renameAndFixField("Pos", "pos", class02269::N);
         var0x = var0x.renameField("Rotation", "rotation");
         return var0x.renameField("EntityId", "entity_id");
      }))).update("banners", var0 -> var0.createList(var0.asStream().map(var0x -> {
         var0x = var0x.renameField("Pos", "pos");
         var0x = var0x.renameField("Color", "color");
         return var0x.renameField("Name", "name");
      })));
   }

   public TypeRewriteRule makeRule() {
      ArrayList arraylist = new ArrayList();
      this.N(arraylist);
      this.y(arraylist);
      arraylist.add(
         this.writeFixAndRead(
            "BlockPos format for map frames",
            this.getInputSchema().getType(class06962.U),
            this.getOutputSchema().getType(class06962.U),
            var1x -> var1x.update("data", this::N)
         )
      );
      Type<?> type = this.getInputSchema().getType(class06962.l);
      arraylist.add(
         this.fixTypeEverywhereTyped(
            "BlockPos format for compass target",
            type,
            class03952.N(type, "minecraft:compass"::equals, var0 -> var0.update(DSL.remainderFinder(), var0x -> var0x.update("LodestonePos", class02269::N)))
         )
      );
      return TypeRewriteRule.seq(arraylist);
   }
}
