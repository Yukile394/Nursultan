package minecraft;

import com.mojang.serialization.Codec;

public enum class07852 implements class05033 {
   field_13174("raw_generation"),
   field_25186("lakes"),
   field_13171("local_modifications"),
   field_13172("underground_structures"),
   field_13173("surface_structures"),
   field_25187("strongholds"),
   field_13176("underground_ores"),
   field_13177("underground_decoration"),
   field_35182("fluid_springs"),
   field_13178("vegetal_decoration"),
   field_13179("top_layer_modification");

   public static final Codec<class07852> field_37680 = class05033.N(class07852::values);
   private final String field_37682;

   private class07852(String var3) {
      this.field_37682 = var3;
   }

   public String N() {
      return this.field_37682;
   }

   @Override
   public String method_15434() {
      return this.field_37682;
   }
}
