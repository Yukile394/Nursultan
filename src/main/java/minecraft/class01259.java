package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.FieldFinder;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.CompoundList.CompoundListType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class class01259 extends DataFix {
   public class01259(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected static <A> Type<Pair<Either<A, Unit>, Dynamic<?>>> y(String var0, Type<A> var1) {
      return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.remainderType());
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      long i = var1.get("seed").asLong(0L);
      return new Dynamic(var1.getOps(), class05972.N(var1, i, class05972.N(var1, i), false));
   }

   protected static <A> Type<Pair<A, Dynamic<?>>> N(String var0, Type<A> var1) {
      return DSL.and(DSL.field(var0, var1), DSL.remainderType());
   }

   protected static <A1, A2> Type<Pair<Either<A1, Unit>, Pair<Either<A2, Unit>, Dynamic<?>>>> N(String var0, Type<A1> var1, String var2, Type<A2> var3) {
      return DSL.and(DSL.optional(DSL.field(var0, var1)), DSL.optional(DSL.field(var2, var3)), DSL.remainderType());
   }

   protected static Type<? extends Pair<? extends Either<? extends Pair<? extends Either<?, Unit>, ? extends Pair<? extends Either<? extends List<? extends Pair<? extends Either<?, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>>, Unit>, Dynamic<?>>> N(
      Schema var0
   ) {
      return y("settings", N("biome", var0.getType(class06962.p), "layers", DSL.list(y("block", var0.getType(class06962.q)))));
   }

   protected TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      Type type = DSL.taggedChoiceType(
         "type",
         DSL.string(),
         ImmutableMap.of(
            "minecraft:debug",
            DSL.remainderType(),
            "minecraft:flat",
            N(schema),
            "minecraft:noise",
            N(
               "biome_source",
               DSL.taggedChoiceType(
                  "type",
                  DSL.string(),
                  ImmutableMap.of(
                     "minecraft:fixed",
                     N("biome", schema.getType(class06962.p)),
                     "minecraft:multi_noise",
                     DSL.list(N("biome", schema.getType(class06962.p))),
                     "minecraft:checkerboard",
                     N("biomes", DSL.list(schema.getType(class06962.p))),
                     "minecraft:vanilla_layered",
                     DSL.remainderType(),
                     "minecraft:the_end",
                     DSL.remainderType()
                  )
               ),
               "settings",
               DSL.or(DSL.string(), N("default_block", schema.getType(class06962.q), "default_fluid", schema.getType(class06962.q)))
            )
         )
      );
      CompoundListType compoundlisttype = DSL.compoundList(class00622.N(), N("generator", type));
      Type type1 = DSL.and(compoundlisttype, DSL.remainderType());
      Type type2 = schema.getType(class06962.A);
      FieldFinder fieldfinder = new FieldFinder("dimensions", type1);
      if (!type2.findFieldType("dimensions").equals(type1)) {
         throw new IllegalStateException();
      } else {
         OpticFinder opticfinder = compoundlisttype.finder();
         return this.fixTypeEverywhereTyped(
            "MissingDimensionFix", type2, var4x -> var4x.updateTyped(fieldfinder, var4xx -> var4xx.updateTyped(opticfinder, var3xxx -> {
               if (!(var3xxx.getValue() instanceof List)) {
                  throw new IllegalStateException("List exptected");
               } else if (((List)var3xxx.getValue()).isEmpty()) {
                  Dynamic dynamic = (Dynamic)var4x.get(DSL.remainderFinder());
                  Dynamic dynamic1 = this.N(dynamic);
                  return (Typed)DataFixUtils.orElse(compoundlisttype.readTyped(dynamic1).result().map(Pair::getFirst), var3xxx);
               } else {
                  return var3xxx;
               }
            }))
         );
      }
   }
}
