package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface class02500 {
   Codec<Map<class02487<?>, class02500>> y = Codec.dispatchedMap(class02487.N, class02487::L);
   class02362<class04247, class02470<?>> L = class02487.y.y(class02470::N, class02487::i);
   class02362<class04247, Map<class02487<?>, class02500>> u = L.N_33(class02389.L(64))
      .N_10(var0 -> var0.stream().collect(Collectors.toMap(class02470::N, class02470::y)), var0 -> var0.entrySet().stream().map(class02470::N).toList());

   static MapCodec<class02470<?>> N(String var0) {
      return class02487.N.dispatchMap(var0, class02470::N, class02487::u);
   }

   boolean N(class02666 var1);
}
