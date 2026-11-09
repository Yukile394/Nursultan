package minecraft;

import com.mojang.serialization.MapCodec;

class class01796 implements class01757<class01782> {
   private static final MapCodec<class01782> N = class03748.N.fieldOf("value").xmap(class01782::new, class01782::y);
   private static final class02362<class04247, class01782> y = class02362.N(class03748.u, class01782::y, class01782::new);

   class01796() {
      super();
   }

   @Override
   public class02362<class04247, class01782> y() {
      return y;
   }

   @Override
   public MapCodec<class01782> N() {
      return N;
   }
}
