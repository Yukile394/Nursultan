package minecraft;

import com.mojang.serialization.Codec;

public enum class04675 implements class05033 {
   field_50210("custom_name"),
   field_50211("item_name");

   public static final Codec<class04675> field_50212 = class05033.N(class04675::values);
   private final String field_50213;

   private class04675(String var3) {
      this.field_50213 = var3;
   }

   public class02477<class00392> N() {
      return switch (this) {
         case field_50210 -> class02484.B;
         case field_50211 -> class02484.U;
      };
   }

   @Override
   public String method_15434() {
      return this.field_50213;
   }
}
