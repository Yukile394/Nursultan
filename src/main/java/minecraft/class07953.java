package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class07953 extends class07473 {
   private static final int N = 0;
   private static final int y = 1;
   private static final int L = 2;
   protected final class07079 i;
   protected final boolean R;
   private final boolean u;
   private int Z;
   private int z;
   private int U;
   @Nullable
   protected class07438 M;
   protected int B = 60;

   public class07953 L(int var1) {
      this.B = var1;
      return this;
   }

   @Override
   public void L() {
      this.Z = 0;
      this.z = 0;
      this.U = 0;
   }

   public class07953(class07079 var1, boolean var2) {
      this(var1, var2, false);
   }

   public class07953(class07079 var1, boolean var2, boolean var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.u = var3;
   }

   protected double Z() {
      return this.i.method_45325(class05298.P);
   }

   @Override
   public void u() {
      this.i.y(null);
      this.M = null;
   }

   @Override
   public boolean y() {
      class07438 class07438 = this.i.T();
      if (class07438 == null) {
         class07438 = this.M;
      }

      if (class07438 == null) {
         return false;
      } else if (!this.i.method_18395(class07438)) {
         return false;
      } else {
         class00502 class00502x = this.i.method_5781();
         class00502 class00502x = class07438.method_5781();
         if (class00502x != null && class00502x == class00502x) {
            return false;
         } else {
            double d0 = this.Z();
            if (this.i.method_5858(class07438) > d0 * d0) {
               return false;
            } else {
               if (this.R) {
                  if (this.i.C().N(class07438)) {
                     this.U = 0;
                  } else if (++this.U > y(this.B)) {
                     return false;
                  }
               }

               this.i.y(class07438);
               return true;
            }
         }
      }
   }

   private boolean N(class07438 var1) {
      this.z = y(10 + this.i.method_59922().y(5));
      class00143 class00143 = this.i.f().N(var1, 0);
      if (class00143 == null) {
         return false;
      } else {
         class01763 class01763 = class00143.u();
         if (class01763 == null) {
            return false;
         } else {
            int ix = class01763.N - var1.method_31477();
            int j = class01763.L - var1.method_31479();
            return ix * ix + j * j <= 2.25;
         }
      }
   }

   protected boolean N(@Nullable class07438 var1, class01328 var2) {
      if (var1 == null) {
         return false;
      } else if (!var2.N(N(this.i), this.i, var1)) {
         return false;
      } else if (!this.i.L(var1.method_24515())) {
         return false;
      } else {
         if (this.u) {
            if (--this.z <= 0) {
               this.Z = 0;
            }

            if (this.Z == 0) {
               this.Z = this.N(var1) ? 1 : 2;
            }

            if (this.Z == 2) {
               return false;
            }
         }

         return true;
      }
   }
}
