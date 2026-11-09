package minecraft;

import com.mojang.serialization.Codec;

public enum class06685 implements class05033 {
   field_5788("pink", class06541.field_1061),
   field_5780("blue", class06541.field_1078),
   field_5784("red", class06541.field_1079),
   field_5785("green", class06541.field_1060),
   field_5782("yellow", class06541.field_1054),
   field_5783("purple", class06541.field_1058),
   field_5786("white", class06541.field_1068);

   public static final Codec<class06685> field_56628 = class05033.N(class06685::values);
   private final String field_5781;
   private final class06541 field_5787;

   private class06685(String var3, class06541 var4) {
      this.field_5781 = var3;
      this.field_5787 = var4;
   }

   public String y() {
      return this.field_5781;
   }

   public class06541 N() {
      return this.field_5787;
   }

   @Override
   public String method_15434() {
      return this.field_5781;
   }
}
