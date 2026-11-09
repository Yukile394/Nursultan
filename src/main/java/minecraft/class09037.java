package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public interface class09037 {
   Codec<Integer> y = class06338.N(1, 1024);
   Codec<class09037> L = class04206.No.T().dispatch(class09037::N, var0 -> var0);
   Codec<class03556<class09037>> u = class01281.N(class04227.yL, L);
   Codec<class03543<class09037>> i = class03541.N(class04227.yL, L);
   class02362<class04247, class03556<class09037>> R = class02389.N(class04227.yL, class02389.L(L));
   class02362<ByteBuf, class09037> M = class02389.N(L);

   Optional<class08752> u();

   MapCodec<? extends class09037> N();

   class09039 H_();
}
