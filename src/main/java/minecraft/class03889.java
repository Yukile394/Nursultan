package minecraft;

import Nursultan.class10285;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class03889(class03877 density, class03877 upperBound, int lowerBound, int cellHeight) implements class03877 {
   private static final MapCodec<class03889> Z = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03877.R.fieldOf("density").forGetter(class03889::u),
            class03877.R.fieldOf("upper_bound").forGetter(class03889::i),
            Codec.intRange(class07376.i * 2, class07376.u * 2).fieldOf("lower_bound").forGetter(class03889::W),
            class06338.b.fieldOf("cell_height").forGetter(class03889::m)
         )
         .apply(var0, class03889::new)
   );
   public static final class03979<class03889> N = class03865.N(Z);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   class03889(class03877 density, class03877 upperBound, int lowerBound, int cellHeight) {
      this.density = density;
      this.upperBound = upperBound;
      this.lowerBound = lowerBound;
      this.cellHeight = cellHeight;
   }

   public class03877 i() {
      return this.upperBound;
   }

   public int m() {
      return this.cellHeight;
   }

   public class03877 u() {
      return this.density;
   }

   @Override
   public double y() {
      return Math.max((double)this.lowerBound, this.upperBound.y());
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03889(this.density.N(var1), this.upperBound.N(var1), this.lowerBound, this.cellHeight));
   }

   @Override
   public double N(class03875 var1) {
      int i = class04995.N(this.upperBound.N(var1) / this.cellHeight) * this.cellHeight;
      if (i <= this.lowerBound) {
         return this.lowerBound;
      } else {
         for (int j = i; j >= this.lowerBound; j -= this.cellHeight) {
            if (this.density.N(new class10285(var1.y(), j, var1.u())) > 0.0) {
               return j;
            }
         }

         return this.lowerBound;
      }
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }

   @Override
   public double N() {
      return this.lowerBound;
   }

   public int W() {
      return this.lowerBound;
   }
}
