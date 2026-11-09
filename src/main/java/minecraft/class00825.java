package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00825(Optional<class05196> player, Optional<class05196> entityPredicate, Optional<class00759> killingBlow) implements class01425 {
   public static final Codec<class00825> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00821.y.optionalFieldOf("player").forGetter(class00825::N),
            class00821.y.optionalFieldOf("entity").forGetter(class00825::i),
            class00759.N.optionalFieldOf("killing_blow").forGetter(class00825::R)
         )
         .apply(var0, class00825::new)
   );

   public static class06915<class00825> L() {
      return class06912.Ny.N(new class00825(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   public class00825(Optional<class05196> player, Optional<class05196> entityPredicate, Optional<class00759> killingBlow) {
      this.player = player;
      this.entityPredicate = entityPredicate;
      this.killingBlow = killingBlow;
   }

   public Optional<class05196> i() {
      return this.entityPredicate;
   }

   public static class06915<class00825> u() {
      return class06912.u.N(new class00825(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   public static class06915<class00825> y(class00810 var0, Optional<class00759> var1) {
      return class06912.u.N(new class00825(Optional.empty(), Optional.of(class00821.N(var0)), var1));
   }

   public static class06915<class00825> y(Optional<class00821> var0, Optional<class00759> var1) {
      return class06912.u.N(new class00825(Optional.empty(), class00821.N(var0), var1));
   }

   public static class06915<class00825> y(Optional<class00821> var0, class00789 var1) {
      return class06912.u.N(new class00825(Optional.empty(), class00821.N(var0), Optional.of(var1.y())));
   }

   public static class06915<class00825> y(class00810 var0, class00789 var1) {
      return class06912.u.N(new class00825(Optional.empty(), Optional.of(class00821.N(var0)), Optional.of(var1.y())));
   }

   public static class06915<class00825> y() {
      return class06912.L.N(new class00825(Optional.empty(), Optional.empty(), Optional.empty()));
   }

   public static class06915<class00825> y(Optional<class00821> var0) {
      return class06912.u.N(new class00825(Optional.empty(), class00821.N(var0), Optional.empty()));
   }

   public static class06915<class00825> y(class00810 var0) {
      return class06912.u.N(new class00825(Optional.empty(), Optional.of(class00821.N(var0)), Optional.empty()));
   }

   @Override
   public Optional<class05196> N() {
      return this.player;
   }

   public static class06915<class00825> N(class00810 var0, Optional<class00759> var1) {
      return class06912.L.N(new class00825(Optional.empty(), Optional.of(class00821.N(var0)), var1));
   }

   public static class06915<class00825> N(Optional<class00821> var0, class00789 var1) {
      return class06912.L.N(new class00825(Optional.empty(), class00821.N(var0), Optional.of(var1.y())));
   }

   public static class06915<class00825> N(Optional<class00821> var0, Optional<class00759> var1) {
      return class06912.L.N(new class00825(Optional.empty(), class00821.N(var0), var1));
   }

   public static class06915<class00825> N(class00810 var0) {
      return class06912.L.N(new class00825(Optional.empty(), Optional.of(class00821.N(var0)), Optional.empty()));
   }

   public static class06915<class00825> N(Optional<class00821> var0) {
      return class06912.L.N(new class00825(Optional.empty(), class00821.N(var0), Optional.empty()));
   }

   public boolean N(class04770 var1, class05908 var2, class07072 var3) {
      return this.killingBlow.isPresent() && !this.killingBlow.get().N(var1, var3)
         ? false
         : this.entityPredicate.isEmpty() || this.entityPredicate.get().N(var2);
   }

   @Override
   public void N(class04492 var1) {
      class01425.super.N(var1);
      var1.N(this.entityPredicate, "entity");
   }

   public static class06915<class00825> N(class00810 var0, class00789 var1) {
      return class06912.L.N(new class00825(Optional.empty(), Optional.of(class00821.N(var0)), Optional.of(var1.y())));
   }

   public Optional<class00759> R() {
      return this.killingBlow;
   }
}
