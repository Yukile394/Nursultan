package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07575(Optional<class05196> player, Optional<Integer> count) implements class01425 {
   public static final Codec<class07575> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class07575::N), class06338.b.optionalFieldOf("count").forGetter(class07575::y))
         .apply(var0, class07575::new)
   );

   public class07575(Optional<class05196> player, Optional<Integer> count) {
      this.player = player;
      this.count = count;
   }

   public Optional<Integer> y() {
      return this.count;
   }

   public boolean y(int var1) {
      return this.count.isEmpty() || var1 >= this.count.get();
   }

   public static class06915<class07575> N(int var0) {
      return class06912.o.N(new class07575(Optional.empty(), Optional.of(var0)));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }
}
