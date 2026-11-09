package minecraft;

import com.mojang.serialization.MapCodec;

public class class05988 extends class04983 {
   public static final MapCodec<class05988> N = y(class05988::new);
   private static final class00494 M = class00891.y(8.0, 0.0, 15.0);

   public class05988(class01362 var1) {
      super(var1, class07211.field_11036, M, false, 0.1);
   }

   @Override
   protected class00891 u() {
      return class00869.sk;
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
   public MapCodec<class05988> N() {
      return N;
   }
}
