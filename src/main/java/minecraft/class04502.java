package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04502(class03556<class04513> normal, class03556<class04513> ominous, int targetCooldownLength, int requiredPlayerRange) {
   public static final MapCodec<class04502> i = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class04513.L.optionalFieldOf("normal_config", class03556.N(class04513.N)).forGetter(class04502::N),
            class04513.L.optionalFieldOf("ominous_config", class03556.N(class04513.N)).forGetter(class04502::y),
            class06338.T.optionalFieldOf("target_cooldown_length", 36000).forGetter(class04502::L),
            Codec.intRange(1, 128).optionalFieldOf("required_player_range", 14).forGetter(class04502::u)
         )
         .apply(var0, class04502::new)
   );
   public static final class04502 R = new class04502(class03556.N(class04513.N), class03556.N(class04513.N), 36000, 14);

   public int L() {
      return this.targetCooldownLength;
   }

   public class04502(class03556<class04513> normal, class03556<class04513> ominous, int targetCooldownLength, int requiredPlayerRange) {
      this.normal = normal;
      this.ominous = ominous;
      this.targetCooldownLength = targetCooldownLength;
      this.requiredPlayerRange = requiredPlayerRange;
   }

   public int u() {
      return this.requiredPlayerRange;
   }

   public class03556<class04513> y() {
      return this.ominous;
   }

   public class03556<class04513> N() {
      return this.normal;
   }

   public class04502 N(class07078<?> var1) {
      return new class04502(class03556.N(this.normal.N().N(var1)), class03556.N(this.ominous.N().N(var1)), this.targetCooldownLength, this.requiredPlayerRange);
   }
}
