package minecraft;

import Nursultan.class10944;

public class class01083 {
   private static final float L = -0.01F;
   private static final float u = -0.001F;
   public static final int N = 128;
   public static final int y = 128;
   private final class08626 i;
   private final class08265 R;

   public class01083(class08117 var1, class08265 var2) {
      super();
      this.i = var1.N(class08589.Z);
      this.R = var2;
   }

   private class10944 N(class00768 var1) {
      class10944 class10944 = new class10944();
      class10944.N = this.i.N(var1.N());
      class10944.y = var1.u();
      class10944.L = var1.i();
      class10944.u = var1.R();
      class10944.R = var1.M().orElse(null);
      class10944.i = var1.y();
      return class10944;
   }

   public void N(class02265 var1, class07769 var2, class08270 var3) {
      var3.N = this.R.y(var1, var2);
      var3.y.clear();

      for (class00768 class00768 : var2.i()) {
         var3.y.add(this.N(class00768));
      }
   }

   public void N(class08270 var1, class01421 var2, class01237 var3, boolean var4, int var5) {
      var3.N(var2, class06851.n(var1.N), (var1x, var2x) -> {
         var2x.N(var1x, 0.0F, 128.0F, -0.01F).method_39415(-1).method_22913(0.0F, 1.0F).method_60803(var5);
         var2x.N(var1x, 128.0F, 128.0F, -0.01F).method_39415(-1).method_22913(1.0F, 1.0F).method_60803(var5);
         var2x.N(var1x, 128.0F, 0.0F, -0.01F).method_39415(-1).method_22913(1.0F, 0.0F).method_60803(var5);
         var2x.N(var1x, 0.0F, 0.0F, -0.01F).method_39415(-1).method_22913(0.0F, 0.0F).method_60803(var5);
      });
      int ix = 0;

      for (class10944 class10944 : var1.y) {
         if (!var4 || class10944.i) {
            var2.N();
            var2.N(class10944.y / 2.0F + 64.0F, class10944.L / 2.0F + 64.0F, -0.02F);
            var2.N(class02058.R.N(class10944.u * 360 / 16.0F));
            var2.y(4.0F, 4.0F, 3.0F);
            var2.N(-0.125F, 0.125F, 0.0F);
            class08388 class08388 = class10944.N;
            if (class08388 != null) {
               float f = ix * -0.001F;
               var3.N(var2, class06851.n(class08388.method_45852()), (var3x, var4x) -> {
                  var4x.N(var3x, -1.0F, 1.0F, f).method_39415(-1).method_22913(class08388.method_4594(), class08388.method_4593()).method_60803(var5);
                  var4x.N(var3x, 1.0F, 1.0F, f).method_39415(-1).method_22913(class08388.method_4577(), class08388.method_4593()).method_60803(var5);
                  var4x.N(var3x, 1.0F, -1.0F, f).method_39415(-1).method_22913(class08388.method_4577(), class08388.method_4575()).method_60803(var5);
                  var4x.N(var3x, -1.0F, -1.0F, f).method_39415(-1).method_22913(class08388.method_4594(), class08388.method_4575()).method_60803(var5);
               });
               var2.y();
            }

            if (class10944.R != null) {
               class01590 class01590 = (class01590)class06202.Nq().i_3;
               float f1 = class01590.N(class10944.R);
               float f2 = class04995.N(25.0F / f1, 0.0F, 6.0F / 9.0F);
               var2.N();
               var2.N(class10944.y / 2.0F + 64.0F - f1 * f2 / 2.0F, class10944.L / 2.0F + 64.0F + 4.0F, -0.025F);
               var2.y(f2, f2, -1.0F);
               var2.N(0.0F, 0.0F, 0.1F);
               var3.N(1).N(var2, 0.0F, 0.0F, class10944.R.method_30937(), false, class01583.field_33993, var5, -1, Integer.MIN_VALUE, 0);
               var2.y();
            }

            ix++;
         }
      }
   }
}
