package minecraft;

enum class03070 {
   field_28384(true, true),
   field_28385(true, false),
   field_28386(false, true);

   final boolean field_28387;
   final boolean field_28388;

   private class03070(boolean var3, boolean var4) {
      this.field_28387 = var3;
      this.field_28388 = var4;
   }

   public static class03070 N(class07050 var0) {
      return var0 == class07050.field_5808 ? field_28385 : field_28386;
   }
}
