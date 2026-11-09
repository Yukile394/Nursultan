package minecraft;

public class class06028 extends class01209 {
   public class06028(class01224 var1, class01894 var2, class07209 var3, class06993 var4) {
      super(class04878.NL, 0, var1, var2, var2.toString(), N(var4), var3);
   }

   public class06028(class01224 var1, class07001 var2) {
      super(class04878.NL, var2, var1, var1x -> N(var2.<class06993>N_15("Rot", class06993.field_56670).orElseThrow()));
   }

   private void N(class05974 var1, class06069 var2, class05163 var3, class05163 var4) {
      class06069 class06069 = class06069.y(var1.method_8412()).L().N(var3.M());
      if (class06069.z() < 0.5F) {
         int i = var3.B() + class06069.y(var3.u());
         int j = var3.Z();
         int k = var3.z() + class06069.y(var3.R());
         class07209 class07209 = new class07209(i, j, k);
         if (var1.method_8320(class07209).P() && var4.y(class07209)) {
            var1.method_8652(class07209, class00869.mu.W().N(class06993.N(class06069)), 2);
         }
      }
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      class05163 class05163 = this.y.y(this.L, this.u);
      var5.y(class05163);
      super.N(var1, var2, var3, var4, var5, var6, var7);
      this.N(var1, var4, class05163, var5);
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Rot", class06993.field_56670, this.L.u());
   }

   private static class01233 N(class06993 var0) {
      return new class01233().N(var0).N(class07111.field_11302).N(class05282.u);
   }
}
