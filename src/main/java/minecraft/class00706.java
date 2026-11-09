package minecraft;

import org.jspecify.annotations.Nullable;

public class class00706 extends class00685 {
   private static final int y = 200;
   private static final int L = 4;
   private static final int u = 10;
   private int i;
   private int R;
   @Nullable
   private class07048 M;

   @Override
   public void L() {
      this.i = 0;
      this.R++;
   }

   public class00706(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00706> B() {
      return class00702.R;
   }

   public void Z() {
      this.R = 0;
   }

   @Override
   public void u() {
      if (this.M != null) {
         this.M.method_31472();
         this.M = null;
      }
   }

   @Override
   public void y() {
      this.i++;
      if (this.i % 2 == 0 && this.i < 10) {
         class06889 class06889 = this.N.u(1.0F).u();
         class06889.y((float) (-Math.PI / 4));
         double d0 = this.N.L.method_23317();
         double d1 = this.N.L.method_23323(0.5);
         double d2 = this.N.L.method_23321();

         for (int ix = 0; ix < 8; ix++) {
            double d3 = d0 + this.N.method_59922().E() / 2.0;
            double d4 = d1 + this.N.method_59922().E() / 2.0;
            double d5 = d2 + this.N.method_59922().E() / 2.0;

            for (int j = 0; j < 6; j++) {
               this.N
                  .method_73183()
                  .method_8406(class00473.N(class07107.Z, 1.0F), d3, d4, d5, -class06889.M * 0.08F * j, -class06889.B * 0.6F, -class06889.Z * 0.08F * j);
            }

            class06889.y((float) (Math.PI / 16));
         }
      }
   }

   @Override
   public void N(class04782 var1) {
      this.i++;
      if (this.i >= 200) {
         if (this.R >= 4) {
            this.N.W().N(class00702.i);
         } else {
            this.N.W().N(class00702.M);
         }
      } else if (this.i == 10) {
         class06889 class06889 = new class06889(this.N.L.method_23317() - this.N.method_23317(), 0.0, this.N.L.method_23321() - this.N.method_23321()).u();
         float f = 5.0F;
         double d0 = this.N.L.method_23317() + class06889.M * 5.0 / 2.0;
         double d1 = this.N.L.method_23321() + class06889.Z * 5.0 / 2.0;
         double d2 = this.N.L.method_23323(0.5);
         double d3 = d2;
         class07218 class07218 = new class07218(d0, d2, d1);

         while (var1.R(class07218)) {
            if (--d3 < 0.0) {
               d3 = d2;
               break;
            }

            class07218.N(d0, d3, d1);
         }

         d3 = class04995.N(d3) + 1;
         this.M = new class07048(var1, d0, d3, d1);
         this.M.N(this.N);
         this.M.N(5.0F);
         this.M.N(200);
         this.M.N(class00473.N(class07107.Z, 1.0F));
         this.M.y(0.25F);
         this.M.N(new class07055(class07047.M));
         var1.method_8649(this.M);
      }
   }
}
