package minecraft;

public class class06368<S extends class08468, M extends class06078<S> & class06240 & class06230> extends class02758<S, M> {
   private static final float N = (float) (-Math.PI / 6);
   private static final float y = (float) (Math.PI / 2);

   public class06368(class06252<S, M> var1) {
      super(var1);
   }

   private void N(S var1, class07070 var2, class01421 var3, class01237 var4, int var5) {
      var3.N();
      this.u().method_63512().N(var3);
      class01686 class01686 = this.u().R();
      float f = class01686.i;
      class01686.i = class04995.N(class01686.i, (float) (-Math.PI / 6), (float) (Math.PI / 2));
      class01686.N(var3);
      class01686.i = f;
      class02245.N(var3, class02221.N);
      boolean flag = var2 == class07070.field_6182;
      var3.N((flag ? -2.5F : 2.5F) / 16.0F, -0.0625F, 0.0F);
      var1.NI.N(var3, var4, var5, class01384.u, var1.l);
      var3.y();
   }

   protected void N(S var1, class08898 var2, class06584 var3, class07070 var4, class01421 var5, class01237 var6, int var7) {
      if (!var2.i()) {
         class07050 class07050 = var4 == var1.NJ ? class07050.field_5808 : class07050.field_5810;
         if (var1.o && var1.B == class07050 && var1.NX < 1.0E-5F && !var1.NI.i()) {
            this.N((S)var1, var4, var5, var6, var7);
         } else {
            super.N((S)var1, var2, var3, var4, var5, var6, var7);
         }
      }
   }
}
