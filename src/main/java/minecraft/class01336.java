package minecraft;

import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01336 extends class01350 {
   private Dynamic<?> L(Dynamic<?> var1) {
      return y(var1, "target_uuid", "Target").orElse(var1);
   }

   public class01336(Schema var1) {
      super(var1, class06962.G);
   }

   private Dynamic<?> y(Dynamic<?> var1) {
      return var1.get("Owner")
         .get()
         .map(var0 -> N(var0, "Id", "Id").orElse(var0))
         .map(var1x -> var1.remove("Owner").set("SkullOwner", var1x))
         .result()
         .orElse(var1);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("BlockEntityUUIDFix", this.getInputSchema().getType(this.N), var1 -> {
         var1 = this.N(var1, "minecraft:conduit", this::L);
         return this.N(var1, "minecraft:skull", this::y);
      });
   }
}
