package minecraft;

import com.mojang.serialization.Codec;

public enum class00785 implements class05033 {
   field_26407("NONE", 0, "none"),
   field_26408("FROZEN", 1, "frozen");

   private final String field_26410;
   public static final Codec<class00785> field_26409 = class05033.N(class00785::values);

   class00785(String var3) {
      this.field_26410 = var3;
   }

   public String N() {
      return this.field_26410;
   }

   public abstract float N(class07209 var1, float var2);

   @Override
   public String method_15434() {
      return this.field_26410;
   }
}
