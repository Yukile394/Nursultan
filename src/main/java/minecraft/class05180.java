package minecraft;

public class class05180 extends class01209 {
   public class05180(class01224 var1, String var2, class07209 var3, class06993 var4, boolean var5) {
      super(class04878.h, 0, var1, N(var2), var2, N(var5, var4), var3);
   }

   public class05180(class01224 var1, class07001 var2) {
      super(class04878.h, var2, var1, var1x -> N(var2.y("OW", false), var2.<class06993>N_15("Rot", class06993.field_56670).orElseThrow()));
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
      if (var1.startsWith("Chest")) {
         class07209 class07209 = var2.method_10074();
         if (var5.y(class07209)) {
            class03136.N(var3, var4, class07209, class06273.y);
         }
      } else if (var5.y(var2) && class07299.method_25953(var2)) {
         if (var1.startsWith("Sentry")) {
            class07144 class07144 = class07078.yU.N(var3.method_8410(), class06113.field_16474);
            if (class07144 != null) {
               class07144.method_5814(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5);
               var3.method_8649(class07144);
            }
         } else if (var1.startsWith("Elytra")) {
            class00679 class00679 = new class00679(var3.method_8410(), var2, this.L.u().N(class07211.field_11035));
            class00679.N(new class06584(class06570.sT), false);
            var3.method_8649(class00679);
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Rot", class06993.field_56670, this.L.u());
      var2.N("OW", this.L.Z().get(0) == class05282.y);
   }

   private static class01894 N(String var0) {
      return class01894.y("end_city/" + var0);
   }

   @Override
   protected class01894 N() {
      return N(this.N);
   }

   private static class01233 N(boolean var0, class06993 var1) {
      class05282 class05282 = var0 ? class05282.y : class05282.u;
      return new class01233().N(true).N(class05282).N(var1);
   }
}
