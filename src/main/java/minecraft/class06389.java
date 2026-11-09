package minecraft;

import com.mojang.serialization.Codec;

public class class06389 extends class06391<class06414> {
   public class06389(Codec<class06414> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06414> var1) {
      class07209 class07209xx = var1.i();
      class05974 class05974 = var1.y();
      class06414 class06414 = (class06414)var1.R();

      for (class07209 class07209x : class07209.method_10097(class07209xx.method_10069(-1, -2, -1), class07209xx.method_10069(1, 2, 1))) {
         boolean flag = class07209x.method_10263() == class07209xx.method_10263();
         boolean flag1 = class07209x.method_10264() == class07209xx.method_10264();
         boolean flag2 = class07209x.method_10260() == class07209xx.method_10260();
         boolean flag3 = Math.abs(class07209x.method_10264() - class07209xx.method_10264()) == 2;
         if (flag && flag1 && flag2) {
            class07209 class07209xx = class07209x.method_10062();
            this.N(class05974, class07209xx, class00869.EY.W());
            class06414.y().ifPresent(var3x -> {
               class00394 class00394 = class05974.method_8321(class07209);
               if (class00394 instanceof class00491) {
                  ((class00491)class00394).N(var3x, class06414.L());
               }
            });
         } else if (flag1) {
            this.N(class05974, class07209x, class00869.N.W());
         } else if (flag3 && flag && flag2) {
            this.N(class05974, class07209x, class00869.q.W());
         } else if ((flag || flag2) && !flag3) {
            this.N(class05974, class07209x, class00869.q.W());
         } else {
            this.N(class05974, class07209x, class00869.N.W());
         }
      }

      return true;
   }
}
