package minecraft;

import com.mojang.serialization.MapCodec;

class class01774 implements class01757<class01759> {
   private static final MapCodec<class01759> N = class00411.N.xmap(class01759::new, class01759::y);
   private static final class02362<class04247, class01759> y = class02362.N(class00411.L, class01759::y, class01759::new);

   class01774() {
      super();
   }

   @Override
   public class02362<class04247, class01759> y() {
      return y;
   }

   @Override
   public MapCodec<class01759> N() {
      return N;
   }
}
