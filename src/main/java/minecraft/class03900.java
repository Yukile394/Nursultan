package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03900(class03877 input, double minValue, double maxValue) implements class03899 {
   private static final MapCodec<class03900> B = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03877.u.fieldOf("input").forGetter(class03900::az_),
            class03865.y.fieldOf("min").forGetter(class03900::N),
            class03865.y.fieldOf("max").forGetter(class03900::y)
         )
         .apply(var0, class03900::new)
   );
   public static final class03979<class03900> N = class03865.N(B);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   protected class03900(class03877 input, double minValue, double maxValue) {
      this.input = input;
      this.minValue = minValue;
      this.maxValue = maxValue;
   }

   @Override
   public double y() {
      return this.maxValue;
   }

   @Override
   public double N() {
      return this.minValue;
   }

   @Override
   public class03877 N(class03881 var1) {
      return new class03900(this.input.N(var1), this.minValue, this.maxValue);
   }

   @Override
   public double N(double var1) {
      return class04995.N(var1, this.minValue, this.maxValue);
   }

   @Override
   public class03877 az_() {
      return this.input;
   }
}
