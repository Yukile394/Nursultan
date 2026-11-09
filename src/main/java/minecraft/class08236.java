package minecraft;

enum class08236 {
   field_53906(4, 2, 1),
   field_53907(4, 1, 2),
   field_53908(2, 4, 1),
   field_53909(1, 4, 2),
   field_53910(2, 1, 4),
   field_53911(1, 2, 4);

   final int field_53912;
   final int field_53913;
   final int field_53914;

   private class08236(int var3, int var4, int var5) {
      this.field_53912 = var3;
      this.field_53913 = var4;
      this.field_53914 = var5;
   }

   public static class08236 N(int var0, int var1, int var2) {
      if (var0 > var1 && var0 > var2) {
         return var1 > var2 ? field_53906 : field_53907;
      } else if (var1 > var0 && var1 > var2) {
         return var0 > var2 ? field_53908 : field_53909;
      } else {
         return var0 > var1 ? field_53910 : field_53911;
      }
   }
}
