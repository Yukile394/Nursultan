package minecraft;

import Nursultan.class10866;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class08004 extends class07150 {
   private static final class01894 N = class01894.y("baby");
   private static final class07471 y = new class07471(N, 0.5, class07463.field_6330);
   private static final class01894 M = class01894.y("reinforcement_caller_charge");
   private static final class07471 B = new class07471(class01894.y("reinforcement_callee_charge"), -0.05F, class07463.field_6328);
   private static final class01894 Z = class01894.y("leader_zombie_bonus");
   private static final class01894 W = class01894.y("zombie_random_spawn_bonus");
   private static final class02131<Boolean> T = class03289.N(class08004.class, class02154.U);
   private static final class02131<Integer> b = class03289.N(class08004.class, class02154.y);
   private static final class02131<Boolean> X = class03289.N(class08004.class, class02154.U);
   public static final float L = 0.05F;
   public static final int u = 50;
   public static final int i = 40;
   public static final int R = 7;
   private static final int a = -1;
   private static final class01325 p = class07078.yx.E().N(0.5F).y(0.93F);
   private static final float F = 0.1F;
   private static final Predicate<class07086> A = var0 -> var0 == class07086.field_5807;
   private static final boolean f = false;
   private static final boolean C = false;
   private static final int S = 0;
   private final class07466 x = new class07466(this, A);
   private boolean D = false;
   private int h = 0;
   private int r;

   public void L(int var1) {
      this.h = var1;
   }

   protected void L(class04782 var1) {
      this.N(var1, class07078.X);
      if (!this.method_5701()) {
         var1.method_8444(null, 1040, this.method_24515(), 0);
      }
   }

   @Override
   public boolean L(class06584 var1) {
      return var1.N(class01226.Nw) && this.method_6109() && this.method_5765() ? false : super.L(var1);
   }

   public void M(boolean var1) {
      if (this.V.u()) {
         if (this.D != var1) {
            this.D = var1;
            this.V.y(var1);
            if (var1) {
               this.e.N(1, this.x);
            } else {
               this.e.N(this.x);
            }
         }
      } else if (this.D) {
         this.e.N(this.x);
         this.D = false;
      }
   }

   public boolean Q() {
      return this.D;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (T.equals(var1)) {
         this.method_18382();
      }

      super.method_5674(var1);
   }

   @Override
   public class07078<? extends class08004> method_5864() {
      return (class07078<? extends class08004>)super.method_5864();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(T, false);
      var1.N(b, 0);
      var1.N(X, false);
   }

   @Override
   public void method_5773() {
      if (this.method_73183() instanceof class04782 class04782 && this.method_5805() && !this.Nt()) {
         if (this.d()) {
            this.r--;
            if (this.r < 0) {
               this.L(class04782);
            }
         } else if (this.m()) {
            if (this.method_5777(class01231.N)) {
               this.h++;
               if (this.h >= 600) {
                  this.N(300);
               }
            } else {
               this.h = -1;
            }
         }
      }

      super.method_5773();
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (!super.method_64397(var1, var2, var3)) {
         return false;
      } else {
         class07438 class07438 = this.T();
         if (class07438 == null && var2.u() instanceof class07438) {
            class07438 = (class07438)var2.u();
         }

         if (class07438 != null && var1.y() == class07086.field_5807 && this.field_5974.z() < this.method_45325(class05298.Q) && var1.method_74962()) {
            int ix = class04995.N(this.method_23317());
            int j = class04995.N(this.method_23318());
            int k = class04995.N(this.method_23321());
            class07078<? extends class08004> class07078 = this.method_5864();
            class08004 class08004 = class07078.N(var1, class06113.field_16463);
            if (class08004 == null) {
               return true;
            }

            for (int l = 0; l < 50; l++) {
               int i1 = ix + class04995.N(this.field_5974, 7, 40) * class04995.N(this.field_5974, -1, 1);
               int j1 = j + class04995.N(this.field_5974, 7, 40) * class04995.N(this.field_5974, -1, 1);
               int k1 = k + class04995.N(this.field_5974, 7, 40) * class04995.N(this.field_5974, -1, 1);
               class07209 class07209 = new class07209(i1, j1, k1);
               if (class07448.N(class07078, var1, class07209) && class07448.N(class07078, var1, class06113.field_16463, class07209, var1.field_9229)) {
                  class08004.method_5814(i1, j1, k1);
                  if (!var1.N(i1, j1, k1, 7.0) && var1.method_8606(class08004) && var1.N(class08004) && (class08004.Y_() || !var1.u(class08004.method_5829()))) {
                     class08004.y(class07438);
                     class08004.N(var1, var1.method_8404(class08004.method_24515()), class06113.field_16463, null);
                     var1.y(class08004);
                     class07469 class07469 = this.method_5996(class05298.Q);
                     class07471 class07471 = class07469.N(M);
                     double d0 = class07471 != null ? class07471.y() : 0.0;
                     class07469.L(M);
                     class07469.u(new class07471(M, d0 - 0.05, class07463.field_6328));
                     class08004.method_5996(class05298.Q).u(B);
                     break;
                  }
               }
            }
         }

         return true;
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(this.X_(), 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("IsBaby", this.method_6109());
      var1.N("CanBreakDoors", this.Q());
      var1.N("InWaterTime", this.method_5799() ? this.h : -1);
      var1.N("DrownedConversionTime", this.d() ? this.r : -1);
   }

   @Override
   public boolean method_6109() {
      return this.method_5841().N(T);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y(var1.N("IsBaby", false));
      this.M(var1.N("CanBreakDoors", false));
      this.h = var1.N("InWaterTime", 0);
      int ix = var1.N("DrownedConversionTime", -1);
      if (ix != -1) {
         this.N(ix);
      } else {
         this.method_5841().N(X, false);
      }
   }

   @Override
   public boolean method_5874(class04782 var1, class07438 var2, class07072 var3) {
      boolean flag = super.method_5874(var1, var2, var3);
      if ((var1.y() == class07086.field_5802 || var1.y() == class07086.field_5807) && var2 instanceof class08041 class08041) {
         if (var1.y() != class07086.field_5807 && this.field_5974.Z()) {
            return flag;
         }

         if (this.N(var1, class08041)) {
            flag = false;
         }
      }

      return flag;
   }

   public class08004(class07299 var1) {
      this(class07078.yx, var1);
   }

   public class08004(class07078<? extends class08004> var1, class07299 var2) {
      super(var1, var2);
   }

   protected void B() {
      this.e.N(2, new class08161<>(this, 1.0, 1.0, 10.0F, 2.0F));
      this.e.N(3, new class07972(this, 1.0, false));
      this.e.N(6, new class07954(this, 1.0, true, 4, this::Q));
      this.e.N(7, new class07957(this, 1.0));
      this.H.N(1, new class07989(this).N(class07182.class));
      this.H.N(2, new class07952<>(this, class08036.class, true));
      this.H.N(3, new class07952<>(this, class06171.class, false));
      this.H.N(3, new class07952<>(this, class07625.class, true));
      this.H.N(5, new class07952<>(this, class07872.class, 10, true, false, class07872.y));
   }

   @Override
   protected class04891 s() {
      return class04909.Jo;
   }

   public static class05300 l() {
      return class07150.Y().N(class05298.P, 35.0).N(class05298.l, 0.23F).N(class05298.u, 3.0).N(class05298.y, 2.0).N(class05298.Q);
   }

   public boolean d() {
      return this.method_5841().N(X);
   }

   protected boolean m() {
      return true;
   }

   protected void u(float var1) {
      this.V_();
      this.method_5996(class05298.b).L(new class07471(k, this.field_5974.U() * 0.05F, class07463.field_6328));
      double d0 = this.field_5974.U() * 1.5 * var1;
      if (d0 > 1.0) {
         this.method_5996(class05298.P).L(new class07471(W, d0, class07463.field_6331));
      }

      if (this.field_5974.z() < var1 * 0.05F) {
         this.method_5996(class05298.Q).L(new class07471(Z, this.field_5974.U() * 0.25 + 0.5, class07463.field_6328));
         this.method_5996(class05298.n).L(new class07471(Z, this.field_5974.U() * 3.0 + 1.0, class07463.field_6331));
         this.M(true);
      }
   }

   public void u(int var1) {
      this.r = var1;
   }

   @Override
   public void y(boolean var1) {
      this.method_5841().N(T, var1);
      if (this.method_73183() != null && !this.method_73183().method_8608()) {
         class07469 class07469 = this.method_5996(class05298.l);
         class07469.L(N);
         if (var1) {
            class07469.y(y);
         }
      }
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      return var2.N(class06570.vU) ? false : super.y(var1, var2);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      var4 = super.N(var1, var2, var3, var4);
      float fx = var2.u();
      if (var3 != class06113.field_16468) {
         this.L(class06069.z() < 0.55F * fx);
      }

      if (var4 == null) {
         var4 = new class10866(N(class06069), true);
      }

      if (var4 instanceof class10866 class10866) {
         if (class10866.y) {
            this.y(true);
            if (class10866.L) {
               if (class06069.z() < 0.05) {
                  List<class07628> list = var1.N(class07628.class, this.method_5829().L(5.0, 3.0, 5.0), class07042.L);
                  if (!list.isEmpty()) {
                     class07628 class07628x = list.get(0);
                     class07628x.N(true);
                     this.method_5873(class07628x, false, false);
                  }
               } else if (class06069.z() < 0.05) {
                  class07628 class07628 = class07078.Q.N(this.method_73183(), class06113.field_16460);
                  if (class07628 != null) {
                     class07628.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
                     class07628.N(var1, var2, class06113.field_16460, null);
                     class07628.N(true);
                     this.method_5873(class07628, false, false);
                     var1.method_8649(class07628);
                  }
               }
            }
         }

         this.M(class06069.z() < fx * 0.1F);
         if (var3 != class06113.field_16468) {
            this.N(class06069, var2);
            this.N(var1, class06069, var2);
         }
      }

      if (this.method_6118(class07085.field_6169).R() && class06842.y() && class06069.z() < 0.25F) {
         this.method_5673(class07085.field_6169, new class06584(class06069.z() < 0.1F ? class00869.iV : class00869.iK));
         this.N(class07085.field_6169, 0.0F);
      }

      this.u(fx);
      return var4;
   }

   public static boolean N(class06069 var0) {
      return var0.z() < 0.05F;
   }

   private void N(int var1) {
      this.r = var1;
      this.method_5841().N(X, true);
   }

   protected void N(class04782 var1, class07078<? extends class08004> var2) {
      this.N(var2, class08234.N(this, true, true), var1x -> var1x.u(var1.method_8404(var1x.method_24515()).u()));
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      super.N(var1, var2);
      if (var1.z() < (this.method_73183().y() == class07086.field_5807 ? 0.05F : 0.01F)) {
         int ix = var1.y(6);
         if (ix == 0) {
            this.method_5673(class07085.field_6173, new class06584(class06570.To));
         } else if (ix == 1) {
            this.method_5673(class07085.field_6173, new class06584(class06570.le));
         } else {
            this.method_5673(class07085.field_6173, new class06584(class06570.Tq));
         }
      }
   }

   public boolean N(class04782 var1, class08041 var2) {
      return var2.N(class07078.yr, class08234.N(var2, true, true), var3 -> {
         var3.N(var1, var1.method_8404(var3.method_24515()), class06113.field_16468, new class10866(false, true));
         var3.N(var2.t());
         var3.N(var2.O().u());
         var3.N(var2.y().N());
         var3.y(var2.u());
         if (!this.method_5701()) {
            var1.method_8444(null, 1026, this.method_24515(), 0);
         }
      }) != null;
   }

   @Override
   protected void l_() {
      this.e.N(4, new class08020(this, this, 1.0, 3));
      this.e.N(8, new class07962(this, class08036.class, 8.0F));
      this.e.N(8, new class07956(this));
      this.B();
   }

   @Override
   public int method_6110(class04782 var1) {
      if (this.method_6109()) {
         this.J = (int)(this.J * 2.5);
      }

      return super.method_6110(var1);
   }

   @Override
   public class04891 method_6002() {
      return class04909.JH;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? p : super.method_55694(var1);
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      boolean flag = super.method_6121(var1, var2);
      if (flag) {
         float fx = var1.method_8404(this.method_24515()).y();
         if (this.method_6047().R() && this.method_5809() && this.field_5974.z() < fx * 0.3F) {
            var2.method_5639(2 * (int)fx);
         }
      }

      return flag;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Jf;
   }

   protected class04891 X_() {
      return class04909.oE;
   }

   protected void V_() {
      this.method_5996(class05298.Q).N(this.field_5974.U() * 0.1F);
   }

   protected boolean Y_() {
      return false;
   }

   protected boolean U_() {
      return true;
   }
}
