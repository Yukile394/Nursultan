package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class04414 {
   private static final Codec<class04414> y = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.list(class04421.N).fieldOf("block").forGetter(var0x -> var0x.L)).apply(var0, class04414::new)
   );
   public static final class02968<class04414> N = new class02968<>("filter", y);
   private final List<class04421> L;

   public class04414(List<class04421> var1) {
      super();
      this.L = List.copyOf(var1);
   }

   public boolean y(String var1) {
      return this.L.stream().anyMatch(var1x -> var1x.y().test(var1));
   }

   public boolean N(String var1) {
      return this.L.stream().anyMatch(var1x -> var1x.N().test(var1));
   }
}
