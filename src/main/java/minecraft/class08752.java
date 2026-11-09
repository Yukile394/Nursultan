package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public interface class08752 {
   Codec<class08752> y = class04206.Nq.T().dispatch(class08752::N, var0 -> var0);

   MapCodec<? extends class08752> N();

   Optional<class00647> N(Map<String, class08737> var1);
}
