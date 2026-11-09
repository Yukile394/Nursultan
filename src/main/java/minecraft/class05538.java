package minecraft;

import Nursultan.class10519;
import Nursultan.class10520;
import Nursultan.class10521;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class05538 extends class07633 implements class05549 {
   public static final int N = 200;
   private static final int p = 10;
   protected static final ImmutableList<? extends class05340<? extends class05355<? super class05538>>> y = ImmutableList.of(
      class05340.L, class05340.P, class05340.R, class05340.T, class05340.b
   );
   protected static final ImmutableList<? extends class05378<?>> L = ImmutableList.of(
      class05378.j,
      class05378.M,
      class05378.B,
      class05378.U,
      class05378.E,
      class05378.P,
      class05378.m,
      class05378.I,
      class05378.n,
      class05378.s,
      class05378.T,
      class05378.e,
      new class05378[]{class05378.w, class05378.X, class05378.Q, class05378.a, class05378.p, class05378.A, class05378.S, class05378.NN}
   );
   private static final class02131<Integer> F = class03289.N(class05538.class, class02154.y);
   private static final class02131<Boolean> A = class03289.N(class05538.class, class02154.U);
   private static final class02131<Boolean> f = class03289.N(class05538.class, class02154.U);
   public static final double u = 20.0;
   public static final int i = 1200;
   private static final int C = 6000;
   public static final String R = "Variant";
   private static final int S = 1800;
   private static final int x = 2400;
   private static final boolean D = false;
   public final class02595 M = new class02595(10, class07586.l);
   public final class02595 B = new class02595(10, class07586.l);
   public final class02595 Z = new class02595(10, class07586.l);
   public final class02595 X = new class02595(10, class07586.l);
   private static final int h = 100;

   public void M(boolean var1) {
      this.field_6011.N(A, var1);
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.S();
   }

   @Override
   public boolean method_5675() {
      return false;
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Nx);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(F, 0);
      var1.N(A, false);
      var1.N(f, false);
   }

   @Override
   public int method_5748() {
      return 6000;
   }

   @Override
   public void method_5670() {
      int ix = this.method_5669();
      super.method_5670();
      if (!this.Nt() && this.method_73183() instanceof class04782 class04782) {
         this.N(class04782, ix);
      }

      if (this.method_73183().method_8608()) {
         this.t();
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      float fx = this.method_6032();
      if (!this.Nt()
         && this.method_73183().field_9229.y(3) == 0
         && (this.method_73183().field_9229.y(3) < var3 || fx / this.method_6063() < 0.5F)
         && var3 < fx
         && this.method_5799()
         && (var2.u() != null || var2.L() != null)
         && !this.v()) {
         super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.X, 200);
      }

      return super.method_64397(var1, var2, var3);
   }

   @Override
   protected class04891 method_5737() {
      return class04909.Nf;
   }

   @Override
   protected class04891 method_5625() {
      return class04909.NA;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Variant", class05541.field_56659, this.m());
      var1.N("FromBucket", this.B());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Nx ? method_66651(var1, this.m()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class05541>N("Variant", class05541.field_56659).orElse(class05541.field_57623));
      this.N(var1.N("FromBucket", false));
   }

   public class05538(class07078<? extends class05538> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_18, 0.0F);
      this.q = new class10519(this);
      this.o = new class10521(this, this, 20);
   }

   @Override
   public boolean B() {
      return this.field_6011.N(f);
   }

   @Override
   public void D() {
      if (!this.v()) {
         super.D();
      }
   }

   @Nullable
   @Override
   protected class04891 s() {
      return this.method_5799() ? class04909.NF : class04909.Np;
   }

   public static class05300 n() {
      return class07633.Ne().N(class05298.n, 14.0).N(class05298.l, 1.0).N(class05298.u, 2.0).N(class05298.O, 1.0);
   }

   public class05541 m() {
      return class05541.N(this.field_6011.N(F));
   }

   private void t() {
      class05558 class05558;
      if (this.v()) {
         class05558 = class05558.field_52483;
      } else if (this.method_5799()) {
         class05558 = class05558.field_52484;
      } else if (this.method_24828()) {
         class05558 = class05558.field_52485;
      } else {
         class05558 = class05558.field_52486;
      }

      this.M.N(class05558 == class05558.field_52483);
      this.B.N(class05558 == class05558.field_52484);
      this.Z.N(class05558 == class05558.field_52485);
      boolean flag = super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.u() || this.method_36455() != this.field_6004 || this.method_36454() != this.field_5982;
      this.X.N(flag);
   }

   @Override
   public boolean g() {
      return true;
   }

   public boolean v() {
      return this.field_6011.N(A);
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      class05538 class05538 = class07078.z.N(var1, class06113.field_16466);
      if (class05538 != null) {
         class05541 class05541;
         if (N(this.field_5974)) {
            class05541 = class05541.y(this.field_5974);
         } else {
            class05541 = this.field_5974.Z() ? this.m() : ((class05538)var2).m();
         }

         class05538.N(class05541);
         class05538.NW();
      }

      return class05538;
   }

   @Override
   public class04891 E() {
      return class04909.uG;
   }

   @Override
   public void N(class07001 var1) {
      class05549.N(this, var1);
      this.u(var1.y("Age", 0));
      var1.R("HuntingCooldown")
         .ifPresentOrElse(
            var2 -> this.method_18868().N(class05378.S, true, var1.y("HuntingCooldown", 0L)), () -> this.method_18868().N(class05378.S, Optional.empty())
         );
   }

   public static void N(class04782 var0, class05538 var1, class07438 var2) {
      if (var2.method_29504()) {
         class07072 class07072 = var2.method_6081();
         if (class07072 != null) {
            class07049 class07049 = class07072.u();
            if (class07049 != null && class07049.method_5864() == class07078.Ly) {
               class08036 class08036 = (class08036)class07049;
               if (var0.N(class08036.class, var1.method_5829().M(20.0)).contains(class08036)) {
                  var1.N(class08036);
               }
            }
         }
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      return class05549.N(var1, var2, this).orElse(super.N(var1, var2));
   }

   public static boolean N(class07078<? extends class07438> var0, class01001 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Lm);
   }

   @Override
   public boolean N(double var1) {
      return !this.B() && !this.method_16914();
   }

   @Override
   protected void N(class08036 var1, class07050 var2, class06584 var3) {
      if (var3.N(class06570.jn)) {
         class06584 class06584 = new class06584(class06570.jE);
         var1.method_6122(var2, this.N(var3, var1, class06584));
      } else {
         super.N(var1, var2, var3);
      }
   }

   public void N(class08036 var1) {
      class07055 class07055 = var1.method_6112(class07047.z);
      if (class07055 == null || class07055.N(2399)) {
         int ix = class07055 != null ? class07055.u() : 0;
         int j = Math.min(2400, 100 + ix);
         var1.method_37222(new class07055(class07047.z, j, 0), this);
      }

      var1.method_6016(class07047.u);
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class05573(this, var1);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("axolotlBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("axolotlActivityUpdate");
      class05552.N(this);
      class04643.L();
      if (!this.Nt()) {
         Optional<Integer> optional = this.method_18868().L(class05378.X);
         this.M(optional.isPresent() && optional.get() > 0);
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.yB);
   }

   @Override
   public void N(boolean var1) {
      this.field_6011.N(f, var1);
   }

   private void N(class05541 var1) {
      this.field_6011.N(F, var1.N());
   }

   private static boolean N(class06069 var0) {
      return var0.y(1200) == 0;
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return 0.0F;
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      boolean flag = false;
      if (var3 == class06113.field_16473) {
         return (class07446)var4;
      } else {
         class06069 class06069 = var1.method_8409();
         if (var4 instanceof class10520) {
            if (((class10520)var4).N() >= 2) {
               flag = true;
            }
         } else {
            var4 = new class10520(class05541.N(class06069), class05541.N(class06069));
         }

         this.N(((class10520)var4).N(class06069));
         if (flag) {
            this.u(-24000);
         }

         return super.N(var1, var2, var3, (class07446)var4);
      }
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this);
   }

   private class06584 N(class06584 var1, class08036 var2, class06584 var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) ? var3 : class05970.N(var1, var2, var3);
   }

   protected void N(class04782 var1, int var2) {
      if (this.method_5805() && !this.method_5721()) {
         this.method_5855(var2 - 1);
         if (this.method_74092()) {
            this.method_5855(0);
            this.method_64397(var1, this.method_48923().v(), 2.0F);
         }
      } else {
         this.method_5855(this.method_5748());
      }
   }

   @Override
   public void W() {
      int ix = this.method_5669() + 1800;
      this.method_5855(Math.min(ix, this.method_5748()));
   }

   @Override
   public int Ni() {
      return 1;
   }

   @Override
   public boolean Nu() {
      return super.Nu() || this.B();
   }

   @Override
   public int NR() {
      return 1;
   }

   @Override
   public class06584 Y() {
      return new class06584(class06570.jt);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Nx) {
         this.N(method_66651(class02484.Nx, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public void e_(class06584 var1) {
      class05549.N(this, var1);
      var1.N(class02484.Nx, this);
      class02837.N(class02484.NM, var1, var1x -> {
         var1x.N("Age", this.K());
         class01289<class05538> class01289 = this.method_18868();
         if (class01289.N(class05378.S)) {
            var1x.N("HuntingCooldown", class01289.i(class05378.S));
         }
      });
   }

   @Override
   public class05781<class05538> method_28306() {
      return class01289.N(L, y);
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.NX;
   }

   @Override
   public void method_59928() {
      this.method_5783(class04909.Nc, 1.0F, 1.0F);
   }

   @Override
   public class01289<class05538> method_18868() {
      return (class01289<class05538>)super.method_18868();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Na;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class05552.N(this.method_28306().N(var1));
   }

   @Override
   public boolean method_33190() {
      return !this.v() && super.method_33190();
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(this.method_6029(), var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      this.method_18799(this.method_18798().L(0.9));
   }
}
