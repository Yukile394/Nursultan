package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00778(class04548<Integer> blockLightLimit, class04548<Integer> skyLightLimit) {
   private static final class04548<Integer> u = new class04548<>(0, 15);
   public static final Codec<class00778> N = RecordCodecBuilder.create(
      var0 -> var0.group(N("block_light_limit").forGetter(var0x -> var0x.blockLightLimit), N("sky_light_limit").forGetter(var0x -> var0x.skyLightLimit))
         .apply(var0, class00778::new)
   );

   public class00778(class04548<Integer> blockLightLimit, class04548<Integer> skyLightLimit) {
      super();
      this.blockLightLimit = blockLightLimit;
      this.skyLightLimit = skyLightLimit;
   }

   public class04548<Integer> y() {
      return this.skyLightLimit;
   }

   private static DataResult<class04548<Integer>> N(class04548<Integer> var0) {
      return !u.N(var0) ? DataResult.error(() -> "Light values must be withing range " + u) : DataResult.success(var0);
   }

   public class04548<Integer> N() {
      return this.blockLightLimit;
   }

   public boolean N(class07209 var1, class04782 var2) {
      return this.blockLightLimit.N(var2.method_8314(class00772.field_9282, var1)) && this.skyLightLimit.N(var2.method_8314(class00772.field_9284, var1));
   }

   private static MapCodec<class04548<Integer>> N(String var0) {
      return class04548.N.lenientOptionalFieldOf(var0, u).validate(class00778::N);
   }
}
