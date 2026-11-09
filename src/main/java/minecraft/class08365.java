package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import org.slf4j.Logger;

public class class08365 extends DataFix {
   private static final Logger N = LogUtils.getLogger();

   public class08365(Schema var1) {
      super(var1, true);
   }

   private static <T> Dynamic<T> N(DynamicOps<T> var0, String var1) {
      try {
         JsonElement jsonelement = class08314.N(var1);
         if (!jsonelement.isJsonNull()) {
            return new Dynamic(var0, JsonOps.INSTANCE.convertTo(var0, jsonelement));
         }
      } catch (Exception exception) {
         N.error("Failed to unflatten text component json: {}", var1, exception);
      }

      return new Dynamic(var0, var0.createString(var1));
   }

   private <T> TypeRewriteRule N(Type<Pair<String, String>> var1, Type<T> var2) {
      return this.fixTypeEverywhere(
         "UnflattenTextComponentFix", var1, var2, var1x -> var2x -> class07536.N(var2, N(var1x, (String)var2x.getSecond()), true).getValue()
      );
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.O);
      Type type1 = this.getOutputSchema().getType(class06962.O);
      return this.N(type, type1);
   }
}
