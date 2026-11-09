package minecraft;

import com.mojang.serialization.Codec;

enum class04875 implements class05033 {
   field_19026("ongoing"),
   field_19027("victory"),
   field_19028("loss"),
   field_19029("stopped");

   public static final Codec<class04875> field_56440 = class05033.N(class04875::values);
   private final String field_56441;

   private class04875(String var3) {
      this.field_56441 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_56441;
   }
}
