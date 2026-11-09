package minecraft;

import com.mojang.serialization.Codec;

public enum class00609 implements class05033 {
   field_63771("override"),
   field_63772("alpha_blend"),
   field_63773("add"),
   field_63774("subtract"),
   field_63775("multiply"),
   field_64353("blend_to_gray"),
   field_63776("minimum"),
   field_63777("maximum"),
   field_63778("and"),
   field_63779("nand"),
   field_63780("or"),
   field_63781("nor"),
   field_63782("xor"),
   field_63783("xnor");

   public static final Codec<class00609> field_63784 = class05033.N(class00609::values);
   private final String field_63785;

   private class00609(String var3) {
      this.field_63785 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_63785;
   }
}
