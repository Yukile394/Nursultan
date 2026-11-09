package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Function;

public record class03866(
   class03877 barrierNoise,
   class03877 fluidLevelFloodednessNoise,
   class03877 fluidLevelSpreadNoise,
   class03877 lavaNoise,
   class03877 temperature,
   class03877 vegetation,
   class03877 continents,
   class03877 erosion,
   class03877 depth,
   class03877 ridges,
   class03877 preliminarySurfaceLevel,
   class03877 finalDensity,
   class03877 veinToggle,
   class03877 veinRidged,
   class03877 veinGap
) {
   public static final Codec<class03866> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            N("barrier", class03866::N),
            N("fluid_level_floodedness", class03866::y),
            N("fluid_level_spread", class03866::L),
            N("lava", class03866::u),
            N("temperature", class03866::i),
            N("vegetation", class03866::R),
            N("continents", class03866::M),
            N("erosion", class03866::B),
            N("depth", class03866::Z),
            N("ridges", class03866::z),
            N("preliminary_surface_level", class03866::U),
            N("final_density", class03866::E),
            N("vein_toggle", class03866::W),
            N("vein_ridged", class03866::m),
            N("vein_gap", class03866::P)
         )
         .apply(var0, class03866::new)
   );

   public class03877 L() {
      return this.fluidLevelSpreadNoise;
   }

   public class03877 M() {
      return this.continents;
   }

   public class03877 P() {
      return this.veinGap;
   }

   public class03866(
      class03877 barrierNoise,
      class03877 fluidLevelFloodednessNoise,
      class03877 fluidLevelSpreadNoise,
      class03877 lavaNoise,
      class03877 temperature,
      class03877 vegetation,
      class03877 continents,
      class03877 erosion,
      class03877 depth,
      class03877 ridges,
      class03877 preliminarySurfaceLevel,
      class03877 finalDensity,
      class03877 veinToggle,
      class03877 veinRidged,
      class03877 veinGap
   ) {
      super();
      this.barrierNoise = barrierNoise;
      this.fluidLevelFloodednessNoise = fluidLevelFloodednessNoise;
      this.fluidLevelSpreadNoise = fluidLevelSpreadNoise;
      this.lavaNoise = lavaNoise;
      this.temperature = temperature;
      this.vegetation = vegetation;
      this.continents = continents;
      this.erosion = erosion;
      this.depth = depth;
      this.ridges = ridges;
      this.preliminarySurfaceLevel = preliminarySurfaceLevel;
      this.finalDensity = finalDensity;
      this.veinToggle = veinToggle;
      this.veinRidged = veinRidged;
      this.veinGap = veinGap;
   }

   public class03877 B() {
      return this.erosion;
   }

   public class03877 Z() {
      return this.depth;
   }

   public class03877 i() {
      return this.temperature;
   }

   public class03877 m() {
      return this.veinRidged;
   }

   public class03877 U() {
      return this.preliminarySurfaceLevel;
   }

   public class03877 z() {
      return this.ridges;
   }

   public class03877 u() {
      return this.lavaNoise;
   }

   public class03877 y() {
      return this.fluidLevelFloodednessNoise;
   }

   public class03877 E() {
      return this.finalDensity;
   }

   private static RecordCodecBuilder<class03866, class03877> N(String var0, Function<class03866, class03877> var1) {
      return class03877.R.fieldOf(var0).forGetter(var1);
   }

   public class03877 N() {
      return this.barrierNoise;
   }

   public class03866 N(class03881 var1) {
      return new class03866(
         this.barrierNoise.N(var1),
         this.fluidLevelFloodednessNoise.N(var1),
         this.fluidLevelSpreadNoise.N(var1),
         this.lavaNoise.N(var1),
         this.temperature.N(var1),
         this.vegetation.N(var1),
         this.continents.N(var1),
         this.erosion.N(var1),
         this.depth.N(var1),
         this.ridges.N(var1),
         this.preliminarySurfaceLevel.N(var1),
         this.finalDensity.N(var1),
         this.veinToggle.N(var1),
         this.veinRidged.N(var1),
         this.veinGap.N(var1)
      );
   }

   public class03877 W() {
      return this.veinToggle;
   }

   public class03877 R() {
      return this.vegetation;
   }
}
