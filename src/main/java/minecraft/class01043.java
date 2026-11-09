package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01043(double energyBudget, double charge) {
   public static final Codec<class01043> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.DOUBLE.fieldOf("energy_budget").forGetter(var0x -> var0x.energyBudget), Codec.DOUBLE.fieldOf("charge").forGetter(var0x -> var0x.charge)
         )
         .apply(var0, class01043::new)
   );

   public class01043(double energyBudget, double charge) {
      this.energyBudget = energyBudget;
      this.charge = charge;
   }

   public double y() {
      return this.charge;
   }

   public double N() {
      return this.energyBudget;
   }
}
