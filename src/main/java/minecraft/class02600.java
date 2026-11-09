package minecraft;

public class class02600 extends class06249<class08468, class02721> {
   private final class06079 N;

   public class02600(class06252<class08468, class02721> var1, class01140 var2) {
      super(var1);
      this.N = new class06079(var2.N(class04802.LT));
   }

   private void N(class01421 var1, class01237 var2, int var3, class08468 var4, class07648 var5, float var6, float var7, boolean var8) {
      var1.N();
      var1.N(var8 ? 0.4F : -0.4F, var4.Z ? -1.3F : -1.5F, 0.0F);
      class08450 class08450 = new class08450();
      class08450.L = class06067.field_3464;
      class08450.P = var4.P;
      class08450.NN = var4.NN;
      class08450.Ny = var4.Ny;
      class08450.D = var6;
      class08450.h = var7;
      var2.N(this.N, class08450, var1, this.N.method_23500(class02714.N(var5)), var3, class01384.u, var4.l, null);
      var1.y();
   }

   public void N(class01421 var1, class01237 var2, int var3, class08468 var4, float var5, float var6) {
      class07648 class07648x = var4.NY;
      if (class07648x != null) {
         this.N(var1, var2, var3, var4, class07648x, var5, var6, true);
      }

      class07648 class07648x = var4.NQ;
      if (class07648x != null) {
         this.N(var1, var2, var3, var4, class07648x, var5, var6, false);
      }
   }
}
