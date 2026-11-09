package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04329(int spreadWidth, int spreadHeight, int maxHeight) implements class06386 {
   public static final Codec<class04329> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.b.fieldOf("spread_width").forGetter(class04329::N),
            class06338.b.fieldOf("spread_height").forGetter(class04329::y),
            class06338.b.fieldOf("max_height").forGetter(class04329::L)
         )
         .apply(var0, class04329::new)
   );

   public int L() {
      return this.maxHeight;
   }

   public class04329(int spreadWidth, int spreadHeight, int maxHeight) {
      this.spreadWidth = spreadWidth;
      this.spreadHeight = spreadHeight;
      this.maxHeight = maxHeight;
   }

   public int y() {
      return this.spreadHeight;
   }

   public int N() {
      return this.spreadWidth;
   }
}
