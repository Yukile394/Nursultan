package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public interface class05957 extends class01381, Predicate<class05908> {
   Codec<class05957> y = class04206.I.T().dispatch("condition", class05957::N, class05955::N);
   Codec<class05957> L = Codec.lazyInitialized(() -> Codec.withAlternative(y, class03496.R));
   Codec<class03556<class05957>> u = class01281.N(class04227.yq, L);

   class05955 N();
}
