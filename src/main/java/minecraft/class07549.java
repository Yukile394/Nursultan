package minecraft;

import Nursultan.class10719;
import Nursultan.class10725;
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07549 extends class07150 {
   protected static final int y = 80;
   private static final class02131<Boolean> N = class03289.N(class07549.class, class02154.U);
   private static final class02131<Integer> u = class03289.N(class07549.class, class02154.y);
   private float i;
   private float R;
   private float M;
   private float B;
   private float Z;
   @Nullable
   private class07438 W;
   private int T;
   private boolean b;
   @Nullable
   protected class07978 L;

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (u.equals(var1)) {
         this.T = 0;
         this.W = null;
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
      var1.N(u, 0);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (!this.m() && !var2.N(class03696.G) && !var2.N(class03683.p)) {
         class07049 class07049 = var2.L();
         if (class07049 instanceof class07438) {
            ((class07438)class07049).method_64397(var1, this.method_48923().u(this), 2.0F);
         }
      }

      if (this.L != null) {
         this.L.Z();
      }

      return super.method_64397(var1, var2, var3);
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   public class07549(class07078<? extends class07549> var1, class07299 var2) {
      super(var1, var2);
      this.J = 10;
      this.N(class04425.field_18, 0.0F);
      this.q = new class10725(this);
      this.i = this.field_5974.z();
      this.R = this.i;
   }

   public int B() {
      return 80;
   }

   public float i(float var1) {
      return class04995.B(var1, this.Z, this.B);
   }

   @Override
   protected class04891 s() {
      return this.method_5799() ? class04909.mM : class04909.mB;
   }

   @Nullable
   public class07438 n() {
      if (!this.v()) {
         return null;
      } else if (this.method_73183().method_8608()) {
         if (this.W != null) {
            return this.W;
         } else {
            class07049 class07049 = this.method_73183().method_8469(this.field_6011.N(u));
            if (class07049 instanceof class07438) {
               this.W = (class07438)class07049;
               return this.W;
            } else {
               return null;
            }
         }
      } else {
         return this.T();
      }
   }

   public boolean m() {
      return this.field_6011.N(N);
   }

   public float t() {
      return this.T;
   }

   public boolean v() {
      return this.field_6011.N(u) != 0;
   }

   public float u(float var1) {
      return class04995.B(var1, this.R, this.i);
   }

   protected class04891 E() {
      return class04909.mE;
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return var2.method_8316(var1).N(class01231.N) ? 10.0F + var2.B(var1) : super.N(var1, var2);
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this);
   }

   void N(int var1) {
      this.field_6011.N(u, var1);
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class07639(this, var1);
   }

   public void N(boolean var1) {
      this.field_6011.N(N, var1);
   }

   public static boolean N(class07078<? extends class07549> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return (var4.y(20) == 0 || !var1.M(var3))
         && var1.y() != class07086.field_5801
         && (class06113.N(var2) || var1.method_8316(var3).N(class01231.N))
         && var1.method_8316(var3.method_10074()).N(class01231.N);
   }

   public static class05300 W() {
      return class07150.Y().N(class05298.u, 6.0).N(class05298.l, 0.5).N(class05298.n, 30.0);
   }

   public float R(float var1) {
      return (this.T + var1) / this.B();
   }

   @Override
   public int Ni() {
      return 180;
   }

   @Override
   public int m_() {
      return 160;
   }

   @Override
   protected void l_() {
      class07976 class07976 = new class07976(this, 1.0);
      this.L = new class07978(this, 1.0, 80);
      this.e.N(4, new class07559(this));
      this.e.N(5, class07976);
      this.e.N(7, this.L);
      this.e.N(8, new class07962(this, class08036.class, 8.0F));
      this.e.N(8, new class07962(this, class07549.class, 12.0F, 0.01F));
      this.e.N(9, new class07956(this));
      this.L.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
      class07976.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
      this.H.N(1, new class07952<>(this, class07438.class, 10, true, false, new class10719(this)));
   }

   @Override
   public class04891 method_6002() {
      return this.method_5799() ? class04909.mz : class04909.mU;
   }

   @Override
   public void method_6007() {
      if (this.method_5805()) {
         if (this.method_73183().method_8608()) {
            this.R = this.i;
            if (!this.method_5799()) {
               this.M = 2.0F;
               class06889 class06889x = this.method_18798();
               if (class06889x.B > 0.0 && this.b && !this.method_5701()) {
                  this.method_73183()
                     .method_8486(this.method_23317(), this.method_23318(), this.method_23321(), this.E(), this.method_5634(), 1.0F, 1.0F, false);
               }

               this.b = class06889x.B < 0.0 && this.method_73183().method_8515(this.method_24515().method_10074(), this);
            } else if (this.m()) {
               if (this.M < 0.5F) {
                  this.M = 4.0F;
               } else {
                  this.M = this.M + (0.5F - this.M) * 0.1F;
               }
            } else {
               this.M = this.M + (0.125F - this.M) * 0.2F;
            }

            this.i = this.i + this.M;
            this.Z = this.B;
            if (!this.method_5799()) {
               this.B = this.field_5974.z();
            } else if (this.m()) {
               this.B = this.B + (0.0F - this.B) * 0.25F;
            } else {
               this.B = this.B + (1.0F - this.B) * 0.06F;
            }

            if (this.m() && this.method_5799()) {
               class06889 class06889 = this.method_5828(0.0F);

               for (int ix = 0; ix < 2; ix++) {
                  this.method_73183()
                     .method_8406(
                        class07107.u,
                        this.method_23322(0.5) - class06889.M * 1.5,
                        this.method_23319() - class06889.B * 1.5,
                        this.method_23325(0.5) - class06889.Z * 1.5,
                        0.0,
                        0.0,
                        0.0
                     );
               }
            }

            if (this.v()) {
               if (this.T < this.B()) {
                  this.T++;
               }

               class07438 class07438 = this.n();
               if (class07438 != null) {
                  this.p().N(class07438, 90.0F, 90.0F);
                  this.p().N();
                  double d5 = this.R(0.0F);
                  double d0 = class07438.method_23317() - this.method_23317();
                  double d1 = class07438.method_23323(0.5) - this.method_23320();
                  double d2 = class07438.method_23321() - this.method_23321();
                  double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                  d0 /= d3;
                  d1 /= d3;
                  d2 /= d3;
                  double d4 = this.field_5974.U();

                  while (d4 < d3) {
                     d4 += 1.8 - d5 + this.field_5974.U() * (1.7 - d5);
                     this.method_73183()
                        .method_8406(class07107.u, this.method_23317() + d0 * d4, this.method_23320() + d1 * d4, this.method_23321() + d2 * d4, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.method_5799()) {
            this.method_5855(300);
         } else if (this.method_24828()) {
            this.method_18799(this.method_18798().y((this.field_5974.z() * 2.0F - 1.0F) * 0.4F, 0.5, (this.field_5974.z() * 2.0F - 1.0F) * 0.4F));
            this.method_36456(this.field_5974.z() * 360.0F);
            this.method_24830(false);
            this.field_64356 = true;
         }

         if (this.v()) {
            this.method_36456(super.fields_4212a028292fd3c078969e3ee4c71d9e8_2);
         }
      }

      super.method_6007();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.method_5799() ? class04909.mW : class04909.mm;
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(0.1F, var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
      if (!this.m() && this.T() == null) {
         this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
      }
   }
}
