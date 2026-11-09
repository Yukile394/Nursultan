package minecraft;

import java.util.List;

public class class06518 extends class06581 implements class02661 {
   public static final int N = 10;
   public static final float y = 8.0F;
   public static final float L = 2.5F;

   public static class02197 L() {
      return new class02197(List.of(), 1.0F, 2, false);
   }

   public class06518(class06573 var1) {
      super(var1);
   }

   @Override
   public class06509 y(class06584 var1) {
      return class06509.field_63380;
   }

   public static class02833 y() {
      return class02833.N()
         .N(class05298.u, new class07471(M, 8.0, class07463.field_6328), class02834.field_49217)
         .N(class05298.R, new class07471(B, -2.9F, class07463.field_6328), class02834.field_49217)
         .N();
   }

   @Override
   public class08005 N(class07299 var1, class00737 var2, class06584 var3, class07211 var4) {
      class07517 class07517 = new class07517(var1, var2.N(), var2.y(), var2.L(), var3.L(1));
      class07517.y = class08008.field_7593;
      return class07517;
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      if (class06584.b()) {
         return class07082.u;
      } else if (class07323.N(class06584, var2) > 0.0F && !var2.method_5721()) {
         return class07082.u;
      } else {
         var2.method_6019(var3);
         return class07082.L;
      }
   }

   @Override
   public boolean N(class06584 var1, class07299 var2, class07438 var3, int var4) {
      if (var3 instanceof class08036 class08036) {
         if (this.N(var1, var3) - var4 < 10) {
            return false;
         } else {
            float f = class07323.N(var1, class08036);
            if (f > 0.0F && !class08036.method_5721()) {
               return false;
            } else if (var1.b()) {
               return false;
            } else {
               class03556<class04891> class03556 = class07323.y(var1, class02523.O).orElse(class04909.Qh);
               class08036.method_7259(class01235.L.y(this));
               if (var2 instanceof class04782 class04782) {
                  var1.N(1, class08036);
                  if (f == 0.0F) {
                     class06584 class06584 = var1.y(1, class08036);
                     class07517 class07517 = class08005.N(class07517::new, class04782, class06584, class08036, 0.0F, 2.5F, 1.0F);
                     if (class08036.method_56992()) {
                        class07517.y = class08008.field_7594;
                     }

                     var2.method_43129(null, class07517, class03556.N(), class04911.field_15248, 1.0F, 1.0F);
                     return true;
                  }
               }

               if (f > 0.0F) {
                  float f7 = class08036.method_36454();
                  float f1 = class08036.method_36455();
                  float f2 = -class04995.m(f7 * (float) (Math.PI / 180.0)) * class04995.P(f1 * (float) (Math.PI / 180.0));
                  float f3 = -class04995.m(f1 * (float) (Math.PI / 180.0));
                  float f4 = class04995.P(f7 * (float) (Math.PI / 180.0)) * class04995.P(f1 * (float) (Math.PI / 180.0));
                  float f5 = class04995.N(f2 * f2 + f3 * f3 + f4 * f4);
                  f2 *= f / f5;
                  f3 *= f / f5;
                  f4 *= f / f5;
                  class08036.method_5762(f2, f3, f4);
                  class08036.method_40126(20, 8.0F, var1);
                  if (class08036.method_24828()) {
                     float f6 = 1.1999999F;
                     class08036.method_5784(class07451.field_6308, new class06889(0.0, 1.1999999F, 0.0));
                  }

                  var2.method_43129(null, class08036, class03556.N(), class04911.field_15248, 1.0F, 1.0F);
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      return 72000;
   }
}
