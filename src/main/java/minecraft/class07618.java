package minecraft;

import Nursultan.class10714;
import java.util.Objects;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07618 extends class02735 {
   private static final class02131<Boolean> R = class03289.N(class07618.class, class02154.U);
   private static final class02131<Integer> M = class03289.N(class07618.class, class02154.y);
   static final class01328 N = class01328.y().N(10.0).u();
   public static final int y = 4800;
   private static final int B = 2400;
   public static final Predicate<class00717> L = var0 -> !var0.R() && var0.method_5805() && var0.method_5799();
   public static final float u = 0.65F;
   private static final boolean Z = false;
   @Nullable
   class07209 i;

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, false);
      var1.N(M, 2400);
   }

   @Override
   public int method_5748() {
      return 4800;
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.Nt()) {
         this.method_5855(this.method_5748());
      } else {
         if (this.method_5721()) {
            this.y(2400);
         } else {
            this.y(this.E() - 1);
            if (this.E() <= 0) {
               this.method_64419(this.method_48923().v(), 1.0F);
            }

            if (this.method_24828()) {
               this.method_18799(this.method_18798().y((this.field_5974.z() * 2.0F - 1.0F) * 0.2F, 0.5, (this.field_5974.z() * 2.0F - 1.0F) * 0.2F));
               this.method_36456(this.field_5974.z() * 360.0F);
               this.method_24830(false);
               this.field_64356 = true;
            }
         }

         if (this.method_73183().method_8608() && this.method_5799() && this.method_18798().B() > 0.03) {
            class06889 class06889 = this.method_5828(0.0F);
            float f = class04995.P(this.method_36454() * (float) (Math.PI / 180.0)) * 0.3F;
            float f1 = class04995.m(this.method_36454() * (float) (Math.PI / 180.0)) * 0.3F;
            float f2 = 1.2F - this.field_5974.z() * 0.7F;

            for (int ix = 0; ix < 2; ix++) {
               this.method_73183()
                  .method_8406(
                     class07107.NG,
                     this.method_23317() - class06889.M * f2 + f,
                     this.method_23318() - class06889.B,
                     this.method_23321() - class06889.Z * f2 + f1,
                     0.0,
                     0.0,
                     0.0
                  );
               this.method_73183()
                  .method_8406(
                     class07107.NG,
                     this.method_23317() - class06889.M * f2 - f,
                     this.method_23318() - class06889.B,
                     this.method_23321() - class06889.Z * f2 - f1,
                     0.0,
                     0.0,
                     0.0
                  );
            }
         }
      }
   }

   @Override
   protected class04891 method_5737() {
      return class04909.ZO;
   }

   @Override
   protected class04891 method_5625() {
      return class04909.ZQ;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("GotFish", this.B());
      var1.N("Moistness", this.E());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("GotFish", false));
      this.y(var1.N("Moistness", 2400));
   }

   @Override
   protected boolean method_5860(class07049 var1) {
      return true;
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 38) {
         this.N(class07107.F);
      } else {
         super.method_5711(var1);
      }
   }

   public class07618(class07078<? extends class07618> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class05581(this, 85, 10, 0.02F, 0.1F, true);
      this.o = new class07450(this, 10);
      this.L(true);
   }

   public boolean B() {
      return this.field_6011.N(R);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return this.method_5799() ? class04909.Zt : class04909.Zn;
   }

   protected boolean m() {
      class07209 class07209 = this.f().M();
      return class07209 != null ? class07209.method_19769(this.method_73189(), 12.0) : false;
   }

   @Override
   public boolean g() {
      return true;
   }

   public void y(int var1) {
      this.field_6011.N(M, var1);
   }

   public int E() {
      return this.field_6011.N(M);
   }

   private void N(class07126 var1) {
      for (int ix = 0; ix < 7; ix++) {
         double d0 = this.field_5974.E() * 0.01;
         double d1 = this.field_5974.E() * 0.01;
         double d2 = this.field_5974.E() * 0.01;
         this.method_73183().method_8406(var1, this.method_23322(1.0), this.method_23319() + 0.2, this.method_23325(1.0), d0, d1, d2);
      }
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class07639(this, var1);
   }

   @Nullable
   public class07618 y(class04782 var1, class07077 var2) {
      return class07078.e.N(var1, class06113.field_16466);
   }

   public void N(boolean var1) {
      this.field_6011.N(R, var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.method_5855(this.method_5748());
      this.method_36457(0.0F);
      class07446 class07446 = Objects.requireNonNullElseGet(var4, () -> new class10714(0.1F));
      return super.N(var1, var2, var3, class07446);
   }

   @Override
   protected class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (!class06584.R() && class06584.N(class01226.yP)) {
         if (!this.method_73183().method_8608()) {
            this.method_5783(class04909.Zd, 1.0F, 1.0F);
         }

         if (this.method_6109()) {
            class06584.N(1, var1);
            this.N(i(-this.s), true);
         } else {
            this.N(true);
            class06584.N(1, var1);
         }

         return class07082.N;
      } else {
         return super.N(var1, var2);
      }
   }

   @Override
   protected void N(int var1) {
   }

   @Override
   protected void N(class04782 var1, class00717 var2) {
      if (this.method_6118(class07085.field_6173).R()) {
         class06584 class06584 = var2.N();
         if (this.L(class06584)) {
            this.method_29499(var2);
            this.method_5673(class07085.field_6173, class06584);
            this.N(class07085.field_6173);
            this.method_6103(var2, class06584.c());
            var2.method_31472();
         }
      }
   }

   public static class05300 W() {
      return class07079.H().N(class05298.n, 10.0).N(class05298.l, 1.2F).N(class05298.u, 3.0);
   }

   @Override
   public int Ni() {
      return 1;
   }

   @Override
   public int NR() {
      return 1;
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07454(this));
      this.e.N(0, new class07979(this));
      this.e.N(1, new class07642(this));
      this.e.N(2, new class07635(this, 4.0));
      this.e.N(4, new class07985(this, 1.0, 10));
      this.e.N(4, new class07956(this));
      this.e.N(5, new class07962(this, class08036.class, 6.0F));
      this.e.N(5, new class07961(this, 10));
      this.e.N(6, new class07999(this, 1.2F, true));
      this.e.N(8, new class07653(this));
      this.e.N(8, new class07432(this));
      this.e.N(9, new class07464<>(this, class07549.class, 8.0F, 1.0, 1.0));
      this.H.N(1, new class07989(this, class07549.class).N());
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.Zl;
   }

   @Override
   public int method_6064(int var1) {
      return this.method_5748();
   }

   @Override
   public void method_59928() {
      this.method_5783(class04909.ZG, 1.0F, 1.0F);
   }

   @Override
   public float method_17825() {
      return this.method_6109() ? 0.65F : 1.0F;
   }

   @Override
   public boolean method_18395(class07438 var1) {
      return !this.method_6109() && super.method_18395(var1);
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_6173 && this.method_5936();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Zw;
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(this.method_6029(), var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
      if (this.T() == null) {
         this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
      }
   }
}
