package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public record class00821(
   Optional<class00829> entityType,
   Optional<class00761> distanceToPlayer,
   Optional<class02219> movement,
   class00833 location,
   Optional<class00834> effects,
   Optional<class00809> nbt,
   Optional<class00820> flags,
   Optional<class06110> equipment,
   Optional<class03622> subPredicate,
   Optional<Integer> periodicTick,
   Optional<class00821> vehicle,
   Optional<class00821> passenger,
   Optional<class00821> targetedEntity,
   Optional<String> team,
   Optional<class02506> slots,
   class00142 components
) {
   public static final Codec<class00821> N = Codec.recursive(
      "EntityPredicate",
      var0 -> RecordCodecBuilder.create(
         var1 -> var1.group(
               class00829.N.optionalFieldOf("type").forGetter(class00821::N),
               class00761.N.optionalFieldOf("distance").forGetter(class00821::y),
               class02219.N.optionalFieldOf("movement").forGetter(class00821::L),
               class00833.u.forGetter(class00821::u),
               class00834.N.optionalFieldOf("effects").forGetter(class00821::i),
               class00809.N.optionalFieldOf("nbt").forGetter(class00821::R),
               class00820.N.optionalFieldOf("flags").forGetter(class00821::M),
               class06110.N.optionalFieldOf("equipment").forGetter(class00821::B),
               class03622.L.optionalFieldOf("type_specific").forGetter(class00821::Z),
               class06338.b.optionalFieldOf("periodic_tick").forGetter(class00821::z),
               var0.optionalFieldOf("vehicle").forGetter(class00821::U),
               var0.optionalFieldOf("passenger").forGetter(class00821::E),
               var0.optionalFieldOf("targeted_entity").forGetter(class00821::W),
               Codec.STRING.optionalFieldOf("team").forGetter(class00821::m),
               class02506.N.optionalFieldOf("slots").forGetter(class00821::P),
               class00142.y.forGetter(class00821::s)
            )
            .apply(var1, class00821::new)
      )
   );
   public static final Codec<class05196> y = Codec.withAlternative(class05196.N, N, class00821::N);

   public Optional<class02219> L() {
      return this.movement;
   }

   public Optional<class00820> M() {
      return this.flags;
   }

   public Optional<class02506> P() {
      return this.slots;
   }

   public class00821(
      Optional<class00829> entityType,
      Optional<class00761> distanceToPlayer,
      Optional<class02219> movement,
      class00833 location,
      Optional<class00834> effects,
      Optional<class00809> nbt,
      Optional<class00820> flags,
      Optional<class06110> equipment,
      Optional<class03622> subPredicate,
      Optional<Integer> periodicTick,
      Optional<class00821> vehicle,
      Optional<class00821> passenger,
      Optional<class00821> targetedEntity,
      Optional<String> team,
      Optional<class02506> slots,
      class00142 components
   ) {
      this.entityType = entityType;
      this.distanceToPlayer = distanceToPlayer;
      this.movement = movement;
      this.location = location;
      this.effects = effects;
      this.nbt = nbt;
      this.flags = flags;
      this.equipment = equipment;
      this.subPredicate = subPredicate;
      this.periodicTick = periodicTick;
      this.vehicle = vehicle;
      this.passenger = passenger;
      this.targetedEntity = targetedEntity;
      this.team = team;
      this.slots = slots;
      this.components = components;
   }

   public Optional<class06110> B() {
      return this.equipment;
   }

   public Optional<class03622> Z() {
      return this.subPredicate;
   }

   public Optional<class00834> i() {
      return this.effects;
   }

   public class00142 s() {
      return this.components;
   }

   public Optional<String> m() {
      return this.team;
   }

   public Optional<class00821> U() {
      return this.vehicle;
   }

   public Optional<Integer> z() {
      return this.periodicTick;
   }

   public class00833 u() {
      return this.location;
   }

   public Optional<class00761> y() {
      return this.distanceToPlayer;
   }

   public static class05908 y(class04770 var0, class07049 var1) {
      class04162 class04162 = new class04160(var0.method_51469()).N(class06551.N, var1).N(class06551.B, var0.method_73189()).N(class06925.P);
      return new class05927(class04162).N(Optional.empty());
   }

   public Optional<class00821> E() {
      return this.passenger;
   }

   public static class05196 N(class00810 var0) {
      return N(var0.y());
   }

   public boolean N(class04770 var1, @Nullable class07049 var2) {
      return this.N(var1.method_51469(), var1.method_73189(), var2);
   }

   public static List<class05196> N(class00810... var0) {
      return Stream.of(var0).map(class00821::N).toList();
   }

   public static class05196 N(class00821 var0) {
      class05957 class05957 = class07700.N(class05919.field_935, var0).build();
      return new class05196(List.of(class05957));
   }

   public boolean N(class04782 var1, @Nullable class06889 var2, @Nullable class07049 var3) {
      if (var3 == null) {
         return false;
      } else if (this.entityType.isPresent() && !this.entityType.get().N(var3.method_5864())) {
         return false;
      } else {
         if (var2 == null) {
            if (this.distanceToPlayer.isPresent()) {
               return false;
            }
         } else if (this.distanceToPlayer.isPresent()
            && !this.distanceToPlayer.get().N(var2.M, var2.B, var2.Z, var3.method_23317(), var3.method_23318(), var3.method_23321())) {
            return false;
         }

         if (this.movement.isPresent()) {
            class06889 class06889xxx = var3.method_60478();
            class06889 class06889x = class06889xxx.L(20.0);
            if (!this.movement.get().N(class06889x.M, class06889x.B, class06889x.Z, var3.field_6017)) {
               return false;
            }
         }

         if (this.location.N().isPresent() && !this.location.N().get().N(var1, var3.method_23317(), var3.method_23318(), var3.method_23321())) {
            return false;
         } else {
            if (this.location.y().isPresent()) {
               class06889 class06889x = class06889.y(var3.method_23312());
               if (!var3.method_24828() || !this.location.y().get().N(var1, class06889x.N(), class06889x.y(), class06889x.L())) {
                  return false;
               }
            }

            if (this.location.L().isPresent()) {
               class06889 class06889 = class06889.y(var3.method_23314());
               if (!this.location.L().get().N(var1, class06889.N(), class06889.y(), class06889.L())) {
                  return false;
               }
            }

            if (this.effects.isPresent() && !this.effects.get().N(var3)) {
               return false;
            } else if (this.flags.isPresent() && !this.flags.get().N(var3)) {
               return false;
            } else if (this.equipment.isPresent() && !this.equipment.get().N(var3)) {
               return false;
            } else if (this.subPredicate.isPresent() && !this.subPredicate.get().N(var3, var1, var2)) {
               return false;
            } else if (this.vehicle.isPresent() && !this.vehicle.get().N(var1, var2, var3.method_5854())) {
               return false;
            } else if (this.passenger.isPresent() && var3.method_5685().stream().noneMatch(var3x -> this.passenger.get().N(var1, var2, var3x))) {
               return false;
            } else if (this.targetedEntity.isPresent() && !this.targetedEntity.get().N(var1, var2, var3 instanceof class07079 ? ((class07079)var3).T() : null)) {
               return false;
            } else if (this.periodicTick.isPresent() && var3.field_6012 % this.periodicTick.get() != 0) {
               return false;
            } else {
               if (this.team.isPresent()) {
                  class00502 class00502 = var3.method_5781();
                  if (class00502 == null || !this.team.get().equals(class00502.L())) {
                     return false;
                  }
               }

               if (this.slots.isPresent() && !this.slots.get().N(var3)) {
                  return false;
               } else {
                  return !this.components.test((class02666)var3) ? false : this.nbt.isEmpty() || this.nbt.get().N(var3);
               }
            }
         }
      }
   }

   public static Optional<class05196> N(Optional<class00821> var0) {
      return var0.map(class00821::N);
   }

   public Optional<class00829> N() {
      return this.entityType;
   }

   public Optional<class00821> W() {
      return this.targetedEntity;
   }

   public Optional<class00809> R() {
      return this.nbt;
   }
}
