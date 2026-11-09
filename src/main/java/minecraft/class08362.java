package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class class08362 extends DataFix {
   public class08362(Schema var1) {
      super(var1, false);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      Optional optional = var0.asString().result();
      return optional.isPresent() ? var0.createBoolean(Boolean.parseBoolean((String)optional.get())) : var0;
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.O);
      return this.fixTypeEverywhere(
         "TextComponentStringyFlagsFix",
         type,
         var0 -> var0x -> var0x.mapSecond(
            var0xx -> var0xx.mapRight(
               var0xxx -> var0xxx.mapSecond(
                  var0xxxx -> var0xxxx.mapSecond(
                     var0xxxxx -> var0xxxxx.mapSecond(
                        var0xxxxxx -> var0xxxxxx.update("bold", class08362::N)
                           .update("italic", class08362::N)
                           .update("underlined", class08362::N)
                           .update("strikethrough", class08362::N)
                           .update("obfuscated", class08362::N)
                     )
                  )
               )
            )
         )
      );
   }
}
