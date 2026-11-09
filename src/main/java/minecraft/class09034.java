package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public interface class09034 {
   Codec<class09034> N = class04206.NV.T().dispatch(class09034::N, var0 -> var0);
   Codec<List<class09034>> y = class06338.N(N);

   MapCodec<? extends class09034> N();
}
