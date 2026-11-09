package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.stream.Stream;

public interface class00299 {
   Codec<class00299> N = class04206.Nw.T().dispatch(class00299::N, class00319::N);
   class02362<class04247, class00299> y = class02389.N(class04227.Nt).y(class00299::N, class00319::y);

   default class06584 y(class00311 var1) {
      return this.N(var1, class00297.N).findFirst().orElse(class06584.E);
   }

   <T> Stream<T> N(class00311 var1, class00308<T> var2);

   default List<class06584> N(class00311 var1) {
      return this.N(var1, class00297.N).toList();
   }

   default boolean N(class03767 var1) {
      return true;
   }

   class00319<? extends class00299> N();
}
