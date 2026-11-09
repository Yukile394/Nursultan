package minecraft;

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

public class class02873 extends DataFix {
   public class02873(Schema var1) {
      super(var1, false);
   }

   private TypeRewriteRule N(
      OpticFinder<Pair<String, Pair<Either<Pair<String, String>, Unit>, Pair<Either<?, Unit>, Dynamic<?>>>>> var1, Type<?> var2, String var3
   ) {
      Type type = this.getInputSchema().getChoiceType(class06962.o, var3);
      OpticFinder opticfinder = DSL.namedChoice(var3, type);
      OpticFinder opticfinder1 = type.findField("Items");
      return this.fixTypeEverywhereTyped(
         "Fix non-zero indexing in chest horse type " + var3,
         var2,
         var3x -> var3x.updateTyped(
            opticfinder,
            var2xx -> var2xx.updateTyped(
               opticfinder1,
               var1xxx -> var1xxx.update(
                  var1,
                  var0xxx -> var0xxx.mapSecond(
                     var0xxxx -> var0xxxx.mapSecond(
                        var0xxxxx -> var0xxxxx.mapSecond(
                           var0xxxxxx -> var0xxxxxx.update("Slot", var0xxxxxxx -> var0xxxxxxx.createByte((byte)(var0xxxxxxx.asInt(2) - 2)))
                        )
                     )
                  )
               )
            )
         )
      );
   }

   protected TypeRewriteRule makeRule() {
      OpticFinder opticfinder = DSL.typeFinder(this.getInputSchema().getType(class06962.l));
      Type type = this.getInputSchema().getType(class06962.o);
      return TypeRewriteRule.seq(
         this.N(opticfinder, type, "minecraft:llama"),
         new TypeRewriteRule[]{
            this.N(opticfinder, type, "minecraft:trader_llama"), this.N(opticfinder, type, "minecraft:mule"), this.N(opticfinder, type, "minecraft:donkey")
         }
      );
   }
}
