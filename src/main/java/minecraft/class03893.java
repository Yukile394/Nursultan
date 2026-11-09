package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class03893(class03877 input, double minInclusive, double maxExclusive, class03877 whenInRange, class03877 whenOutOfRange) implements class03877 {
   public static final MapCodec<class03893> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03877.R.fieldOf("input").forGetter(class03893::u),
            class03865.y.fieldOf("min_inclusive").forGetter(class03893::i),
            class03865.y.fieldOf("max_exclusive").forGetter(class03893::W),
            class03877.R.fieldOf("when_in_range").forGetter(class03893::m),
            class03877.R.fieldOf("when_out_of_range").forGetter(class03893::P)
         )
         .apply(var0, class03893::new)
   );
   public static final class03979<class03893> y = class03865.N(N);

   @Override
   public class03979<? extends class03877> L() {
      return y;
   }

   public class03877 P() {
      return this.whenOutOfRange;
   }

   class03893(class03877 input, double minInclusive, double maxExclusive, class03877 whenInRange, class03877 whenOutOfRange) {
      this.input = input;
      this.minInclusive = minInclusive;
      this.maxExclusive = maxExclusive;
      this.whenInRange = whenInRange;
      this.whenOutOfRange = whenOutOfRange;
   }

   public double i() {
      return this.minInclusive;
   }

   public class03877 m() {
      return this.whenInRange;
   }

   public class03877 u() {
      return this.input;
   }

   @Override
   public double y() {
      return Math.max(this.whenInRange.y(), this.whenOutOfRange.y());
   }

   @Override
   public double N(class03875 var1) {
      double d0 = this.input.N(var1);
      return d0 >= this.minInclusive && d0 < this.maxExclusive ? this.whenInRange.N(var1) : this.whenOutOfRange.N(var1);
   }

   @Override
   public double N() {
      return Math.min(this.whenInRange.N(), this.whenOutOfRange.N());
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      this.input.N(var1, var2);

      for (int i = 0; i < var1.length; i++) {
         double d0 = var1[i];
         if (d0 >= this.minInclusive && d0 < this.maxExclusive) {
            var1[i] = this.whenInRange.N(var2.L(i));
         } else {
            var1[i] = this.whenOutOfRange.N(var2.L(i));
         }
      }
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03893(this.input.N(var1), this.minInclusive, this.maxExclusive, this.whenInRange.N(var1), this.whenOutOfRange.N(var1)));
   }

   public double W() {
      return this.maxExclusive;
   }
}
