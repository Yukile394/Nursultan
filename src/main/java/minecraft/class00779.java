package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00779(Optional<class05196> player, class00836 level) implements class01425 {
   public static final Codec<class00779> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00779::N), class00836.u.optionalFieldOf("level", class00836.L).forGetter(class00779::L)
         )
         .apply(var0, class00779::new)
   );

   public class00836 L() {
      return this.level;
   }

   public class00779(Optional<class05196> player, class00836 level) {
      this.player = player;
      this.level = level;
   }

   public static class06915<class00779> y() {
      return class06912.W.N(new class00779(Optional.empty(), class00836.L));
   }

   public boolean N(int var1) {
      return this.level.u(var1);
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00779> N(class00836 var0) {
      return class06912.W.N(new class00779(Optional.empty(), var0));
   }
}
