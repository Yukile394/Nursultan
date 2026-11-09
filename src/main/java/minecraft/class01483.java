package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class class01483 extends DataFix {
   private static final Codec<List<Float>> N = Codec.FLOAT.listOf();

   public class01483(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static boolean N(OptionalDynamic<?> var0, int var1) {
      return var0.flatMap(N::parse).map(var1x -> var1x.size() == var1 && var1x.stream().allMatch(var0xx -> var0xx == 0.0F)).result().orElse(false);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityRedundantChanceTagsFix", this.getInputSchema().getType(class06962.o), var0 -> var0.update(DSL.remainderFinder(), var0x -> {
            if (N(var0x.get("HandDropChances"), 2)) {
               var0x = var0x.remove("HandDropChances");
            }

            if (N(var0x.get("ArmorDropChances"), 4)) {
               var0x = var0x.remove("ArmorDropChances");
            }

            return var0x;
         })
      );
   }
}
