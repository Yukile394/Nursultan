package minecraft;

import org.jspecify.annotations.Nullable;

public class class07162 extends class07079 implements class07542 {
   private static final class02131<Integer> M = class03289.N(class07162.class, class02154.y);
   public static final int N = 1;
   public static final int y = 127;
   public static final int L = 4;
   private static final boolean B = false;
   public float u;
   public float i;
   public float R;
   private boolean Z = false;

   public static boolean L(class07078<class07162> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      if (var1.y() != class07086.field_5801) {
         if (class06113.N(var2)) {
            return y(var0, var1, var2, var3, var4);
         }

         if (var1.i(var3).N(class03557.Nm) && var3.method_10264() > 50 && var3.method_10264() < 70) {
            float f = var1.method_75598().N(class00608.H, var3);
            if (var4.z() < f && var1.U(var3) <= var4.y(8)) {
               return y(var0, var1, var2, var3, var4);
            }
         }

         if (!(var1 instanceof class05974)) {
            return false;
         }

         class07321 class07321 = new class07321(var3);
         boolean flag = class07836.N(class07321.B, class07321.Z, ((class05974)var1).method_8412(), 987234911L).y(10) == 0;
         if (var4.y(10) == 0 && flag && var3.method_10264() < 40) {
            return y(var0, var1, var2, var3, var4);
         }
      }

      return false;
   }

   @Override
   public void method_18382() {
      double d0 = this.method_23317();
      double d1 = this.method_23318();
      double d2 = this.method_23321();
      super.method_18382();
      this.method_5814(d0, d1, d2);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (M.equals(var1)) {
         this.method_18382();
         this.method_36456(super.fields_4212a028292fd3c078969e3ee4c71d9e8_2);
         super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = super.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
         if (this.method_5799() && this.field_5974.y(20) == 0) {
            this.method_5746();
         }
      }

      super.method_5674(var1);
   }

   @Override
   public class07078<? extends class07162> method_5864() {
      return (class07078<? extends class07162>)super.method_5864();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(M, 1);
   }

