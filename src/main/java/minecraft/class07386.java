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
import java.util.Objects;
import java.util.Optional;

public class class07386 extends DataFix {
   public static final String[] N = new String[]{
      "minecraft:white_shulker_box",
      "minecraft:orange_shulker_box",
      "minecraft:magenta_shulker_box",
      "minecraft:light_blue_shulker_box",
      "minecraft:yellow_shulker_box",
      "minecraft:lime_shulker_box",
      "minecraft:pink_shulker_box",
      "minecraft:gray_shulker_box",
      "minecraft:silver_shulker_box",
      "minecraft:cyan_shulker_box",
      "minecraft:purple_shulker_box",
      "minecraft:blue_shulker_box",
      "minecraft:brown_shulker_box",
      "minecraft:green_shulker_box",
      "minecraft:red_shulker_box",
      "minecraft:black_shulker_box"
   };

   public class07386(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.l);
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder<?> opticfinder1 = type.findField("tag");
      OpticFinder<?> opticfinder2 = opticfinder1.type().findField("BlockEntityTag");
      return this.fixTypeEverywhereTyped(
         "ItemShulkerBoxColorFix",
         type,
         var3x -> {
            Optional optional = var3x.getOptional(opticfinder);
            if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:shulker_box")) {
               Optional optional1 = var3x.getOptionalTyped(opticfinder1);
               if (optional1.isPresent()) {
                  Typed typed = (Typed)optional1.get();
                  Optional optional2 = typed.getOptionalTyped(opticfinder2);
                  if (optional2.isPresent()) {
                     Typed typed1 = (Typed)optional2.get();
                     Dynamic<?> dynamic = (Dynamic<?>)typed1.get(DSL.remainderFinder());
                     int i = dynamic.get("Color").asInt(0);
                     dynamic.remove("Color");
                     return var3x.set(opticfinder1, typed.set(opticfinder2, typed1.set(DSL.remainderFinder(), dynamic)))
                        .set(opticfinder, Pair.of(class06962.K.typeName(), N[i % 16]));
                  }
               }
            }

            return var3x;
         }
      );
   }
}
