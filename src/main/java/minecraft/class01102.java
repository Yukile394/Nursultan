package minecraft;

public enum class01102 {
   field_27289(false, false),
   field_27290(true, false),
   field_27291(true, true);

   private final boolean field_27292;
   private final boolean field_27293;

   private class01102(boolean var3, boolean var4) {
      this.field_27292 = var3;
      this.field_27293 = var4;
   }

   public boolean y() {
      return this.field_27292;
   }

   public static class01102 N(class04763 var0) {
      if (var0.N(class04763.field_13877)) {
         return field_27291;
      } else {
         return var0.N(class04763.field_44855) ? field_27290 : field_27289;
      }
   }

   public boolean N() {
      return this.field_27293;
   }
}
