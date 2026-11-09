package minecraft;

import com.mojang.serialization.MapCodec;

public class class06010 extends class04983 {
   public static final MapCodec<class06010> N = y(class06010::new);
   private static final class00494 M = class00891.y(8.0, 9.0, 16.0);

   public class06010(class01362 var1) {
      super(var1, class07211.field_11033, M, false, 0.1);
   }

   @Override
   protected class00891 u() {
      return class00869.sd;
   }

   @Override
   protected boolean E(class00500 var1) {
      return class01378.N(var1);
   }

   @Override
   protected int N(class06069 var1) {
      return class01378.N(var1);
   }

   @Override
   public MapCodec<class06010> N() {
      return N;
   }
}
