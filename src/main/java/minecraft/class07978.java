package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07978 extends class07473 {
   public static final int N = 120;
   protected final class07475 y;
   protected double L;
   protected double u;
   protected double i;
   protected final double R;
   protected int M;
   protected boolean B;
   private final boolean Z;

   public void L(int var1) {
      this.M = var1;
   }

   @Override
   public void L() {
      this.y.f().N(this.L, this.u, this.i, this.R);
   }

   @Nullable
   protected class06889 M() {
      return class05475.N(this.y, 10, 7);
   }

   public class07978(class07475 var1, double var2) {
      this(var1, var2, 120);
   }

   public class07978(class07475 var1, double var2, int var4) {
      this(var1, var2, var4, true);
   }

   public class07978(class07475 var1, double var2, int var4, boolean var5) {
      super();
      this.y = var1;
      this.R = var2;
      this.M = var4;
      this.Z = var5;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   public void Z() {
      this.B = true;
   }

   @Override
   public void u() {
      this.y.f().W();
      super.u();
   }

   @Override
   public boolean y() {
      return !this.y.f().U() && !this.y.method_42148();
   }

   @Override
   public boolean N() {
      if (this.y.method_42148()) {
         return false;
      } else {
         if (!this.B) {
            if (this.Z && this.y.method_6131() >= 100) {
               return false;
            }

            if (this.y.method_59922().y(y(this.M)) != 0) {
               return false;
            }
         }

         class06889 class06889 = this.M();
         if (class06889 == null) {
            return false;
         } else {
            this.L = class06889.M;
            this.u = class06889.B;
            this.i = class06889.Z;
            this.B = false;
            return true;
         }
      }
   }
}
