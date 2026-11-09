package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Locale;
import java.util.stream.IntStream;

public class class06066 implements class03908 {
   private static final Codec<Double> y = Codec.doubleRange(0.001, 1000.0);
   private static final MapCodec<class06066> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            y.fieldOf("xz_scale").forGetter(var0x -> var0x.s),
            y.fieldOf("y_scale").forGetter(var0x -> var0x.T),
            y.fieldOf("xz_factor").forGetter(var0x -> var0x.E),
            y.fieldOf("y_factor").forGetter(var0x -> var0x.W),
            Codec.doubleRange(1.0, 8.0).fieldOf("smear_scale_multiplier").forGetter(var0x -> var0x.m)
         )
         .apply(var0, class06066::N)
   );
   public static final class03979<class06066> N = class03979.N(L);
   private final class05008 M;
   private final class05008 B;
   private final class05008 Z;
   private final double z;
   private final double U;
   private final double E;
   private final double W;
   private final double m;
   private final double P;
   private final double s;
   private final double T;

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class06066(class06069 var1, double var2, double var4, double var6, double var8, double var10) {
      this(
         class05008.N(var1, IntStream.rangeClosed(-15, 0)),
         class05008.N(var1, IntStream.rangeClosed(-15, 0)),
         class05008.N(var1, IntStream.rangeClosed(-7, 0)),
         var2,
         var4,
         var6,
         var8,
         var10
      );
   }

   private class06066(class05008 var1, class05008 var2, class05008 var3, double var4, double var6, double var8, double var10, double var12) {
      super();
      this.M = var1;
      this.B = var2;
      this.Z = var3;
      this.s = var4;
      this.T = var6;
      this.E = var8;
      this.W = var10;
      this.m = var12;
      this.z = 684.412 * this.s;
      this.U = 684.412 * this.T;
      this.P = var1.N(this.U);
   }

   @Override
   public double y() {
      return this.P;
   }

   public class06066 N(class06069 var1) {
      return new class06066(var1, this.s, this.T, this.E, this.W, this.m);
   }

   public static class06066 N(double var0, double var2, double var4, double var6, double var8) {
      return new class06066(new class04042(0L), var0, var2, var4, var6, var8);
   }

   @Override
   public double N() {
      return -this.y();
   }

   public void N(StringBuilder var1) {
      var1.append("BlendedNoise{minLimitNoise=");
      this.M.N(var1);
      var1.append(", maxLimitNoise=");
      this.B.N(var1);
      var1.append(", mainNoise=");
      this.Z.N(var1);
      var1.append(
            String.format(
               Locale.ROOT,
               ", xzScale=%.3f, yScale=%.3f, xzMainScale=%.3f, yMainScale=%.3f, cellWidth=4, cellHeight=8",
               684.412,
               684.412,
               8.555150000000001,
               4.277575000000001
            )
         )
         .append('}');
   }

   @Override
   public double N(class03875 var1) {
      double d0 = var1.y() * this.z;
      double d1 = var1.L() * this.U;
      double d2 = var1.u() * this.z;
      double d3 = d0 / this.E;
      double d4 = d1 / this.W;
      double d5 = d2 / this.E;
      double d6 = this.U * this.m;
      double d7 = d6 / this.W;
      double d8 = 0.0;
      double d9 = 0.0;
      double d10 = 0.0;
      boolean flag = true;
      double d11 = 1.0;

      for (int i = 0; i < 8; i++) {
         class04860 class04860x = this.Z.N(i);
         if (class04860x != null) {
            d10 += class04860x.N(class05008.y(d3 * d11), class05008.y(d4 * d11), class05008.y(d5 * d11), d7 * d11, d4 * d11) / d11;
         }

         d11 /= 2.0;
      }

      double d16 = (d10 / 10.0 + 1.0) / 2.0;
      boolean flag1 = d16 >= 1.0;
      boolean flag2 = d16 <= 0.0;
      d11 = 1.0;

      for (int j = 0; j < 16; j++) {
         double d12 = class05008.y(d0 * d11);
         double d13 = class05008.y(d1 * d11);
         double d14 = class05008.y(d2 * d11);
         double d15 = d6 * d11;
         if (!flag1) {
            class04860 class04860 = this.M.N(j);
            if (class04860 != null) {
               d8 += class04860.N(d12, d13, d14, d15, d1 * d11) / d11;
            }
         }

         if (!flag2) {
            class04860 class04860xx = this.B.N(j);
            if (class04860xx != null) {
               d9 += class04860xx.N(d12, d13, d14, d15, d1 * d11) / d11;
            }
         }

         d11 /= 2.0;
      }

      return class04995.y(d16, d8 / 512.0, d9 / 512.0) / 128.0;
   }
}
