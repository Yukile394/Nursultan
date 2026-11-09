package minecraft;

import com.google.common.collect.ImmutableMap;

public class class03616 extends class05765<class04003> {
   private static final int y = 15;
   private static final int L = 20;
   private static final double u = 0.5;
   private static final double i = 2.5;
   public static final int N = 40;
   private static final int R = class04995.L(34.0);
   private static final int Z = class04995.u(60.0F);

   protected void L(class04782 var1, class04003 var2, long var3) {
      var2.method_18868().L(class05378.s).ifPresent(var1x -> var2.p().N(var1x.method_73189()));
      if (!var2.method_18868().N(class05378.Nx) && !var2.method_18868().N(class05378.NS)) {
         var2.method_18868().N(class05378.NS, class06244.field_17274, Z - R);
         var2.method_18868().L(class05378.s).filter(var2::L).filter(var1x -> var2.method_43259(var1x, 15.0, 20.0)).ifPresent(var2x -> {
            class06889 class06889xxx = var2.method_73189().i(var2.method_56072().y(class03831.field_48320, 0, var2.method_36454()));
            class06889 class06889x = var2x.method_33571().u(class06889xxx);
            class06889 class06889xx = class06889x.u();
            int ix = class04995.N(class06889x.M()) + 7;

            for (int j = 1; j < ix; j++) {
               class06889 class06889xxx = class06889xxx.i(class06889xx.L((double)j));
               var1.method_65096(class07107.Q, class06889xxx.M, class06889xxx.B, class06889xxx.Z, 1, 0.0, 0.0, 0.0, 0.0);
            }

            var2.method_5783(class04909.Is, 3.0F, 1.0F);
            if (var2x.method_64397(var1, var1.method_48963().i(var2), 10.0F)) {
               double d1 = 0.5 * (1.0 - var2x.method_45325(class05298.b));
               double d0 = 2.5 * (1.0 - var2x.method_45325(class05298.b));
               var2x.method_5762(class06889xx.N() * d0, class06889xx.y() * d1, class06889xx.L() * d0);
            }
         });
      }
   }

   public class03616() {
      super(
         ImmutableMap.of(
            class05378.s,
            class05367.field_18456,
            class05378.NC,
            class05367.field_18457,
            class05378.NS,
            class05367.field_18458,
            class05378.Nx,
            class05367.field_18458
         ),
         Z
      );
   }

   protected void u(class04782 var1, class04003 var2, long var3) {
      N(var2, 40);
   }

   protected void y(class04782 var1, class04003 var2, long var3) {
      var2.method_18868().N(class05378.T, true, Z);
      var2.method_18868().N(class05378.Nx, class06244.field_17274, R);
      var1.method_8421(var2, (byte)62);
      var2.method_5783(class04909.IT, 3.0F, 1.0F);
   }

   public static void N(class07438 var0, int var1) {
      var0.method_18868().N(class05378.NC, class06244.field_17274, var1);
   }

   protected boolean N(class04782 var1, class04003 var2, long var3) {
      return true;
   }

   protected boolean N(class04782 var1, class04003 var2) {
      return var2.method_43259(var2.method_18868().L(class05378.s).get(), 15.0, 20.0);
   }
}
