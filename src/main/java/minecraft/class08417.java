package minecraft;

import com.mojang.serialization.MapCodec;

public class class08417 extends class06786 implements class00873 {
   public static final MapCodec<class08417> N = y(class08417::new);
   private static final class00494 L = class00891.y(12.0, 0.0, 10.0);

   public class08417(class01362 var1) {
      super(var1);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      var1.method_8501(var3, class00869.yI.W());
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public MapCodec<class08417> N() {
      return N;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return true;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class08402.y(var2, var3, var4);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }
}
