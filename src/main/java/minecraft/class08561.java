package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08561(class03543<class00780> requiredBiomes) implements class08568 {
   public static final MapCodec<class08561> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03541.N(class04227.NA).fieldOf("biomes").forGetter(class08561::y)).apply(var0, class08561::new)
   );

   public class08561(class03543<class00780> requiredBiomes) {
      this.requiredBiomes = requiredBiomes;
   }

   public class03543<class00780> y() {
      return this.requiredBiomes;
   }

   public boolean test(class08579 var1) {
      return this.requiredBiomes.N(var1.u());
   }

   @Override
   public MapCodec<class08561> N() {
      return N;
   }
}
