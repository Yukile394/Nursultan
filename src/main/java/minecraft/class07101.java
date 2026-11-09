package minecraft;

import com.mojang.serialization.MapCodec;

public abstract class class07101 extends class00891 {
   public static final class08064<class07211> R = class06665.f;

   public class07101(class01362 var1) {
      super(var1);
   }

   @Override
   protected abstract MapCodec<? extends class07101> N();

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(R)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(R, var2.N(var1.L(R)));
   }
}
