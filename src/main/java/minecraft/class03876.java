package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public record class03876(class03556<class05056> noiseData, class05041 noise) {
   public static final Codec<class03876> N = class05056.u.xmap(var0 -> new class03876(var0, null), class03876::y);

   @Nullable
   public class05041 L() {
      return this.noise;
   }

   public class03876(class03556<class05056> var1) {
      this(var1, null);
   }

   public class03876(class03556<class05056> noiseData, @Nullable class05041 noise) {
      super();
      this.noiseData = noiseData;
      this.noise = noise;
   }

   public class03556<class05056> y() {
      return this.noiseData;
   }

   public double N() {
      return this.noise == null ? 2.0 : this.noise.N();
   }

   public double N(double var1, double var3, double var5) {
      return this.noise == null ? 0.0 : this.noise.N(var1, var3, var5);
   }
}
