package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import java.util.Optional;

public class class01094 extends DataFix {
   public class01094(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private <OldEntityTree, NewEntityTree, Entity> TypeRewriteRule N(
      Schema var1, Schema var2, Type<OldEntityTree> var3, Type<NewEntityTree> var4, Type<Entity> var5
   ) {
      Type type = DSL.named(class06962.J.typeName(), DSL.and(DSL.optional(DSL.field("Riding", var3)), var5));
      Type type1 = DSL.named(class06962.J.typeName(), DSL.and(DSL.optional(DSL.field("Passengers", DSL.list(var4))), var5));
      Type<?> type2 = var1.getType(class06962.J);
      Type<?> type3 = var2.getType(class06962.J);
      if (!Objects.equals(type2, type)) {
         throw new IllegalStateException("Old entity type is not what was expected.");
      } else if (!type3.equals(type1, true, true)) {
         throw new IllegalStateException("New entity type is not what was expected.");
      } else {
         OpticFinder opticfinder = DSL.typeFinder(type);
         OpticFinder opticfinder1 = DSL.typeFinder(type1);
         OpticFinder opticfinder2 = DSL.typeFinder(var4);
         Type<?> type4 = var1.getType(class06962.L);
         Type<?> type5 = var2.getType(class06962.L);
         return TypeRewriteRule.seq(
            this.fixTypeEverywhere(
               "EntityRidingToPassengerFix",
               type,
               type1,
               var5x -> var6x -> {
                  Optional optional = Optional.empty();
                  Pair pair = var6x;

                  while (true) {
                     Either either = (Either)DataFixUtils.orElse(
                        optional.map(
                           var4xxx -> Either.left(
                              ImmutableList.of(
                                 ((Typed)var4.pointTyped(var5x).orElseThrow(() -> new IllegalStateException("Could not create new entity tree")))
                                    .set(opticfinder1, var4xxx)
                                    .getOptional(opticfinder2)
                                    .orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"))
                              )
                           )
                        ),
                        Either.right(DSL.unit())
                     );
                     optional = Optional.of(Pair.of(class06962.J.typeName(), Pair.of(either, ((Pair)pair.getSecond()).getSecond())));
                     Optional optional1 = ((Either)((Pair)pair.getSecond()).getFirst()).left();
                     if (optional1.isEmpty()) {
                        return (Pair)optional.orElseThrow(() -> new IllegalStateException("Should always have an entity tree here"));
                     }

                     pair = (Pair)new Typed(var3, var5x, optional1.get())
                        .getOptional(opticfinder)
                        .orElseThrow(() -> new IllegalStateException("Should always have an entity here"));
                  }
               }
            ),
            this.writeAndRead("player RootVehicle injecter", type4, type5)
         );
      }
   }

   public TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      Schema schema1 = this.getOutputSchema();
      Type<?> type = schema.getTypeRaw(class06962.J);
      Type<?> type1 = schema1.getTypeRaw(class06962.J);
      Type<?> type2 = schema.getTypeRaw(class06962.o);
      return this.N(schema, schema1, type, type1, type2);
   }
}
