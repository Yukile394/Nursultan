package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class class08632 extends DataFix {
   public class08632(Schema var1) {
      super(var1, true);
   }

   private <ItemStackOld, ItemStackNew> TypeRewriteRule N(Type<ItemStackOld> var1, Type<ItemStackNew> var2, OpticFinder<?> var3) {
      Type type = DSL.named(
         class06962.g.typeName(),
         DSL.and(
            DSL.optional(DSL.field("ArmorItems", DSL.list(var1))),
            DSL.optional(DSL.field("HandItems", DSL.list(var1))),
            DSL.optional(DSL.field("body_armor_item", var1)),
            DSL.optional(DSL.field("saddle", var1))
         )
      );
      Type type1 = DSL.named(
         class06962.g.typeName(),
         DSL.optional(
            DSL.field(
               "equipment",
               DSL.and(
                  DSL.optional(DSL.field("mainhand", var2)),
                  DSL.optional(DSL.field("offhand", var2)),
                  DSL.optional(DSL.field("feet", var2)),
                  DSL.and(
                     DSL.optional(DSL.field("legs", var2)),
                     DSL.optional(DSL.field("chest", var2)),
                     DSL.optional(DSL.field("head", var2)),
                     DSL.and(DSL.optional(DSL.field("body", var2)), DSL.optional(DSL.field("saddle", var2)), DSL.remainderType())
                  )
               )
            )
         )
      );
      if (!type.equals(this.getInputSchema().getType(class06962.g))) {
         throw new IllegalStateException("Input entity_equipment type does not match expected");
      } else if (!type1.equals(this.getOutputSchema().getType(class06962.g))) {
         throw new IllegalStateException("Output entity_equipment type does not match expected");
      } else {
         return this.fixTypeEverywhere(
            "EquipmentFormatFix",
            type,
            type1,
            var2x -> var2xx -> {
               String s = (String)var2xx.getFirst();
               Pair pair = (Pair)var2xx.getSecond();
               List list = (List)((Either)pair.getFirst()).map(Function.identity(), var0xx -> List.of());
               List list1 = (List)((Either)((Pair)pair.getSecond()).getFirst()).map(Function.identity(), var0xx -> List.of());
               Either either = (Either)((Pair)((Pair)pair.getSecond()).getSecond()).getFirst();
               Either either1 = (Either)((Pair)((Pair)pair.getSecond()).getSecond()).getSecond();
               Either either2 = N(0, list, var0x);
               Either either3 = N(1, list, var0x);
               Either either4 = N(2, list, var0x);
               Either either5 = N(3, list, var0x);
               Either either6 = N(0, list1, var0x);
               Either either7 = N(1, list1, var0x);
               return N(either, either1, either2, either3, either4, either5, either6, either7)
                  ? Pair.of(s, Either.right(Unit.INSTANCE))
                  : Pair.of(
                     s,
                     Either.left(
                        Pair.of(
                           either6,
                           Pair.of(
                              either7,
                              Pair.of(either2, Pair.of(either3, Pair.of(either4, Pair.of(either5, Pair.of(either, Pair.of(either1, new Dynamic(var2x)))))))
                           )
                        )
                     )
                  );
            }
         );
      }
   }

   @SafeVarargs
   private static boolean N(Either<?, Unit>... var0) {
      Either[] aeither = var0;
      int i = var0.length;

      for (int j = 0; j < i; j++) {
         if (aeither[j].right().isEmpty()) {
            return false;
         }
      }

      return true;
   }

   private static <ItemStack> Either<ItemStack, Unit> N(int var0, List<ItemStack> var1, Predicate<ItemStack> var2) {
      if (var0 >= var1.size()) {
         return Either.right(Unit.INSTANCE);
      } else {
         Object object = var1.get(var0);
         return var2.test(object) ? Either.right(Unit.INSTANCE) : Either.left(object);
      }
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getTypeRaw(class06962.l);
      Type<?> type1 = this.getOutputSchema().getTypeRaw(class06962.l);
      OpticFinder<?> opticfinder = type.findField("id");
      return this.N(type, type1, opticfinder);
   }
}
