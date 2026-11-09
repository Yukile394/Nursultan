package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07677(Optional<class05196> player, Optional<class05196> villager, Optional<class00845> item) implements class01425 {
   public static final Codec<class07677> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class07677::N),
            class00821.y.optionalFieldOf("villager").forGetter(class07677::L),
            class00845.N.optionalFieldOf("item").forGetter(class07677::u)
         )
         .apply(var0, class07677::new)
   );

   public Optional<class05196> L() {
      return this.villager;
   }

   public class07677(Optional<class05196> player, Optional<class05196> villager, Optional<class00845> item) {
      super();
      this.player = player;
      this.villager = villager;
      this.item = item;
   }

   public Optional<class00845> u() {
      return this.item;
   }

   public static class06915<class07677> y() {
      return class06912.v.N(new class07677(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   public boolean N(class05908 var1, class06584 var2) {
      return this.villager.isPresent() && !this.villager.get().N(var1) ? false : !this.item.isPresent() || this.item.get().test(var2);
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class07677> N(class00810 var0) {
      return class06912.v.N(new class07677(Optional.of(class00821.N(var0)), Optional.empty(), Optional.empty()));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.villager, "villager");
   }
}
