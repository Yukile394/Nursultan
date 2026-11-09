package minecraft;

import com.mojang.serialization.Codec;

public enum class04436 implements class05033 {
   field_37199("piece"),
   field_37200("full");

   public static final Codec<class04436> field_37202 = class05033.N(class04436::values);
   private final String field_37203;

   private class04436(String var3) {
      this.field_37203 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_37203;
   }
}
