package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class02528(
   boolean attributeToUser,
   Optional<class03556<class03689>> damageType,
   Optional<class02546> knockbackMultiplier,
   Optional<class03543<class00891>> immuneBlocks,
   class06889 offset,
   class02546 radius,
   boolean createFire,
   class07328 blockInteraction,
   class07126 smallParticle,
   class07126 largeParticle,
   class04540<class00931> blockParticles,
   class03556<class04891> sound
) implements class02560 {
   public static final MapCodec<class02528> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("attribute_to_user", false).forGetter(class02528::y),
            class03689.y.optionalFieldOf("damage_type").forGetter(class02528::L),
            class02546.y.optionalFieldOf("knockback_multiplier").forGetter(class02528::u),
            class03541.N(class04227.Z).optionalFieldOf("immune_blocks").forGetter(class02528::i),
            class06889.N.optionalFieldOf("offset", class06889.L).forGetter(class02528::R),
            class02546.y.fieldOf("radius").forGetter(class02528::M),
            Codec.BOOL.optionalFieldOf("create_fire", false).forGetter(class02528::B),
            class07328.field_51780.fieldOf("block_interaction").forGetter(class02528::Z),
            class07107.yE.fieldOf("small_particle").forGetter(class02528::z),
            class07107.yE.fieldOf("large_particle").forGetter(class02528::U),
            class04540.N(class00931.N).optionalFieldOf("block_particles", class04540.N()).forGetter(class02528::E),
            class04891.y.fieldOf("sound").forGetter(class02528::W)
         )
         .apply(var0, class02528::new)
   );

   public Optional<class03556<class03689>> L() {
      return this.damageType;
   }

   public class02546 M() {
      return this.radius;
   }

   public class02528(
      boolean attributeToUser,
      Optional<class03556<class03689>> damageType,
      Optional<class02546> knockbackMultiplier,
      Optional<class03543<class00891>> immuneBlocks,
      class06889 offset,
      class02546 radius,
      boolean createFire,
      class07328 blockInteraction,
      class07126 smallParticle,
      class07126 largeParticle,
      class04540<class00931> blockParticles,
      class03556<class04891> sound
   ) {
      super();
      this.attributeToUser = attributeToUser;
      this.damageType = damageType;
      this.knockbackMultiplier = knockbackMultiplier;
      this.immuneBlocks = immuneBlocks;
      this.offset = offset;
      this.radius = radius;
      this.createFire = createFire;
      this.blockInteraction = blockInteraction;
      this.smallParticle = smallParticle;
      this.largeParticle = largeParticle;
      this.blockParticles = blockParticles;
      this.sound = sound;
   }

   public boolean B() {
      return this.createFire;
   }

   public class07328 Z() {
      return this.blockInteraction;
   }

   public Optional<class03543<class00891>> i() {
      return this.immuneBlocks;
   }

   public class07126 U() {
      return this.largeParticle;
   }

   public class07126 z() {
      return this.smallParticle;
   }

   public Optional<class02546> u() {
      return this.knockbackMultiplier;
   }

   public boolean y() {
      return this.attributeToUser;
   }

   public class04540<class00931> E() {
      return this.blockParticles;
   }

   @Nullable
   private class07072 N(class07049 var1, class06889 var2) {
      if (this.damageType.isEmpty()) {
         return null;
      } else {
         return this.attributeToUser ? new class07072(this.damageType.get(), var1) : new class07072(this.damageType.get(), var2);
      }
   }

   @Override
   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5) {
      class06889 class06889 = var5.i(this.offset);
      var1.method_8454(
         this.attributeToUser ? var4 : null,
         this.N(var4, class06889),
         new class02247(
            this.blockInteraction != class07328.field_40888,
            this.damageType.isPresent(),
            this.knockbackMultiplier.map(var1x -> var1x.N(var2)),
            this.immuneBlocks
         ),
         class06889.N(),
         class06889.y(),
         class06889.L(),
         Math.max(this.radius.N(var2), 0.0F),
         this.createFire,
         this.blockInteraction,
         this.smallParticle,
         this.largeParticle,
         this.blockParticles,
         this.sound
      );
   }

   @Override
   public MapCodec<class02528> N() {
      return N;
   }

   public class03556<class04891> W() {
      return this.sound;
   }

   public class06889 R() {
      return this.offset;
   }
}
