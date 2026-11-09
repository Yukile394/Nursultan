package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface class02936 {
   class02928<class02854> N = new class02948();
   class02928<class02830> y = new class02940();
   class02928<class02820> L = new class02946();
   Map<class02477<?>, class02928<?>> u = Stream.of(N, y, L).collect(Collectors.toMap(class02928::N, var0 -> (class02928<?>)var0));
   Codec<class02928<?>> i = class04206.NW.T().comapFlatMap(var0 -> {
      class02928<?> class02928 = u.get(var0);
      return class02928 != null ? DataResult.success(class02928) : DataResult.error(() -> "No items in component");
   }, class02928::N);
}
