package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class08367 extends DataFix {
   @Nullable
   private static <T> Dynamic<T> L(Dynamic<T> var0) {
      String s = var0.get("action").asString("");
      String s1 = var0.get("value").asString("");

      return switch (s) {
         case "open_url" -> !N(s1) ? null : var0.renameField("value", "url");
         case "open_file" -> var0.renameField("value", "path");
         case "run_command", "suggest_command" -> !y(s1) ? null : var0.renameField("value", "command");
         case "change_page" -> {
            Integer integer = var0.get("value").result().map(class08367::u).orElse(null);
            if (integer == null) {
               yield null;
            } else {
               int i = Math.max(integer, 1);
               yield var0.remove("value").set("page", var0.createInt(i));
            }
         }
         default -> var0;
      };
   }

   public class08367(Schema var1) {
      super(var1, true);
   }

   @Nullable
   private static Integer u(Dynamic<?> var0) {
      Optional<Number> optional = var0.asNumber().result();
      if (optional.isPresent()) {
         return optional.get().intValue();
      } else {
         try {
            return Integer.parseInt(var0.asString(""));
         } catch (Exception exception) {
            return null;
         }
      }
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      String s = var0.get("action").asString("");

      return switch (s) {
         case "show_text" -> var0.renameField("contents", "value");
         case "show_item" -> {
            Dynamic dynamic1 = var0.get("contents").orElseEmptyMap();
            yield dynamic1.asString().result().isPresent()
               ? var0.renameField("contents", "id")
               : N(var0.remove("contents"), dynamic1, "id", "count", "components");
         }
         case "show_entity" -> {
            Dynamic dynamic = var0.get("contents").orElseEmptyMap();
            yield N(var0.remove("contents"), dynamic, "id", "type", "name").renameField("id", "uuid").renameField("type", "id");
         }
         default -> var0;
      };
   }

   private static boolean y(String var0) {
      for (int i = 0; i < var0.length(); i++) {
         char c0 = var0.charAt(i);
         if (c0 == 167 || c0 < ' ' || c0 == 127) {
            return false;
         }
      }

      return true;
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.renameAndFixField("hoverEvent", "hover_event", class08367::y).renameAndFixField("clickEvent", "click_event", class08367::L);
   }

   private static Dynamic<?> N(Dynamic<?> var0, Dynamic<?> var1, String... var2) {
      for (String s : var2) {
         var0 = Dynamic.copyField(var1, s, var0, s);
      }

      return var0;
   }

   private <C1, C2, H extends Pair<String, ?>> TypeRewriteRule N(Type<C1> var1, Type<C2> var2, Type<H> var3) {
      Type type = DSL.named(
         class06962.O.typeName(),
         DSL.or(
            DSL.or(DSL.string(), DSL.list(var1)),
            DSL.and(
               DSL.optional(DSL.field("extra", DSL.list(var1))),
               DSL.optional(DSL.field("separator", var1)),
               DSL.optional(DSL.field("hoverEvent", var3)),
               DSL.remainderType()
            )
         )
      );
      if (!type.equals(this.getInputSchema().getType(class06962.O))) {
         throw new IllegalStateException("Text component type did not match, expected " + type + " but got " + this.getInputSchema().getType(class06962.O));
      } else {
         Type<?> type1 = class02269.N(type, type, var2);
         return this.fixTypeEverywhere(
            "TextComponentHoverAndClickEventFix", type, var2, var2x -> var3x -> !((Either)var3x.getSecond()).map(var0xx -> false, var0xx -> {
               Pair pair = (Pair)((Pair)var0xx.getSecond()).getSecond();
               boolean flag = ((Either)pair.getFirst()).left().isPresent();
               boolean flag1 = ((Dynamic)pair.getSecond()).get("clickEvent").result().isPresent();
               return flag || flag1;
            }) ? var3x : class07536.N(class02269.N(type1, var3x, var2x), var2, class08367::N).getValue()
         );
      }
   }

   private static boolean N(String var0) {
      try {
         String s = new URI(var0).getScheme();
         if (s == null) {
            return false;
         } else {
            String s1 = s.toLowerCase(Locale.ROOT);
            return "http".equals(s1) || "https".equals(s1);
         }
      } catch (URISyntaxException urisyntaxexception) {
         return false;
      }
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.O).findFieldType("hoverEvent");
      return this.N(this.getInputSchema().getTypeRaw(class06962.O), this.getOutputSchema().getType(class06962.O), type);
   }
}
