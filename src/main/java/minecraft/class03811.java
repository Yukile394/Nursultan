package minecraft;

import Nursultan.class10242;
import com.mojang.serialization.Dynamic;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;

public class class03811 extends class07633 {
   public static final float N = 0.6F;
   public static final float y = 32.5F;
   public static final int L = 80;
   private static final double M = 7.0;
   private static final double B = 2.0;
   private static final class02131<class03829> Z = class03289.N(class03811.class, class02154.I);
   private long X = 0L;
   public final class04396 u = new class04396();
   public final class04396 i = new class04396();
   public final class04396 R = new class04396();
   private int p;
   private boolean F = false;

   private void w() {
      switch (this.n()) {
         case field_47790:
            this.u.N();
            this.i.N();
            this.R.N();
            break;
         case field_47791:
            this.u.N();
            this.i.y(this.field_6012);
            this.R.N();
            break;
         case field_47792:
            this.u.N();
            this.i.N();
            if (this.F) {
               this.R.N();
               this.F = false;
            }

            if (this.X == 0L) {
               this.R.N(this.field_6012);
               this.R.N(class03829.field_47792.y(), 1.0F);
            } else {
               this.R.y(this.field_6012);
            }
            break;
         case field_49084:
            this.u.y(this.field_6012);
            this.i.N();
            this.R.N();
      }
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (Z.equals(var1)) {
         this.X = 0L;
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(Z, class03829.field_47790);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         this.w();
      }

      if (this.W()) {
         this.NM();
      }

      this.X++;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.W()) {
         var3 = (var3 - 1.0F) / 2.0F;
      }

      return super.method_64397(var1, var2, var3);
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.NM, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("state", class03829.field_47794, this.n());
      var1.N("scute_time", this.p);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class03829>N("state", class03829.field_47794).orElse(class03829.field_47790));
      var1.i("scute_time").ifPresent(var1x -> this.p = var1x);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 64 && this.method_73183().method_8608()) {
         this.F = true;
         this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.NW, this.method_5634(), 1.0F, 1.0F, false);
      } else {
         super.method_5711(var1);
      }
   }

   public class03811(class07078<? extends class07633> var1, class07299 var2) {
      super(var1, var2);
      this.f().N(true);
      this.p = this.d();
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 12.0).N(class05298.l, 0.14);
   }

   @Override
   protected class04891 s() {
      return this.W() ? null : class04909.NR;
   }

   public class03829 n() {
      return this.field_6011.N(Z);
   }

   public boolean l() {
      return !this.Nk() && !this.method_52535() && !this.g_() && !this.method_5765() && !this.method_5782();
   }

   private int d() {
      return this.field_5974.y(20 * class01517.i * 5) + 20 * class01517.i * 5;
   }

   public boolean m() {
      return this.n().N(this.X);
   }

   public void t() {
      if (!this.W()) {
         this.NN();
         this.Na();
         this.method_32876(class01194.n);
         this.method_56078(class04909.NZ);
         this.N(class03829.field_47791);
      }
   }

   public boolean v() {
      return this.n() == class03829.field_47791 && this.X > class03829.field_47791.y();
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.M.N(var1, class06113.field_16466);
   }

   public boolean N(@Nullable class07049 var1, class06584 var2) {
      if (this.method_6109()) {
         return false;
      } else {
         if (this.method_73183() instanceof class04782 class04782) {
            this.method_72394(class04782, class06273.NS, var1, var2, this::method_5775);
            this.method_43077(class04909.NP);
            this.method_32876(class01194.b);
         }

         return true;
      }
   }

   private boolean N(class03811 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_5) && var1.W();
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (class06584.N(class06570.kN) && this.N(var1, class06584)) {
         class06584.N(16, var1, var2.N());
         return class07082.N;
      } else {
         return (class07082)(this.N(this) ? class07082.u : super.N(var1, var2));
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.NF);
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("armadilloBrain");
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(var1, this);
      class04643.L();
      class04643.N("armadilloActivityUpdate");
      class03806.N(this);
      class04643.L();
      if (this.method_5805() && --this.p <= 0 && this.method_27071(var1)) {
         if (this.method_64169(var1, class06273.NK, this::method_5775)) {
            this.method_5783(class04909.NU, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
            this.method_32876(class01194.v);
         }

         this.p = this.d();
      }

      super.N(var1);
   }

   public void N(class03829 var1) {
      this.field_6011.N(Z, var1);
   }

   public boolean N(class07438 var1) {
      if (!this.method_5829().L(7.0, 2.0, 7.0).L(var1.method_5829())) {
         return false;
      } else if (var1.method_5864().N(class01217.u)) {
         return true;
      } else if (this.method_6065() == var1) {
         return true;
      } else if (var1 instanceof class08036 class08036) {
         return class08036.method_7325() ? false : class08036.method_5624() || class08036.method_5765();
      } else {
         return false;
      }
   }

   public static boolean N(class07078<class03811> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.LW) && N(var1, var3);
   }

   public boolean W() {
      return this.field_6011.N(Z) != class03829.field_47790;
   }

   @Override
   protected void O() {
      this.method_56078(class04909.NL);
   }

   public void G() {
      if (this.W()) {
         this.method_32876(class01194.n);
         this.method_56078(class04909.NE);
         this.N(class03829.field_47790);
      }
   }

   @Override
   public int NR() {
      return this.W() ? 0 : 32;
   }

   @Override
   protected class07472 Z_() {
      return new class10242(this, this);
   }

   @Override
   public class05781<class03811> method_28306() {
      return class03806.N();
   }

   @Override
   public class04891 method_6002() {
      return class04909.NB;
   }

   @Override
   public float method_17825() {
      return this.method_6109() ? 0.6F : 1.0F;
   }

   @Override
   public void method_6074(class04782 var1, class07072 var2, float var3) {
      super.method_6074(var1, var2, var3);
      if (!this.Nt() && !this.method_29504()) {
         if (var2.u() instanceof class07438) {
            this.method_18868().N(class05378.o, true, 80L);
            if (this.l()) {
               this.t();
            }
         } else if (var2.N(class03696.J)) {
            this.G();
         }
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.W() ? class04909.Ni : class04909.Nu;
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class03806.N(this.method_28306().N(var1));
   }

   @Override
   public boolean T_() {
      return super.T_() && !this.W();
   }
}
