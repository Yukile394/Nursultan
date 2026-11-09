package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public class class06559 extends class06581 implements class03568 {
   private static final Map<class06563, class06559> N = Maps.newEnumMap(class06563.class);
   private final class06563 y;

   public class06559(class06563 var1, class06573 var2) {
      super(var2);
      this.y = var1;
      N.put(var1, this);
   }

   public static class06559 N(class06563 var0) {
      return N.get(var0);
   }

   @Override
   public boolean N(class07299 var1, class07267 var2, boolean var3, class08036 var4) {
      if (var2.N(var1x -> var1x.N(this.N()), var3)) {
         var1.method_8396(null, var2.d(), class04909.zn, class04911.field_15245, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public class07082 N(class06584 var1, class08036 var2, class07438 var3, class07050 var4) {
      if (var3 instanceof class07881 class07881 && class07881.method_5805() && !class07881.m() && class07881.W() != this.y) {
         class07881.method_73183().method_43129(var2, class07881, class04909.zn, class04911.field_15248, 1.0F, 1.0F);
         if (!var2.method_73183().method_8608()) {
            class07881.N(this.y);
            var1.B(1);
         }

         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   public class06563 N() {
      return this.y;
   }
}
