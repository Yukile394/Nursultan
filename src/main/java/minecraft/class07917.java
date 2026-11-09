package minecraft;

import com.google.common.collect.ImmutableMap;
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
import java.util.stream.Stream;

public class class07917 extends DataFix {
   public class07917(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.l);
      OpticFinder opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder opticfinder1 = type.findField("tag");
      OpticFinder opticfinder2 = opticfinder1.type().findField("BlockEntityTag");
      return this.fixTypeEverywhereTyped(
         "ItemBannerColorFix",
         type,
         var3x -> {
            Optional optional = var3x.getOptional(opticfinder);
            if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:banner")) {
               Dynamic dynamic = (Dynamic)var3x.get(DSL.remainderFinder());
               Optional optional1 = var3x.getOptionalTyped(opticfinder1);
               if (optional1.isPresent()) {
                  Typed typed = (Typed)optional1.get();
                  Optional optional2 = typed.getOptionalTyped(opticfinder2);
                  if (optional2.isPresent()) {
                     Typed typed1 = (Typed)optional2.get();
                     Dynamic dynamic1 = (Dynamic)typed.get(DSL.remainderFinder());
                     Dynamic dynamic2 = (Dynamic)typed1.getOrCreate(DSL.remainderFinder());
                     if (dynamic2.get("Base").asNumber().result().isPresent()) {
                        dynamic = dynamic.set("Damage", dynamic.createShort((short)(dynamic2.get("Base").asInt(0) & 15)));
                        Optional optional3 = dynamic1.get("display").result();
                        if (optional3.isPresent()) {
                           Dynamic dynamic3 = (Dynamic)optional3.get();
                           Dynamic dynamic4 = dynamic3.createMap(
                              ImmutableMap.of(dynamic3.createString("Lore"), dynamic3.createList(Stream.of(dynamic3.createString("(+NBT"))))
                           );
                           if (Objects.equals(dynamic3, dynamic4)) {
                              return var3x.set(DSL.remainderFinder(), dynamic);
                           }
                        }

                        dynamic2.remove("Base");
                        return var3x.set(DSL.remainderFinder(), dynamic)
                           .set(opticfinder1, typed.set(opticfinder2, typed1.set(DSL.remainderFinder(), dynamic2)));
                     }
                  }
               }

               return var3x.set(DSL.remainderFinder(), dynamic);
            } else {
               return var3x;
            }
         }
      );
   }
}
