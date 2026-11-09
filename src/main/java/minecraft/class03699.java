package minecraft;

import com.mojang.serialization.Codec;

public enum class03699 implements class05033 {
   field_42275("hurt", class04909.GD),
   field_42276("thorns", class04909.GD),
   field_42277("drowning", class04909.Gh),
   field_42278("burning", class04909.lN),
   field_42279("poking", class04909.ly),
   field_42280("freezing", class04909.Gr);

   public static final Codec<class03699> field_42281 = class05033.N(class03699::values);
   private final String field_42282;
   private final class04891 field_42283;

   private class03699(String var3, class04891 var4) {
      this.field_42282 = var3;
      this.field_42283 = var4;
   }

   public class04891 N() {
      return this.field_42283;
   }

   @Override
   public String method_15434() {
      return this.field_42282;
   }
}
