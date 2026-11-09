package minecraft;

import com.mojang.serialization.MapCodec;

public record class00273<T extends class00265>(MapCodec<T> codec, class02362<class04247, T> streamCodec) {
   public class00273(MapCodec<T> codec, class02362<class04247, T> streamCodec) {
      super();
      this.codec = codec;
      this.streamCodec = streamCodec;
   }

   public class02362<class04247, T> y() {
      return this.streamCodec;
   }

   public MapCodec<T> N() {
      return this.codec;
   }
}
