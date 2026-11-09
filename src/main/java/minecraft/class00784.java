package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00784(Optional<class05196> player, Optional<class05196> zombie, Optional<class05196> villager) implements class01425 {
   public static final Codec<class00784> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00784::N),
            class00821.y.optionalFieldOf("zombie").forGetter(class00784::L),
            class00821.y.optionalFieldOf("villager").forGetter(class00784::u)
         )
         .apply(var0, class00784::new)
   );

   public Optional<class05196> L() {
      return this.zombie;
   }

   public class00784(Optional<class05196> player, Optional<class05196> zombie, Optional<class05196> villager) {
      super();
      this.player = player;
      this.zombie = zombie;
      this.villager = villager;
   }

   public Optional<class05196> u() {
      return this.villager;
   }

   public static class06915<class00784> y() {
      return class06912.j.N(new class00784(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.zombie, "zombie");
      var1.N(this.villager, "villager");
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class05908 var1, class05908 var2) {
      return this.zombie.isPresent() && !this.zombie.get().N(var1) ? false : !this.villager.isPresent() || this.villager.get().N(var2);
   }
}
