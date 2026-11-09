package minecraft;

import com.mojang.serialization.Codec;

public enum class02306 implements class05033 {
   field_49112("uniform"),
   field_49113("jp");

   public static final Codec<class02306> field_49114 = class05033.N(class02306::values);
   private final String field_49115;

   private class02306(String var3) {
      this.field_49115 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_49115;
   }
}
