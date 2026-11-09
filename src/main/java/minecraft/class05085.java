package minecraft;

import com.mojang.serialization.Codec;

public enum class05085 implements class05033 {
   field_24029("on_land_surface"),
   field_24030("partly_buried"),
   field_24031("on_ocean_floor"),
   field_24032("in_mountain"),
   field_24033("underground"),
   field_24034("in_nether");

   public static final Codec<class05085> field_37811 = class05033.N(class05085::values);
   private final String field_24036;

   private class05085(String var3) {
      this.field_24036 = var3;
   }

   public String N() {
      return this.field_24036;
   }

   @Override
   public String method_15434() {
      return this.field_24036;
   }
}
