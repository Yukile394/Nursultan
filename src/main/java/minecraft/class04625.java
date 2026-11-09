package minecraft;

public class class04625 {
   public class04625() {
      super();
   }

   public static class04142<class08041> N(float var0, int var1) {
      return class04137.N_42(var2 -> var2.group(var2.L(class05378.m)).apply(var2, var2x -> (var3, var4, var5) -> {
         if (var3.method_19500(var4.method_24515())) {
            return false;
         } else {
            class05368 class05368 = var3.method_19494();
            int i = class05368.N(class01296.N(var4.method_24515()));
            class06889 class06889x = null;

            for (int j = 0; j < 5; j++) {
               class06889 class06889x = class05456.N(var4, 15, 7, var1xxxx -> -class05368.N(class01296.N(var1xxxx)));
               if (class06889x != null) {
                  int k = class05368.N(class01296.N(class07209.method_49638(class06889x)));
                  if (k < i) {
                     class06889x = class06889x;
                     break;
                  }

                  if (k == i) {
                     class06889x = class06889x;
                  }
               }
            }

            if (class06889x != null) {
               var2x.N(new class05352(class06889x, var0, var1));
            }

            return true;
         }
      }));
   }
}
