package minecraft;

import Nursultan.class10285;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.Objects;
import net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks;

public final class class03222 implements MultiNoiseSamplerHooks {
   private class03877 temperature;
   private class03877 humidity;
   private class03877 continentalness;
   private class03877 erosion;
   private class03877 depth;
   private class03877 weirdness;
   private List<class03229> spawnTarget;
   private Long B = null;
   private class04860 Z = null;

   public class03877 L() {
      return this.humidity;
   }

   public class03877 M() {
      return this.weirdness;
   }

   public class03222(class03877 var1, class03877 var2, class03877 var3, class03877 var4, class03877 var5, class03877 var6, List<class03229> var7) {
      super();
      this.temperature = var1;
      this.humidity = var2;
      this.continentalness = var3;
      this.erosion = var4;
      this.depth = var5;
      this.weirdness = var6;
      this.spawnTarget = var7;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class03222
            && Objects.equals(this.temperature, ((class03222)var1).temperature)
            && Objects.equals(this.humidity, ((class03222)var1).humidity)
            && Objects.equals(this.continentalness, ((class03222)var1).continentalness)
            && Objects.equals(this.erosion, ((class03222)var1).erosion)
            && Objects.equals(this.depth, ((class03222)var1).depth)
            && Objects.equals(this.weirdness, ((class03222)var1).weirdness)
            && Objects.equals(this.spawnTarget, ((class03222)var1).spawnTarget);
   }

   @Override
   public final String toString() {
      return "class03222[temperature="
         + Objects.toString(this.temperature)
         + ", humidity="
         + Objects.toString(this.humidity)
         + ", continentalness="
         + Objects.toString(this.continentalness)
         + ", erosion="
         + Objects.toString(this.erosion)
         + ", depth="
         + Objects.toString(this.depth)
         + ", weirdness="
         + Objects.toString(this.weirdness)
         + ", spawnTarget="
         + Objects.toString(this.spawnTarget)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (
               (
                        (
                                 (
                                          ((0 * 31 + Objects.hashCode(this.temperature)) * 31 + Objects.hashCode(this.humidity)) * 31
                                             + Objects.hashCode(this.continentalness)
                                       )
                                       * 31
                                    + Objects.hashCode(this.erosion)
                              )
                              * 31
                           + Objects.hashCode(this.depth)
                     )
                     * 31
                  + Objects.hashCode(this.weirdness)
            )
            * 31
         + Objects.hashCode(this.spawnTarget);
   }

   public List<class03229> B() {
      return this.spawnTarget;
   }

   public class03877 i() {
      return this.erosion;
   }

   public class03877 u() {
      return this.continentalness;
   }

   public class03877 y() {
      return this.temperature;
   }

   public class03231 N(int var1, int var2, int var3) {
      int i = class01146.L(var1);
      int j = class01146.L(var2);
      int k = class01146.L(var3);
      class10285 class10285 = new class10285(i, j, k);
      return class03216.N(
         (float)this.temperature.N(class10285),
         (float)this.humidity.N(class10285),
         (float)this.continentalness.N(class10285),
         (float)this.erosion.N(class10285),
         (float)this.depth.N(class10285),
         (float)this.weirdness.N(class10285)
      );
   }

   public class07209 N() {
      return this.spawnTarget.isEmpty() ? class07209.field_10980 : class03216.N(this.spawnTarget, this);
   }

   public class03877 R() {
      return this.depth;
   }

   public long fabric_getSeed() {
      return this.B;
   }

   public class04860 fabric_getEndBiomesSampler() {
      if (this.Z == null) {
         Preconditions.checkState(this.B != null, "MultiNoiseSampler doesn't have a seed set, created using different method?");
         this.Z = new class04860(new class07836(new class06075(this.B)));
      }

      return this.Z;
   }

   public void fabric_setSeed(long var1) {
      this.B = var1;
   }
}
