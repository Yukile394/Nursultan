package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class06233(int from, int to, class06250 dimensions) {
   private static final Codec<class06233> i = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.c.fieldOf("from").forGetter(class06233::N), class06338.c.fieldOf("to").forGetter(class06233::y), class06250.L.forGetter(class06233::L)
         )
         .apply(var0, class06233::new)
   );
   public static final Codec<class06233> u = i.validate(
      var0 -> var0.from >= var0.to ? DataResult.error(() -> "Invalid range: [" + var0.from + ";" + var0.to + "]") : DataResult.success(var0)
   );

   public class06250 L() {
      return this.dimensions;
   }

   private class06233(int from, int to, class06250 dimensions) {
      super();
      this.from = from;
      this.to = to;
      this.dimensions = dimensions;
   }

   public int y() {
      return this.to;
   }

   public int N() {
      return this.from;
   }
}
