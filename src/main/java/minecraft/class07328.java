package minecraft;

import com.mojang.serialization.Codec;

public enum class07328 implements class05033 {
   field_40888("none"),
   field_40889("block"),
   field_40890("mob"),
   field_40891("tnt"),
   field_51779("trigger");

   public static final Codec<class07328> field_51780 = class05033.N(class07328::values);
   private final String field_51781;

   private class07328(String var3) {
      this.field_51781 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_51781;
   }
}
