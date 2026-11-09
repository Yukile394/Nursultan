package minecraft;

import com.mojang.serialization.Codec;

public enum class04902 implements class05033 {
   field_14532("warm"),
   field_14528("cold");

   public static final Codec<class04902> field_24990 = class05033.N(class04902::values);
   @Deprecated
   public static final Codec<class04902> field_56682 = class06338.L(class04902::valueOf);
   private final String field_14529;

   private class04902(String var3) {
      this.field_14529 = var3;
   }

   public String N() {
      return this.field_14529;
   }

   @Override
   public String method_15434() {
      return this.field_14529;
   }
}
