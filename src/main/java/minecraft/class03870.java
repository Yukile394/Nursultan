package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class03870(class03876 noise, @Deprecated double xzScale, double yScale) implements class03877 {
   public static final MapCodec<class03870> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03876.N.fieldOf("noise").forGetter(class03870::u),
            Codec.DOUBLE.fieldOf("xz_scale").forGetter(class03870::i),
            Codec.DOUBLE.fieldOf("y_scale").forGetter(class03870::W)
         )
         .apply(var0, class03870::new)
   );
   public static final class03979<class03870> y = class03865.N(N);

   @Override
   public class03979<? extends class03877> L() {
      return y;
   }

   public class03870(class03876 noise, @Deprecated double xzScale, double yScale) {
      super();
      this.noise = noise;
      this.xzScale = xzScale;
      this.yScale = yScale;
   }

   @Deprecated
   public double i() {
      return this.xzScale;
   }

   public class03876 u() {
      return this.noise;
   }

   @Override
   public double y() {
      return this.noise.N();
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03870(var1.N(this.noise), this.xzScale, this.yScale));
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }

   @Override
   public double N(class03875 var1) {
      return this.noise.N(var1.y() * this.xzScale, var1.L() * this.yScale, var1.u() * this.xzScale);
   }

   @Override
   public double N() {
      return -this.y();
   }

   public double W() {
      return this.yScale;
   }
}
