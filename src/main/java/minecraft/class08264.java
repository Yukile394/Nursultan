package minecraft;

import com.mojang.serialization.Codec;

enum class08264 implements class05033 {
   field_53708("structure"),
   field_53709("mcfunction");

   public static final Codec<class08264> field_53710 = class05033.N(class08264::values);
   private final String field_53711;

   private class08264(String var3) {
      this.field_53711 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_53711;
   }
}
