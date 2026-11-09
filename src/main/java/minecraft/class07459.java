package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07459 extends class07473 {
   public static final int N = 8;
   public static final int y = 4;
   public static final int L = 3;
   private final class07633 u;
   @Nullable
   private class07633 i;
   private final double R;
   private int M;

   @Override
   public void L() {
      this.M = 0;
   }

   public class07459(class07633 var1, double var2) {
      super();
      this.u = var1;
      this.R = var2;
   }

   @Override
   public void i() {
      if (--this.M <= 0) {
         this.M = this.N(10);
         this.u.f().N(this.i, this.R);
      }
   }

   @Override
   public void u() {
      this.i = null;
   }

   @Override
   public boolean y() {
      if (this.u.K() >= 0) {
         return false;
      } else if (!this.i.method_5805()) {
         return false;
      } else {
         double d0 = this.u.method_5858(this.i);
         return !(d0 < 9.0) && !(d0 > 256.0);
      }
   }

   @Override
   public boolean N() {
      if (this.u.K() >= 0) {
         return false;
      } else {
         List<class07633> list = this.u.method_73183().N((Class<class07633>)this.u.getClass(), this.u.method_5829().L(8.0, 4.0, 8.0));
         class07633 class07633x = null;
         double d0 = Double.MAX_VALUE;

         for (class07633 class07633x : list) {
            if (class07633x.K() >= 0) {
               double d1 = this.u.method_5858(class07633x);
               if (!(d1 > d0)) {
                  d0 = d1;
                  class07633x = class07633x;
               }
            }
         }

         if (class07633x == null) {
            return false;
         } else if (d0 < 9.0) {
            return false;
         } else {
            this.i = class07633x;
            return true;
         }
      }
   }
}
