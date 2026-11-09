package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class class03536 extends DataFix {
   public class03536(Schema var1) {
      super(var1, false);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      Dynamic dynamic = var0.get("structures")
         .orElseEmptyMap()
         .updateMapValues(var1x -> var1x.mapSecond(var1xx -> var1xx.set("type", var0.createString("minecraft:random_spread"))));
      return (Dynamic<?>)DataFixUtils.orElse(
         var0.get("stronghold").result().map(var2 -> dynamic.set("minecraft:stronghold", var2.set("type", var0.createString("minecraft:concentric_rings")))),
         dynamic
      );
   }

   private static Pair<Dynamic<?>, Dynamic<?>> N(Pair<Dynamic<?>, Dynamic<?>> var0) {
      Dynamic dynamic = (Dynamic)var0.getSecond();
      return Pair.of(
         (Dynamic)var0.getFirst(), dynamic.update("generator", var0x -> var0x.update("settings", var0xx -> var0xx.update("structures", class03536::N)))
      );
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.A);
      OpticFinder opticfinder = type.findField("dimensions");
      return this.fixTypeEverywhereTyped(
         "StructureSettingsFlatten",
         type,
         var1x -> var1x.updateTyped(opticfinder, var1xx -> class07536.N(var1xx, opticfinder.type(), var0xx -> var0xx.updateMapValues(class03536::N)))
      );
   }
}
