package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class class05805 extends class08181 {
   public static final Map<String, String> N = ImmutableMap.builder()
      .put("minecraft:salmon_mob", "minecraft:salmon")
      .put("minecraft:cod_mob", "minecraft:cod")
      .build();
   public static final Map<String, String> y = ImmutableMap.builder()
      .put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg")
      .put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg")
      .build();

   public class05805(Schema var1, boolean var2) {
      super("EntityCodSalmonFix", var1, var2);
   }

   @Override
   protected String N(String var1) {
      return N.getOrDefault(var1, var1);
   }
}
