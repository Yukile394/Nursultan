package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public class class06552 extends class06581 {
   public class06552(class06573 var1) {
      super(var1);
   }

   private boolean N(class08036 var1, class07050 var2) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_11);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      class06183 class06183 = N(var1, var2, class05835.field_1348);
      if (class06183.N() == class07113.field_1332 && var1.method_8320(class06183.u()).N(class00869.Mm)) {
         return class07082.i;
      } else {
         if (this.N(var2, var3)) {
            var2.method_6019(var3);
         }

         if (var1 instanceof class04782) {
            class07209 class07209 = ((class04782)var1).method_8487(class04398.N, var2.method_24515(), 100, false);
            if (class07209 == null) {
               return class07082.L;
            }

            class08026 class08026 = new class08026(var1, var2.method_23317(), var2.method_23323(0.5), var2.method_23321());
            class08026.N(class06584);
            class08026.N(class06889.N(class07209));
            var1.method_32888(class01194.V, class08026.method_73189(), class01164.N(var2));
            var1.method_8649(class08026);
            if (var2 instanceof class04770 class04770) {
               class06912.m.N(class04770, class07209);
            }

            float f = class04995.B(var1.field_9229.z(), 0.33F, 0.5F);
            var1.method_43128(null, var2.method_23317(), var2.method_23318(), var2.method_23321(), class04909.zp, class04911.field_15254, 1.0F, f);
            class06584.N(1, var2);
            var2.method_7259(class01235.L.y(this));
         }

         return class07082.y;
      }
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      return 0;
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209xx = var1.method_8037();
      class00500 class00500x = class07299.method_8320(class07209xx);
      if (!class00500x.N(class00869.Mm) || class00500x.L(class07200.L)) {
         return class07082.i;
      } else if (class07299.method_8608()) {
         return class07082.N;
      } else {
         class00500 class00500x = class00500x.y(class07200.L, true);
         class00891.N_19(class00500x, class00500x, class07299, class07209xx);
         class07299.method_8652(class07209xx, class00500x, 2);
         class07299.method_8455(class07209xx, class00869.Mm);
         var1.method_8041().B(1);
         class07299.N(1503, class07209xx, 0);
         class06653 class06653 = class07200.y().N(class07299, class07209xx);
         if (class06653 != null) {
            class07209 class07209x = class06653.N().method_10069(-3, 0, -3);

            for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                  class07209 class07209xx = class07209x.method_10069(i, 0, j);
                  class07299.N(class07209xx, true, null);
                  class07299.method_8652(class07209xx, class00869.MW.W(), 2);
               }
            }

            class07299.method_8474(1038, class07209x.method_10069(1, 0, 1), 0);
         }

         return class07082.N;
      }
   }
}
