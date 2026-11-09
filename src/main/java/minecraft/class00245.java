package minecraft;

import Nursultan.class09235;
import Nursultan.class09237;
import Nursultan.class09239;
import Nursultan.class09240;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00245 extends class07150 {
   private static final class02131<Boolean> W = class03289.N(class00245.class, class02154.U);
   private static final class02131<Boolean> T = class03289.N(class00245.class, class02154.U);
   private static final class02131<Boolean> b = class03289.N(class00245.class, class02154.U);
   private static final class02131<Optional<class07209>> X = class03289.N(class00245.class, class02154.s);
   private static final int a = 15;
   private static final int p = 1;
   private static final float F = 3.0F;
   private static final float A = 32.0F;
   private static final float f = 144.0F;
   public static final int N = 40;
   private static final float C = 0.4F;
   public static final float y = 0.3F;
   public static final int L = 16545810;
   public static final int u = 6250335;
   public static final int i = 8;
   public static final int R = 45;
   private static final int S = 4;
   private int x;
   public final class04396 M = new class04396();
   public final class04396 B = new class04396();
   public final class04396 Z = new class04396();
   private int D;
   private boolean h;
   private int r;
   private int NN;

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 1.0).N(class05298.l, 0.4F).N(class05298.u, 3.0).N(class05298.P, 32.0).N(class05298.O, 1.0625);
   }

   public void P() {
      if (super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 > this.r) {
         this.r = super.fields_2212a028292fd3c078969e3ee4c71d9e8_2
            + this.method_59922()
               .N(this.h ? 2 : super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 / 4, this.h ? 8 : super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 / 2);
         this.h = !this.h;
      }
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(W, true);
      var1.N(T, false);
      var1.N(b, false);
      var1.N(X, Optional.empty());
   }

   @Override
   public boolean method_5753() {
      return this.N() || super.method_5753();
   }

   @Override
   public void method_5773() {
      if (!this.method_73183().method_8608()) {
         class07209 class07209 = this.U();
         if (class07209 != null) {
            class00394 class00394 = this.method_73183().method_8321(class07209);
            if (!(class00394 instanceof class00327) || !((class00327)class00394).y(this)) {
               this.method_6033(0.0F);
            }
         }
      }

      super.method_5773();
      if (this.method_73183().method_8608()) {
         this.n();
         this.P();
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      class07209 class07209 = this.U();
      if (class07209 == null || var2.N(class03696.u)) {
         return super.method_64397(var1, var2, var3);
      } else if (!this.method_5679(var1, var2) && this.D <= 0 && !this.method_29504()) {
         class08036 class08036 = this.N(var2);
         class07049 class07049 = var2.L();
         if (!(class07049 instanceof class07438) && !(class07049 instanceof class08005) && class08036 == null) {
            return false;
         } else {
            this.D = 8;
            this.method_73183().method_8421(this, (byte)66);
            this.method_32876(class01194.n);
            if (this.method_73183().method_8321(class07209) instanceof class00327 class00327 && class00327.y(this)) {
               if (class08036 != null) {
                  class00327.y();
               }

               this.method_6013(var2);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.Bj, 0.15F, 1.0F);
   }

   @Override
   public boolean method_5810() {
      return super.method_5810() && this.B();
   }

   @Override
   public void method_5762(double var1, double var3, double var5) {
      if (this.B()) {
         super.method_5762(var1, var3, var5);
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.y("home_pos", class07209.field_25064, this.U());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      var1.<class07209>N("home_pos", class07209.field_25064).ifPresent(this::N);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 66) {
         this.D = 8;
         this.method_6013(this.method_48923().s());
      } else if (var1 == 4) {
         this.x = 15;
         this.method_59928();
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   public boolean method_5822(boolean var1) {
      return !this.N() && super.method_5822(var1);
   }

   public class00245(class07078<? extends class00245> var1, class07299 var2) {
      super(var1, var2);
      this.o = new class09235(this, this);
      this.q = new class09237(this, this);
      this.K = new class09240(this, this);
      ((class07655)this.f()).N(true);
      this.J = 0;
   }

   public boolean B() {
      return this.field_6011.N(W);
   }

   public void Z() {
      if (this.method_73183() instanceof class04782 class04782) {
         class00734 class00734 = this.method_5829();
         class06889 class06889 = class00734.R();
         double d0 = class00734.y() * 0.3;
         double d1 = class00734.L() * 0.3;
         double d2 = class00734.u() * 0.3;
         class04782.method_65096(new class07105(class07107.yz, class00869.n.W()), class06889.M, class06889.B, class06889.Z, 100, d0, d1, d2, 0.0);
         class04782.method_65096(
            new class07105(class07107.yz, class00869.Lp.W().y(class00325.L, class08630.field_55833)),
            class06889.M,
            class06889.B,
            class06889.Z,
            10,
            d0,
            d1,
            d2,
            0.0
         );
      }

      this.method_56078(this.method_6002());
      this.method_5650(class07062.field_26999);
   }

   public boolean b() {
      List<class08036> list = super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.z).orElse(List.of());
      boolean flag = this.v();
      if (list.isEmpty()) {
         if (flag) {
            this.j();
         }

         return true;
      } else {
         boolean flag1 = false;

         for (class08036 class08036 : list) {
            if (this.method_18395(class08036) && !this.method_5722(class08036)) {
               flag1 = true;
               if ((!flag || class07438.staticFields_7212a028292fd3c078969e3ee4c71d9e8_5.test(class08036))
                  && this.method_64619(
                     class08036,
                     0.5,
                     false,
                     true,
                     new double[]{this.method_23320(), this.method_23318() + 0.5 * this.method_55693(), (this.method_23320() + this.method_23318()) / 2.0}
                  )) {
                  if (flag) {
                     return false;
                  }

                  if (class08036.method_5858(this) < 144.0) {
                     this.N(class08036);
                     return false;
                  }
               }
            }
         }

         if (!flag1 && flag) {
            this.j();
         }

         return true;
      }
   }

   @Override
   protected class04891 s() {
      return this.v() ? null : class04909.Bm;
   }

   private void n() {
      this.M.N(this.x > 0, this.field_6012);
      this.B.N(this.D > 0, this.field_6012);
      this.Z.N(this.W(), this.field_6012);
   }

   public boolean m() {
      return this.h;
   }

   public boolean v() {
      return this.field_6011.N(T);
   }

   public void j() {
      this.method_18868().y(class05378.s);
      this.method_32876(class01194.n);
      this.method_56078(class04909.Bs);
      this.N(false);
   }

   @Nullable
   public class07209 U() {
      return this.field_6011.N(X).orElse(null);
   }

   public boolean z() {
      List<class08036> list = super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.z).orElse(List.of());
      if (list.isEmpty()) {
         this.NN = 0;
         return false;
      } else {
         class00734 class00734 = this.method_5829();

         for (class08036 class08036 : list) {
            if (class00734.u(class08036.method_33571())) {
               this.NN++;
               return this.NN > 4;
            }
         }

         this.NN = 0;
         return false;
      }
   }

   public void y(class07209 var1) {
      this.field_6011.N(X, Optional.of(var1));
   }

   public void y(class07072 var1) {
      this.N(var1);
      this.method_6078(var1);
      this.method_56078(class04909.Bl);
   }

   public void E() {
      this.field_6011.N(b, true);
   }

   public class08036 N(class07072 var1) {
      this.method_65344(var1);
      return this.method_65343(var1);
   }

   public void N(class08036 var1) {
      this.method_18868().N(class05378.s, var1);
      this.method_32876(class01194.n);
      this.method_56078(class04909.BP);
      this.N(true);
   }

   public void N(class07209 var1) {
      this.y(var1);
      this.N(class04425.field_17, 8.0F);
      this.N(class04425.field_33534, 8.0F);
      this.N(class04425.field_14, 8.0F);
      this.N(class04425.field_3, 0.0F);
      this.N(class04425.field_9, 0.0F);
   }

   public boolean N() {
      return this.U() != null;
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("creakingBrain");
      this.method_18868().N((class04782)this.method_73183(), this);
      class04643.L();
      class00260.N(this);
   }

   public void N(boolean var1) {
      this.field_6011.N(T, var1);
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class00262(this, this, var1);
   }

   public boolean W() {
      return this.field_6011.N(b);
   }

   @Override
   protected class07472 Z_() {
      return new class09239(this, this);
   }

   @Override
   public void method_6005(double var1, double var3, double var5) {
      if (this.B()) {
         super.method_6005(var1, var3, var5);
      }
   }

   @Override
   public class05781<class00245> method_28306() {
      return class00260.N();
   }

   @Override
   public class04891 method_6002() {
      return class04909.Bb;
   }

   @Override
   public void method_59928() {
      this.method_56078(class04909.BT);
   }

   @Override
   public void method_48565(float var1) {
      float fx = Math.min(var1 * 25.0F, 3.0F);
      super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(fx, 0.4F, 1.0F);
   }

   @Override
   public void method_6007() {
      if (this.D > 0) {
         this.D--;
      }

      if (this.x > 0) {
         this.x--;
      }

      if (!this.method_73183().method_8608()) {
         boolean flag = this.field_6011.N(W);
         boolean flag1 = this.b();
         if (flag1 != flag) {
            this.method_32876(class01194.n);
            if (flag1) {
               this.method_56078(class04909.Bn);
            } else {
               this.NN();
               this.method_56078(class04909.Bv);
            }
         }

         this.field_6011.N(W, flag1);
      }

      super.method_6007();
   }

   @Override
   public class01289<class00245> method_18868() {
      return (class01289<class00245>)super.method_18868();
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      if (!(var2 instanceof class07438)) {
         return false;
      } else {
         this.x = 15;
         this.method_73183().method_8421(this, (byte)4);
         return super.method_6121(var1, var2);
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.N() ? class04909.BG : super.method_6011(var1);
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class00260.y(this, this.method_28306().N(var1));
   }

   @Override
   public void method_6108() {
      if (this.N() && this.W()) {
         super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 = super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 + 1;
         if (!this.method_73183().method_8608() && super.fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 45 && !this.method_31481()) {
            this.Z();
         }
      } else {
         super.method_6108();
      }
   }
}
