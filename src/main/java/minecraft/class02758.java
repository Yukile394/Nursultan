package minecraft;

public class class02758<S extends class08827, M extends class06078<S> & class06240> extends class06249<S, M> {
   public class02758(class06252<S, M> var1) {
      super(var1);
   }

   protected void N(S var1, class08898 var2, class06584 var3, class07070 var4, class01421 var5, class01237 var6, int var7) {
      if (!var2.i()) {
         var5.N();
         this.u().N((S)var1, var4, var5);
         var5.N(class02058.y.N(-90.0F));
         var5.N(class02058.u.N(180.0F));
         boolean flag = var4 == class07070.field_6182;
         var5.N((flag ? -1 : 1) / 16.0F, 0.125F, -0.625F);
         if (var1.NX > 0.0F && var1.NJ == var4 && var1.Nc == class08155.field_63400) {
            class06733.N(var1, var5);
         }

         float f = var1.N(var4);
         if (f != 0.0F) {
            (var4 == class07070.field_6183 ? var1.No : var1.NV).N(var1, var5, f, var4, var3);
         }

         var2.N(var5, var6, var7, class01384.u, var1.l);
         var5.y();
      }
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      this.N((S)var4, var4.Nq, var4.NK, class07070.field_6183, var1, var2, var3);
      this.N((S)var4, var4.Ne, var4.NH, class07070.field_6182, var1, var2, var3);
   }
}
