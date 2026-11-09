package minecraft;

import java.util.List;

public class class08591 extends class07486 {
   public class08591(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.yu, var1, var2, var4, var6, var8);
   }

   public class08591(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.yu, var1, var2, var3);
   }

   public class08591(class07078<? extends class08591> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public void N(class04782 var1, class06584 var2, class07089 var3) {
      class06517 class06517 = var2.a_(class02484.h, class06517.N);
      float f = var2.a_(class02484.r, 1.0F);
      Iterable<class07055> iterable = class06517.N();
      class00734 class00734x = this.method_5829().L(var3.y().u(this.method_73189()));
      class00734 class00734x = class00734x.L(4.0, 2.0, 4.0);
      List<class07438> list = this.method_73183().N(class07438.class, class00734x);
      float f1 = class08038.N(this);
      if (!list.isEmpty()) {
         class07049 class07049 = this.P();

         for (class07438 class07438 : list) {
            if (class07438.method_6086()) {
               double d0 = class00734x.u(class07438.method_5829().M(f1));
               if (d0 < 16.0) {
                  double d1 = 1.0 - Math.sqrt(d0) / 4.0;

                  for (class07055 class07055x : iterable) {
                     class03556<class07084> class03556 = class07055x.L();
                     if (class03556.N().N()) {
                        class03556.N().N(var1, this, this.z(), class07438, class07055x.i(), d1);
                     } else {
                        int i = class07055x.N(var3x -> (int)(d1 * var3x * f + 0.5));
                        class07055 class07055x = new class07055(class03556, i, class07055x.i(), class07055x.R(), class07055x.M());
                        if (!class07055x.N(20)) {
                           class07438.method_37222(class07055x, class07049);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   protected class06581 N() {
      return class06570.lO;
   }
}
