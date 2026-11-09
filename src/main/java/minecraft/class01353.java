package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class01353 extends class00955 {
   public class01353(Schema var1, boolean var2) {
      super(var1, var2, "JigsawPropertiesFix", class06962.G, "minecraft:jigsaw");
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      String s = var0.get("attachement_type").asString("minecraft:empty");
      String s1 = var0.get("target_pool").asString("minecraft:empty");
      return var0.set("name", var0.createString(s))
         .set("target", var0.createString(s))
         .remove("attachement_type")
         .set("pool", var0.createString(s1))
         .remove("target_pool");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), class01353::N);
   }
}
