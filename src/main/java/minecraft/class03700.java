package minecraft;

import com.mojang.serialization.Codec;

public enum class03700 implements class05033 {
   field_42361("default"),
   field_42362("fall_variants"),
   field_42363("intentional_game_design");

   public static final Codec<class03700> field_42364 = class05033.N(class03700::values);
   private final String field_42365;

   private class03700(String var3) {
      this.field_42365 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_42365;
   }
}
