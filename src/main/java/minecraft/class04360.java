package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;

public record class04360(Map<Integer, Float> advances) implements class06270 {
   public static final MapCodec<class04360> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.unboundedMap(class06338.c, Codec.FLOAT).fieldOf("advances").forGetter(class04360::L)).apply(var0, class04360::new)
   );

   public Map<Integer, Float> L() {
      return this.advances;
   }

   public class04360(Map<Integer, Float> advances) {
      super();
      this.advances = advances;
   }

   @Override
   public Either<class06246, class06254> y() {
      return Either.left((class06246)var1 -> new class04354(this.advances));
   }

   @Override
   public class05855 N() {
      return class05855.field_37904;
   }
}
