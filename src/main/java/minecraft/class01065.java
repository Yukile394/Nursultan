package minecraft;

public enum class01065 {
   field_63850(false, false),
   field_63851(true, false),
   field_63852(true, true);

   public final boolean field_63853;
   public final boolean field_63854;

   private class01065(boolean var3, boolean var4) {
      this.field_63853 = var3;
      this.field_63854 = var4;
   }

   public static class01065 N(boolean var0) {
      return var0 ? field_63851 : field_63850;
   }
}
