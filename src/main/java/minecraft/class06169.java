package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class class06169 extends class08181 {
   public static final Map<String, String> N = ImmutableMap.builder().put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg").build();

   public class06169(Schema var1, boolean var2) {
      super("EntityRavagerRenameFix", var1, var2);
   }

   @Override
   protected String N(String var1) {
      return Objects.equals("minecraft:illager_beast", var1) ? "minecraft:ravager" : var1;
   }
}
