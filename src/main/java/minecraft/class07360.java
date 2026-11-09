package minecraft;

import com.mojang.serialization.Codec;

public enum class07360 implements class05033 {
   field_64385("none"),
   field_64386("overworld"),
   field_64387("end");

   public static final Codec<class07360> field_64388 = class05033.N(class07360::values);
   private final String field_64389;

   private class07360(String var3) {
      this.field_64389 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_64389;
   }
}
