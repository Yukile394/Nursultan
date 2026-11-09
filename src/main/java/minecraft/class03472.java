package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleSupplier;

public class class03472 implements class01857 {
   private final class06202 N;
   private double y = Double.MIN_VALUE;
   private List<class07049> L = Collections.emptyList();

   public class03472(class06202 var1) {
      super();
      this.N = var1;
   }

   private void N(class07209 var1, double var2, int var4) {
      double d0 = var1.method_10263() - 2.0 * var2;
      double d1 = var1.method_10264() - 2.0 * var2;
      double d2 = var1.method_10260() - 2.0 * var2;
      double d3 = d0 + 1.0 + 4.0 * var2;
      double d4 = d1 + 1.0 + 4.0 * var2;
      double d5 = d2 + 1.0 + 4.0 * var2;
      class06724.N(new class00734(d0, d1, d2, d3, d4, d5), class06747.N(class02566.N(0.4F, var4)));
      class00494 class00494 = ((class03448)this.N.T_3).method_8320(var1).y((class03448)this.N.T_3, var1, class06092.N()).method_66507(var1);
      class06747 class06747 = class06747.N(var4);
      Iterator<class00734> iterator = class00494.method_1090().iterator();

      while (iterator.hasNext()) {
         class06724.N(iterator.next(), class06747);
      }
   }

   private double N(class07049 var1) {
      return 0.02 * (String.valueOf(var1.method_5628() + 0.132453657).hashCode() % 1000) / 1000.0;
   }

   private void N(class07049 var1, DoubleSupplier var2, int var3) {
      var1.field_44784.ifPresent(var4 -> {
         double d0 = var2.getAsDouble();
         class07209 class07209x = var1.method_23312();
         this.N(class07209x, 0.02 + d0, var3);
         class07209 class07209x = var1.method_43260();
         if (!class07209x.equals(class07209x)) {
            this.N(class07209x, 0.04 + d0, -16711681);
         }
      });
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      double d0 = class07536.u();
      if (d0 - this.y > 1.0E8) {
         this.y = d0;
         class07049 class07049x = ((class03386)this.N.i_5).s().B();
         this.L = ImmutableList.copyOf(class07049x.method_73183().N_70(class07049x, class07049x.method_5829().M(16.0)));
      }

      class04453 class04453 = (class04453)this.N.T_4;
      if (class04453 != null && class04453.field_44784.isPresent()) {
         this.N(class04453, () -> 0.0, -65536);
      }

      for (class07049 class07049 : this.L) {
         if (class07049 != class04453) {
            this.N(class07049, () -> this.N(class07049), -16711936);
         }
      }
   }
}
