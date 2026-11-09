package minecraft;

import com.mojang.serialization.Codec;

public enum class08030 implements class05033 {
   field_7559(0, "cape"),
   field_7564(1, "jacket"),
   field_7568(2, "left_sleeve"),
   field_7570(3, "right_sleeve"),
   field_7566(4, "left_pants_leg"),
   field_7565(5, "right_pants_leg"),
   field_7563(6, "hat");

   public static final Codec<class08030> field_62532 = class05033.N(class08030::values);
   private final int field_7561;
   private final int field_7560;
   private final String field_7569;
   private final class00392 field_7567;

   public String L() {
      return this.field_7569;
   }

   private class08030(int var3, String var4) {
      this.field_7561 = var3;
      this.field_7560 = 1 << var3;
      this.field_7569 = var4;
      this.field_7567 = class00392.L("options.modelPart." + var4);
   }

   public class00392 u() {
      return this.field_7567;
   }

   public int y() {
      return this.field_7561;
   }

   public int N() {
      return this.field_7560;
   }

   @Override
   public String method_15434() {
      return this.field_7569;
   }
}
