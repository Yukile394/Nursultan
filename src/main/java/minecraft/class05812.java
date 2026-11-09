package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class class05812 extends DataFix {
   public class05812(Schema var1) {
      super(var1, true);
   }

   private <ItemStackOld, ItemStackNew> TypeRewriteRule N(Type<ItemStackOld> var1, Type<ItemStackNew> var2) {
      Type type = DSL.named(class06962.g.typeName(), DSL.optional(DSL.field("Equipment", DSL.list(var1))));
      Type type1 = DSL.named(
         class06962.g.typeName(),
         DSL.and(
            DSL.optional(DSL.field("ArmorItems", DSL.list(var2))),
            DSL.optional(DSL.field("HandItems", DSL.list(var2))),
            DSL.optional(DSL.field("body_armor_item", var2)),
            DSL.optional(DSL.field("saddle", var2))
         )
      );
      if (!type.equals(this.getInputSchema().getType(class06962.g))) {
         throw new IllegalStateException("Input entity_equipment type does not match expected");
      } else if (!type1.equals(this.getOutputSchema().getType(class06962.g))) {
         throw new IllegalStateException("Output entity_equipment type does not match expected");
      } else {
         return TypeRewriteRule.seq(
            this.fixTypeEverywhereTyped(
               "EntityEquipmentToArmorAndHandFix - drop chances",
               this.getInputSchema().getType(class06962.o),
               var0 -> var0.update(DSL.remainderFinder(), class05812::N)
            ),
            this.fixTypeEverywhere(
               "EntityEquipmentToArmorAndHandFix - equipment",
               type,
               type1,
               var1x -> {
                  Object object = ((Pair)var2.read(new Dynamic(var1x).emptyMap())
                        .result()
                        .orElseThrow(() -> new IllegalStateException("Could not parse newly created empty itemstack.")))
                     .getFirst();
                  Either either = Either.right(DSL.unit());
                  return var2x -> var2x.mapSecond(var2xx -> {
                     List list = (List)var2xx.map(Function.identity(), var0xxx -> List.of());
                     Either eitherx = Either.right(DSL.unit());
                     Either either1 = Either.right(DSL.unit());
                     if (!list.isEmpty()) {
                        eitherx = Either.left(Lists.newArrayList(new Object[]{list.getFirst(), object}));
                     }

                     if (list.size() > 1) {
                        ArrayList arraylist = Lists.newArrayList(new Object[]{object, object, object, object});

                        for (int i = 1; i < Math.min(list.size(), 5); i++) {
                           arraylist.set(i - 1, list.get(i));
                        }

                        either1 = Either.left(arraylist);
                     }

                     return Pair.of(either1, Pair.of(eitherx, Pair.of(either, either)));
                  });
               }
            )
         );
      }
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      Optional optional = var0.get("DropChances").asStreamOpt().result();
      var0 = var0.remove("DropChances");
      if (optional.isPresent()) {
         Iterator iterator = Stream.concat(((Stream)optional.get()).map(var0x -> var0x.asFloat(0.0F)), Stream.generate(() -> 0.0F)).iterator();
         float f = (Float)iterator.next();
         if (var0.get("HandDropChances").result().isEmpty()) {
            var0 = var0.set("HandDropChances", var0.createList(Stream.of(f, 0.0F).map(var0::createFloat)));
         }

         if (var0.get("ArmorDropChances").result().isEmpty()) {
            var0 = var0.set(
               "ArmorDropChances",
               var0.createList(Stream.of((Float)iterator.next(), (Float)iterator.next(), (Float)iterator.next(), (Float)iterator.next()).map(var0::createFloat))
            );
         }
      }

      return var0;
   }

   public TypeRewriteRule makeRule() {
      return this.N(this.getInputSchema().getTypeRaw(class06962.l), this.getOutputSchema().getTypeRaw(class06962.l));
   }
}
