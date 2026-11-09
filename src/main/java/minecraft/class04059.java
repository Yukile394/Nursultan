package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04059(
   int chargeCount, int amountPerCharge, int spreadAttempts, int growthRounds, int spreadRounds, class02142 extraRareGrowths, float catalystChance
) implements class06386 {
   public static final Codec<class04059> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(1, 32).fieldOf("charge_count").forGetter(class04059::N),
            Codec.intRange(1, 500).fieldOf("amount_per_charge").forGetter(class04059::y),
            Codec.intRange(1, 64).fieldOf("spread_attempts").forGetter(class04059::L),
            Codec.intRange(0, 8).fieldOf("growth_rounds").forGetter(class04059::i),
            Codec.intRange(0, 8).fieldOf("spread_rounds").forGetter(class04059::R),
            class02142.L.fieldOf("extra_rare_growths").forGetter(class04059::M),
            Codec.floatRange(0.0F, 1.0F).fieldOf("catalyst_chance").forGetter(class04059::B)
         )
         .apply(var0, class04059::new)
   );

   public int L() {
      return this.spreadAttempts;
   }

   public class02142 M() {
      return this.extraRareGrowths;
   }

   public class04059(
      int chargeCount, int amountPerCharge, int spreadAttempts, int growthRounds, int spreadRounds, class02142 extraRareGrowths, float catalystChance
   ) {
      super();
      this.chargeCount = chargeCount;
      this.amountPerCharge = amountPerCharge;
      this.spreadAttempts = spreadAttempts;
      this.growthRounds = growthRounds;
      this.spreadRounds = spreadRounds;
      this.extraRareGrowths = extraRareGrowths;
      this.catalystChance = catalystChance;
   }

   public float B() {
      return this.catalystChance;
   }

   public int i() {
      return this.growthRounds;
   }

   public int y() {
      return this.amountPerCharge;
   }

   public int N() {
      return this.chargeCount;
   }

   public int R() {
      return this.spreadRounds;
   }
}
