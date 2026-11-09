package minecraft;

import com.viaversion.viafabricplus.settings.impl.DebugSettings;

public class class06571 extends class06581 {
   public class06571(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class06501 var1) {
      class08036 class08036 = var1.method_8036();
      class07299 class07299 = var1.method_8045();
      class07209 class07209x = var1.method_8037();
      class00500 class00500x = class07299.method_8320(class07209x);
      if (!class05847.T(class00500x) && !class05440.v(class00500x) && !class05467.v(class00500x)) {
         class07209 class07209x = class07209x.method_10093(var1.method_8038());
         if (class05989.N(class07299, class07209x, var1.method_8042())) {
            class04891 class04891x = class04909.Uc;
            class04911 class04911x = class04911.field_15245;
            float f3 = class07299.method_8409().z() * 0.4F + 0.8F;
            float f2 = 1.0F;
            class04911 class04911x = class04911x;
            class04891 class04891x = class04891x;
            if (this.N(class07299, class08036, class07209x, class04891x, class04911x, f2, f3)) {
               class07299.method_8396(class08036, class07209x, class04891x, class04911x, f2, f3);
            }

            class00500 class00500x = class05989.y(class07299, class07209x);
            class07299.method_8652(class07209x, class00500x, 11);
            class07299.N(class08036, class01194.Z, class07209x);
            class06584 class06584 = var1.method_8041();
            if (class08036 instanceof class04770) {
               class06912.w.N((class04770)class08036, class07209x, class06584);
               class06584.N(1, class08036, var1.method_20287().N());
            }

            return class07082.N;
         } else {
            return class07082.u;
         }
      } else {
         class04891 class04891xx = class04909.Uc;
         class04911 class04911xx = class04911.field_15245;
         float f1 = class07299.method_8409().z() * 0.4F + 0.8F;
         float f = 1.0F;
         class04911 class04911xxx = class04911xx;
         class04891 class04891xxx = class04891xx;
         if (this.N(class07299, class08036, class07209x, class04891xxx, class04911xxx, f, f1)) {
            class07299.method_8396(class08036, class07209x, class04891xxx, class04911xxx, f, f1);
         }

         class07299.method_8652(class07209x, class00500x.y(class06665.n, true), 11);
         class07299.N(class08036, class01194.L, class07209x);
         if (class08036 != null) {
            var1.method_8041().N(1, class08036, var1.method_20287().N());
         }

         return class07082.N;
      }
   }

   private boolean N(class07299 var1, class07049 var2, class07209 var3, class04891 var4, class04911 var5, float var6, float var7) {
      return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
   }
}
