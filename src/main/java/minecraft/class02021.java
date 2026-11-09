package minecraft;

enum class02021 {
   field_4199(0, 1, 2, 3),
   field_4200(2, 3, 0, 1),
   field_4204(3, 0, 1, 2),
   field_4205(0, 1, 2, 3),
   field_4206(3, 0, 1, 2),
   field_4207(1, 2, 3, 0);

   final int field_4203;
   final int field_4201;
   final int field_4198;
   final int field_4209;
   private static final class02021[] field_4202 = class07536.N(new class02021[6], var0 -> {
      var0[class07211.field_11033.L()] = field_4199;
      var0[class07211.field_11036.L()] = field_4200;
      var0[class07211.field_11043.L()] = field_4204;
      var0[class07211.field_11035.L()] = field_4205;
      var0[class07211.field_11039.L()] = field_4206;
      var0[class07211.field_11034.L()] = field_4207;
   });

   private class02021(int var3, int var4, int var5, int var6) {
      this.field_4203 = var3;
      this.field_4201 = var4;
      this.field_4198 = var5;
      this.field_4209 = var6;
   }

   public static class02021 N(class07211 var0) {
      return field_4202[var0.L()];
   }
}
