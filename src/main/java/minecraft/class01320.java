package minecraft;

public class class01320 extends class06249<class08460, class01316> {
   public class01320(class06252<class08460, class01316> var1) {
      super(var1);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08460 var4, float var5, float var6) {
      class08898 class08898 = var4.J;
      if (!class08898.i()) {
         boolean flag = var4.u;
         boolean flag1 = var4.NB;
         var1.N();
         var1.N(this.u().y.y / 16.0F, this.u().y.L / 16.0F, this.u().y.u / 16.0F);
         if (flag1) {
            float f = 0.75F;
            var1.y(0.75F, 0.75F, 0.75F);
         }

         var1.N(class02058.R.rotation(var4.N));
         var1.N(class02058.u.N(var5));
         var1.N(class02058.y.N(var6));
         if (var4.NB) {
            if (flag) {
               var1.N(0.4F, 0.26F, 0.15F);
            } else {
               var1.N(0.06F, 0.26F, -0.5F);
            }
         } else if (flag) {
            var1.N(0.46F, 0.26F, 0.22F);
         } else {
            var1.N(0.06F, 0.27F, -0.5F);
         }

         var1.N(class02058.y.N(90.0F));
         if (flag) {
            var1.N(class02058.R.N(90.0F));
         }

         class08898.N(var1, var2, var3, class01384.u, var4.l);
         var1.y();
      }
   }
}
