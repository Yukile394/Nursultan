package minecraft;

import com.mojang.serialization.Codec;

public enum class08165 implements class05033 {
   field_63425(0, "full_moon"),
   field_63426(1, "waning_gibbous"),
   field_63427(2, "third_quarter"),
   field_63428(3, "waning_crescent"),
   field_63429(4, "new_moon"),
   field_63430(5, "waxing_crescent"),
   field_63431(6, "first_quarter"),
   field_63432(7, "waxing_gibbous");

   public static final Codec<class08165> field_64378 = class05033.N(class08165::values);
   public static final int field_63433 = values().length;
   public static final int field_64379 = 24000;
   private final int field_63434;
   private final String field_63435;

   private class08165(int var3, String var4) {
      this.field_63434 = var3;
      this.field_63435 = var4;
   }

   public int y() {
      return this.field_63434 * 24000;
   }

   public int N() {
      return this.field_63434;
   }

   @Override
   public String method_15434() {
      return this.field_63435;
   }
}
