package minecraft;

import com.mojang.serialization.MapCodec;

public record class05959<T extends class08122>(MapCodec<T> codec) {
   public class05959(MapCodec<T> codec) {
      super();
      this.codec = codec;
   }

   public MapCodec<T> N() {
      return this.codec;
   }
}
