package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public record class03887(class04562<class03903, class03890> spline) implements class03877 {
   private static final Codec<class04562<class03903, class03890>> L = class04562.N(class03890.N);
   private static final MapCodec<class03887> M = L.fieldOf("spline").xmap(class03887::new, class03887::u);
   public static final class03979<class03887> N = class03865.N(M);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class03887(class04562<class03903, class03890> spline) {
      this.spline = spline;
   }

   public class04562<class03903, class03890> u() {
      return this.spline;
   }

   @Override
   public double y() {
      return this.spline.L();
   }

   @Override
   public double N() {
      return this.spline.y();
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03887(this.spline.N_48(var1x -> var1x.N(var1))));
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }

   @Override
   public double N(class03875 var1) {
      return this.spline.N(new class03903(var1));
   }
}
