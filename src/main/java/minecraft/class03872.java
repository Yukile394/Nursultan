package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03872(class03877 input, class03876 noise, class03873 rarityValueMapper) implements class03895 {
   private static final MapCodec<class03872> B = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03877.R.fieldOf("input").forGetter(class03872::u),
            class03876.N.fieldOf("noise").forGetter(class03872::i),
            class03873.field_37068.fieldOf("rarity_value_mapper").forGetter(class03872::W)
         )
         .apply(var0, class03872::new)
   );
   public static final class03979<class03872> N = class03865.N(B);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class03872(class03877 input, class03876 noise, class03873 rarityValueMapper) {
      this.input = input;
      this.noise = noise;
      this.rarityValueMapper = rarityValueMapper;
   }

   public class03876 i() {
      return this.noise;
   }

   @Override
   public class03877 u() {
      return this.input;
   }

   @Override
   public double y() {
      return this.rarityValueMapper.field_37072 * this.noise.N();
   }

   @Override
   public double N() {
      return 0.0;
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03872(this.input.N(var1), var1.N(this.noise), this.rarityValueMapper));
   }

   @Override
   public double N(class03875 var1, double var2) {
      double d0 = this.rarityValueMapper.field_37071.get(var2);
      return d0 * Math.abs(this.noise.N(var1.y() / d0, var1.L() / d0, var1.u() / d0));
   }

   public class03873 W() {
      return this.rarityValueMapper;
   }
}
