package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class04943(Optional<class05196> player, class00836 signalStrength, Optional<class05196> projectile) implements class01425 {
   public static final Codec<class04943> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class04943::N),
            class00836.u.optionalFieldOf("signal_strength", class00836.L).forGetter(class04943::y),
            class00821.y.optionalFieldOf("projectile").forGetter(class04943::L)
         )
         .apply(var0, class04943::new)
   );

   public Optional<class05196> L() {
      return this.projectile;
   }

   public class04943(Optional<class05196> player, class00836 signalStrength, Optional<class05196> projectile) {
      this.player = player;
      this.signalStrength = signalStrength;
      this.projectile = projectile;
   }

   public class00836 y() {
      return this.signalStrength;
   }

   public static class06915<class04943> N(class00836 var0, Optional<class05196> var1) {
      return class06912.c.N(new class04943(Optional.empty(), var0, var1));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.projectile, "projectile");
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class05908 var1, class06889 var2, int var3) {
      return !this.signalStrength.u(var3) ? false : !this.projectile.isPresent() || this.projectile.get().N(var1);
   }
}
