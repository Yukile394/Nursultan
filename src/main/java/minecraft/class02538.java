package minecraft;

import com.mojang.serialization.Codec;

public enum class02538 implements class05033 {
   field_51723("entity_position", (var0, var2, var4, var5) -> var0),
   field_51724("in_bounding_box", (var0, var2, var4, var5) -> var2 + (var5.U() - 0.5) * var4);

   public static final Codec<class02538> field_51725 = class05033.N(class02538::values);
   private final String field_51726;
   private final class02553 field_51727;

   private class02538(String var3, class02553 var4) {
      this.field_51726 = var3;
      this.field_51727 = var4;
   }

   public double N(double var1, double var3, float var5, class06069 var6) {
      return this.field_51727.getCoordinate(var1, var3, var5, var6);
   }

   @Override
   public String method_15434() {
      return this.field_51726;
   }
}
