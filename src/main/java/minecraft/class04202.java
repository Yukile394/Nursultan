package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;

public class class04202 extends class00653 {
   public static final MapCodec<class04202> y = y(class04202::new);
   private static final Map<class07211, class00494> i = class00389.L(class00891.y(10.0, 8.0, 8.0, 16.0));

   public class04202(class01362 var1) {
      super(class07032.field_41313, var1);
   }

   @Override
   public MapCodec<class04202> N() {
      return y;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i.get(var1.L(u));
   }
}
