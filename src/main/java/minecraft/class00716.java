package minecraft;

public class class00716 extends class00685 {
   private static final int y = 100;
   private static final int L = 10;
   private static final int u = 20;
   private static final int i = 150;
   private static final class01328 R = class01328.N().N(150.0);
   private final class01328 M;
   private int B;

   @Override
   public void L() {
      this.B = 0;
   }

   public class00716(class00690 var1) {
      super(var1);
      this.M = class01328.N().N(20.0).N((var1x, var2) -> Math.abs(var1x.method_23318() - var1.method_23318()) <= 10.0);
   }

   @Override
   public class00702<class00716> B() {
      return class00702.M;
   }

   @Override
   public void N(class04782 var1) {
      this.B++;
      class08036 class08036 = var1.N(this.M, this.N, this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
      if (class08036 != null) {
         if (this.B > 25) {
            this.N.W().N(class00702.B);
         } else {
            class06889 class06889 = new class06889(class08036.method_23317() - this.N.method_23317(), 0.0, class08036.method_23321() - this.N.method_23321())
               .u();
            float f = (float)(
                  Math.acos(
                        (float)new class06889(
                              class04995.m(this.N.method_36454() * (float) (Math.PI / 180.0)),
                              0.0,
                              -class04995.P(this.N.method_36454() * (float) (Math.PI / 180.0))
                           )
                           .u()
                           .y(class06889)
                     )
                     * 180.0F / (float)Math.PI
               )
               + 0.5F;
            if (f < 0.0F || f > 10.0F) {
               double d0 = class08036.method_23317() - this.N.L.method_23317();
               double d1 = class08036.method_23321() - this.N.L.method_23321();
               double d2 = class04995.N(class04995.i(180.0 - class04995.u(d0, d1) * 180.0F / (float)Math.PI - this.N.method_36454()), -100.0, 100.0);
               this.N.Z *= 0.8F;
               float f1 = (float)Math.sqrt(d0 * d0 + d1 * d1) + 1.0F;
               float f2 = f1;
               if (f1 > 40.0F) {
                  f1 = 40.0F;
               }

               this.N.Z += (float)d2 * (0.7F / f1 / f2);
               this.N.method_36456(this.N.method_36454() + this.N.Z);
            }
         }
      } else if (this.B >= 100) {
         class08036 = var1.N(R, this.N, this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
         this.N.W().N(class00702.i);
         if (class08036 != null) {
            this.N.W().N(class00702.Z);
            this.N.W().y(class00702.Z).N(new class06889(class08036.method_23317(), class08036.method_23318(), class08036.method_23321()));
         }
      }
   }
}
