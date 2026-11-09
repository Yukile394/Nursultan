package minecraft;

import com.mojang.serialization.Codec;

public enum class03691 implements class05033 {
   field_42285("never"),
   field_42286("when_caused_by_living_non_player"),
   field_42287("always");

   public static final Codec<class03691> field_42288 = class05033.N(class03691::values);
   private final String field_42289;

   private class03691(String var3) {
      this.field_42289 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_42289;
   }
}
