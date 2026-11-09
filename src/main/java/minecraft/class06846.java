package minecraft;

import com.mojang.serialization.Codec;

public enum class06846 implements class05033 {
   field_64076("auto"),
   field_64077("mean"),
   field_64078("cutout"),
   field_64079("strict_cutout"),
   field_64080("dark_cutout");

   public static final Codec<class06846> field_64081 = class05033.y(class06846::values);
   private final String field_64082;

   private class06846(String var3) {
      this.field_64082 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_64082;
   }
}
