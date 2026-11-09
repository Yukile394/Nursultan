package minecraft;

import com.mojang.serialization.Codec;

public enum class08438 implements class05033 {
   field_56429("normal"),
   field_56430("cold"),
   field_56431("warm");

   public static final Codec<class08438> field_56432 = class05033.N(class08438::values);
   private final String field_56433;

   private class08438(String var3) {
      this.field_56433 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_56433;
   }
}
