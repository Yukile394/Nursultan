package minecraft;

public class class05165 extends class01209 {
   public class05165(class01224 var1, class01894 var2, class07209 var3, class06993 var4, int var5) {
      super(class04878.q, 0, var1, var2, var2.toString(), N(var4, var2), N(var2, var3, var5));
   }

   public class05165(class01224 var1, class07001 var2) {
      super(class04878.q, var2, var1, var1x -> N(var2.<class06993>N_15("Rot", class06993.field_56670).orElseThrow(), var1x));
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class01894 class01894 = class01894.N(this.N);
      class01233 class01233 = N(this.L.u(), class01894);
      class07209 class07209xxx = class05173.u.get(class01894);
      class07209 class07209x = this.u
         .method_10081(class01207.N(class01233, new class07209(3 - class07209xxx.method_10263(), 0, -class07209xxx.method_10260())));
      int i = var1.method_8624(class07830.field_13194, class07209x.method_10263(), class07209x.method_10260());
      class07209 class07209xx = this.u;
      this.u = this.u.method_10069(0, i - 90 - 1, 0);
      super.N(var1, var2, var3, var4, var5, var6, var7);
      if (class01894.equals(class05173.y)) {
         class07209 class07209xxx = this.u.method_10081(class01207.N(class01233, new class07209(3, 0, 5)));
         class00500 class00500 = var1.method_8320(class07209xxx.method_10074());
         if (!class00500.P() && !class00500.N(class00869.uW)) {
            var1.method_8652(class07209xxx, class00869.ib.W(), 3);
         }
      }

      this.u = class07209xx;
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
      if ("chest".equals(var1)) {
         var3.method_8652(var2, class00869.N.W(), 3);
         class00394 class00394 = var3.method_8321(var2.method_10074());
         if (class00394 instanceof class00379) {
            ((class00379)class00394).N(class06273.Y, var4.B());
         }
      }
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Rot", class06993.field_56670, this.L.u());
   }

   private static class07209 N(class01894 var0, class07209 var1, int var2) {
      return var1.method_10081(class05173.u.get(var0)).method_10087(var2);
   }

   private static class01233 N(class06993 var0, class01894 var1) {
      return new class01233().N(var0).N(class07111.field_11302).N(class05173.L.get(var1)).N(class05282.y).N(class02610.field_52237);
   }
}
