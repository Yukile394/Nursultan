package minecraft;

import com.mojang.serialization.Codec;

public enum class00801 implements class05033 {
   field_9384("none"),
   field_9382("rain"),
   field_9383("snow");

   public static final Codec<class00801> field_46251 = class05033.N(class00801::values);
   private final String field_46252;

   private class00801(String var3) {
      this.field_46252 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_46252;
   }
}
