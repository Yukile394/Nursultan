package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class05202(Optional<class05196> player, Optional<class00845> item, Optional<class05196> entity) implements class01425 {
   public static final Codec<class05202> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class05202::N),
            class00845.N.optionalFieldOf("item").forGetter(class05202::y),
            class00821.y.optionalFieldOf("entity").forGetter(class05202::L)
         )
         .apply(var0, class05202::new)
   );

   public Optional<class05196> L() {
      return this.entity;
   }

   public class05202(Optional<class05196> player, Optional<class00845> item, Optional<class05196> entity) {
      this.player = player;
      this.item = item;
      this.entity = entity;
   }

   public Optional<class00845> y() {
      return this.item;
   }

   public boolean N(class04770 var1, class06584 var2, class05908 var3) {
      return this.item.isPresent() && !this.item.get().test(var2) ? false : !this.entity.isPresent() || this.entity.get().N(var3);
   }

   public static class06915<class05202> N(class05196 var0, Optional<class00845> var1, Optional<class05196> var2) {
      return class06912.A.N(new class05202(Optional.of(var0), var1, var2));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class05202> N(Optional<class05196> var0, Optional<class00845> var1, Optional<class05196> var2) {
      return class06912.f.N(new class05202(var0, var1, var2));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.entity, "entity");
   }
}
