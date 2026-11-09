package minecraft;

import org.jspecify.annotations.Nullable;

public class class07164 extends class07528 {
   public class07164(class07078<? extends class07164> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   class04891 B() {
      return class04909.Qo;
   }

   @Override
   protected class04891 s() {
      return class04909.Qg;
   }

   @Override
   protected class08007 N(class06584 var1, float var2, @Nullable class06584 var3) {
      class08007 class08007 = super.N(var1, var2, var3);
      if (class08007 instanceof class08037) {
         ((class08037)class08007).N(new class07055(class07047.y, 600));
      }

      return class08007;
   }

   public static boolean N(class07078<class07164> var0, class01001 var1, class06113 var2, class07209 var3, class06069 var4) {
      class07209 class07209 = var3;

      do {
         class07209 = class07209.method_10084();
      } while (var1.method_8320(class07209).N(class00869.ba));

      return class07150.y(var0, var1, var2, var3, var4) && (class06113.N(var2) || var1.N_17(class07209.method_10074()));
   }

   @Override
   public class04891 method_6002() {
      return class04909.QI;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.QJ;
   }
}
