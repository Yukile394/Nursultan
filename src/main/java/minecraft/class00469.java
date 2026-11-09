package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;

public class class00469 extends DataFix {
   public class00469(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> N(Dynamic<?> var1) {
      if (!"MobSpawner".equals(var1.get("id").asString(""))) {
         return var1;
      } else {
         Optional optional = var1.get("EntityId").asString().result();
         if (optional.isPresent()) {
            Dynamic dynamic = (Dynamic)DataFixUtils.orElse(var1.get("SpawnData").result(), var1.emptyMap());
            dynamic = dynamic.set("id", dynamic.createString(((String)optional.get()).isEmpty() ? "Pig" : (String)optional.get()));
            var1 = var1.set("SpawnData", dynamic);
            var1 = var1.remove("EntityId");
         }

         Optional optional1 = var1.get("SpawnPotentials").asStreamOpt().result();
         if (optional1.isPresent()) {
            var1 = var1.set(
               "SpawnPotentials",
               var1.createList(
                  ((Stream)optional1.get())
                     .map(
                        var0 -> {
                           Optional optionalx = var0.get("Type").asString().result();
                           if (optionalx.isPresent()) {
                              Dynamic dynamicx = ((Dynamic)DataFixUtils.orElse(var0.get("Properties").result(), var0.emptyMap()))
                                 .set("id", var0.createString((String)optionalx.get()));
                              return var0.set("Entity", dynamicx).remove("Type").remove("Properties");
                           } else {
                              return (Dynamic)var0;
                           }
                        }
                     )
               )
            );
         }

         return var1;
      }
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getOutputSchema().getType(class06962.e);
      return this.fixTypeEverywhereTyped("MobSpawnerEntityIdentifiersFix", this.getInputSchema().getType(class06962.e), type, var2 -> {
         Dynamic dynamic = (Dynamic)var2.get(DSL.remainderFinder());
         dynamic = dynamic.set("id", dynamic.createString("MobSpawner"));
         DataResult dataresult = type.readTyped(this.N(dynamic));
         return dataresult.result().isEmpty() ? var2 : (Typed)((Pair)dataresult.result().get()).getFirst();
      });
   }
}
