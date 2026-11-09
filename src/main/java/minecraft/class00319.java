package minecraft;

import com.mojang.serialization.MapCodec;

public record class00319<T extends class00299>(MapCodec<T> codec, class02362<class04247, T> streamCodec) {
   public class00319(MapCodec<T> codec, class02362<class04247, T> streamCodec) {
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
