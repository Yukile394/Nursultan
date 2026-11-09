package minecraft;

import com.google.common.primitives.Doubles;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04333(int minSection, int maxSection, Optional<double[]> heights) {
   private static final Codec<double[]> i = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
   public static final Codec<class04333> N = RecordCodecBuilder.create(
         var0 -> var0.group(
               Codec.INT.fieldOf("min_section").forGetter(class04333::N),
               Codec.INT.fieldOf("max_section").forGetter(class04333::y),
               i.lenientOptionalFieldOf("heights").forGetter(class04333::L)
            )
            .apply(var0, class04333::new)
      )
      .validate(class04333::N);

   public Optional<double[]> L() {
      return this.heights;
   }

   public class04333(int minSection, int maxSection, Optional<double[]> heights) {
      this.minSection = minSection;
      this.maxSection = maxSection;
      this.heights = heights;
   }

   public int y() {
      return this.maxSection;
   }

   public int N() {
      return this.minSection;
   }

   private static DataResult<class04333> N(class04333 var0) {
      return var0.heights.isPresent() && ((double[])var0.heights.get()).length != class03032.u
         ? DataResult.error(() -> "heights has to be of length " + class03032.u)
         : DataResult.success(var0);
   }
}
