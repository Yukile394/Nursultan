package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class class05802 extends class00955 {
   private static final Map<String, String> L = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("donkeykong", "donkey_kong");
      var0.put("burningskull", "burning_skull");
      var0.put("skullandroses", "skull_and_roses");
   });

   public class05802(Schema var1, boolean var2) {
      super(var1, var2, "EntityPaintingMotiveFix", class06962.o, "minecraft:painting");
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      Optional<String> optional = var1.get("Motive").asString().result();
      if (optional.isPresent()) {
         String s = optional.get().toLowerCase(Locale.ROOT);
         return var1.set("Motive", var1.createString(class00622.N(L.getOrDefault(s, s))));
      } else {
         return var1;
      }
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }
}
