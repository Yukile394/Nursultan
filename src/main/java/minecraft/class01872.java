package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class class01872 implements class01857 {
   private final class06202 N;
   private double y = Double.MIN_VALUE;
   private List<class00494> L = Collections.emptyList();

   public class01872(class06202 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      double d0 = class07536.u();
      if (d0 - this.y > 1.0E8) {
         this.y = d0;
         class07049 var12 = ((class03386)this.N.i_5).s().B();
         this.L = ImmutableList.copyOf(var12.method_73183().method_8600(var12, var12.method_5829().M(6.0)));
      }

      for (class00494 class00494 : this.L) {
         class06747 class06747 = class06747.N(-1);
         Iterator<class00734> iterator = class00494.method_1090().iterator();

         while (iterator.hasNext()) {
            class06724.N(iterator.next(), class06747);
         }
      }
   }
}
