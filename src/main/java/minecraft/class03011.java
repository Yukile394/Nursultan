package minecraft;

import Nursultan.class10101;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03011(class05946<class05056> noise, double minThreshold, double maxThreshold) implements class04017 {
   static final class03979<class03011> u = class03979.N(
      RecordCodecBuilder.mapCodec(
         var0 -> var0.group(
               class05946.N(class04227.yW).fieldOf("noise").forGetter(class03011::y),
               Codec.DOUBLE.fieldOf("min_threshold").forGetter(class03011::L),
               Codec.DOUBLE.fieldOf("max_threshold").forGetter(class03011::u)
            )
            .apply(var0, class03011::new)
      )
   );

   public double L() {
      return this.minThreshold;
   }

   class03011(class05946<class05056> noise, double minThreshold, double maxThreshold) {
      super();
      this.noise = noise;
      this.minThreshold = minThreshold;
      this.maxThreshold = maxThreshold;
   }

   public double u() {
      return this.maxThreshold;
   }

   public class05946<class05056> y() {
      return this.noise;
   }

   @Override
   public class03979<? extends class04017> N() {
      return u;
   }

   public class04018 apply(class04039 var1) {
      class05041 class05041 = var1.R.N(this.noise);
      return new class10101(this, var1, class05041);
   }
}
