package minecraft;

import com.mojang.serialization.Codec;

public enum class07428 implements class05033 {
   field_6302("monster", 70, false, false, 128),
   field_6294("creature", 10, true, true, 128),
   field_6303("ambient", 15, true, false, 128),
   field_34447("axolotls", 5, true, false, 128),
   field_30092("underground_water_creature", 5, true, false, 128),
   field_6300("water_creature", 5, true, false, 128),
   field_24460("water_ambient", 20, true, false, 64),
   field_17715("misc", -1, true, true, 128);

   public static final Codec<class07428> field_24655 = class05033.N(class07428::values);
   private final int field_6297;
   private final boolean field_6298;
   private final boolean field_6295;
   private final String field_6304;
   private final int field_24461 = 32;
   private final int field_24462;

   public boolean L() {
      return this.field_6298;
   }

   private class07428(String var3, int var4, boolean var5, boolean var6, int var7) {
      this.field_6304 = var3;
      this.field_6297 = var4;
      this.field_6298 = var5;
      this.field_6295 = var6;
      this.field_24462 = var7;
   }

   public int i() {
      return this.field_24462;
   }

   public boolean u() {
      return this.field_6295;
   }

   public int y() {
      return this.field_6297;
   }

   public String N() {
      return this.field_6304;
   }

   public int R() {
      return 32;
   }

   @Override
   public String method_15434() {
      return this.field_6304;
   }
}
