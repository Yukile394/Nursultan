package minecraft;

public class class02893 extends class04507<class00717, class08446> {
   private static final float N = 0.0625F;
   private static final float y = 0.15F;
   private static final float L = 0.0625F;
   private final class08943 u;
   private final class06069 i = class06069.u();

   public class02893(class04832 var1) {
      super(var1);
      this.u = var1.y();
      this.field_4673 = 0.15F;
      this.field_4672 = 0.75F;
   }

   public static void y(class01421 var0, class01237 var1, int var2, class08810 var3, class06069 var4) {
      class00734 class00734 = var3.y.M();
      int ix = var3.L;
      if (ix != 0) {
         var4.N(var3.u);
         class08898 class08898 = var3.y;
         float f = (float)class00734.u();
         if (f > 0.0625F) {
            class08898.N(var0, var1, var2, class01384.u, var3.l);

            for (int j = 1; j < ix; j++) {
               var0.N();
               float f1 = (var4.z() * 2.0F - 1.0F) * 0.15F;
               float f2 = (var4.z() * 2.0F - 1.0F) * 0.15F;
               float f3 = (var4.z() * 2.0F - 1.0F) * 0.15F;
               var0.N(f1, f2, f3);
               class08898.N(var0, var1, var2, class01384.u, var3.l);
               var0.y();
            }
         } else {
            float f4 = f * 1.5F;
            var0.N(0.0F, 0.0F, -(f4 * (ix - 1) / 2.0F));
            class08898.N(var0, var1, var2, class01384.u, var3.l);
            var0.N(0.0F, 0.0F, f4);

            for (int k = 1; k < ix; k++) {
               var0.N();
               float f5 = (var4.z() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float f6 = (var4.z() * 2.0F - 1.0F) * 0.15F * 0.5F;
               var0.N(f5, f6, 0.0F);
               class08898.N(var0, var1, var2, class01384.u, var3.l);
               var0.y();
               var0.N(0.0F, 0.0F, f4);
            }
         }
      }
   }

   public static void N(class01421 var0, class01237 var1, int var2, class08810 var3, class06069 var4) {
      N(var0, var1, var2, var3, var4, var3.y.M());
   }

   public static void N(class01421 var0, class01237 var1, int var2, class08810 var3, class06069 var4, class00734 var5) {
      int ix = var3.L;
      if (ix != 0) {
         var4.N(var3.u);
         class08898 class08898 = var3.y;
         float f = (float)var5.u();
         if (f > 0.0625F) {
            class08898.N(var0, var1, var2, class01384.u, var3.l);

            for (int j = 1; j < ix; j++) {
               var0.N();
               float f1 = (var4.z() * 2.0F - 1.0F) * 0.15F;
               float f2 = (var4.z() * 2.0F - 1.0F) * 0.15F;
               float f3 = (var4.z() * 2.0F - 1.0F) * 0.15F;
               var0.N(f1, f2, f3);
               class08898.N(var0, var1, var2, class01384.u, var3.l);
               var0.y();
            }
         } else {
            float f4 = f * 1.5F;
            var0.N(0.0F, 0.0F, -(f4 * (ix - 1) / 2.0F));
            class08898.N(var0, var1, var2, class01384.u, var3.l);
            var0.N(0.0F, 0.0F, f4);

            for (int k = 1; k < ix; k++) {
               var0.N();
               float f5 = (var4.z() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float f6 = (var4.z() * 2.0F - 1.0F) * 0.15F * 0.5F;
               var0.N(f5, f6, 0.0F);
               class08898.N(var0, var1, var2, class01384.u, var3.l);
               var0.y();
               var0.N(0.0F, 0.0F, f4);
            }
         }
      }
   }

   public class08446 method_55269() {
      return new class08446();
   }

   public void method_62354(class00717 var1, class08446 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.y;
      var2.N(var1, var1.N(), this.u);
   }

   public void method_3936(class08446 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (!var1.y.i()) {
         var2.N();
         class00734 class00734 = var1.y.M();
         float f = -((float)class00734.y) + 0.0625F;
         float f1 = class04995.m(var1.P / 10.0F + var1.N) * 0.1F + 0.1F;
         var2.N(0.0F, f1 + f, 0.0F);
         float f2 = class00717.N(var1.P, var1.N);
         var2.N(class02058.u.rotation(f2));
         N(var2, var3, var1.G, var1, this.i, class00734);
         var2.y();
         super.method_3936(var1, var2, var3, var4);
      }
   }
}
