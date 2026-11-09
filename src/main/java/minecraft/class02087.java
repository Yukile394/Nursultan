package minecraft;

import com.mojang.serialization.Codec;

public enum class02087 implements class05033 {
   field_41490("realm"),
   field_41491("local"),
   field_41492("server");

   public static final Codec<class02087> field_41493 = class05033.N(class02087::values);
   private final String field_41494;

   private class02087(String var3) {
      this.field_41494 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_41494;
   }
}
