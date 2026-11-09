package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class03630 extends class07475 implements class03502, class04391 {
   private static final class00753 i = new class00753(1, 1, 1);
   private static final int R = 5;
   private static final float W = 55.0F;
   private static final float m = 15.0F;
   private static final int P = 0;
   private static final int s = 6000;
   private static final int T = 3;
   public static final int N = 1024;
   private static final class02131<Boolean> b = class03289.N(class03630.class, class02154.U);
   private static final class02131<Boolean> X = class03289.N(class03630.class, class02154.U);
   protected static final ImmutableList<class05340<? extends class05355<? super class03630>>> y = ImmutableList.of(
      class05340.L, class05340.u, class05340.R, class05340.y
   );
   protected static final ImmutableList<class05378<?>> L = ImmutableList.of(
      class05378.n,
      class05378.P,
      class05378.B,
      class05378.m,
      class05378.I,
      class05378.d,
      class05378.H,
      class05378.ND,
      class05378.Nh,
      class05378.Nr,
      class05378.yN,
      class05378.NN,
      new class05378[0]
   );
   public static final ImmutableList<Float> u = ImmutableList.of(
      0.5625F, 0.625F, 0.75F, 0.9375F, 1.0F, 1.0F, 1.125F, 1.25F, 1.5F, 1.875F, 2.0F, 2.25F, new Float[]{2.5F, 3.0F, 3.75F, 4.0F}
   );
   private final class01178<class03485> a;
   private class03508 p;
   private final class03481 F;
   private final class01178<class03632> A;
   private final class07075 f = new class07075(1);
   @Nullable
   private class07209 C;
   private long S = 0L;
   private float x;
   private float D;
   private float h;
   private float r;
   private float NN;

   private void w() {
      double d0 = this.field_5974.E() * 0.02;
      double d1 = this.field_5974.E() * 0.02;
      double d2 = this.field_5974.E() * 0.02;
      this.method_73183().method_8406(class07107.f, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d0, d1, d2);
   }

   private boolean L(class06584 var1, class06584 var2) {
      class06517 class06517x = var1.method_58694(class02484.h);
      class06517 class06517x = var2.method_58694(class02484.h);
      return !Objects.equals(class06517x, class06517x);
   }

   private boolean L(@Nullable class07049 var1) {
      if (!(var1 instanceof class08036 class08036)) {
         return false;
      } else {
         Optional<UUID> optional = this.method_18868().L(class05378.ND);
         return optional.isPresent() && class08036.method_5667().equals(optional.get());
      }
   }

   @Override
   public class03508 L() {
      return this.p;
   }

   public static class05300 M() {
      return class07079.H().N(class05298.n, 20.0).N(class05298.m, 0.1F).N(class05298.l, 0.1F).N(class05298.u, 2.0);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(b, false);
      var1.N(X, true);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         this.D = this.x;
         if (this.B()) {
            this.x = class04995.N(this.x + 1.0F, 0.0F, 5.0F);
         } else {
            this.x = class04995.N(this.x - 1.0F, 0.0F, 5.0F);
         }

         if (this.E()) {
            this.h++;
            this.NN = this.r;
            if (this.W()) {
               this.r++;
            } else {
               this.r--;
            }

            this.r = class04995.N(this.r, 0.0F, 15.0F);
         } else {
            this.h = 0.0F;
            this.r = 0.0F;
            this.NN = 0.0F;
         }
      } else {
         class03493.N(this.method_73183(), this.p, this.F);
         if (this.Nk()) {
            this.N(false);
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return this.L(var2.u()) ? false : super.method_64397(var1, var2, var3);
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Override
   public boolean method_5776() {
      return !this.method_24828();
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.N(var1);
      var1.N("listener", class03508.N, this.p);
      var1.N("DuplicationCooldown", this.S);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.b_(var1);
      this.p = var1.<class03508>N("listener", class03508.N).orElseGet(class03508::new);
      this.N((long)var1.N("DuplicationCooldown", 0));
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 18) {
         for (int ix = 0; ix < 3; ix++) {
            this.w();
         }
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   public void method_42147(BiConsumer<class01178<?>, class04782> var1) {
      if (this.method_73183() instanceof class04782 class04782) {
         var1.accept(this.a, class04782);
         var1.accept(this.A, class04782);
      }
   }

   @Override
   protected boolean method_61416(class07049 var1) {
      return this.L(var1) || super.method_61416(var1);
   }

   public class03630(class07078<? extends class03630> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class07460(this, 20, true);
      this.L(this.method_5936());
      this.F = new class03618(this);
      this.p = new class03508();
      this.a = new class01178<>(new class03485(this));
      this.A = new class01178<>(new class03632(this, this.F.y(), class01194.g.N().N()));
   }

   public boolean B() {
      return !this.method_5998(class07050.field_5808).R();
   }

   public float i(float var1) {
      return class04995.B(var1, this.NN, this.r) / 15.0F;
   }

   @Override
   protected class04891 s() {
      return this.method_6084(class07085.field_6173) ? class04909.N : class04909.y;
   }

   @Override
   public class07075 n() {
      return this.f;
   }

   private void l() {
      this.N(6000L);
   }

   private boolean d() {
      return this.field_6011.N(X);
   }

   private boolean m() {
      return this.method_18868().N_22(class05378.yN, class05367.field_18456);
   }

   private void t() {
      if (!this.method_73183().method_8608() && this.S > 0L) {
         this.N(this.S - 1L);
      }
   }

   private boolean v() {
      return this.C == null || !this.C.method_19769(this.method_73189(), class01194.g.N().N()) || !this.method_73183().method_8320(this.C).N(class00869.iG);
   }

   @Override
   public class03481 u() {
      return this.F;
   }

   public float u(float var1) {
      return class04995.B(var1, this.D, this.x) / 5.0F;
   }

   private boolean y(class06584 var1, class06584 var2) {
      return class06584.y(var1, var2) && !this.L(var1, var2);
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      class06584 class06584 = this.method_5998(class07050.field_5808);
      return !class06584.R() && var1.method_64395().N(class07305.I) && this.f.L(var2) && this.y(class06584, var2);
   }

   public boolean E() {
      return this.field_6011.N(b);
   }

   @Override
   public boolean N(double var1) {
      return false;
   }

   @Override
   protected class07623 N(class07299 var1) {
      class07991 class07991 = new class07991(this, var1);
      class07991.y(false);
      class07991.N(true);
      class07991.N(48.0F);
      return class07991;
   }

   @Override
   protected class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584xxx = var1.method_5998(var2);
      class06584 class06584x = this.method_5998(class07050.field_5808);
      if (this.E() && class06584xxx.N(class01226.Nl) && this.d()) {
         this.G();
         this.method_73183().method_8421(this, (byte)18);
         this.method_73183().method_43129(var1, this, class04909.g, class04911.field_15254, 2.0F, 1.0F);
         this.N(var1, class06584xxx);
         return class07082.N;
      } else if (class06584x.R() && !class06584xxx.R()) {
         class06584 class06584xx = class06584xxx.L(1);
         this.method_6122(class07050.field_5808, class06584xx);
         this.N(var1, class06584xxx);
         this.method_73183().method_43129(var1, this, class04909.i, class04911.field_15254, 2.0F, 1.0F);
         this.method_18868().N(class05378.ND, var1.method_5667());
         return class07082.N;
      } else if (!class06584x.R() && var2 == class07050.field_5808 && class06584xxx.R()) {
         this.method_5673(class07085.field_6173, class06584.E);
         this.method_73183().method_43129(var1, this, class04909.R, class04911.field_15254, 2.0F, 1.0F);
         this.method_6104(class07050.field_5808);

         for (class06584 class06584xx : this.n().N()) {
            class06293.N(this, class06584xx, this.method_73189());
         }

         this.method_18868().y(class05378.ND);
         var1.method_7270(class06584x);
         return class07082.N;
      } else {
         return super.N(var1, var2);
      }
   }

   private void N(class08036 var1, class06584 var2) {
      var2.N(1, var1);
   }

   public void N(class07209 var1, boolean var2) {
      if (var2) {
         if (!this.E()) {
            this.C = var1;
            this.N(true);
         }
      } else if (var1.equals(this.C) || this.C == null) {
         this.C = null;
         this.N(false);
      }
   }

   private void N(long var1) {
      this.S = var1;
      this.field_6011.N(X, var1 == 0L);
   }

   public void N(boolean var1) {
      if (!this.method_73183().method_8608() && this.method_6034() && (!var1 || !this.Nk())) {
         this.field_6011.N(b, var1);
      }
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("allayBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("allayActivityUpdate");
      class03645.N(this);
      class04643.L();
      super.N(var1);
   }

   @Override
   protected void N(class04782 var1, class00717 var2) {
      class04391.N(var1, this, this, var2);
   }

   public boolean W() {
      return this.h % 55.0F < 15.0F;
   }

   private void G() {
      class03630 class03630 = class07078.i.N(this.method_73183(), class06113.field_16466);
      if (class03630 != null) {
         class03630.method_29495(this.method_73189());
         class03630.NW();
         class03630.l();
         this.l();
         this.method_73183().method_8649(class03630);
      }
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, this.method_5751() * 0.6, this.method_17681() * 0.1);
   }

   @Override
   protected class00753 Ny() {
      return i;
   }

   @Override
   public void method_16078(class04782 var1) {
      super.method_16078(var1);
      this.f.N().forEach(var2x -> this.method_5775(var1, var2x));
      class06584 class06584 = this.method_6118(class07085.field_6173);
      if (!class06584.R() && !class07323.N(class06584, class02523.g)) {
         this.method_5775(var1, class06584);
         this.method_5673(class07085.field_6173, class06584.E);
      }
   }

   @Override
   public class05781<class03630> method_28306() {
      return class01289.N(L, y);
   }

   @Override
   public class04891 method_6002() {
      return class04909.L;
   }

   @Override
   public float method_6107() {
      return 0.4F;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (!this.method_73183().method_8608() && this.method_5805() && this.field_6012 % 10 == 0) {
         this.method_6025(1.0F);
      }

      if (this.E() && this.v() && this.field_6012 % 20 == 0) {
         this.N(false);
         this.C = null;
      }

      this.t();
   }

   @Override
   public class01289<class03630> method_18868() {
      return (class01289<class03630>)super.method_18868();
   }

   @Override
   public void method_6091(class06889 var1) {
      this.method_70670(var1, this.method_6029());
   }

   @Override
   public boolean method_45324(class06584 var1, class06584 var2) {
      return !this.y(var1, var2);
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return false;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.u;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class03645.N(this.method_28306().N(var1));
   }

   @Override
   public boolean method_5936() {
      return !this.m() && this.B();
   }

   @Override
   protected boolean k_() {
      return false;
   }
}
