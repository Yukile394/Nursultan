package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00817(
   Optional<class00848> position,
   Optional<class03543<class00780>> biomes,
   Optional<class03543<class04748>> structures,
   Optional<class05946<class07299>> dimension,
   Optional<Boolean> smokey,
   Optional<class01393> light,
   Optional<class01392> block,
   Optional<class01415> fluid,
   Optional<Boolean> canSeeSky
) {
   public static final Codec<class00817> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00848.N.optionalFieldOf("position").forGetter(class00817::N),
            class03541.N(class04227.NA).optionalFieldOf("biomes").forGetter(class00817::y),
            class03541.N(class04227.yj).optionalFieldOf("structures").forGetter(class00817::L),
            class05946.N(class04227.yg).optionalFieldOf("dimension").forGetter(class00817::u),
            Codec.BOOL.optionalFieldOf("smokey").forGetter(class00817::i),
            class01393.N.optionalFieldOf("light").forGetter(class00817::R),
            class01392.N.optionalFieldOf("block").forGetter(class00817::M),
            class01415.N.optionalFieldOf("fluid").forGetter(class00817::B),
            Codec.BOOL.optionalFieldOf("can_see_sky").forGetter(class00817::Z)
         )
         .apply(var0, class00817::new)
   );

   public Optional<class03543<class04748>> L() {
      return this.structures;
   }

   public Optional<class01392> M() {
      return this.block;
   }

   public class00817(
      Optional<class00848> position,
      Optional<class03543<class00780>> biomes,
      Optional<class03543<class04748>> structures,
      Optional<class05946<class07299>> dimension,
      Optional<Boolean> smokey,
      Optional<class01393> light,
      Optional<class01392> block,
      Optional<class01415> fluid,
      Optional<Boolean> canSeeSky
   ) {
      super();
      this.position = position;
      this.biomes = biomes;
      this.structures = structures;
      this.dimension = dimension;
      this.smokey = smokey;
      this.light = light;
      this.block = block;
      this.fluid = fluid;
      this.canSeeSky = canSeeSky;
   }

   public Optional<class01415> B() {
      return this.fluid;
   }

   public Optional<Boolean> Z() {
      return this.canSeeSky;
   }

   public Optional<Boolean> i() {
      return this.smokey;
   }

   public Optional<class05946<class07299>> u() {
      return this.dimension;
   }

   public Optional<class03543<class00780>> y() {
      return this.biomes;
   }

   public Optional<class00848> N() {
      return this.position;
   }

   public boolean N(class04782 var1, double var2, double var4, double var6) {
      if (this.position.isPresent() && !this.position.get().N(var2, var4, var6)) {
         return false;
      } else if (this.dimension.isPresent() && this.dimension.get() != var1.method_27983()) {
         return false;
      } else {
         class07209 class07209 = class07209.method_49637(var2, var4, var6);
         boolean flag = var1.method_8477(class07209);
         if (!this.biomes.isPresent() || flag && this.biomes.get().N(var1.i(class07209))) {
            if (!this.structures.isPresent() || flag && var1.method_27056().N(class07209, this.structures.get()).y()) {
               if (!this.smokey.isPresent() || flag && this.smokey.get() == class05847.N(var1, class07209)) {
                  if (this.light.isPresent() && !this.light.get().N(var1, class07209)) {
                     return false;
                  } else if (this.block.isPresent() && !this.block.get().N(var1, class07209)) {
                     return false;
                  } else {
                     return this.fluid.isPresent() && !this.fluid.get().N(var1, class07209)
                        ? false
                        : !this.canSeeSky.isPresent() || this.canSeeSky.get() == var1.N_17(class07209);
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public Optional<class01393> R() {
      return this.light;
   }
}
