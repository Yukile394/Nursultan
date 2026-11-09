package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08547(class03543<class04748> requiredStructures) implements class08568 {
   public static final MapCodec<class08547> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03541.N(class04227.yj).fieldOf("structures").forGetter(class08547::y)).apply(var0, class08547::new)
   );

   public class08547(class03543<class04748> requiredStructures) {
      super();
      this.requiredStructures = requiredStructures;
   }

   public class03543<class04748> y() {
      return this.requiredStructures;
   }

   public boolean test(class08579 var1) {
      return var1.y().method_8410().method_27056().N(var1.N(), this.requiredStructures).y();
   }

   @Override
   public MapCodec<class08547> N() {
      return N;
   }
}
