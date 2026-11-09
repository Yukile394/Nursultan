package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class02809(int index, class06584 item) {
   public static final Codec<class02809> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.intRange(0, 255).fieldOf("slot").forGetter(class02809::N), class06584.y.fieldOf("item").forGetter(class02809::y))
         .apply(var0, class02809::new)
   );

   class02809(int index, class06584 item) {
      super();
      this.index = index;
      this.item = item;
   }

   public class06584 y() {
      return this.item;
   }

   public int N() {
      return this.index;
   }
}
