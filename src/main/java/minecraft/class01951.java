package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public class class01951 extends class06581 {
   public static final int N = 10;
   private static final int y = 200;

   public class01951(class06573 var1) {
      super(var1);
   }

   private double y(class08036 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2) ? 5.0 : var1.method_55754();
   }

   @Override
   public class06509 y(class06584 var1) {
      return class06509.field_42717;
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, int var4) {
      if (var4 >= 0 && var2 instanceof class08036 class08036) {
         class07089 class07089 = this.N(class08036);
         if (class07089 instanceof class06183 class06183 && class07089.N() == class07113.field_1332) {
            if ((this.N(var3, var2) - var4 + 1) % 10 == 5) {
               class07209 class07209 = class06183.u();
               class00500 class00500 = var1.method_8320(class07209);
               class07070 class07070 = var2.method_6058() == class07050.field_5808 ? class08036.method_6068() : class08036.method_6068().N();
               if (class00500.g() && class00500.b() != class06898.field_11455) {
                  this.N(var1, class06183, class00500, var2.method_5828(0.0F), class07070);
               }

               class04891 class04891;
               if (class00500.i() instanceof class01979 class01979) {
                  class04891 = class01979.L();
               } else {
                  class04891 = class04909.ui;
               }

               var1.N(class08036, class07209, class04891, class04911.field_15245);
               if (var1 instanceof class04782 class04782 && var1.method_8321(class07209) instanceof class01965 class01965) {
                  boolean flag = class01965.N(var1.N(), class04782, class08036, class06183.i(), var3);
                  if (flag) {
                     class07085 class07085 = var3.equals(class08036.method_6118(class07085.field_6171)) ? class07085.field_6171 : class07085.field_6173;
                     var3.N(1, class08036, class07085);
                  }
               }
            }
         } else {
            var2.method_6075();
         }
      } else {
         var2.method_6075();
      }
   }

   private class07105 N(class07105 var1, class07299 var2, class06183 var3, class00500 var4, class06889 var5, class07070 var6) {
      var1.fabric_setBlockPos(var3.u());
      return var1;
   }

   private void N(class07299 var1, class06183 var2, class00500 var3, class06889 var4, class07070 var5) {
      double d0 = 3.0;
      int i = var5 == class07070.field_6183 ? 1 : -1;
      int j = var1.method_8409().y(7, 12);
      class07105 class07105 = this.N(new class07105(class07107.y, var3), var1, var2, var3, var4, var5);
      class07211 class07211 = var2.i();
      class01945 class01945 = class01945.N(var4, class07211);
      class06889 class06889 = var2.y();

      for (int k = 0; k < j; k++) {
         var1.method_8406(
            class07105,
            class06889.M - (class07211 == class07211.field_11039 ? 1.0E-6F : 0.0F),
            class06889.B,
            class06889.Z - (class07211 == class07211.field_11043 ? 1.0E-6F : 0.0F),
            class01945.N() * i * 3.0 * var1.method_8409().U(),
            0.0,
            class01945.L() * i * 3.0 * var1.method_8409().U()
         );
      }
   }

   private class07089 N(class08036 var1) {
      return class08038.N(var1, class07042.B, this.y(var1));
   }

   @Override
   public class07082 N(class06501 var1) {
      class08036 class08036 = var1.method_8036();
      if (class08036 != null && this.N(class08036).N() == class07113.field_1332) {
         class08036.method_6019(var1.method_20287());
      }

      return class07082.L;
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      return 200;
   }
}
