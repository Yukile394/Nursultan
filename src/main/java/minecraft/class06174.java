package minecraft;

public class class06174<S extends class08837, M extends class06078<S> & class06275> extends class06249<S, M> {
   public class06174(class06252<S, M> var1) {
      super(var1);
   }

   protected void N(S var1, class01421 var2) {
      this.u().N((S)var1, var2);
      var2.N(class02058.y.rotation(0.75F));
      var2.y(1.07F, 1.07F, 1.07F);
      var2.N(0.0F, 0.13F, -0.34F);
      var2.N(class02058.y.rotation((float) Math.PI));
   }

   public void N(class01421 var1, class01237 var2, int var3, S var4, float var5, float var6) {
      class08898 class08898 = var4.J;
      if (!class08898.i()) {
         var1.N();
         this.N((S)var4, var1);
         class08898.N(var1, var2, var3, class01384.u, var4.l);
         var1.y();
      }
   }
}
