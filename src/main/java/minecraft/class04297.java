package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public abstract class class04297 {
   public static final Codec<class04297> y = class04206.A.T().dispatch(class04297::N, class04323::codec);

   public class04297() {
      super();
   }

   public abstract Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3);

   public abstract class04323<?> N();
}
