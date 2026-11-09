package minecraft;

public enum class07065 {
   field_28630(false, false),
   field_28631(true, false),
   field_28632(false, true),
   field_28633(true, true);

   final boolean field_28634;
   final boolean field_28635;

   public boolean L() {
      return this.field_28634;
   }

   private class07065(boolean var3, boolean var4) {
      this.field_28634 = var3;
      this.field_28635 = var4;
   }

   public boolean y() {
      return this.field_28635;
   }

   public boolean N() {
      return this.field_28635 || this.field_28634;
   }
}
