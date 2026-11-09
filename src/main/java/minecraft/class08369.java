package minecraft;

import com.google.gson.JsonElement;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;

public class class08369 extends DataFix {
   public class08369(Schema var1) {
      super(var1, false);
   }

   private static <H> H y(Type<H> var0, Dynamic<?> var1) {
      JsonElement jsonelement = (JsonElement)var1.convert(JsonOps.INSTANCE).getValue();
      Dynamic dynamic = new Dynamic(
         JavaOps.INSTANCE, Map.of("action", "show_text", "contents", Map.<String, String>of("text", "Legacy hoverEvent: " + class05001.i(jsonelement)))
      );
      return (H)class07536.N(var0, dynamic).getValue();
   }

   private <C, H extends Pair<String, ?>> TypeRewriteRule N(Type<C> var1, Type<H> var2) {
      Type type = DSL.named(
         class06962.O.typeName(),
         DSL.or(
            DSL.or(DSL.string(), DSL.list(var1)),
            DSL.and(
               DSL.optional(DSL.field("extra", DSL.list(var1))),
               DSL.optional(DSL.field("separator", var1)),
               DSL.optional(DSL.field("hoverEvent", var2)),
               DSL.remainderType()
            )
         )
      );
      if (!type.equals(this.getInputSchema().getType(class06962.O))) {
         throw new IllegalStateException("Text component type did not match, expected " + type + " but got " + this.getInputSchema().getType(class06962.O));
      } else {
         return this.fixTypeEverywhere(
            "LegacyHoverEventFix",
            type,
            var2x -> var2xx -> var2xx.mapSecond(var2xxx -> var2xxx.mapRight(var2xxxx -> var2xxxx.mapSecond(var2xxxxx -> var2xxxxx.mapSecond(var2xxxxxx -> {
               Optional optional = ((Dynamic)var2xxxxxx.getSecond()).get("hoverEvent").result();
               if (optional.isEmpty()) {
                  return var2xxxxxx;
               } else if (((Dynamic)optional.get()).get("value").result().isEmpty()) {
                  return var2xxxxxx;
               } else {
                  String s = ((Either)var2xxxxxx.getFirst()).left().<String>map(Pair::getFirst).orElse("");
                  Pair pair = this.N(var2, s, (Dynamic<?>)optional.get());
                  return var2xxxxxx.mapFirst(var1xxxxxxx -> Either.left(pair));
               }
            }))))
         );
      }
   }

   private <H> H N(Type<H> var1, String var2, Dynamic<?> var3) {
      return "show_text".equals(var2) ? N(var1, var3) : y(var1, var3);
   }

   private static <H> H N(Type<H> var0, Dynamic<?> var1) {
      Dynamic dynamic = var1.renameField("value", "contents");
      return (H)class07536.N(var0, dynamic).getValue();
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.O).findFieldType("hoverEvent");
      return this.N(this.getInputSchema().getTypeRaw(class06962.O), type);
   }
}
