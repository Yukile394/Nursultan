package minecraft;

import com.mojang.serialization.Codec;

public enum class03553 implements class05033 {
   field_36421("linear"),
   field_36422("triangular");

   public static final Codec<class03553> field_36423 = class05033.N(class03553::values);
   private final String field_36425;

   private class03553(String var3) {
      this.field_36425 = var3;
   }

   public int N(class06069 var1, int var2) {
      return switch (this) {
         case field_36421 -> var1.y(var2);
         case field_36422 -> (var1.y(var2) + var1.y(var2)) / 2;
      };
   }

   @Override
   public String method_15434() {
      return this.field_36425;
   }
}
