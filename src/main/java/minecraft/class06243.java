package minecraft;

import com.mojang.serialization.Codec;

public enum class06243 implements class05033 {
   field_17160("none"),
   field_17161("partial"),
   field_17162("full");

   public static final Codec<class06243> field_55540 = class05033.N(class06243::values);
   private final String field_17164;

   private class06243(String var3) {
      this.field_17164 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_17164;
   }
}
