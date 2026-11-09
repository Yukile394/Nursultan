package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public interface class03622 {
   Codec<class03622> L = class04206.NP.T().dispatch(class03622::N, Function.identity());

   boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3);

   MapCodec<? extends class03622> N();
}
