package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class08304 extends DataFix {
   private <T> Dynamic<T> L(Dynamic<T> var1) {
      return (Dynamic<T>)DataFixUtils.orElse(var1.asNumber().result().map(var1x -> {
         return switch (var1x.intValue()) {
            case -1 -> var1.createString("minecraft:the_nether");
            case 1 -> var1.createString("minecraft:the_end");
            default -> var1.createString("minecraft:overworld");
         };
      }), var1);
   }

   public class08304(Schema var1) {
      super(var1, false);
   }

   private <T> Dynamic<T> y(Dynamic<T> var1) {
      return var1.update("Dimension", this::L);
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.update("dimension", this::L);
   }

   public TypeRewriteRule makeRule() {
      TypeRewriteRule typerewriterule = this.fixTypeEverywhereTyped(
         "PlayerLegacyDimensionFix", this.getInputSchema().getType(class06962.L), var1x -> var1x.update(DSL.remainderFinder(), this::y)
      );
      Type type = this.getInputSchema().getType(class06962.U);
      OpticFinder opticfinder = type.findField("data");
      TypeRewriteRule typerewriterule1 = this.fixTypeEverywhereTyped(
         "MapLegacyDimensionFix", type, var2x -> var2x.updateTyped(opticfinder, var1xx -> var1xx.update(DSL.remainderFinder(), this::N))
      );
      return TypeRewriteRule.seq(typerewriterule, typerewriterule1);
   }
}
