package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class class01356 extends class08347 {
   private static final Map<String, String> N = ImmutableMap.builder()
      .put("down", "down_south")
      .put("up", "up_north")
      .put("north", "north_up")
      .put("south", "south_up")
      .put("west", "west_up")
      .put("east", "east_up")
      .build();

   public class01356(Schema var1) {
      super(var1, "jigsaw_rotation_fix");
   }

   @Override
   protected boolean N(String var1) {
      return var1.equals("minecraft:jigsaw");
   }

   @Override
   protected <T> Dynamic<T> N(String var1, Dynamic<T> var2) {
      String s = var2.get("facing").asString("north");
      return var2.remove("facing").set("orientation", var2.createString(N.getOrDefault(s, s)));
   }
}
