package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03878(class03877 shiftX, class03877 shiftY, class03877 shiftZ, double xzScale, double yScale, class03876 noise) implements class03877 {
   private static final MapCodec<class03878> U = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03877.R.fieldOf("shift_x").forGetter(class03878::u),
            class03877.R.fieldOf("shift_y").forGetter(class03878::i),
            class03877.R.fieldOf("shift_z").forGetter(class03878::W),
            Codec.DOUBLE.fieldOf("xz_scale").forGetter(class03878::m),
            Codec.DOUBLE.fieldOf("y_scale").forGetter(class03878::P),
            class03876.N.fieldOf("noise").forGetter(class03878::s)
         )
         .apply(var0, class03878::new)
   );
   public static final class03979<class03878> N = class03865.N(U);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public double P() {
      return this.yScale;
   }

   public class03878(class03877 shiftX, class03877 shiftY, class03877 shiftZ, double xzScale, double yScale, class03876 noise) {
      this.shiftX = shiftX;
      this.shiftY = shiftY;
      this.shiftZ = shiftZ;
      this.xzScale = xzScale;
      this.yScale = yScale;
      this.noise = noise;
   }

   public class03877 i() {
      return this.shiftY;
   }

   public class03876 s() {
      return this.noise;
   }

   public double m() {
      return this.xzScale;
   }

   public class03877 u() {
      return this.shiftX;
   }

   @Override
   public double y() {
      return this.noise.N();
   }

   @Override
   public double N() {
      return -this.y();
   }

   @Override
   public double N(class03875 var1) {
      double d0 = var1.y() * this.xzScale + this.shiftX.N(var1);
      double d1 = var1.L() * this.yScale + this.shiftY.N(var1);
      double d2 = var1.u() * this.xzScale + this.shiftZ.N(var1);
      return this.noise.N(d0, d1, d2);
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03878(this.shiftX.N(var1), this.shiftY.N(var1), this.shiftZ.N(var1), this.xzScale, this.yScale, var1.N(this.noise)));
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }

   public class03877 W() {
      return this.shiftZ;
   }
}
