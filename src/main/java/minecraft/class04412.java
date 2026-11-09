package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class04412(List<class04419> structures, class03532 placement) {
   public static final Codec<class04412> N = RecordCodecBuilder.create(
      var0 -> var0.group(class04419.N.listOf().fieldOf("structures").forGetter(class04412::N), class03532.y.fieldOf("placement").forGetter(class04412::y))
         .apply(var0, class04412::new)
   );
   public static final Codec<class03556<class04412>> y = class01281.N(class04227.yb, N);

   public class04412(class03556<class04748> var1, class03532 var2) {
      this(List.of(new class04419(var1, 1)), var2);
   }

   public class04412(List<class04419> structures, class03532 placement) {
      super();
      this.structures = structures;
      this.placement = placement;
   }

   public class03532 y() {
      return this.placement;
   }

   public static class04419 N(class03556<class04748> var0) {
      return new class04419(var0, 1);
   }

   public List<class04419> N() {
      return this.structures;
   }

   public static class04419 N(class03556<class04748> var0, int var1) {
      return new class04419(var0, var1);
   }
}
