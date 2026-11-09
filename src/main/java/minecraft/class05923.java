package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;

public class class05923 extends DataFix {
   public class05923(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      return var0.update("Sections", var0x -> var0x.updateMapValues(var0xx -> var0xx.mapSecond(var0xxx -> var0xxx.remove("Valid"))));
   }

   protected TypeRewriteRule makeRule() {
      Type type = DSL.named(class06962.v.typeName(), DSL.remainderType());
      if (!Objects.equals(type, this.getInputSchema().getType(class06962.v))) {
         throw new IllegalStateException("Poi type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("POI rebuild", type, var0 -> var0x -> var0x.mapSecond(class05923::N));
      }
   }
}
