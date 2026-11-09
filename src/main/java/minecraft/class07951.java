package minecraft;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

public class class07951 extends class07473 {
   public final class00683 N;
   private double y;
   private static final int L = 8;
   private int u;

   public class07951(class00683 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public void i() {
      if (this.N.yi()) {
         if (!(this.N.yW() instanceof class00700)) {
            class00683 class00683 = this.N.yR();
            double d0 = this.N.method_5739(class00683);
            float f = 2.0F;
            class06889 class06889 = new class06889(
                  class00683.method_23317() - this.N.method_23317(),
                  class00683.method_23318() - this.N.method_23318(),
                  class00683.method_23321() - this.N.method_23321()
               )
               .u()
               .L(Math.max(d0 - 2.0, 0.0));
            this.N.f().N(this.N.method_23317() + class06889.M, this.N.method_23318() + class06889.B, this.N.method_23321() + class06889.Z, this.y);
         }
      }
   }

   @Override
   public void u() {
      this.N.yL();
      this.y = 2.1;
   }

   @Override
   public boolean y() {
      if (this.N.yi() && this.N.yR().method_5805() && this.N(this.N, 0)) {
         if (this.N.method_5858(this.N.yR()) > 676.0) {
            if (this.y <= 3.0) {
               this.y *= 1.2;
               this.u = y(40);
               return true;
            }

            if (this.u == 0) {
               return false;
            }
         }

         if (this.u > 0) {
            this.u--;
         }

         return true;
      } else {
         return false;
      }
   }

   private List N(class07299 var1, class07049 var2, class00734 var3, Predicate var4) {
      return var1.N(class00683.class, var3, var1x -> var1x != var2);
   }

   private boolean N(class00683 var1, int var2) {
      if (var2 > 8) {
         return false;
      } else if (var1.yi()) {
         return var1.yR().g_() ? true : this.N(var1.yR(), ++var2);
      } else {
         return false;
      }
   }

   @Override
   public boolean N() {
      if (!this.N.g_() && !this.N.yi()) {
         class07299 class07299 = this.N.method_73183();
         class00683 class00683 = this.N;
         class00734 class00734 = this.N.method_5829().L(9.0, 4.0, 9.0);
         Predicate predicate = var0 -> {
            class07078<?> class07078 = var0.method_5864();
            return class07078 == class07078.NQ || class07078 == class07078.yJ;
         };
         class00734 class00734x = class00734;
         class00683 class00683x = class00683;
         class07299 class07299x = class07299;
         List list = this.N(class07299x, class00683x, class00734x, predicate);
         class00683 class00683xx = null;
         double d0 = Double.MAX_VALUE;

         for (class07049 class07049x : list) {
            class00683 class00683xxx = (class00683)class07049x;
            if (class00683xxx.yi() && !class00683xxx.yu()) {
               double d1 = this.N.method_5858(class00683xxx);
               if (!(d1 > d0)) {
                  d0 = d1;
                  class00683xx = class00683xxx;
               }
            }
         }

         if (class00683xx == null) {
            for (class07049 class07049x : list) {
               class00683 class00683xxx = (class00683)class07049x;
               if (class00683xxx.g_() && !class00683xxx.yu()) {
                  double d2 = this.N.method_5858(class00683xxx);
                  if (!(d2 > d0)) {
                     d0 = d2;
                     class00683xx = class00683xxx;
                  }
               }
            }
         }

         if (class00683xx == null) {
            return false;
         } else if (d0 < 4.0) {
            return false;
         } else if (!class00683xx.g_() && !this.N(class00683xx, 1)) {
            return false;
         } else {
            this.N.N(class00683xx);
            return true;
         }
      } else {
         return false;
      }
   }
}
