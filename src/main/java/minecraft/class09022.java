package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class09022(class00392 contents, int width) implements class09034 {
   public static final int L = 200;
   public static final MapCodec<class09022> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03748.N.fieldOf("contents").forGetter(class09022::y), class09037.y.optionalFieldOf("width", 200).forGetter(class09022::L))
         .apply(var0, class09022::new)
   );
   public static final Codec<class09022> i = Codec.withAlternative(u.codec(), class03748.N, var0 -> new class09022(var0, 200));

   public int L() {
      return this.width;
   }

   public class09022(class00392 contents, int width) {
      super();
      this.contents = contents;
      this.width = width;
   }

   public class00392 y() {
      return this.contents;
   }

   @Override
   public MapCodec<class09022> N() {
      return u;
   }
}
