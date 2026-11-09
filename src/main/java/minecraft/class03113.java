package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class class03113 extends DataFix {
   private static final String N = "minecraft:empty";

   private static <T> Typed<T> L(Typed<?> var0, Type<T> var1) {
      return new Typed(var1, var0.getOps(), var0.getValue());
   }

   public class03113(Schema var1) {
      super(var1, true);
   }

   private static <T> Typed<T> y(Typed<?> var0, Type<T> var1) {
      return class07536.N(var0, var1, var0x -> var0x.set("item", N(var0x, "minecraft:spectral_arrow")));
   }

   private static <T> Function<Typed<?>, Typed<?>> N(String var0, class03111<?> var1, Type<?> var2, Type<T> var3) {
      OpticFinder opticfinder = DSL.namedChoice(var0, var2);
      return var3x -> var3x.updateTyped(opticfinder, var3, var2xx -> var1.fix(var2xx, var3));
   }

   private Function<Typed<?>, Typed<?>> N(String var1, class03111<?> var2) {
      Type type = this.getInputSchema().getChoiceType(class06962.o, var1);
      Type type1 = this.getOutputSchema().getChoiceType(class06962.o, var1);
      return N(var1, var2, type, type1);
   }

   private static String N(Dynamic<?> var0) {
      return var0.get("Potion").asString("minecraft:empty").equals("minecraft:empty") ? "minecraft:arrow" : "minecraft:tipped_arrow";
   }

   private static <T> Typed<T> N(Typed<?> var0, Type<T> var1) {
      return class07536.N(var0, var1, var0x -> var0x.set("item", N(var0x, N(var0x))));
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1) {
      return var0.createMap(ImmutableMap.of(var0.createString("id"), var0.createString(var1), var0.createString("Count"), var0.createInt(1)));
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.o);
      Type type1 = this.getOutputSchema().getType(class06962.o);
      return this.fixTypeEverywhereTyped(
         "Fix AbstractArrow item type",
         type,
         type1,
         class02269.N(this.N("minecraft:trident", class03113::L), this.N("minecraft:arrow", class03113::N), this.N("minecraft:spectral_arrow", class03113::y))
      );
   }
}
