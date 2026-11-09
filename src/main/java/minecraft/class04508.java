package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class04508 extends class07150 {
   private static final int M = 20;
   private static final int B = 1;
   private static final int Z = 20;
   private static final int W = 3;
   private static final int T = 5;
   private static final int b = 10;
   private static final float X = 3.0F;
   private static final int a = 1;
   private static final int p = 80;
   public class04396 N = new class04396();
   public class04396 y = new class04396();
   public class04396 L = new class04396();
   public class04396 u = new class04396();
   public class04396 i = new class04396();
   public class04396 R = new class04396();
   private int F = 0;
   private int A = 0;
   private static final class04252 f = (var0, var1, var2) -> {
      var1.method_73183().method_43129(null, var1, class04909.LF, var1.method_5634(), 1.0F, 1.0F);
      class04252.y.deflect(var0, var1, var2);
   };

   public static class05300 M() {
      return class07079.H().N(class05298.l, 0.63F).N(class05298.n, 30.0).N(class05298.P, 24.0).N(class05298.u, 3.0);
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public class04252 method_56071(class08005 var1) {
      if (var1.method_5864() != class07078.n && var1.method_5864() != class07078.ya) {
         return this.method_5864().N(class01217.j) ? f : class04252.N;
      } else {
         return class04252.N;
      }
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (this.method_73183().method_8608() && field_18064.equals(var1)) {
         this.n();
         class01312 class01312 = this.method_18376();
         switch (class01312) {
            case field_47247:
               this.i.y(this.field_6012);
               break;
            case field_47248:
               this.R.y(this.field_6012);
               break;
            case field_47246:
               this.y.y(this.field_6012);
         }
      }

      super.method_5674(var1);
   }

   @Override
   public double method_29241() {
      return this.method_5751();
   }

   @Override
   public void method_5773() {
      class01312 class01312 = this.method_18376();
      switch (class01312) {
         case field_47247:
         case field_47248:
         case field_18076:
            this.B().N(1 + this.method_59922().y(1));
            break;
         case field_47246:
            this.N(20);
            break;
         case field_30095:
            this.u.y(this.field_6012);
            this.E();
      }

      this.N.y(this.field_6012);
      if (class01312 != class01312.field_47246 && this.y.y()) {
         this.L.N(this.field_6012);
         this.y.N();
      }

      this.A = this.A == 0 ? this.field_5974.N(1, 80) : this.A - 1;
      if (this.A == 0) {
         this.W();
      }

      super.method_5773();
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      if (var1 > 3.0) {
         this.method_5783(class04909.LD, 1.0F, 1.0F);
      }

      return super.method_5747(var1, var3, var4);
   }

   public class04508(class07078<? extends class07150> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_47413, -1.0F);
      this.N(class04425.field_3, -1.0F);
      this.J = 10;
   }

   public class04508 B() {
      this.F = 0;
      return this;
   }

   @Override
   public void D() {
      if (this.T() == null || !this.method_24828()) {
         this.method_73183().method_55116(this, this.s(), this.method_5634(), 1.0F, 1.0F);
      }
   }

   @Override
   protected class04891 s() {
      return this.method_24828() ? class04909.Lf : class04909.LC;
   }

   private void n() {
      this.i.N();
      this.N.N();
      this.R.N();
      this.u.N();
   }

   public Optional<class07438> m() {
      return this.method_18868().L(class05378.d).map(class07072::u).filter(var0 -> var0 instanceof class07438).map(var0 -> (class07438)var0);
   }

   public double v() {
      return this.method_23318() + this.method_17682() / 2.0F + 0.3F;
   }

   public boolean y(class06889 var1) {
      class06889 class06889 = this.method_24515().method_46558();
      return var1.N(class06889, 4.0, 10.0);
   }

   public void E() {
      if (++this.F <= 5) {
         class00500 class00500 = !this.method_55667().P() ? this.method_55667() : this.method_25936();
         class06889 class06889x = this.method_18798();
         class06889 class06889x = this.method_73189().i(class06889x).y(0.0, 0.1F, 0.0);

         for (int ix = 0; ix < 3; ix++) {
            this.method_73183().method_8406(this.N(new class07105(class07107.y, class00500)), class06889x.M, class06889x.B, class06889x.Z, 0.0, 0.0, 0.0);
         }
      }
   }

   private class07105 N(class07105 var1) {
      class07209 class07209 = !this.method_55667().P() ? this.method_24515() : this.method_23312();
      var1.fabric_setBlockPos(class07209);
      return var1;
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("breezeBrain");
      this.method_18868().N(var1, this);
      class04643.y("breezeActivityUpdate");
      class04516.N(this);
      class04643.L();
      super.N(var1);
   }

   public void N(int var1) {
      if (!this.method_5765()) {
         class06889 class06889x = this.method_5829().R();
         class06889 class06889x = new class06889(class06889x.M, this.method_73189().B, class06889x.Z);
         class00500 class00500 = !this.method_55667().P() ? this.method_55667() : this.method_25936();
         if (class00500.b() != class06898.field_11455) {
            for (int ix = 0; ix < var1; ix++) {
               this.method_73183().method_8406(this.N(new class07105(class07107.y, class00500)), class06889x.M, class06889x.B, class06889x.Z, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void W() {
      float fx = 0.7F + 0.4F * this.field_5974.z();
      float f1 = 0.8F + 0.2F * this.field_5974.z();
      this.method_73183().method_55116(this, class04909.uy, this.method_5634(), f1, fx);
   }

   @Override
   public int NR() {
      return 30;
   }

   @Override
   public int NB() {
      return 25;
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
      super.method_74589(var1, var2);
      var2.N(class00429.u, () -> new class00464(this.method_18868().L(class05378.s).map(class07049::method_5628), this.method_18868().L(class05378.yE)));
   }

   @Override
   public class05781<class04508> method_28306() {
      return class01289.N(class04516.R, class04516.i);
   }

   @Override
   public boolean method_5679(class04782 var1, class07072 var2) {
      return var2.u() instanceof class04508 || super.method_5679(var1, var2);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Lr;
   }

   @Override
   public class01289<class04508> method_18868() {
      return (class01289<class04508>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.uN;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class04516.N(this, this.method_28306().N(var1));
   }

   @Override
   public boolean method_5973(class07078<?> var1) {
      return var1 == class07078.Ly || var1 == class07078.Nn;
   }
}
