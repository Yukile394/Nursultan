package minecraft;

import com.mojang.serialization.Codec;

public enum class06558 implements class05033 {
   field_55206("none"),
   field_55207("arrow"),
   field_55208("rocket");

   public static final Codec<class06558> field_55209 = class05033.N(class06558::values);
   private final String field_55210;

   private class06558(String var3) {
      this.field_55210 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_55210;
   }
}
