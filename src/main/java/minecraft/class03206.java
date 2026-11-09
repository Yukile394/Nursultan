package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;

public class class03206 extends DataFix {
   public class03206(Schema var1) {
      super(var1, true);
   }

   private <T> Typed<T> y(Type<T> var1, Typed<?> var2) {
      DynamicOps<?> dynamicops = var2.getOps();
      List list = ((List)var2.getValue()).stream().map(var1x -> {
         Pair pair = (Pair)var1x;
         int i = ((Dynamic)pair.getSecond()).get("Weight").asNumber().result().orElse(1).intValue();
         Dynamic dynamic = new Dynamic(dynamicops);
         dynamic = dynamic.set("weight", dynamic.createInt(i));
         Dynamic dynamic1 = ((Dynamic)pair.getSecond()).remove("Weight").remove("Entity");
         return Pair.of(Pair.of(pair.getFirst(), dynamic1), dynamic);
      }).toList();
      return new Typed(var1, dynamicops, list);
   }

   private <T> Typed<T> N(Type<T> var1, Typed<?> var2) {
      DynamicOps<?> dynamicops = var2.getOps();
      return new Typed(var1, dynamicops, Pair.of(var2.getValue(), new Dynamic(dynamicops)));
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.e);
      Type<?> type1 = this.getOutputSchema().getType(class06962.e);
      OpticFinder<?> opticfinder = type.findField("SpawnData");
      Type<?> type2 = type1.findField("SpawnData").type();
      OpticFinder<?> opticfinder1 = type.findField("SpawnPotentials");
      Type<?> type3 = type1.findField("SpawnPotentials").type();
      return this.fixTypeEverywhereTyped(
         "Fix mob spawner data structure",
         type,
         type1,
         var5x -> var5x.updateTyped(opticfinder, type2, var2xx -> this.N(type2, var2xx)).updateTyped(opticfinder1, type3, var2xx -> this.y(type3, var2xx))
      );
   }
}
