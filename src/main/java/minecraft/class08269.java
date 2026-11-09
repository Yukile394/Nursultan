package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class08269(boolean elements, boolean tags, boolean stable) {
   public static final MapCodec<class08269> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("elements").forGetter(class08269::N),
            Codec.BOOL.fieldOf("tags").forGetter(class08269::y),
            Codec.BOOL.fieldOf("stable").forGetter(class08269::L)
         )
         .apply(var0, class08269::new)
   );
   public static final Codec<class08269> y = N.codec();

   public boolean L() {
      return this.stable;
   }

   class08269(boolean elements, boolean tags, boolean stable) {
      super();
      this.elements = elements;
      this.tags = tags;
      this.stable = stable;
   }

   public boolean y() {
      return this.tags;
   }

   public boolean N() {
      return this.elements;
   }
}
