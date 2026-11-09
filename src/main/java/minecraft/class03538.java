package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

@Deprecated
public record class03538(class03556<class04412> otherSet, int chunkCount) {
   public static final Codec<class03538> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01281.N(class04227.yb, class04412.N, false).fieldOf("other_set").forGetter(class03538::N),
            Codec.intRange(1, 16).fieldOf("chunk_count").forGetter(class03538::y)
         )
         .apply(var0, class03538::new)
   );

   public class03538(class03556<class04412> otherSet, int chunkCount) {
      this.otherSet = otherSet;
      this.chunkCount = chunkCount;
   }

   public int y() {
      return this.chunkCount;
   }

   public class03556<class04412> N() {
      return this.otherSet;
   }

   boolean N(class02045 var1, int var2, int var3) {
      return var1.N(this.otherSet, var2, var3, this.chunkCount);
   }
}
