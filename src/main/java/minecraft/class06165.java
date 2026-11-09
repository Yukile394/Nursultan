package minecraft;

import Nursultan.class09459;
import Nursultan.class09463;
import Nursultan.class09465;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class06165 extends class07633 {
   private static final class02131<Integer> B = class03289.N(class06165.class, class02154.y);
   private static final class02131<Byte> Z = class03289.N(class06165.class, class02154.N);
   private static final int X = 1;
   public static final int N = 4;
   public static final int y = 8;
   public static final int L = 16;
   private static final int p = 32;
   private static final int F = 64;
   private static final int A = 128;
   private static final class02131<Optional<class08372<class07438>>> f = class03289.N(class06165.class, class02154.b);
   private static final class02131<Optional<class08372<class07438>>> C = class03289.N(class06165.class, class02154.b);
   static final Predicate<class00717> u = var0 -> !var0.R() && var0.method_5805();
   private static final Predicate<class07049> S = var0 -> !(var0 instanceof class07438 class07438)
      ? false
      : class07438.method_6052() != null && class07438.method_6083() < class07438.field_6012 + 600;
   static final Predicate<class07049> i = var0 -> var0 instanceof class07628 || var0 instanceof class07879;
   private static final Predicate<class07049> x = var0 -> !var0.method_21751() && class07042.i.test(var0);
   private static final int D = 600;
   private static final class01325 h = class07078.Ni.E().N(0.5F).y(0.2975F);
   private static final Codec<List<class08372<class07438>>> r = class08372.N().listOf();
   private static final boolean NN = false;
   private static final boolean Ny = false;
   private static final boolean NL = false;
   private class07473 NE;
   private class07473 NW;
   private class07473 Nm;
   private float NP;
   private float Ns;
   float R;
   float M;
   private int NT;

   void w() {
      this.Z(false);
   }

   @Override
   public boolean L(class06584 var1) {
      class06584 class06584 = this.method_6118(class07085.field_6173);
      return class06584.R() || this.NT > 0 && this.R(var1) && !this.R(class06584);
   }

   private void M(class06584 var1) {
      if (!var1.R() && !this.method_73183().method_8608()) {
         class00717 class00717 = new class00717(
            this.method_73183(), this.method_23317() + this.method_5720().M, this.method_23318() + 1.0, this.method_23321() + this.method_5720().Z, var1
         );
         class00717.N(40);
         class00717.N(this);
         this.method_5783(class04909.EL, 1.0F, 1.0F);
         this.method_73183().method_8649(class00717);
      }
   }

   void M(boolean var1) {
      this.y(64, var1);
   }

   public boolean Q() {
      return !this.method_6113() && !this.v() && !this.n();
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NJ);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(f, Optional.empty());
      var1.N(C, Optional.empty());
      var1.N(B, class01319.field_57610.N());
      var1.N(Z, (byte)0);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_6034()) {
         boolean flag = this.method_5799();
         if (flag || this.T() != null || this.method_73183().method_8546()) {
            this.w();
         }

         if (flag || this.method_6113()) {
            this.N(false);
         }

         if (this.n() && this.method_73183().field_9229.z() < 0.2F) {
            class07209 class07209 = this.method_24515();
            class00500 class00500 = this.method_73183().method_8320(class07209);
            this.method_73183().N(2001, class07209, class00891.W(class00500));
         }
      }

      this.Ns = this.NP;
      if (this.d()) {
         this.NP = this.NP + (1.0F - this.NP) * 0.4F;
      } else {
         this.NP = this.NP + (0.0F - this.NP) * 0.4F;
      }

      this.M = this.R;
      if (this.method_18276()) {
         this.R += 0.2F;
         if (this.R > 3.0F) {
            this.R = 3.0F;
         }
      } else {
         this.R = 0.0F;
      }
   }

   @Override
   public boolean method_18276() {
      return this.N(4);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Trusted", r, this.m().toList());
      var1.N("Sleeping", this.method_6113());
      var1.N("Type", class01319.field_41548, this.W());
      var1.N("Sitting", this.v());
      var1.N("Crouching", this.method_18276());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NJ ? method_66651(var1, this.W()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.o();
      var1.<List>N("Trusted", r).orElse(List.of()).forEach(this::N);
      this.Z(var1.N("Sleeping", false));
      this.N(var1.<class01319>N("Type", class01319.field_41548).orElse(class01319.field_57610));
      this.N(var1.N("Sitting", false));
      this.U(var1.N("Crouching", false));
      if (this.method_73183() instanceof class04782) {
         this.I();
      }
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 45) {
         class06584 class06584 = this.method_6118(class07085.field_6173);
         if (!class06584.R()) {
            for (int ix = 0; ix < 8; ix++) {
               class06889 class06889 = new class06889((this.field_5974.z() - 0.5) * 0.1, this.field_5974.z() * 0.1 + 0.1, 0.0)
                  .N(-this.method_36455() * (float) (Math.PI / 180.0))
                  .y(-this.method_36454() * (float) (Math.PI / 180.0));
               this.method_73183()
                  .method_8406(
                     new class07092(class07107.S, class06584),
                     this.method_23317() + this.method_5720().M / 2.0,
                     this.method_23318(),
                     this.method_23321() + this.method_5720().Z / 2.0,
                     class06889.M,
                     class06889.B + 0.05,
                     class06889.Z
                  );
            }
         }
      } else {
         super.method_5711(var1);
      }
   }

   public class06165(class07078<? extends class06165> var1, class07299 var2) {
      super(var1, var2);
      this.o = new class01297(this);
      this.q = new class09463(this);
      this.N(class04425.field_5, 0.0F);
      this.N(class04425.field_17, 0.0F);
      this.L(true);
      this.f().N(32.0F);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.l, 0.3F).N(class05298.n, 10.0).N(class05298.u, 2.0).N(class05298.w, 5.0).N(class05298.P, 32.0);
   }

   private void B(class06584 var1) {
      class00717 class00717 = new class00717(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), var1);
      this.method_73183().method_8649(class00717);
   }

   void B(boolean var1) {
      this.y(128, var1);
   }

   @Override
   public void D() {
      class04891 class04891 = this.s();
      if (class04891 == class04909.Ur) {
         this.method_5783(class04891, 2.0F, this.method_6017());
      } else {
         super.D();
      }
   }

   private void I() {
      if (this.W() == class01319.field_17996) {
         this.H.N(4, this.NE);
         this.H.N(4, this.NW);
         this.H.N(6, this.Nm);
      } else {
         this.H.N(4, this.Nm);
         this.H.N(6, this.NE);
         this.H.N(6, this.NW);
      }
   }

   void Z(boolean var1) {
      this.y(32, var1);
   }

   private boolean i(class06584 var1) {
      return this.R(var1) && this.T() == null && this.method_24828() && !this.method_6113();
   }

   public float i(float var1) {
      return class04995.B(var1, this.M, this.R);
   }

   @Nullable
   @Override
   protected class04891 s() {
      if (this.method_6113()) {
         return class04909.EN;
      } else {
         return !this.method_73183().method_8530()
               && this.field_5974.z() < 0.1F
               && this.method_73183().N(class08036.class, this.method_5829().L(16.0, 16.0, 16.0), class07042.R).isEmpty()
            ? class04909.Ur
            : class04909.UC;
      }
   }

   public boolean n() {
      return this.N(64);
   }

   public boolean l() {
      return this.R == 3.0F;
   }

   public boolean d() {
      return this.N(8);
   }

   Stream<class08372<class07438>> m() {
      return Stream.concat(this.field_6011.N(f).stream(), this.field_6011.N(C).stream());
   }

   private void o() {
      this.field_6011.N(f, Optional.empty());
      this.field_6011.N(C, Optional.empty());
   }

   public boolean t() {
      return this.N(128);
   }

   public boolean v() {
      return this.N(1);
   }

   public void U(boolean var1) {
      this.y(4, var1);
   }

   public void z(boolean var1) {
      this.y(16, var1);
   }

   public boolean u(class07438 var1) {
      return this.m().anyMatch(var1x -> var1x.y(var1));
   }

   public float u(float var1) {
      return class04995.B(var1, this.Ns, this.NP) * 0.11F * (float) Math.PI;
   }

   @Override
   public void y(@Nullable class07438 var1) {
      if (this.t() && var1 == null) {
         this.B(false);
      }

      super.y(var1);
   }

   private void y(int var1, boolean var2) {
      if (var2) {
         this.field_6011.N(Z, (byte)(this.field_6011.N(Z) | var1));
      } else {
         this.field_6011.N(Z, (byte)(this.field_6011.N(Z) & ~var1));
      }
   }

   public void E(boolean var1) {
      this.y(8, var1);
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      if (var1.z() < 0.2F) {
         float fx = var1.z();
         class06584 class06584;
         if (fx < 0.05F) {
            class06584 = new class06584(class06570.Ty);
         } else if (fx < 0.2F) {
            class06584 = new class06584(class06570.jO);
         } else if (fx < 0.4F) {
            class06584 = var1.Z() ? new class06584(class06570.Gp) : new class06584(class06570.GF);
         } else if (fx < 0.6F) {
            class06584 = new class06584(class06570.bL);
         } else if (fx < 0.8F) {
            class06584 = new class06584(class06570.js);
         } else {
            class06584 = new class06584(class06570.Tr);
         }

         this.method_5673(class07085.field_6173, class06584);
      }
   }

   @Override
   protected void N(class04782 var1, class00717 var2) {
      class06584 class06584 = var2.N();
      if (this.L(class06584)) {
         int ix = class06584.c();
         if (ix > 1) {
            this.B(class06584.N(ix - 1));
         }

         this.M(this.method_6118(class07085.field_6173));
         this.method_29499(var2);
         this.method_5673(class07085.field_6173, class06584.N(1));
         this.N(class07085.field_6173);
         this.method_6103(var2, class06584.c());
         var2.method_31472();
         this.NT = 0;
      }
   }

   public static boolean N(class06165 var0, class07438 var1) {
      double d0 = var1.method_23321() - var0.method_23321();
      double d1 = var1.method_23317() - var0.method_23317();
      double d2 = d0 / d1;
      byte b0 = 6;

      for (int ix = 0; ix < 6; ix++) {
         double d3 = d2 == 0.0 ? 0.0 : d0 * (ix / 6.0F);
         double d4 = d2 == 0.0 ? d1 * (ix / 6.0F) : d3 / d2;

         for (int j = 1; j < 4; j++) {
            if (!var0.method_73183().method_8320(class07209.method_49637(var0.method_23317() + d4, var0.method_23318() + j, var0.method_23321() + d3)).d()) {
               return false;
            }
         }
      }

      return true;
   }

   private void N(class08372<class07438> var1) {
      if (this.field_6011.N(f).isPresent()) {
         this.field_6011.N(C, Optional.of(var1));
      } else {
         this.field_6011.N(f, Optional.of(var1));
      }
   }

   @Override
   protected void N(class08036 var1, class07079 var2) {
      ((class06165)var2).N(var1);
   }

   public void N(boolean var1) {
      this.y(1, var1);
   }

   @Nullable
   public class06165 y(class04782 var1, class07077 var2) {
      class06165 class06165 = class07078.Ni.N(var1, class06113.field_16466);
      if (class06165 != null) {
         class06165.N(this.field_5974.Z() ? this.W() : ((class06165)var2).W());
      }

      return class06165;
   }

   public static boolean N(class07078<class06165> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Lv) && N(var1, var3);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class01319 class01319 = class01319.N(var1.i(this.method_24515()));
      boolean flag = false;
      if (var4 instanceof class09465 class09465) {
         class01319 = class09465.N;
         if (class09465.N() >= 2) {
            flag = true;
         }
      } else {
         var4 = new class09465(class01319);
      }

      this.N(class01319);
      if (flag) {
         this.u(-24000);
      }

      if (var1 instanceof class04782) {
         this.I();
      }

      this.N(var1.method_8409(), var2);
      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NO);
   }

   private void N(class01319 var1) {
      this.field_6011.N(B, var1.N());
   }

   private boolean N(int var1) {
      return (this.field_6011.N(Z) & var1) != 0;
   }

   void N(class07438 var1) {
      this.N(class08372.N(var1));
   }

   public class01319 W() {
      return class01319.N(this.field_6011.N(B));
   }

   private boolean R(class06584 var1) {
      return var1.L(class02484.d) && var1.L(class02484.w);
   }

   @Override
   protected void O() {
      this.method_5783(class04909.UD, 1.0F, 1.0F);
   }

   @Override
   public boolean G() {
      return this.N(16);
   }

   void Y() {
      this.E(false);
      this.U(false);
      this.N(false);
      this.Z(false);
      this.B(false);
      this.M(false);
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.55F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NJ) {
         this.N(method_66651(class02484.NJ, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   public boolean method_6113() {
      return this.N(32);
   }

   @Override
   protected void l_() {
      this.NE = new class07952<>(this, class07633.class, 10, false, false, (var0, var1) -> var0 instanceof class07628 || var0 instanceof class07879);
      this.NW = new class07952<>(this, class07872.class, 10, false, false, class07872.y);
      this.Nm = new class07952<>(this, class07629.class, 20, false, false, (var0, var1) -> var0 instanceof class07643);
      this.e.N(0, new class01298(this));
      this.e.N(0, new class03559(this, this.method_73183()));
      this.e.N(1, new class06152(this));
      this.e.N(2, new class09459(this, 2.2));
      this.e.N(3, new class06167(this, 1.0));
      this.e.N(4, new class07464<>(this, class08036.class, 16.0F, 1.6, 1.4, var1 -> x.test(var1) && !this.u(var1) && !this.t()));
      this.e.N(4, new class07464<>(this, class07894.class, 8.0F, 1.6, 1.4, var1 -> !((class07894)var1).NQ() && !this.t()));
      this.e.N(4, new class07464<>(this, class07869.class, 8.0F, 1.6, 1.4, var1 -> !this.t()));
      this.e.N(5, new class01306(this));
      this.e.N(6, new class01287(this));
      this.e.N(6, new class01305(this, 1.25));
      this.e.N(7, new class01326(this, 1.2F, true));
      this.e.N(7, new class01290(this));
      this.e.N(8, new class01300(this, 1.25));
      this.e.N(9, new class01302(this, 32, 200));
      this.e.N(10, new class06177(this, 1.2F, 12, 1));
      this.e.N(10, new class07982(this, 0.4F));
      this.e.N(11, new class07957(this, 1.0));
      this.e.N(11, new class01308(this));
      this.e.N(12, new class01324(this, this, (float)class08036.class, 24.0F));
      this.e.N(13, new class01330(this));
      this.H.N(3, new class06136(this, (boolean)class07438.class, false, false, (var1, var2) -> S.test(var1) && !this.u(var1)));
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.Ux;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? h : super.method_55694(var1);
   }

   @Override
   public void method_6007() {
      if (!this.method_73183().method_8608() && this.method_5805() && this.method_6034()) {
         this.NT++;
         class06584 class06584x = this.method_6118(class07085.field_6173);
         if (this.i(class06584x)) {
            if (this.NT > 600) {
               class06584 class06584x = class06584x.N(this.method_73183(), this);
               if (!class06584x.R()) {
                  this.method_5673(class07085.field_6173, class06584x);
               }

               this.NT = 0;
            } else if (this.NT > 560 && this.field_5974.z() < 0.1F) {
               this.O();
               this.method_73183().method_8421(this, (byte)45);
            }
         }

         class07438 class07438 = this.T();
         if (class07438 == null || !class07438.method_5805()) {
            this.U(false);
            this.E(false);
         }
      }

      if (this.method_6113() || this.method_6062()) {
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
         super.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
         super.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
      }

      super.method_6007();
      if (this.t() && this.field_5974.z() < 0.05F) {
         this.method_5783(class04909.Uf, 1.0F, 1.0F);
      }
   }

   @Override
   public void method_16080(class04782 var1, class07072 var2) {
      class06584 class06584 = this.method_6118(class07085.field_6173);
      if (!class06584.R()) {
         this.method_5775(var1, class06584);
         this.method_5673(class07085.field_6173, class06584.E);
      }

      super.method_16080(var1, var2);
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_6173 && this.method_5936();
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Uh;
   }

   @Override
   public boolean method_6062() {
      return this.method_29504();
   }
}
