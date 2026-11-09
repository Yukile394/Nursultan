package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00826(Optional<class05196> player, Optional<class00798> damage) implements class01425 {
   public static final Codec<class00826> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class00826::N), class00798.N.optionalFieldOf("damage").forGetter(class00826::L))
         .apply(var0, class00826::new)
   );

   public Optional<class00798> L() {
      return this.damage;
   }

   public class00826(Optional<class05196> player, Optional<class00798> damage) {
      super();
      this.player = player;
      this.damage = damage;
   }

   public static class06915<class00826> y() {
      return class06912.Z.N(new class00826(Optional.empty(), Optional.empty()));
   }

   public static class06915<class00826> N(class00798 var0) {
      return class06912.Z.N(new class00826(Optional.empty(), Optional.of(var0)));
   }

   public static class06915<class00826> N(class00764 var0) {
      return class06912.Z.N(new class00826(Optional.empty(), Optional.of(var0.y())));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public boolean N(class04770 var1, class07072 var2, float var3, float var4, boolean var5) {
      return !this.damage.isPresent() || this.damage.get().N(var1, var2, var3, var4, var5);
   }
}
