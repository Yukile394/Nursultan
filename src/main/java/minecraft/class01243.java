package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class01243(Optional<class05196> player, Optional<class00845> item, Optional<class05196> entity) implements class01425 {
   public static final Codec<class01243> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class01243::N),
            class00845.N.optionalFieldOf("item").forGetter(class01243::y),
            class00821.y.optionalFieldOf("entity").forGetter(class01243::L)
         )
         .apply(var0, class01243::new)
   );

   public Optional<class05196> L() {
      return this.entity;
   }

   public class01243(Optional<class05196> player, Optional<class00845> item, Optional<class05196> entity) {
      super();
      this.player = player;
      this.item = item;
      this.entity = entity;
   }

   public static class06915<class01243> y(class00837 var0, Optional<class05196> var1) {
      return N(Optional.empty(), var0, var1);
   }

   public Optional<class00845> y() {
      return this.item;
   }

   public static class06915<class01243> y(Optional<class05196> var0, class00837 var1, Optional<class05196> var2) {
      return class06912.S.N(new class01243(var0, Optional.of(var1.y()), var2));
   }

   public static class06915<class01243> N(class00837 var0, Optional<class05196> var1) {
      return class06912.S.N(new class01243(Optional.empty(), Optional.of(var0.y()), var1));
   }

   public static class06915<class01243> N(Optional<class05196> var0, class00837 var1, Optional<class05196> var2) {
      return class06912.C.N(new class01243(var0, Optional.of(var1.y()), var2));
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

   public boolean N(class06584 var1, class05908 var2) {
      return this.item.isPresent() && !this.item.get().test(var1) ? false : this.entity.isEmpty() || this.entity.get().N(var2);
   }
}
