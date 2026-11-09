package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class04451 extends class08360 {
   private static final String[] N = new String[]{
      "minecraft:ponder_goat_horn",
      "minecraft:sing_goat_horn",
      "minecraft:seek_goat_horn",
      "minecraft:feel_goat_horn",
      "minecraft:admire_goat_horn",
      "minecraft:call_goat_horn",
      "minecraft:yearn_goat_horn",
      "minecraft:dream_goat_horn"
   };

   public class04451(Schema var1) {
      super(var1, "GoatHornIdFix", var0 -> var0.equals("minecraft:goat_horn"));
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      int i = var1.get("SoundVariant").asInt(0);
      String s = N[i >= 0 && i < N.length ? i : 0];
      return var1.remove("SoundVariant").set("instrument", var1.createString(s));
   }
}
