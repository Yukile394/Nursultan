package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07668(Optional<class05196> player, Optional<class00845> item) implements class01425 {
   public static final Codec<class07668> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class07668::N), class00845.N.optionalFieldOf("item").forGetter(class07668::y))
         .apply(var0, class07668::new)
   );

   public class07668(Optional<class05196> player, Optional<class00845> item) {
      this.player = player;
      this.item = item;
   }

   public Optional<class00845> y() {
      return this.item;
   }

   public static class06915<class07668> N(Optional<class00845> var0) {
      return class06912.J.N(new class07668(Optional.empty(), var0));
   }

   public static class06915<class07668> N(class02055<class06581> var0, class07310 var1) {
      return class06912.J.N(new class07668(Optional.empty(), Optional.of(class00837.N().N(var0, var1).y())));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class06584 var1) {
      return this.item.isEmpty() || this.item.get().test(var1);
   }
}
