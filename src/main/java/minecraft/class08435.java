package minecraft;

import com.mojang.serialization.Codec;

public enum class08435 implements class05033 {
   field_56542("normal"),
   field_56543("cold");

   public static final Codec<class08435> field_56544 = class05033.N(class08435::values);
   private final String field_56545;

   private class08435(String var3) {
      this.field_56545 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_56545;
   }
}
