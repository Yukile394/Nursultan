package minecraft;

import com.mojang.serialization.Codec;

public enum class03371 implements class05033 {
   field_44568("singleplayer"),
   field_44569("multiplayer"),
   field_44570("realms");

   static final Codec<class03371> field_44571 = class05033.N(class03371::values);
   private final String field_44572;

   private class03371(String var3) {
      this.field_44572 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_44572;
   }
}
