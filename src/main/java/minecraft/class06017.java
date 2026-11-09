package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class class06017 extends DataFix {
   public class06017(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private <R> Typed<?> N(Type<R> var1, Type<Pair<Either<Pair<List<Pair<R, Integer>>, Dynamic<?>>, Unit>, Dynamic<?>>> var2, Typed<?> var3) {
      Dynamic<?> dynamic = (Dynamic<?>)var3.getOrCreate(DSL.remainderFinder());
      int i = dynamic.get("RecipesUsedSize").asInt(0);
      dynamic = dynamic.remove("RecipesUsedSize");
      ArrayList arraylist = Lists.newArrayList();

      for (int j = 0; j < i; j++) {
         String s = "RecipeLocation" + j;
         String s1 = "RecipeAmount" + j;
         Optional<Dynamic<?>> optional = dynamic.get(s).result();
         int k = dynamic.get(s1).asInt(0);
         if (k > 0) {
            optional.ifPresent(var3x -> var1.read(var3x).result().ifPresent(var2xx -> arraylist.add(Pair.of(var2xx.getFirst(), k))));
         }

         dynamic = dynamic.remove(s).remove(s1);
      }

      return var3.set(DSL.remainderFinder(), var2, Pair.of(Either.left(Pair.of(arraylist, dynamic.emptyMap())), dynamic));
   }

   private <R> TypeRewriteRule N(Type<R> var1) {
      Type type = DSL.and(DSL.optional(DSL.field("RecipesUsed", DSL.and(DSL.compoundList(var1, DSL.intType()), DSL.remainderType()))), DSL.remainderType());
      OpticFinder opticfinder = DSL.namedChoice("minecraft:furnace", this.getInputSchema().getChoiceType(class06962.G, "minecraft:furnace"));
      OpticFinder opticfinder1 = DSL.namedChoice("minecraft:blast_furnace", this.getInputSchema().getChoiceType(class06962.G, "minecraft:blast_furnace"));
      OpticFinder opticfinder2 = DSL.namedChoice("minecraft:smoker", this.getInputSchema().getChoiceType(class06962.G, "minecraft:smoker"));
      Type<?> type1 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:furnace");
      Type<?> type2 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:blast_furnace");
      Type<?> type3 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:smoker");
      Type<?> type4 = this.getInputSchema().getType(class06962.G);
      Type<?> type5 = this.getOutputSchema().getType(class06962.G);
      return this.fixTypeEverywhereTyped(
         "FurnaceRecipesFix",
         type4,
         type5,
         var9x -> var9x.updateTyped(opticfinder, type1, var3xx -> this.N(var1, type, var3xx))
            .updateTyped(opticfinder1, type2, var3xx -> this.N(var1, type, var3xx))
            .updateTyped(opticfinder2, type3, var3xx -> this.N(var1, type, var3xx))
      );
   }

   protected TypeRewriteRule makeRule() {
      return this.N(this.getOutputSchema().getTypeRaw(class06962.a));
   }
}
