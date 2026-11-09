package minecraft;

import com.mojang.serialization.Codec;

public enum class02610 implements class05033 {
   field_52237("ignore_waterlogging"),
   field_52238("apply_waterlogging");

   public static Codec<class02610> field_52239 = class05033.y(class02610::values);
   private final String field_52240;

   private class02610(String var3) {
      this.field_52240 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_52240;
   }
}
