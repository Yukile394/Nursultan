package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public class class06189 implements class06386 {
   public static final Codec<class06189> N = RecordCodecBuilder.create(
      var0 -> var0.group(class04336.y.fieldOf("feature_true").forGetter(var0x -> var0x.y), class04336.y.fieldOf("feature_false").forGetter(var0x -> var0x.L))
         .apply(var0, class06189::new)
   );
   public final class03556<class04336> y;
   public final class03556<class04336> L;

   public class06189(class03556<class04336> var1, class03556<class04336> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public Stream<class03238<?, ?>> u() {
      return Stream.concat(this.y.N().N(), this.L.N().N());
   }
}
