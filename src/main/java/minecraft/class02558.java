package minecraft;

import com.mojang.serialization.Codec;

public enum class02558 implements class05033 {
   field_51683("attacker"),
   field_51684("damaging_entity"),
   field_51685("victim");

   public static final Codec<class02558> field_51686 = class05033.N(class02558::values);
   private final String field_51687;

   private class02558(String var3) {
      this.field_51687 = var3;
   }

   @Override
   public String method_15434() {
      return this.field_51687;
   }
}
