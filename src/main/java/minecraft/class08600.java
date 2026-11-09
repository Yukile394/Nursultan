package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class08600 extends DataFix {
   private static String L(int var0) {
      return switch (var0 & 65535) {
         case 1 -> "flopper";
         case 256 -> "sunstreak";
         case 257 -> "stripey";
         case 512 -> "snooper";
         case 513 -> "glitter";
         case 768 -> "dasher";
         case 769 -> "blockfish";
         case 1024 -> "brinely";
         case 1025 -> "betty";
         case 1280 -> "spotty";
         case 1281 -> "clayfish";
         default -> "kob";
      };
   }

   private static <T> Dynamic<T> L(Dynamic<T> var0, Dynamic<T> var1) {
      Optional optional = var1.get("type").result();
      return optional.isEmpty()
         ? var0
         : var0.update("minecraft:bucket_entity_data", var0x -> var0x.remove("type")).set("minecraft:salmon/size", (Dynamic)optional.get());
   }

   public class08600(Schema var1) {
      super(var1, false);
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0, Dynamic<T> var1) {
      Optional<Number> optional = var1.get("Variant").asNumber().result();
      if (optional.isEmpty()) {
         return var0;
      } else {
         String s = switch (optional.get().intValue()) {
            case 1 -> "wild";
            case 2 -> "gold";
            case 3 -> "cyan";
            case 4 -> "blue";
            default -> "lucy";
         };
         return var0.update("minecraft:bucket_entity_data", var0x -> var0x.remove("Variant")).set("minecraft:axolotl/variant", var0.createString(s));
      }
   }

   private static String y(int var0) {
      return class02269.N(var0 >> 24 & 0xFF);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, Dynamic<T> var1) {
      Optional<Number> optional = var1.get("BucketVariantTag").asNumber().result();
      if (optional.isEmpty()) {
         return var0;
      } else {
         int i = optional.get().intValue();
         String s = L(i);
         String s1 = N(i);
         String s2 = y(i);
         return var0.update("minecraft:bucket_entity_data", var0x -> var0x.remove("BucketVariantTag"))
            .set("minecraft:tropical_fish/pattern", var0.createString(s))
            .set("minecraft:tropical_fish/base_color", var0.createString(s1))
            .set("minecraft:tropical_fish/pattern_color", var0.createString(s2));
      }
   }

   private static String N(int var0) {
      return class02269.N(var0 >> 16 & 0xFF);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      Optional optional = var0.get("minecraft:entity_data").result();
      if (optional.isEmpty()) {
         return var0;
      } else if (((Dynamic)optional.get()).get("id").asString().result().filter(var0x -> var0x.equals("minecraft:painting")).isEmpty()) {
         return var0;
      } else {
         Optional optional1 = ((Dynamic)optional.get()).get("variant").result();
         Dynamic dynamic = ((Dynamic)optional.get()).remove("variant");
         if (dynamic.remove("id").equals(dynamic.emptyMap())) {
            var0 = var0.remove("minecraft:entity_data");
         } else {
            var0 = var0.set("minecraft:entity_data", dynamic);
         }

         if (optional1.isPresent()) {
            var0 = var0.set("minecraft:painting/variant", (Dynamic)optional1.get());
         }

         return var0;
      }
   }

   public final TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.l);
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder<?> opticfinder1 = type.findField("components");
      return this.fixTypeEverywhereTyped("ItemStack bucket_entity_data variants to separate components", type, var2x -> {
         String s = var2x.getOptional(opticfinder).<String>map(Pair::getSecond).orElse("");

         return switch (s) {
            case "minecraft:salmon_bucket" -> var2x.updateTyped(opticfinder1, class08600::L);
            case "minecraft:axolotl_bucket" -> var2x.updateTyped(opticfinder1, class08600::y);
            case "minecraft:tropical_fish_bucket" -> var2x.updateTyped(opticfinder1, class08600::N);
            case "minecraft:painting" -> var2x.updateTyped(opticfinder1, var0x -> class07536.N(var0x, var0x.getType(), class08600::N));
            default -> var2x;
         };
      });
   }
}
