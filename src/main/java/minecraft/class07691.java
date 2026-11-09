package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class07691(Optional<class05196> player, Optional<class05196> entity) implements class01425 {
   public static final Codec<class07691> N = RecordCodecBuilder.create(
      var0 -> var0.group(class00821.y.optionalFieldOf("player").forGetter(class07691::N), class00821.y.optionalFieldOf("entity").forGetter(class07691::y))
         .apply(var0, class07691::new)
   );

   public class07691(Optional<class05196> player, Optional<class05196> entity) {
      this.player = player;
      this.entity = entity;
   }

   public Optional<class05196> y() {
      return this.entity;
   }

   public static class06915<class07691> N(class00810 var0) {
      return class06912.P.N(new class07691(Optional.empty(), Optional.of(class00821.N(var0))));
   }

   public boolean N(class05908 var1) {
      return this.entity.isEmpty() || this.entity.get().N(var1);
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.entity, "entity");
   }
}
