package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class class08406 extends DataFix {
   private Dynamic<?> L(Dynamic<?> var1) {
      return class02269.N(var1.renameField("LifeTicks", "life_ticks"), "BoundX", "BoundY", "BoundZ", "bound_pos");
   }

   public class08406(Schema var1) {
      super(var1, false);
   }

   private Dynamic<?> i(Dynamic<?> var1) {
      var1 = var1.remove("TravelPosX").remove("TravelPosY").remove("TravelPosZ");
      var1 = class02269.N(var1, "HomePosX", "HomePosY", "HomePosZ", "home_pos");
      return var1.renameField("HasEgg", "has_egg");
   }

   private Dynamic<?> u(Dynamic<?> var1) {
      return class02269.N(var1.renameField("Size", "size"), "AX", "AY", "AZ", "anchor_pos");
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return class02269.N(var1, "SleepingX", "SleepingY", "SleepingZ", "sleeping_pos");
   }

   private OpticFinder<?> N(String var1) {
      return DSL.namedChoice(var1, this.getInputSchema().getChoiceType(class06962.o, var1));
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      var1 = this.y(var1);
      Optional optional = var1.get("SpawnX").asNumber().result();
      Optional optional1 = var1.get("SpawnY").asNumber().result();
      Optional optional2 = var1.get("SpawnZ").asNumber().result();
      if (optional.isPresent() && optional1.isPresent() && optional2.isPresent()) {
         Dynamic dynamic = var1.createMap(
            Map.of(
               var1.createString("pos"),
               class02269.N(var1, ((Number)optional.get()).intValue(), ((Number)optional1.get()).intValue(), ((Number)optional2.get()).intValue())
            )
         );
         dynamic = Dynamic.copyField(var1, "SpawnAngle", dynamic, "angle");
         dynamic = Dynamic.copyField(var1, "SpawnDimension", dynamic, "dimension");
         dynamic = Dynamic.copyField(var1, "SpawnForced", dynamic, "forced");
         var1 = var1.remove("SpawnX").remove("SpawnY").remove("SpawnZ").remove("SpawnAngle").remove("SpawnDimension").remove("SpawnForced");
         var1 = var1.set("respawn", dynamic);
      }

      Optional optional3 = var1.get("enteredNetherPosition").result();
      if (optional3.isPresent()) {
         var1 = var1.remove("enteredNetherPosition")
            .set(
               "entered_nether_pos",
               var1.createList(
                  Stream.of(
                     var1.createDouble(((Dynamic)optional3.get()).get("x").asDouble(0.0)),
                     var1.createDouble(((Dynamic)optional3.get()).get("y").asDouble(0.0)),
                     var1.createDouble(((Dynamic)optional3.get()).get("z").asDouble(0.0))
                  )
               )
            );
      }

      return var1;
   }

   private Dynamic<?> R(Dynamic<?> var1) {
      return class02269.N(var1, "TileX", "TileY", "TileZ", "block_pos");
   }

   public TypeRewriteRule makeRule() {
      OpticFinder opticfinder = this.N("minecraft:vex");
      OpticFinder opticfinder1 = this.N("minecraft:phantom");
      OpticFinder opticfinder2 = this.N("minecraft:turtle");
      List list = List.of(this.N("minecraft:item_frame"), this.N("minecraft:glow_item_frame"), this.N("minecraft:painting"), this.N("minecraft:leash_knot"));
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "InlineBlockPosFormatFix - player", this.getInputSchema().getType(class06962.L), var1x -> var1x.update(DSL.remainderFinder(), this::N)
         ),
         this.fixTypeEverywhereTyped(
            "InlineBlockPosFormatFix - entity",
            this.getInputSchema().getType(class06962.o),
            var5 -> {
               var5 = var5.update(DSL.remainderFinder(), this::y)
                  .updateTyped(opticfinder, var1xx -> var1xx.update(DSL.remainderFinder(), this::L))
                  .updateTyped(opticfinder1, var1xx -> var1xx.update(DSL.remainderFinder(), this::u))
                  .updateTyped(opticfinder2, var1xx -> var1xx.update(DSL.remainderFinder(), this::i));

               for (OpticFinder opticfinderx : list) {
                  var5 = var5.updateTyped(opticfinderx, var1xx -> var1xx.update(DSL.remainderFinder(), this::R));
               }

               return var5;
            }
         )
      );
   }
}
