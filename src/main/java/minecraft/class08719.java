package minecraft;

import com.mojang.serialization.Codec;

public enum class08719 implements class05033 {
   field_54125("humanoid"),
   field_54126("humanoid_leggings"),
   field_54127("wings"),
   field_54128("wolf_body"),
   field_54129("horse_body"),
   field_54130("llama_body"),
   field_56123("pig_saddle"),
   field_56124("strider_saddle"),
   field_56125("camel_saddle"),
   field_64249("camel_husk_saddle"),
   field_56126("horse_saddle"),
   field_56127("donkey_saddle"),
   field_56128("mule_saddle"),
   field_56129("zombie_horse_saddle"),
   field_56130("skeleton_horse_saddle"),
   field_59984("happy_ghast_body"),
   field_63621("nautilus_saddle"),
   field_63622("nautilus_body");

   public static final Codec<class08719> field_54131 = class05033.N(class08719::values);
   private final String field_54132;

   private class08719(String var3) {
      this.field_54132 = var3;
   }

   public String N() {
      return "trims/entity/" + this.field_54132;
   }

   @Override
   public String method_15434() {
      return this.field_54132;
   }
}
