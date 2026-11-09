package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class05912(Optional<class05196> player, Optional<class03556<class00891>> block, Optional<class00845> item, class00836 beesInside)
   implements class01425 {
   public static final Codec<class05912> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class05912::N),
            class04206.i.b().optionalFieldOf("block").forGetter(class05912::y),
            class00845.N.optionalFieldOf("item").forGetter(class05912::L),
            class00836.u.optionalFieldOf("num_bees_inside", class00836.L).forGetter(class05912::u)
         )
         .apply(var0, class05912::new)
   );

   public Optional<class00845> L() {
      return this.item;
   }

   public class05912(Optional<class05196> player, Optional<class03556<class00891>> block, Optional<class00845> item, class00836 beesInside) {
      this.player = player;
      this.block = block;
      this.item = item;
      this.beesInside = beesInside;
   }

   public class00836 u() {
      return this.beesInside;
   }

   public Optional<class03556<class00891>> y() {
      return this.block;
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class00500 var1, class06584 var2, int var3) {
      if (this.block.isPresent() && !var1.N(this.block.get())) {
         return false;
      } else {
         return this.item.isPresent() && !this.item.get().test(var2) ? false : this.beesInside.u(var3);
      }
   }

   public static class06915<class05912> N(class00891 var0, class00837 var1, class00836 var2) {
      return class06912.H.N(new class05912(Optional.empty(), Optional.of(var0.s()), Optional.of(var1.y()), var2));
   }
}
