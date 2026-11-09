package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class08615 extends class07796 implements class01137 {
   public static final MapCodec<class08615> N = y(class08615::new);

   public class08615(class01362 var1) {
      super(var1);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class08610(var1, var2);
   }

   @Override
   protected MapCodec<class08615> N() {
      return N;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8321(var3) instanceof class08610 class08610) {
         if (!var4.method_7338()) {
            return class07082.i;
         } else {
            if (var4.method_73183().method_8608()) {
               var4.method_66696(class08610);
            }

            return class07082.N;
         }
      } else {
         return class07082.i;
      }
   }
}
