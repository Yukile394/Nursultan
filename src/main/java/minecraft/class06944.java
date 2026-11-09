package minecraft;

import org.jspecify.annotations.Nullable;

public class class06944 extends class06581 {
   public static final int N = 3;
   public static final int y = 1;
   public static final int L = 3;

   public class06944(class06573 var1) {
      super(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void N(class07284 var0, class07209 var1, int var2) {
      class00500 class00500 = var0.method_8320(var1);
      if (class00500.i() instanceof class00873 class00873) {
         class07209 class07209 = class00873.N(var1);
         switch (class00873.ay_()) {
            case field_47834:
               class02615.N(var0, class07209, var2 * 3, 3.0, 1.0, false, class07107.F);
               break;
            case field_47835:
               class02615.N(var0, class07209, var2, class07107.F);
         }
      } else if (class00500.N(class00869.K)) {
         class02615.N(var0, var1, var2 * 3, 3.0, 1.0, false, class07107.F);
      }
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209x = var1.method_8037();
      class07209 class07209x = class07209x.method_10093(var1.method_8038());
      class06584 class06584 = var1.method_8041();
      if (N(class06584, class07299, class07209x)) {
         if (!class07299.method_8608()) {
            class06584.N(var1.method_8036(), class01194.Q);
            class07299.N(1505, class07209x, 15);
         }

         return class07082.N;
      } else if (class07299.method_8320(class07209x).L(class07299, class07209x, var1.method_8038())
         && N(class06584, class07299, class07209x, var1.method_8038())) {
         if (!class07299.method_8608()) {
            class06584.N(var1.method_8036(), class01194.Q);
            class07299.N(1505, class07209x, 15);
         }

         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   public static boolean N(class06584 var0, class07299 var1, class07209 var2, @Nullable class07211 var3) {
      if (var1.method_8320(var2).N(class00869.K) && var1.method_8316(var2).R() == 8) {
         if (!(var1 instanceof class04782)) {
            return true;
         } else {
            class06069 class06069 = var1.method_8409();

            label80:
            for (int i = 0; i < 128; i++) {
               class07209 class07209 = var2;
               class00500 class00500x = class00869.yJ.W();

               for (int var8 = 0; var8 < i / 16; var8++) {
                  class07209 = class07209.method_10069(class06069.y(3) - 1, (class06069.y(3) - 1) * class06069.y(3) / 2, class06069.y(3) - 1);
                  if (var1.method_8320(class07209).W(var1, class07209)) {
                     continue label80;
                  }
               }

               class03556<class00780> class03556 = var1.i(class07209);
               if (class03556.N(class03557.NN)) {
                  if (i == 0 && var3 != null && var3.z().L()) {
                     class00500x = class04206.i.N(class01210.No, var1.field_9229).map(var0x -> var0x.N().W()).orElse(class00500x);
                     if (class00500x.y(class07774.L)) {
                        class00500x = class00500x.y(class07774.L, var3);
                     }
                  } else if (class06069.y(4) == 0) {
                     class00500x = class04206.i.N(class01210.NI, var1.field_9229).map(var0x -> var0x.N().W()).orElse(class00500x);
                  }
               }

               if (class00500x.N(class01210.No, var0x -> var0x.y(class07774.L))) {
                  for (int k = 0; !class00500x.N((class05487)var1, class07209) && k < 4; k++) {
                     class00500x = class00500x.y(class07774.L, class07221.field_11062.N(class06069));
                  }
               }

               if (class00500x.N((class05487)var1, class07209)) {
                  class00500 class00500x = var1.method_8320(class07209);
                  if (class00500x.N(class00869.K) && var1.method_8316(class07209).R() == 8) {
                     var1.method_8652(class07209, class00500x, 3);
                  } else if (class00500x.N(class00869.yJ) && ((class00873)class00869.yJ).N((class05487)var1, class07209, class00500x) && class06069.y(10) == 0) {
                     ((class00873)class00869.yJ).N((class04782)var1, class06069, class07209, class00500x);
                  }
               }
            }

            var0.B(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean N(class06584 var0, class07299 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      if (class00500.i() instanceof class00873 class00873 && class00873.N((class05487)var1, var2, class00500)) {
         if (var1 instanceof class04782) {
            if (class00873.N(var1, var1.field_9229, var2, class00500)) {
               class00873.N((class04782)var1, var1.field_9229, var2, class00500);
            }

            var0.B(1);
         }

         return true;
      } else {
         return false;
      }
   }
}
