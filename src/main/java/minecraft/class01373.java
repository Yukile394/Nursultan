package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public class class01373 extends class01350 {
   private static final Logger y = LogUtils.getLogger();

   private Dynamic<?> L(Dynamic<?> var1) {
      return var1.update(
         "DimensionData",
         var0 -> var0.updateMapValues(
            var0x -> var0x.mapSecond(var0xx -> var0xx.update("DragonFight", var0xxx -> L(var0xxx, "DragonUUID", "Dragon").orElse(var0xxx)))
         )
      );
   }

   public class01373(Schema var1) {
      super(var1, class06962.N);
   }

   private Dynamic<?> u(Dynamic<?> var1) {
      return var1.update("Players", var1x -> var1.createList(var1x.asStream().map(var0x -> (Dynamic)N((Dynamic<?>)var0x).orElseGet(() -> {
         y.warn("CustomBossEvents contains invalid UUIDs.");
         return (Dynamic<?>)var0x;
      }))));
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return N(var1, "WanderingTraderId", "WanderingTraderId").orElse(var1);
   }

   protected TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(this.N);
      OpticFinder opticfinder = type.findField("CustomBossEvents");
      OpticFinder opticfinder1 = DSL.typeFinder(DSL.and(DSL.optional(DSL.field("Name", this.getInputSchema().getTypeRaw(class06962.O))), DSL.remainderType()));
      return this.fixTypeEverywhereTyped("LevelUUIDFix", type, var3x -> var3x.update(DSL.remainderFinder(), var1xx -> {
         var1xx = this.L(var1xx);
         return this.y(var1xx);
      }).updateTyped(opticfinder, var2xx -> var2xx.updateTyped(opticfinder1, var1xxx -> var1xxx.update(DSL.remainderFinder(), this::u))));
   }
}
