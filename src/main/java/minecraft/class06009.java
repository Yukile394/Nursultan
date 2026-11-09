package minecraft;

import com.mojang.serialization.Codec;

public enum class06009 implements class05033 {
   field_26426("NONE", 0, "none"),
   field_26427("DARK_FOREST", 1, "dark_forest"),
   field_26428("SWAMP", 2, "swamp");

   private final String field_26430;
   public static final Codec<class06009> field_26429 = class05033.N(class06009::values);

   class06009(String var3) {
      this.field_26430 = var3;
   }

   public String N() {
      return this.field_26430;
   }

   public abstract int N(double var1, double var3, int var5);

   @Override
   public String method_15434() {
      return this.field_26430;
   }
}
