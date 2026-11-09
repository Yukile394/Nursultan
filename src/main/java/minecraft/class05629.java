package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Stream;

public class class05629 implements class06386 {
   public static final Codec<class05629> N = RecordCodecBuilder.create(
      var0 -> var0.apply2(
         class05629::new, class04747.N.listOf().fieldOf("features").forGetter(var0x -> var0x.y), class04336.y.fieldOf("default").forGetter(var0x -> var0x.L)
      )
   );
   public final List<class04747> y;
   public final class03556<class04336> L;

   public class05629(List<class04747> var1, class03556<class04336> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public Stream<class03238<?, ?>> u() {
      return Stream.concat(this.y.stream().flatMap(var0 -> var0.y.N().N()), this.L.N().N());
   }
}
