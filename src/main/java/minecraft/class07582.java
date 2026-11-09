package minecraft;

import com.mojang.serialization.Codec;

public enum class07582 implements class05033 {
   field_64365("normal"),
   field_64366("warm");

   public static final Codec<class07582> field_64367 = class05033.N(class07582::values);
   private final String field_64368;

   private class07582(String var3) {
      this.field_64368 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_64368;
   }
}
