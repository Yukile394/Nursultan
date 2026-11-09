package minecraft;

import com.mojang.serialization.Codec;

public enum class07334 implements class05033 {
   field_64380("default"),
   field_64381("nether");

   public static final Codec<class07334> field_64382 = class05033.N(class07334::values);
   private final String field_64383;

   private class07334(String var3) {
      this.field_64383 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_64383;
   }
}
