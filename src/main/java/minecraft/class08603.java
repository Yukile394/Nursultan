package minecraft;

import com.mojang.serialization.Codec;

public enum class08603 implements class05033 {
   field_55688("normal"),
   field_55689("cold");

   public static final Codec<class08603> field_55690 = class05033.N(class08603::values);
   private final String field_55694;

   private class08603(String var3) {
      this.field_55694 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_55694;
   }
}
