package minecraft;

import com.mojang.serialization.Codec;

public class class04772 extends class06391<class06225> {
   public class04772(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      var1.R();
      if (!class05974.R(class07209)) {
         return false;
      } else {
         for (class07211 class07211 : class07211.values()) {
            if (class07211 != class07211.field_11033 && class00659.N(class05974, class07209.method_10093(class07211), class07211)) {
               class05974.method_8652(class07209, class00869.Rc.W().y(class00659.N(class07211), true), 2);
               return true;
            }
         }

         return false;
      }
   }
}
