package minecraft;

import com.google.common.base.Preconditions;

public enum class04659 {
   field_34759(0, 180),
   field_34760(1, 220),
   field_34761(2, 255),
   field_34762(3, 135);

   private static final class04659[] field_34765 = new class04659[]{field_34759, field_34760, field_34761, field_34762};
   public final int field_34763;
   public final int field_34764;

   private class04659(int var3, int var4) {
      this.field_34763 = var3;
      this.field_34764 = var4;
   }

   static class04659 y(int var0) {
      return field_34765[var0];
   }

   public static class04659 N(int var0) {
      Preconditions.checkPositionIndex(var0, field_34765.length, "brightness id");
      return y(var0);
   }
}
