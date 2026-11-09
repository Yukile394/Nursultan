package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;
import net.fabricmc.fabric.impl.dimension.TaggedChoiceExtension;

public class class03310 extends class00622 {
   public class03310(int var1, Schema var2) {
      super(var1, var2);
   }

   private static TaggedChoice N(String var0, Type var1, Map var2) {
      TaggedChoice taggedchoice = DSL.taggedChoiceLazy(var0, var1, var2);
      ((TaggedChoiceExtension)taggedchoice).fabric$setFailSoft(true);
      return taggedchoice;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class06962.u,
         () -> DSL.fields(
            "Level",
            DSL.optionalFields(
               "Entities",
               DSL.list(class06962.J.in(var1)),
               "TileEntities",
               DSL.list(DSL.or(class06962.G.in(var1), DSL.remainder())),
               "TileTicks",
               DSL.list(DSL.fields("i", class06962.q.in(var1))),
               "Sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes",
                     DSL.optionalFields("palette", DSL.list(class06962.p.in(var1))),
                     "block_states",
                     DSL.optionalFields("palette", DSL.list(class06962.d.in(var1)))
                  )
               ),
               "Structures",
               DSL.optionalFields("Starts", DSL.compoundList(class06962.H.in(var1)))
            )
         )
      );
      var1.registerType(false, class06962.F, () -> DSL.constType(N()));
      var1.registerType(
         false,
         class06962.A,
         () -> DSL.fields(
            "dimensions",
            DSL.compoundList(
               DSL.constType(N()),
               DSL.fields(
                  "generator",
                  N(
                     "type",
                     DSL.string(),
                     ImmutableMap.of(
                        "minecraft:debug",
                        DSL::remainder,
                        "minecraft:flat",
                        (Supplier)() -> DSL.optionalFields(
                           "settings",
                           DSL.optionalFields("biome", class06962.p.in(var1), "layers", DSL.list(DSL.optionalFields("block", class06962.q.in(var1))))
                        ),
                        "minecraft:noise",
                        (Supplier)() -> DSL.optionalFields(
                           "biome_source",
                           N(
                              "type",
                              DSL.string(),
                              ImmutableMap.of(
                                 "minecraft:fixed",
                                 (Supplier)() -> DSL.fields("biome", class06962.p.in(var1)),
                                 "minecraft:multi_noise",
                                 (Supplier)() -> DSL.or(DSL.fields("preset", class06962.F.in(var1)), DSL.list(DSL.fields("biome", class06962.p.in(var1)))),
                                 "minecraft:checkerboard",
                                 (Supplier)() -> DSL.fields("biomes", DSL.list(class06962.p.in(var1))),
                                 "minecraft:the_end",
                                 DSL::remainder
                              )
                           ),
                           "settings",
                           DSL.or(
                              DSL.constType(DSL.string()), DSL.optionalFields("default_block", class06962.q.in(var1), "default_fluid", class06962.q.in(var1))
                           )
                        )
                     )
                  )
               )
            )
         )
      );
   }
}
