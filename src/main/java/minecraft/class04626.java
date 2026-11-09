package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04626 extends class07633 implements class01279, class07650 {
   public static final float N = 120.32113F;
   public static final int y = class04995.u(1.4959966F);
   private static final class02131<Byte> D = class03289.N(class04626.class, class02154.N);
   private static final class02131<Long> h = class03289.N(class04626.class, class02154.L);
   private static final int r = 2;
   private static final int NN = 4;
   private static final int Ny = 8;
   private static final int NL = 1200;
   private static final int NE = 600;
   private static final int NW = 3600;
   private static final int Nm = 4;
   private static final int NP = 10;
   private static final int Ns = 10;
   private static final int NT = 18;
   private static final int Nb = 48;
   private static final int Nj = 2;
   private static final int Nv = 24;
   private static final int Nn = 16;
   private static final int Nt = 16;
   private static final int NG = 20;
   public static final String L = "CropsGrownSincePollination";
   public static final String u = "CannotEnterHiveTicks";
   public static final String i = "TicksSincePollination";
   public static final String R = "HasStung";
   public static final String M = "HasNectar";
   public static final String B = "flower_pos";
   public static final String Z = "hive_pos";
   public static final boolean X = false;
   private static final boolean Nl = false;
   private static final int Nd = 0;
   private static final int Nw = 0;
   private static final int Nk = 0;
   private static final class02135 NY = class01517.N(20, 39);
   @Nullable
   private class08372<class07438> NQ;
   private float NO;
   private float Ng;
   private int NI;
   int p = 0;
   private int NJ = 0;
   private int No = 0;
   private static final int Nq = 200;
   int F;
   private static final int NK = 200;
   private static final int NV = 20;
   private static final int Ne = 60;
   int A = class04995.N(this.field_5974, 20, 60);
   @Nullable
   class07209 f;
   @Nullable
   class07209 C;
   class04599 S;
   class04623 x;
   private class04612 NH;
   private int Nc;

   public void w() {
      this.p = 0;
   }

   public static class05300 No() {
      return class07633.Ne().N(class05298.n, 10.0).N(class05298.m, 0.6F).N(class05298.l, 0.3F).N(class05298.u, 2.0);
   }

   private void M(boolean var1) {
      this.y(4, var1);
   }

   public boolean M(class07209 var1) {
      class00394 class00394 = this.method_73183().method_8321(var1);
      return class00394 instanceof class04620 ? !((class04620)class00394).u() : false;
   }

   @Nullable
   public class07209 Q() {
      return this.C;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(D, (byte)0);
      var1.N(h, -1L);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.NI() && this.o() < 10 && this.field_5974.z() < 0.05F) {
         for (int ix = 0; ix < this.field_5974.y(2) + 1; ix++) {
            this.N(
               this.method_73183(),
               this.method_23317() - 0.3F,
               this.method_23317() + 0.3F,
               this.method_23321() - 0.3F,
               this.method_23321() + 0.3F,
               this.method_23323(0.5),
               class07107.NQ
            );
         }
      }

      this.NV();
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         this.S.E();
         return super.method_64397(var1, var2, var3);
      }
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Override
   public boolean method_5776() {
      return this.y() && this.field_6012 % y == 0;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.y("hive_pos", class07209.field_25064, this.C);
      var1.y("flower_pos", class07209.field_25064, this.f);
      var1.N("HasNectar", this.NI());
      var1.N("HasStung", this.NJ());
      var1.N("TicksSincePollination", this.p);
      var1.N("CannotEnterHiveTicks", this.NJ);
      var1.N("CropsGrownSincePollination", this.No);
      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("HasNectar", false));
      this.M(var1.N("HasStung", false));
      this.p = var1.N("TicksSincePollination", 0);
      this.NJ = var1.N("CannotEnterHiveTicks", 0);
      this.No = var1.N("CropsGrownSincePollination", 0);
      this.C = var1.<class07209>N("hive_pos", class07209.field_25064).orElse(null);
      this.f = var1.<class07209>N("flower_pos", class07209.field_25064).orElse(null);
      this.N(this.method_73183(), var1);
   }

   public class04626(class07078<? extends class04626> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class07460(this, 20, true);
      this.o = new class04598(this, this);
      this.N(class04425.field_9, -1.0F);
      this.N(class04425.field_18, -1.0F);
      this.N(class04425.field_4, 16.0F);
      this.N(class04425.field_21516, -1.0F);
      this.N(class04425.field_10, -1.0F);
   }

   private void B(boolean var1) {
      this.y(2, var1);
   }

   public class07467 I() {
      return this.e;
   }

   boolean i(class07209 var1) {
      return !this.y(var1, 48);
   }

   @Override
   protected class04891 s() {
      return null;
   }

   public int n() {
      return Math.max(this.x.L, this.NH.y);
   }

   @Override
   void l() {
      this.f = null;
      this.A = class04995.N(this.field_5974, 20, 60);
   }

   boolean d() {
      return this.NJ <= 0 && !this.S.U() && !this.NJ() && this.T() == null
         ? (this.NI() || this.NK() || this.method_73183().method_75728().N(class00608.X, this.method_73189())) && !this.Np()
         : false;
   }

   @Nullable
   public class07209 m() {
      return this.f;
   }

   int o() {
      return this.No;
   }

   public List<class07209> t() {
      return this.x.u;
   }

   public boolean v() {
      return this.f != null;
   }

   public float u(float var1) {
      return class04995.B(var1, this.Ng, this.NO);
   }

   public void y(class07209 var1) {
      this.f = var1;
   }

   private boolean y(int var1) {
      return (this.field_6011.N(D) & var1) != 0;
   }

   boolean y(class07209 var1, int var2) {
      return var1.method_19771(this.method_24515(), var2);
   }

   private void y(int var1, boolean var2) {
      if (var2) {
         this.field_6011.N(D, (byte)(this.field_6011.N(D) | var1));
      } else {
         this.field_6011.N(D, (byte)(this.field_6011.N(D) & ~var1));
      }
   }

   @Override
   public boolean y() {
      return !this.method_24828();
   }

   @Override
   public long E() {
      return this.field_6011.N(h);
   }

   @Override
   protected void N(class04782 var1) {
      boolean flag = this.NJ();
      if (this.method_5799()) {
         this.Nc++;
      } else {
         this.Nc = 0;
      }

      if (this.Nc > 20) {
         this.method_64397(var1, this.method_48923().Z(), 1.0F);
      }

      if (flag) {
         this.NI++;
         if (this.NI % 5 == 0 && this.field_5974.y(class04995.N(1200 - this.NI, 1, 1200)) == 0) {
            this.method_64397(var1, this.method_48923().s(), this.method_6032());
         }
      }

      if (!this.NI()) {
         this.p++;
      }

      this.N(var1, false);
   }

   public void N(int var1) {
      this.NJ = var1;
   }

   void N(class07209 var1) {
      class06889 class06889x = class06889.L(var1);
      byte b0 = 0;
      class07209 class07209 = this.method_24515();
      int ix = (int)class06889x.B - class07209.method_10264();
      if (ix > 2) {
         b0 = 4;
      } else if (ix < -2) {
         b0 = -4;
      }

      int j = 6;
      int k = 8;
      int l = class07209.method_19455(var1);
      if (l < 15) {
         j = l / 2;
         k = l / 2;
      }

      class06889 class06889x = class05473.N(this, j, k, b0, class06889x, (float) (Math.PI / 10));
      if (class06889x != null) {
         this.V.y(0.5F);
         this.V.N(class06889x.M, class06889x.B, class06889x.Z, 1.0);
      }
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
         var3.setReturnValue(super.N(var1, var2));
      }
   }

   @Override
   public void N(@Nullable class08372<class07438> var1) {
      this.NQ = var1;
   }

   private void N(class07299 var1, double var2, double var4, double var6, double var8, double var10, class07126 var12) {
      var1.method_8406(var12, class04995.u(var1.field_9229.U(), var2, var4), var10, class04995.u(var1.field_9229.U(), var6, var8), 0.0, 0.0, 0.0);
   }

   @Override
   public void N(long var1) {
      this.field_6011.N(h, var1);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return var2.method_8320(var1).P() ? 10.0F : 0.0F;
   }

   void N(boolean var1) {
      if (var1) {
         this.w();
      }

      this.y(8, var1);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class06584 class06584 = var1.method_5998(var2);
         if (this.N(class06584)) {
            class06581 class06581 = class06584.B();
            if (class06581 instanceof class06918) {
               class00891 class00891 = ((class06918)class06581).L();
               if (class00891 instanceof class00729) {
                  class07055 class07055 = ((class00729)class00891).y();
                  if (class07055 != null) {
                     this.N(var1, var2, class06584);
                     if (!this.method_73183().method_8608()) {
                        this.method_6092(class07055);
                     }

                     return class07082.N;
                  }
               }
            }
         }

         return super.N(var1, var2);
      }
   }

   @Override
   protected class07623 N(class07299 var1) {
      class04632 class04632 = new class04632(this, this, var1);
      class04632.y(false);
      class04632.N(false);
      class04632.N(48.0F);
      return class04632;
   }

   public static boolean N(class00500 var0) {
      if (var0.N(class01210.Nb)) {
         if (var0.N(class06665.q, false)) {
            return false;
         } else {
            return var0.N(class00869.zt) ? var0.L(class06761.y) == class08059.field_12609 : true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Nb);
   }

   @Nullable
   public class04626 y(class04782 var1, class07077 var2) {
      return class07078.m.N(var1, class06113.field_16466);
   }

   private boolean NA() {
      return this.y(2);
   }

   @Nullable
   @Override
   public class08372<class07438> W() {
      return this.NQ;
   }

   public void R(class07209 var1) {
      this.C = var1;
   }

   void G() {
      this.C = null;
      this.F = 200;
   }

   public boolean Y() {
      return this.C != null;
   }

   @Nullable
   class04620 NO() {
      if (this.C == null) {
         return null;
      } else {
         return this.i(this.C) ? null : this.method_73183().N(this.C, class00404.field_20431).orElse(null);
      }
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.5F * this.method_5751(), this.method_17681() * 0.2F);
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
      super.method_74589(var1, var2);
      var2.N(class00429.y, () -> new class00433(Optional.ofNullable(this.Q()), Optional.ofNullable(this.m()), this.n(), this.t()));
   }

   @Override
   protected void l_() {
      this.e.N(0, new class04624(this, this, 1.4F, true));
      this.e.N(1, new class04635(this));
      this.e.N(2, new class07434(this, 1.0));
      this.e.N(3, new class07960(this, 1.25, var0 -> var0.N(class01226.Nb), false));
      this.e.N(3, new class04600(this));
      this.e.N(3, new class04629(this));
      this.S = new class04599(this);
      this.e.N(4, this.S);
      this.e.N(5, new class07459(this, 1.25));
      this.e.N(5, new class04619(this));
      this.x = new class04623(this);
      this.e.N(5, this.x);
      this.NH = new class04612(this);
      this.e.N(6, this.NH);
      this.e.N(7, new class04605(this));
      this.e.N(8, new class04627(this));
      this.e.N(9, new class07427(this));
      this.H.N(1, new class04603(this, this).N(new Class[0]));
      this.H.N(2, new class04617(this));
      this.H.N(3, new class01251<>(this, true));
   }

   void NQ() {
      this.No++;
   }

   private boolean NK() {
      return this.p > 3600;
   }

   private boolean Np() {
      class04620 class04620 = this.NO();
      return class04620 != null && class04620.N();
   }

   private void NF() {
      this.No = 0;
   }

   boolean Ng() {
      return this.NO() != null;
   }

   public boolean NJ() {
      return this.y(4);
   }

   public boolean NI() {
      return this.y(8);
   }

   private void NV() {
      this.Ng = this.NO;
      if (this.NA()) {
         this.NO = Math.min(1.0F, this.NO + 0.2F);
      } else {
         this.NO = Math.max(0.0F, this.NO - 0.24F);
      }
   }

   public void Nq() {
      this.N(false);
      this.NF();
   }

   @Override
   public class04891 method_6002() {
      return class04909.LN;
   }

   @Override
   public float method_6107() {
      return 0.4F;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (!this.method_73183().method_8608()) {
         if (this.NJ > 0) {
            this.NJ--;
         }

         if (this.F > 0) {
            this.F--;
         }

         if (this.A > 0) {
            this.A--;
         }

         boolean flag = this.P_() && !this.NJ() && this.T() != null && this.T().method_5858(this) < 4.0;
         this.B(flag);
         if (this.field_6012 % 20 == 0 && !this.Ng()) {
            this.C = null;
         }
      }
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      class07072 class07072 = this.method_48923().N((class07438)this);
      boolean flag = var2.method_64397(var1, class07072, (int)this.method_45325(class05298.u));
      if (flag) {
         class07323.N(var1, var2, class07072);
         if (var2 instanceof class07438 class07438) {
            class07438.method_21755(class07438.method_21753() + 1);
            byte b0 = 0;
            if (this.method_73183().y() == class07086.field_5802) {
               b0 = 10;
            } else if (this.method_73183().y() == class07086.field_5807) {
               b0 = 18;
            }

            if (b0 > 0) {
               class07438.method_37222(new class07055(class07047.j, b0 * 20, 0), this);
            }
         }

         this.M(true);
         this.R_();
         this.method_5783(class04909.Li, 1.0F, 1.0F);
      }

      return flag;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Ly;
   }

   @Override
   public void method_6010(class03530<class04651> var1) {
      this.method_18799(this.method_18798().y(0.0, 0.01, 0.0));
   }

   @Override
   public void W_() {
      this.y(NY.N(this.field_5974));
   }
}
