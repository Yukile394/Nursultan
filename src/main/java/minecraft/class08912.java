package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Comparator;

public record class08912(float threshold, class08895 model) {
   public static final Codec<class08912> L = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.FLOAT.fieldOf("threshold").forGetter(class08912::N), class08913.y.fieldOf("model").forGetter(class08912::y))
         .apply(var0, class08912::new)
   );
   public static final Comparator<class08912> u = Comparator.comparingDouble(class08912::N);

   public class08912(float threshold, class08895 model) {
      this.threshold = threshold;
      this.model = model;
   }

   public class08895 y() {
      return this.model;
   }

   public float N() {
      return (double)this.threshold;
   }
}
