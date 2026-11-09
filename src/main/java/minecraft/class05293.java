package minecraft;

public interface class05293 {
   int u = 10;
   float i = 0.2F;

   static boolean N(class04782 var0, class07438 var1, class07438 var2) {
      float f1 = (float)var1.method_45325(class05298.u);
      float f;
      if (!var1.method_6109() && (int)f1 > 0) {
         f = f1 / 2.0F + var0.field_9229.y((int)f1);
      } else {
         f = f1;
      }

      class07072 class07072 = var1.method_48923().y(var1);
      boolean flag = var2.method_64397(var0, class07072, f);
      if (flag) {
         class07323.N(var0, (class07049)var2, class07072);
         if (!var1.method_6109()) {
            N(var1, var2);
         }
      }

      return flag;
   }

   static void N(class07438 var0, class07438 var1) {
      double d0 = var0.method_45325(class05298.i);
      double d1 = var1.method_45325(class05298.b);
      double d2 = d0 - d1;
      if (!(d2 <= 0.0)) {
         double d3 = var1.method_23317() - var0.method_23317();
         double d4 = var1.method_23321() - var0.method_23321();
         float f = var0.method_73183().field_9229.y(21) - 10;
         double d5 = d2 * (var0.method_73183().field_9229.z() * 0.5F + 0.2F);
         class06889 class06889 = new class06889(d3, 0.0, d4).u().L(d5).y(f);
         double d6 = d2 * var0.method_73183().field_9229.z() * 0.5;
         var1.method_5762(class06889.M, d6, class06889.Z);
         var1.field_6037 = true;
      }
   }

   int W();
}
