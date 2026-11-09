package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class class07215 extends class06760 {
   private static final Map<class07185, class00494> N = class00389.y(class00891.N(4.0, 4.0, 16.0));

   public class07215(class01362 var1) {
      super(var1);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.y(y, var2.y(var1.L(y)));
   }

   @Override
   protected abstract MapCodec<? extends class07215> N();

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N.get(var1.L(y).z());
   }
}
