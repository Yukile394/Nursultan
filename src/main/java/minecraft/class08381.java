package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class class08381 extends DataFix {
   private static final List<String> N = List.of("feet", "legs", "chest", "head");
   private static final List<String> y = List.of("mainhand", "offhand");
   private static final float L = 0.085F;

   public class08381(Schema var1) {
      super(var1, false);
   }

   private static List<Float> N(OptionalDynamic<?> var0) {
      return var0.asStream().map(var0x -> var0x.asFloat(0.085F)).toList();
   }

   private static Dynamic<?> N(Dynamic<?> var0, List<Float> var1, List<String> var2) {
      for (int i = 0; i < var2.size() && i < var1.size(); i++) {
         String s = (String)var2.get(i);
         float f = (Float)var1.get(i);
         if (f != 0.085F) {
            var0 = var0.set(s, var0.createFloat(f));
         }
      }

      return var0;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "DropChancesFormatFix", this.getInputSchema().getType(class06962.o), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
            List<Float> list = N(var0x.get("ArmorDropChances"));
            List<Float> list1 = N(var0x.get("HandDropChances"));
            float f = var0x.get("body_armor_drop_chance").asNumber().result().map(Number::floatValue).orElse(0.085F);
            var0x = var0x.remove("ArmorDropChances").remove("HandDropChances").remove("body_armor_drop_chance");
            Dynamic<?> dynamic = var0x.emptyMap();
            dynamic = N(dynamic, list, N);
            dynamic = N(dynamic, list1, y);
            if (f != 0.085F) {
               dynamic = dynamic.set("body", var0x.createFloat(f));
            }

            return !dynamic.equals(var0x.emptyMap()) ? var0x.set("drop_chances", dynamic) : var0x;
         })
      );
   }
}
