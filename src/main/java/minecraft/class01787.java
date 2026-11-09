package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class class01787 {
   public static final MapCodec<class01762> N = class04206.NE.T().dispatchMap(class01762::N, class01757::N);
   public static final Codec<class01762> y = N.codec();
   public static final class02362<class04247, class01762> L = class02389.N(class04227.NR).y(class01762::N, class01757::y);
   public static final class02362<class04247, Optional<class01762>> u = L.N_33(class02389::N);

   public class01787() {
      super();
   }

   public static class01757<?> N(class00751<class01757<?>> var0) {
      class00751.N(var0, "blank", class01784.y);
      class00751.N(var0, "styled", class01759.N);
      return class00751.N(var0, "fixed", class01782.N);
   }
}
