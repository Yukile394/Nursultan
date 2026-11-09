package minecraft;

import com.mojang.serialization.Codec;

public enum class05346 implements class05033 {
   field_18424("major_negative", -5, 100, 10, 10),
   field_18425("minor_negative", -1, 200, 20, 20),
   field_18426("minor_positive", 1, 25, 1, 5),
   field_18427("major_positive", 5, 20, 0, 20),
   field_18428("trading", 1, 25, 2, 20);

   public static final int field_30240 = 25;
   public static final int field_30241 = 20;
   public static final int field_30242 = 2;
   public final String field_18430;
   public final int field_18431;
   public final int field_18432;
   public final int field_19354;
   public final int field_18434;
   public static final Codec<class05346> field_41672 = class05033.N(class05346::values);

   private class05346(String var3, int var4, int var5, int var6, int var7) {
      this.field_18430 = var3;
      this.field_18431 = var4;
      this.field_18432 = var5;
      this.field_19354 = var6;
      this.field_18434 = var7;
   }

   @Override
   public String method_15434() {
      return this.field_18430;
   }
}