   @Override
   public void method_5773() {
      this.R = this.i;
      this.i = this.i + (this.u - this.i) * 0.5F;
      super.method_5773();
      if (this.method_24828() && !this.Z) {
         float f = this.method_18377(this.method_18376()).N() * 2.0F;
         float f1 = f / 2.0F;

         for (int ix = 0; ix < f * 16.0F; ix++) {
            float f2 = this.field_5974.z() * (float) (Math.PI * 2);
            float f3 = this.field_5974.z() * 0.5F + 0.5F;
            float f4 = class04995.m(f2) * f1 * f3;
            float f5 = class04995.P(f2) * f1 * f3;
            this.method_73183().method_8406(this.B(), this.method_23317() + f4, this.method_23318(), this.method_23321() + f5, 0.0, 0.0, 0.0);
         }

         this.method_5783(this.v(), this.method_6107(), ((this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F) / 0.8F);
         this.u = -0.5F;
      } else if (!this.method_24828() && this.Z) {
         this.u = 1.0F;
      }

      this.Z = this.method_24828();
      this.E();
   }

   @Override
   public void method_5650(class07062 var1) {
      int ix = this.t();
      if (!this.method_73183().method_8608() && ix > 1 && this.method_29504()) {
         float f = this.method_18377(this.method_18376()).N() / 2.0F;
         int j = ix / 2;
         int k = 2 + this.field_5974.y(3);
         class00502 class00502 = this.method_5781();

         for (int l = 0; l < k; l++) {
            float f1 = (l % 2 - 0.5F) * f;
            float f2 = (l / 2 - 0.5F) * f;
            this.N(this.method_5864(), new class08234(class08731.field_54081, false, false, class00502), class06113.field_16461, var4x -> {
               var4x.N(j, true);
               var4x.method_5808(this.method_23317() + f1, this.method_23318() + 0.5, this.method_23321() + f2, this.field_5974.z() * 360.0F, 0.0F);
            });
         }
      }

      super.method_5650(var1);
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public void method_5697(class07049 var1) {
      super.method_5697(var1);
      if (var1 instanceof class07625 && this.W()) {
         this.N((class07438)var1);
      }
   }

   @Override
   public void method_5694(class08036 var1) {
      if (this.W()) {
         this.N(var1);
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Size", this.t() - 1);
      var1.N("wasOnGround", this.Z);
   }

   @Override
   public void method_5749(class08299 var1) {
      this.N(var1.N("Size", 0) + 1, false);
      super.method_5749(var1);
      this.Z = var1.N("wasOnGround", false);
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      return new class06889(0.0, var2.y() - 0.015625 * this.t() * var3, 0.0);
   }

   public class07162(class07078<? extends class07162> var1, class07299 var2) {
      super(var1, var2);
      this.method_46396();
      this.q = new class07143(this);
   }

   protected class07126 B() {
      return class07107.h;
   }

   protected int Z() {
      return this.field_5974.y(20) + 10;
   }

   protected class04891 n() {
      return this.G() ? class04909.Yw : class04909.kw;
   }

   protected boolean l() {
      return this.t() > 0;
   }

   float d() {
      float f = this.G() ? 1.4F : 0.8F;
      return ((this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F) * f;
   }

   protected float m() {
      return (float)this.method_45325(class05298.u);
   }

   public int t() {
      return this.field_6011.N(M);
   }

   protected class04891 v() {
      return this.G() ? class04909.Yk : class04909.kk;
   }

   protected void E() {
      this.u *= 0.6F;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      int ix = class06069.y(3);
      if (ix < 2 && class06069.z() < 0.5F * var2.u()) {
         ix++;
      }

      int j = 1 << ix;
      this.N(j, true);
      return super.N(var1, var2, var3, var4);
   }

   public void N(int var1, boolean var2) {
      int ix = class04995.N(var1, 1, 127);
      this.field_6011.N(M, ix);
      this.method_23311();
      this.method_18382();
      this.method_5996(class05298.n).N(ix * ix);
      this.method_5996(class05298.l).N(0.2F + 0.1F * ix);
      this.method_5996(class05298.u).N(ix);
      if (var2) {
         this.method_6033(this.method_6063());
      }

      this.J = ix;
   }

   protected void N(class07438 var1) {
      if (this.method_73183() instanceof class04782 class04782 && this.method_5805() && this.L(var1) && this.method_6057(var1)) {
         class07072 class07072 = this.method_48923().y((class07438)this);
         if (var1.method_64397(class04782, class07072, this.m())) {
            this.method_5783(class04909.kG, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
            class07323.N(class04782, (class07049)var1, class07072);
         }
      }
   }

   protected boolean W() {
      return !this.G() && this.method_6034();
   }

   @Override
   public int Ni() {
      return 0;
   }

   @Override
   public boolean G() {
      return this.t() <= 1;
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07161(this));
      this.e.N(2, new class07158(this));
      this.e.N(3, new class07139(this));
      this.e.N(5, new class07174(this));
      this.H.N(1, new class07952<>(this, class08036.class, 10, true, false, (var1, var2) -> Math.abs(var1.method_23318() - this.method_23318()) <= 4.0));
      this.H.N(3, new class07952<>(this, class07625.class, true));
   }

   @Override
   public class04891 method_6002() {
      return this.G() ? class04909.Yl : class04909.kl;
   }

   @Override
   public float method_6107() {
      return 0.4F * this.t();
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return super.method_55694(var1).N(this.t());
   }

   @Override
   public void method_6043() {
      class06889 class06889 = this.method_18798();
      this.method_18800(class06889.M, this.method_6106(), class06889.Z);
      this.field_64356 = true;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.G() ? class04909.Yd : class04909.kd;
   }
}
