package minecraft;

import com.mojang.serialization.Codec;

public enum class02096 implements class05033 {
   field_41481("survival", 0),
   field_41482("creative", 1),
   field_41483("adventure", 2),
   field_41484("spectator", 6),
   field_41485("hardcore", 99);

   public static final Codec<class02096> field_41486 = class05033.N(class02096::values);
   private final String field_41487;
   private final int field_41488;

   private class02096(String var3, int var4) {
      this.field_41487 = var3;
      this.field_41488 = var4;
   }

   public int N() {
      return this.field_41488;
   }

   @Override
   public String method_15434() {
      return this.field_41487;
   }
}
