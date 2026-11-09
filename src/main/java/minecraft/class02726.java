package minecraft;

import Nursultan.class09880;
import com.mojang.datafixers.util.Pair;
import java.util.LinkedList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class02726 extends class02736 {
   public static final int y = 3;
   public static final double L = 0.1;
   public static final double u = 0.005;
   @Nullable
   private class02744 Z;
   private int z;
   private float U;
   private int E = 0;
   public final List<class02769> i = new LinkedList<>();
   public final List<class02769> R = new LinkedList<>();
   public double M = 0.0;
   public class02769 B = class02769.M;

   public float L(float var1) {
      class02744 class02744 = this.M(var1);
      return class04995.Z(class02744.N(), class02744.L().u(), class02744.y().u());
   }

   private class02744 M(float var1) {
      if (var1 == this.U && this.E == this.z && this.Z != null) {
         return this.Z;
      } else {
         float f = (3 - this.E + var1) / 3.0F;
         float f1 = 0.0F;
         float f2 = 1.0F;
         boolean flag = false;

         int ix;
         for (ix = 0; ix < this.R.size(); ix++) {
            float f3 = this.R.get(ix).i();
            if (!(f3 <= 0.0F)) {
               f1 += f3;
               if (f1 >= this.M * f) {
                  float f4 = f1 - f3;
                  f2 = (float)((f * this.M - f4) / f3);
                  flag = true;
                  break;
               }
            }
         }

         if (!flag) {
            ix = this.R.size() - 1;
         }

         class02769 class02769x = this.R.get(ix);
         class02769 class02769x = ix > 0 ? this.R.get(ix - 1) : this.B;
         this.Z = new class02744(f2, class02769x, class02769x);
         this.z = this.E;
         this.U = var1;
         return this.Z;
      }
   }

   public boolean P() {
      return !this.R.isEmpty();
   }

   public class02726(class07504 var1) {
      super(var1);
   }

   public class06889 i(float var1) {
      class02744 class02744 = this.M(var1);
      return class04995.N(class02744.N(), class02744.L().N(), class02744.y().N());
   }

   private class06889 i(class06889 var1) {
      if (this.N.method_31483() instanceof class04770 class04770) {
         class06889 class06889 = class04770.method_63563();
         if (class06889.B() > 0.0) {
            class06889 class06889x = class06889.u();
            double d0 = var1.z();
            if (class06889x.B() > 0.0 && d0 < 0.01) {
               return var1.i(new class06889(class06889x.M, 0.0, class06889x.Z).u().L(0.001));
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private void s() {
      if (--this.E <= 0) {
         this.m();
         this.R.clear();
         if (!this.i.isEmpty()) {
            this.R.addAll(this.i);
            this.i.clear();
            this.M = 0.0;

            for (class02769 class02769 : this.R) {
               this.M = this.M + class02769.i();
            }

            this.E = this.M == 0.0 ? 0 : 3;
         }
      }

      if (this.P()) {
         this.L(this.i(1.0F));
         this.y(this.R(1.0F));
         this.N(this.L(1.0F));
         this.y(this.u(1.0F));
      }
   }

   public void m() {
      this.B = new class02769(this.R(), this.i(), this.U(), this.z(), 0.0F);
   }

   public float u(float var1) {
      class02744 class02744 = this.M(var1);
      return class04995.Z(class02744.N(), class02744.L().L(), class02744.y().L());
   }

   @Override
   public boolean u() {
      boolean flag = this.N(this.N.method_5829().L(0.2, 0.0, 0.2));
      if (!this.N.field_5976 && !this.N.field_5992) {
         return false;
      } else {
         boolean flag1 = this.y(this.N.method_5829().M(1.0E-7));
         return flag && !flag1;
      }
   }

   public boolean y(class00734 var1) {
      boolean flag = false;
      if (this.N.Z()) {
         List<class07049> list = this.L().method_8333(this.N, var1, class07042.N(this.N));
         if (!list.isEmpty()) {
            for (class07049 class07049x : list) {
               if (class07049x instanceof class08036
                  || class07049x instanceof class07625
                  || class07049x instanceof class07504
                  || this.N.method_5782()
                  || class07049x.method_5765()) {
                  class07049x.method_5697(this.N);
                  flag = true;
               }
            }
         }
      } else {
         for (class07049 class07049x : this.L().N_70(this.N, var1)) {
            if (!this.N.method_5626(class07049x) && class07049x.method_5810() && class07049x instanceof class07504) {
               class07049x.method_5697(this.N);
               flag = true;
            }
         }
      }

      return flag;
   }

   @Override
   public double y(class04782 var1) {
      return var1.method_64395().N(class07305.Y).intValue() * (this.N.method_5799() ? 0.5 : 1.0) / 20.0;
   }

   private boolean y(class06889 var1, class08080 var2) {
      return switch (var2) {
         case field_12667 -> var1.M < 0.0;
         case field_12666 -> var1.M > 0.0;
         case field_12670 -> var1.Z > 0.0;
         case field_12668 -> var1.Z < 0.0;
         default -> false;
      };
   }

   @Override
   public void y() {
      if (this.L() instanceof class04782 class04782) {
         class07209 class07209 = this.N.L();
         class00500 class00500 = this.L().method_8320(class07209);
         if (this.N.y()) {
            this.N.N(class07760.U(class00500));
            this.N(class07209, class00500, true);
         }

         this.N.method_56990();
         this.N.y(class04782);
      } else {
         this.s();
         boolean flag = class07760.U(this.L().method_8320(this.N.L()));
         this.N.N(flag);
      }
   }

   public void N(class07209 var1, class00500 var2, boolean var3) {
      if (class07760.U(var2)) {
         class08080 class08080 = var2.L(((class07760)var2.i()).L());
         Pair<class00753, class00753> pair = class07504.N(class08080);
         class06889 class06889xxxxxxxxxxx = new class06889((class00753)pair.getFirst()).L(0.5);
         class06889 class06889x = new class06889((class00753)pair.getSecond()).L(0.5);
         class06889 class06889xx = class06889xxxxxxxxxxx.R();
         class06889 class06889xxx = class06889x.R();
         if (this.i().M() > 1.0E-5F && this.i().y(class06889xx) < this.i().y(class06889xxx) || this.y(class06889xxx, class08080)) {
            class06889 class06889xxxx = class06889xx;
            class06889xx = class06889xxx;
            class06889xxx = class06889xxxx;
         }

         float f = 180.0F - (float)(Math.atan2(class06889xx.Z, class06889xx.M) * 180.0 / Math.PI);
         f += this.N.u() ? 180.0F : 0.0F;
         class06889 class06889xxxx = this.R();
         class06889 class06889xxxxx;
         if (class06889xxxxxxxxxxx.N() != class06889x.N() && class06889xxxxxxxxxxx.L() != class06889x.L()) {
            class06889 class06889xxxxxx = class06889x.u(class06889xxxxxxxxxxx);
            class06889 class06889xxxxxxx = class06889xxxx.u(var1.method_61082()).u(class06889xxxxxxxxxxx);
            class06889 class06889xxxxxxxx = class06889xxxxxx.L(class06889xxxxxx.y(class06889xxxxxxx) / class06889xxxxxx.y(class06889xxxxxx));
            class06889xxxxx = var1.method_61082().i(class06889xxxxxxxxxxx).i(class06889xxxxxxxx);
            f = 180.0F - (float)(Math.atan2(class06889xxxxxxxx.Z, class06889xxxxxxxx.M) * 180.0 / Math.PI);
            f += this.N.u() ? 180.0F : 0.0F;
         } else {
            boolean flag = class06889xxxxxxxxxxx.u(class06889x).M != 0.0;
            boolean flag1 = class06889xxxxxxxxxxx.u(class06889x).Z != 0.0;
            class06889xxxxx = new class06889(
               flag1 ? var1.method_46558().M : class06889xxxx.M, var1.method_10264(), flag ? var1.method_46558().Z : class06889xxxx.Z
            );
         }

         class06889 class06889xxxxxx = class06889xxxxx.u(class06889xxxx);
         this.L(class06889xxxx.i(class06889xxxxxx));
         float f1 = 0.0F;
         boolean flag2 = class06889xxxxxxxxxxx.y() != class06889x.y();
         if (flag2) {
            class06889 class06889xxxxxxx = var1.method_61082().i(class06889xxx);
            double d0 = class06889xxxxxxx.R(this.R());
            this.L(this.R().y(0.0, d0 + 0.1, 0.0));
            f1 = this.N.u() ? 45.0F : -45.0F;
         } else {
            this.L(this.R().y(0.0, 0.1, 0.0));
         }

         this.N(f, f1);
         double d1 = class06889xxxx.R(this.R());
         if (d1 > 0.0) {
            this.i.add(new class02769(this.R(), this.i(), this.U(), this.z(), var3 ? 0.0F : (float)d1));
         }
      }
   }

   @Override
   public double N(class07209 var1, class08080 var2, double var3) {
      if (var3 < 1.0E-5F) {
         return 0.0;
      } else {
         class06889 class06889xxxxxx = this.R();
         Pair<class00753, class00753> pair = class07504.N(var2);
         class00753 class00753x = (class00753)pair.getFirst();
         class00753 class00753x = (class00753)pair.getSecond();
         class06889 class06889x = this.i().R();
         if (class06889x.M() < 1.0E-5F) {
            this.y(class06889.L);
            return 0.0;
         } else {
            boolean flag = class00753x.method_10264() != class00753x.method_10264();
            class06889 class06889xx = new class06889(class00753x).L(0.5).R();
            class06889 class06889xxx = new class06889(class00753x).L(0.5).R();
            if (class06889x.y(class06889xxx) < class06889x.y(class06889xx)) {
               class06889xxx = class06889xx;
            }

            class06889 class06889xxxx = var1.method_61082().i(class06889xxx).y(0.0, 0.1, 0.0).i(class06889xxx.u().L(1.0E-5F));
            if (flag && !this.y(class06889x, var2)) {
               class06889xxxx = class06889xxxx.y(0.0, 1.0, 0.0);
            }

            class06889 class06889xxxxx = class06889xxxx.u(this.R()).u();
            class06889x = class06889xxxxx.L(class06889x.M() / class06889xxxxx.Z());
            class06889 class06889xxxxxx = class06889xxxxxx.i(class06889x.u().L(var3 * (flag ? class04995.M : 1.0F)));
            if (class06889xxxxxx.M(class06889xxxx) <= class06889xxxxxx.M(class06889xxxxxx)) {
               var3 = class06889xxxx.u(class06889xxxxxx).Z();
               class06889xxxxxx = class06889xxxx;
            } else {
               var3 = 0.0;
            }

            this.N.method_5784(class07451.field_6308, class06889xxxxxx.u(class06889xxxxxx));
            class00500 class00500 = this.L().method_8320(class07209.method_49638(class06889xxxxxx));
            if (flag) {
               if (class07760.U(class00500)) {
                  class08080 class08080 = class00500.L(((class07760)class00500.i()).L());
                  if (this.N(var2, class08080)) {
                     return 0.0;
                  }
               }

               double d1 = class06889xxxx.R().R(this.R().R());
               double d0 = class06889xxxx.B + (this.y(class06889x, var2) ? d1 : -d1);
               if (this.R().B < d0) {
                  this.y(this.R().M, d0, this.R().Z);
               }
            }

            if (this.R().R(class06889xxxxxx) < 1.0E-5F && class06889xxxxxx.R(class06889xxxxxx) > 1.0E-5F) {
               this.y(class06889.L);
               return 0.0;
            } else {
               this.y(class06889x);
               return var3;
            }
         }
      }
   }

   private boolean N(class08080 var1, class08080 var2) {
      if (this.i().B() < 0.005 && var2.y() && this.y(this.i(), var1) && !this.y(this.i(), var2)) {
         this.y(class06889.L);
         return true;
      } else {
         return false;
      }
   }

   public boolean N(class00734 var1) {
      if (this.N.Z() && !this.N.method_5782()) {
         List<class07049> list = this.L().method_8333(this.N, var1, class07042.N(this.N));
         if (!list.isEmpty()) {
            for (class07049 class07049 : list) {
               if (!(class07049 instanceof class08036)
                  && !(class07049 instanceof class07625)
                  && !(class07049 instanceof class07504)
                  && !this.N.method_5782()
                  && !class07049.method_5765()
                  && class07049.method_5804(this.N)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private class06889 N(class04782 var1, class06889 var2, class09880 var3, class07209 var4, class00500 var5, class08080 var6) {
      class06889 class06889xxxx = var2;
      if (!var3.L) {
         class06889 class06889x = this.N(var2, var6);
         if (class06889x.z() != var2.z()) {
            var3.L = true;
            class06889xxxx = class06889x;
         }
      }

      if (var3.y) {
         class06889 class06889x = this.i(class06889xxxx);
         if (class06889x.z() != class06889xxxx.z()) {
            var3.u = true;
            class06889xxxx = class06889x;
         }
      }

      if (!var3.u) {
         class06889 class06889x = this.N(class06889xxxx, var5);
         if (class06889x.z() != class06889xxxx.z()) {
            var3.u = true;
            class06889xxxx = class06889x;
         }
      }

      if (var3.y) {
         class06889xxxx = this.N.N(class06889xxxx);
         if (class06889xxxx.B() > 0.0) {
            double d0 = Math.min(class06889xxxx.M(), this.N.N_73(var1));
            class06889xxxx = class06889xxxx.u().L(d0);
         }
      }

      if (!var3.i) {
         class06889 class06889x = this.N(class06889xxxx, var4, var5);
         if (class06889x.z() != class06889xxxx.z()) {
            var3.i = true;
            class06889xxxx = class06889x;
         }
      }

      return class06889xxxx;
   }

   private class06889 N(class06889 var1, class08080 var2) {
      double d0 = Math.max(0.0078125, var1.Z() * 0.02);
      if (this.N.method_5799()) {
         d0 *= 0.2;
      }
      return switch (var2) {
         case field_12667 -> var1.y(-d0, 0.0, 0.0);
         case field_12666 -> var1.y(d0, 0.0, 0.0);
         case field_12670 -> var1.y(0.0, 0.0, d0);
         case field_12668 -> var1.y(0.0, 0.0, -d0);
         default -> var1;
      };
   }

   private void N(float var1, float var2) {
      double d0 = Math.abs(var1 - this.U());
      if (d0 >= 175.0 && d0 <= 185.0) {
         this.N.y(!this.N.u());
         var1 -= 180.0F;
         var2 *= -1.0F;
      }

      var2 = Math.clamp(var2, -45.0F, 45.0F);
      this.N(var2 % 360.0F);
      this.y(var1 % 360.0F);
   }

   @Override
   public void N(class04782 var1) {
      for (class09880 class09880 = new class09880(); class09880.N() && this.N.method_5805(); class09880.y = false) {
         class06889 class06889xxx = this.i();
         class07209 class07209 = this.N.L();
         class00500 class00500 = this.L().method_8320(class07209);
         boolean flag = class07760.U(class00500);
         if (this.N.method_52172() != flag) {
            this.N.N(flag);
            this.N(class07209, class00500, false);
         }

         if (flag) {
            this.N.method_38785();
            this.N.method_22862();
            if (class00500.N(class00869.Bh)) {
               this.N.N(var1, class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), class00500.L(class06900.u));
            }

            class08080 class08080 = class00500.L(((class07760)class00500.i()).L());
            class06889 class06889x = this.N(var1, class06889xxx.R(), class09880, class07209, class00500, class08080);
            if (class09880.y) {
               class09880.N = class06889x.Z();
            } else {
               class09880.N = class09880.N + (class06889x.Z() - class06889xxx.Z());
            }

            this.y(class06889x);
            class09880.N = this.N.N(class07209, class08080, class09880.N);
         } else {
            this.N.L(var1);
            class09880.N = 0.0;
         }

         class06889 class06889x = this.R();
         class06889 class06889xx = class06889x.u(this.N.method_61411());
         double d0 = class06889xx.M();
         if (d0 > 1.0E-5F) {
            if (!(class06889xx.z() > 1.0E-5F)) {
               if (!this.N.method_52172()) {
                  this.N(this.N.method_24828() ? 0.0F : class04995.Z(0.2F, this.z(), 0.0F));
               }
            } else {
               float f = 180.0F - (float)(Math.atan2(class06889xx.Z, class06889xx.M) * 180.0 / Math.PI);
               float f1 = this.N.method_24828() && !this.N.method_52172()
                  ? 0.0F
                  : 90.0F - (float)(Math.atan2(class06889xx.Z(), class06889xx.B) * 180.0 / Math.PI);
               f += this.N.u() ? 180.0F : 0.0F;
               f1 *= this.N.u() ? -1.0F : 1.0F;
               this.N(f, f1);
            }

            this.i.add(new class02769(class06889x, this.i(), this.U(), this.z(), (float)Math.min(d0, this.y(var1))));
         } else if (class06889xxx.z() > 0.0) {
            this.i.add(new class02769(class06889x, this.i(), this.U(), this.z(), 1.0F));
         }

         if (d0 > 1.0E-5F || class09880.y) {
            this.N.method_61409();
            this.N.method_61409();
         }
      }
   }

   private class06889 N(class06889 var1, class07209 var2, class00500 var3) {
      if (var3.N(class00869.yG) && var3.L(class06900.u)) {
         if (var1.M() > 0.01) {
            return var1.u().L(var1.M() + 0.06);
         } else {
            class06889 class06889 = this.N.N(var2);
            return class06889.B() <= 0.0 ? var1 : class06889.L(var1.M() + 0.2);
         }
      } else {
         return var1;
      }
   }

   private class06889 N(class06889 var1, class00500 var2) {
      if (var2.N(class00869.yG) && !var2.L(class06900.u)) {
         return var1.M() < 0.03 ? class06889.L : var1.L(0.5);
      } else {
         return var1;
      }
   }

   @Override
   public double W() {
      return this.N.method_5782() ? 0.997 : 0.975;
   }

   public class06889 R(float var1) {
      class02744 class02744 = this.M(var1);
      return class04995.N(class02744.N(), class02744.L().y(), class02744.y().y());
   }
}
