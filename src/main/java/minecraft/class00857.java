package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00857(Optional<class05196> player, Optional<class00798> damage, Optional<class05196> entity) implements class01425 {
   public static final Codec<class00857> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00857::N),
            class00798.N.optionalFieldOf("damage").forGetter(class00857::L),
            class00821.y.optionalFieldOf("entity").forGetter(class00857::u)
         )
         .apply(var0, class00857::new)
   );

   public Optional<class00798> L() {
      return this.damage;
   }

   public class00857(Optional<class05196> player, Optional<class00798> damage, Optional<class05196> entity) {
      super();
      this.player = player;
      this.damage = damage;
      this.entity = entity;
   }

   public Optional<class05196> u() {
      return this.entity;
   }

   public static class06915<class00857> y(Optional<class00821> var0) {
      return class06912.B.N(new class00857(Optional.empty(), Optional.empty(), class00821.N(var0)));
   }

   public static class06915<class00857> y() {
      return class06912.B.N(new class00857(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.entity, "entity");
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00857> N(Optional<class00798> var0, Optional<class00821> var1) {
      return class06912.B.N(new class00857(Optional.empty(), var0, class00821.N(var1)));
   }

   public static class06915<class00857> N(class00764 var0, Optional<class00821> var1) {
      return class06912.B.N(new class00857(Optional.empty(), Optional.of(var0.y()), class00821.N(var1)));
   }

   public boolean N(class04770 var1, class05908 var2, class07072 var3, float var4, float var5, boolean var6) {
      return this.damage.isPresent() && !this.damage.get().N(var1, var3, var4, var5, var6) ? false : !this.entity.isPresent() || this.entity.get().N(var2);
   }

   public static class06915<class00857> N(Optional<class00798> var0) {
      return class06912.B.N(new class00857(Optional.empty(), var0, Optional.empty()));
   }

   public static class06915<class00857> N(class00764 var0) {
      return class06912.B.N(new class00857(Optional.empty(), Optional.of(var0.y()), Optional.empty()));
   }
}
