package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00786(Optional<class05196> player, Optional<class00845> item) implements class01425 {
   public static final Codec<class00786> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class00786::N), class00845.N.optionalFieldOf("item").forGetter(class00786::L))
         .apply(var0, class00786::new)
   );

   public Optional<class00845> L() {
      return this.item;
   }

   public class00786(Optional<class05196> player, Optional<class00845> item) {
      this.player = player;
      this.item = item;
   }

   public static class06915<class00786> y() {
      return class06912.k.N(new class00786(Optional.empty(), Optional.empty()));
   }

   public static class06915<class00786> N(class02055<class06581> var0, class07310 var1) {
      return N(class00837.N().N(var0, var1.B()));
   }

   public static class06915<class00786> N(class00837 var0) {
      return class06912.k.N(new class00786(Optional.empty(), Optional.of(var0.y())));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class06584 var1) {
      return this.item.isEmpty() || this.item.get().test(var1);
   }
}
