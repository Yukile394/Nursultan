package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;

public class class04955 extends class08181 {
   public static final Map<String, String> N = ImmutableMap.builder().put("minecraft:zombie_pigman_spawn_egg", "minecraft:zombified_piglin_spawn_egg").build();

   public class04955(Schema var1) {
      super("EntityZombifiedPiglinRenameFix", var1, true);
   }

   @Override
   protected String N(String var1) {
      return Objects.equals("minecraft:zombie_pigman", var1) ? "minecraft:zombified_piglin" : var1;
   }
}
