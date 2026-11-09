package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00820(
   Optional<Boolean> isOnGround,
   Optional<Boolean> isOnFire,
   Optional<Boolean> isCrouching,
   Optional<Boolean> isSprinting,
   Optional<Boolean> isSwimming,
   Optional<Boolean> isFlying,
   Optional<Boolean> isBaby,
   Optional<Boolean> isInWater,
   Optional<Boolean> isFallFlying
) {
   public static final Codec<class00820> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("is_on_ground").forGetter(class00820::N),
            Codec.BOOL.optionalFieldOf("is_on_fire").forGetter(class00820::y),
            Codec.BOOL.optionalFieldOf("is_sneaking").forGetter(class00820::L),
            Codec.BOOL.optionalFieldOf("is_sprinting").forGetter(class00820::u),
            Codec.BOOL.optionalFieldOf("is_swimming").forGetter(class00820::i),
            Codec.BOOL.optionalFieldOf("is_flying").forGetter(class00820::R),
            Codec.BOOL.optionalFieldOf("is_baby").forGetter(class00820::M),
            Codec.BOOL.optionalFieldOf("is_in_water").forGetter(class00820::B),
            Codec.BOOL.optionalFieldOf("is_fall_flying").forGetter(class00820::Z)
         )
         .apply(var0, class00820::new)
   );

   public Optional<Boolean> L() {
      return this.isCrouching;
   }

   public Optional<Boolean> M() {
      return this.isBaby;
   }

   public class00820(
      Optional<Boolean> isOnGround,
      Optional<Boolean> isOnFire,
      Optional<Boolean> isCrouching,
      Optional<Boolean> isSprinting,
      Optional<Boolean> isSwimming,
      Optional<Boolean> isFlying,
      Optional<Boolean> isBaby,
      Optional<Boolean> isInWater,
      Optional<Boolean> isFallFlying
   ) {
      super();
      this.isOnGround = isOnGround;
      this.isOnFire = isOnFire;
      this.isCrouching = isCrouching;
      this.isSprinting = isSprinting;
      this.isSwimming = isSwimming;
      this.isFlying = isFlying;
      this.isBaby = isBaby;
      this.isInWater = isInWater;
      this.isFallFlying = isFallFlying;
   }

   public Optional<Boolean> B() {
      return this.isInWater;
   }

   public Optional<Boolean> Z() {
      return this.isFallFlying;
   }

   public Optional<Boolean> i() {
      return this.isSwimming;
   }

   public Optional<Boolean> u() {
      return this.isSprinting;
   }

   public Optional<Boolean> y() {
      return this.isOnFire;
   }

   public Optional<Boolean> N() {
      return this.isOnGround;
   }

   public boolean N(class07049 var1) {
      if (this.isOnGround.isPresent() && var1.method_24828() != this.isOnGround.get()) {
         return false;
      } else if (this.isOnFire.isPresent() && var1.method_5809() != this.isOnFire.get()) {
         return false;
      } else if (this.isCrouching.isPresent() && var1.method_18276() != this.isCrouching.get()) {
         return false;
      } else if (this.isSprinting.isPresent() && var1.method_5624() != this.isSprinting.get()) {
         return false;
      } else if (this.isSwimming.isPresent() && var1.method_5681() != this.isSwimming.get()) {
         return false;
      } else {
         if (this.isFlying.isPresent()) {
            boolean flag = var1 instanceof class07438 class07438xx
               && (class07438xx.method_6128() || class07438xx instanceof class08036 && ((class08036)class07438xx).method_31549().y);
            if (flag != this.isFlying.get()) {
               return false;
            }
         }

         if (this.isInWater.isPresent() && var1.method_5799() != this.isInWater.get()) {
            return false;
         } else {
            return this.isFallFlying.isPresent() && var1 instanceof class07438 class07438x && class07438x.method_6128() != this.isFallFlying.get()
               ? false
               : !(this.isBaby.isPresent() && var1 instanceof class07438 class07438) || class07438.method_6109() == this.isBaby.get();
         }
      }
   }

   public Optional<Boolean> R() {
      return this.isFlying;
   }
}
