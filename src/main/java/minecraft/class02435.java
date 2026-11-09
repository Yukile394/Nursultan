package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Function;

public sealed interface class02435 permits class02412, class02447 {
   Codec<class02435> N = Codec.xor(class02412.y, class02447.y).xmap(var0 -> (class02435)var0.map(Function.identity(), Function.identity()), var0 -> {
      return switch (var0) {
         case class02412 class02412 -> Either.left((class02412)var0);
         case class02447 class02447 -> Either.right((class02447)var0);
         default -> throw new MatchException(null, null);
      };
   });

   Set<class01894> y();

   String N();
}
