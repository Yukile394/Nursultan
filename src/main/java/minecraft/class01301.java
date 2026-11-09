package minecraft;

import com.mojang.serialization.Codec;

public enum class01301 implements class05033 {
   field_18162("false", "options.off"),
   field_18163("fast", "options.clouds.fast"),
   field_18164("true", "options.clouds.fancy");

   public static final Codec<class01301> field_45285 = class05033.N(class01301::values);
   private final String field_45286;
   private final class00392 field_64421;

   private class01301(String var3, String var4) {
      this.field_45286 = var3;
      this.field_64421 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64421;
   }

   @Override
   public String method_15434() {
      return this.field_45286;
   }
}
