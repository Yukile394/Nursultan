package minecraft;

import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class00681 extends class07438 {
   public static final int N = 5;
   private static final boolean d = true;
   public static final class00744 y = new class00744(0.0F, 0.0F, 0.0F);
   public static final class00744 L = new class00744(0.0F, 0.0F, 0.0F);
   public static final class00744 u = new class00744(-10.0F, 0.0F, -10.0F);
   public static final class00744 i = new class00744(-15.0F, 0.0F, 10.0F);
   public static final class00744 R = new class00744(-1.0F, 0.0F, -1.0F);
   public static final class00744 M = new class00744(1.0F, 0.0F, 1.0F);
   private static final class01325 w = class01325.L(0.0F, 0.0F);
   private static final class01325 k = class07078.B.E().N(0.5F).y(0.9875F);
   private static final double Y = 0.1;
   private static final double Q = 0.9;
   private static final double O = 0.4;
   private static final double g = 1.6;
   public static final int B = 8;
   public static final int Z = 16;
   public static final int W = 1;
   public static final int m = 4;
   public static final int P = 8;
   public static final int s = 16;
   public static final class02131<Byte> T = class03289.N(class00681.class, class02154.N);
   public static final class02131<class00744> b = class03289.N(class00681.class, class02154.m);
   public static final class02131<class00744> j = class03289.N(class00681.class, class02154.m);
   public static final class02131<class00744> v = class03289.N(class00681.class, class02154.m);
   public static final class02131<class00744> n = class03289.N(class00681.class, class02154.m);
   public static final class02131<class00744> t = class03289.N(class00681.class, class02154.m);
   public static final class02131<class00744> G = class03289.N(class00681.class, class02154.m);
   private static final Predicate<class07049> I = var0 -> var0 instanceof class07504 && ((class07504)var0).Z();
   private static final boolean J = false;
   private static final int o = 0;
   private static final boolean q = false;
   private static final boolean K = false;
   private static final boolean V = false;
   private static final boolean e = false;
   private boolean H = false;
   public long l;
   private int c = 0;

   public void L(class00744 var1) {
      this.field_6011.N(v, var1);
   }

   private void L(boolean var1) {
      this.field_6011.N(T, this.N(this.field_6011.N(T), 1, var1));
   }

   public boolean L() {
      return (this.field_6011.N(T) & 4) != 0;
   }

   public class00744 M() {
      return this.field_6011.N(j);
   }

   private void P() {
      this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.NO, this.method_5634(), 1.0F, 1.0F);
   }

   @Override
   public boolean method_5696() {
      return this.i();
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
   public boolean method_6034() {
      return super.method_6034() && this.W();
   }

   @Override
   public boolean method_5659(class07307 var1) {
      return var1.B() ? this.method_5767() : true;
   }

   @Override
   public class04641 method_5657() {
      return this.i() ? class04641.field_15975 : super.method_5657();
   }

   @Override
   public class07082 method_5664(class08036 var1, class06889 var2, class07050 var3) {
      class06584 class06584 = var1.method_5998(var3);
      if (this.i() || class06584.N(class06570.lN)) {
         return class07082.i;
      } else if (var1.method_7325()) {
         return class07082.N;
      } else if (var1.method_73183().method_8608()) {
         return class07082.y;
      } else {
         class07085 class07085xx = this.method_32326(class06584);
         if (class06584.R()) {
            class07085 class07085x = this.N(var2);
            class07085 class07085xx = this.N(class07085x) ? class07085xx : class07085x;
            if (this.method_6084(class07085xx) && this.N(var1, class07085xx, class06584, var3)) {
               return class07082.y;
            }
         } else {
            if (this.N(class07085xx)) {
               return class07082.u;
            }

            if (class07085xx.N() == class07043.field_6177 && !this.L()) {
               return class07082.u;
            }

            if (this.N(var1, class07085xx, class06584, var3)) {
               return class07082.y;
            }
         }

         return class07082.i;
      }
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (T.equals(var1)) {
         this.method_18382();
         this.field_23807 = !this.i();
      }

      super.method_5674(var1);
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.GA);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(T, (byte)0);
      var1.N(b, y);
      var1.N(j, L);
      var1.N(v, u);
      var1.N(n, i);
      var1.N(t, R);
      var1.N(G, M);
   }

   @Override
   public void method_5768(class04782 var1) {
      this.method_5650(class07062.field_26998);
      this.method_32876(class01194.s);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_31481()) {
         return false;
      } else if (!var1.method_64395().N(class07305.I) && var2.u() instanceof class07079) {
         return false;
      } else if (var2.N(class03696.u)) {
         this.method_5768(var1);
         return false;
      } else if (this.method_5679(var1, var2) || this.H || this.i()) {
         return false;
      } else if (var2.N(class03696.E)) {
         this.y(var1, var2);
         this.method_5768(var1);
         return false;
      } else if (var2.N(class03696.n)) {
         if (this.method_5809()) {
            this.N(var1, var2, 0.15F);
         } else {
            this.method_5639(5.0F);
         }

         return false;
      } else if (var2.N(class03696.t) && this.method_6032() > 0.5F) {
         this.N(var1, var2, 4.0F);
         return false;
      } else {
         boolean flag = var2.N(class03696.Y);
         boolean flag1 = var2.N(class03696.k);
         if (!flag && !flag1) {
            return false;
         } else if (var2.u() instanceof class08036 class08036 && !class08036.method_31549().i) {
            return false;
         } else if (var2.B()) {
            this.P();
            this.m();
            this.method_5768(var1);
            return true;
         } else {
            long ix = var1.N();
            if (ix - this.l > 5L && !flag1) {
               var1.method_8421(this, (byte)32);
               this.method_32875(class01194.P, var2.u());
               this.l = ix;
            } else {
               this.N(var1, var2);
               this.m();
               this.method_5768(var1);
            }

            return true;
         }
      }
   }

   @Override
   public boolean method_5810() {
      return false;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Invisible", this.method_5767());
      var1.N("Small", this.y());
      var1.N("ShowArms", this.L());
      var1.N("DisabledSlots", this.c);
      var1.N("NoBasePlate", !this.u());
      if (this.i()) {
         var1.N("Marker", this.i());
      }

      var1.N("Pose", class00691.y, this.E());
   }

   @Override
   public class06889 method_31166(float var1) {
      if (this.i()) {
         class00734 class00734 = this.i(false).N(this.method_73189());
         class07209 class07209x = this.method_24515();
         int ix = Integer.MIN_VALUE;

         for (class07209 class07209x : class07209.method_10097(
            class07209.method_49637(class00734.N, class00734.y, class00734.L), class07209.method_49637(class00734.u, class00734.i, class00734.R)
         )) {
            int jx = Math.max(
               this.method_73183().method_8314(class00772.field_9282, class07209x), this.method_73183().method_8314(class00772.field_9284, class07209x)
            );
            if (jx == 15) {
               return class06889.y(class07209x);
            }

            if (jx > ix) {
               ix = jx;
               class07209x = class07209x.method_10062();
            }
         }

         return class06889.y(class07209x);
      } else {
         return super.method_31166(var1);
      }
   }

   @Override
   public boolean method_5863() {
      return super.method_5863() && !this.i();
   }

   @Override
   public boolean method_5640(double var1) {
      double d0 = this.method_5829().N() * 4.0;
      if (Double.isNaN(d0) || d0 == 0.0) {
         d0 = 4.0;
      }

      d0 *= 64.0;
      return var1 < d0 * d0;
   }

   @Override
   public void method_5636(float var1) {
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.field_5982 = var1;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = var1;
      super.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = var1;
   }

   @Override
   public void method_5847(float var1) {
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.field_5982 = var1;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = var1;
      super.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = var1;
   }

   @Override
   public boolean method_6109() {
      return this.y();
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.method_5648(var1.N("Invisible", false));
      this.L(var1.N("Small", false));
      this.N(var1.N("ShowArms", false));
      this.c = var1.N("DisabledSlots", 0);
      this.y(var1.N("NoBasePlate", false));
      this.u(var1.N("Marker", false));
      this.field_5960 = !this.W();
      var1.<class00691>N("Pose", class00691.y).ifPresent(this::N);
   }

   @Override
   public class07070 method_6068() {
      return class07070.field_6183;
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 32) {
         if (this.method_73183().method_8608()) {
            this.method_73183()
               .method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.NI, this.method_5634(), 0.3F, 1.0F, false);
            this.l = this.method_73183().N();
         }
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   public void method_5648(boolean var1) {
      this.H = var1;
      super.method_5648(var1);
   }

   @Override
   public boolean method_5698(class07049 var1) {
      return var1 instanceof class08036 class08036 && !this.method_73183().method_8505(class08036, this.method_24515());
   }

   public class00681(class07078<? extends class00681> var1, class07299 var2) {
      super(var1, var2);
   }

   public class00681(class07299 var1, double var2, double var4, double var6) {
      this(class07078.B, var1);
      this.method_5814(var2, var4, var6);
   }

   public class00744 B() {
      return this.field_6011.N(v);
   }

   public class00744 Z() {
      return this.field_6011.N(n);
   }

   public boolean i() {
      return (this.field_6011.N(T) & 16) != 0;
   }

   private class01325 i(boolean var1) {
      if (var1) {
         return w;
      } else {
         return this.method_6109() ? k : this.method_5864().E();
      }
   }

   public void i(class00744 var1) {
      this.field_6011.N(t, var1);
   }

   private void m() {
      if (this.method_73183() instanceof class04782) {
         ((class04782)this.method_73183())
            .method_65096(
               new class07105(class07107.y, class00869.m.W()),
               this.method_23317(),
               this.method_23323(0.6666666666666666),
               this.method_23321(),
               10,
               this.method_17681() / 4.0F,
               this.method_17682() / 4.0F,
               this.method_17681() / 4.0F,
               0.05
            );
      }
   }

   public class00744 U() {
      return this.field_6011.N(G);
   }

   public class00744 z() {
      return this.field_6011.N(t);
   }

   public boolean u() {
      return (this.field_6011.N(T) & 8) == 0;
   }

   private void u(boolean var1) {
      this.field_6011.N(T, this.N(this.field_6011.N(T), 16, var1));
   }

   public void u(class00744 var1) {
      this.field_6011.N(n, var1);
   }

   private void y(class04782 var1, class07072 var2) {
      this.P();
      this.method_16080(var1, var2);

      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = super.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N(class07085, class06584.E);
         if (!class06584.R()) {
            class00891.N_21(this.method_73183(), this.method_24515().method_10084(), class06584);
         }
      }
   }

   public void y(class00744 var1) {
      this.field_6011.N(j, var1);
   }

   public void y(boolean var1) {
      this.field_6011.N(T, this.N(this.field_6011.N(T), 8, var1));
   }

   public boolean y() {
      return (this.field_6011.N(T) & 1) != 0;
   }

   public class00691 E() {
      return new class00691(this.R(), this.M(), this.B(), this.Z(), this.z(), this.U());
   }

   private List N(class07299 var1, class07049 var2, class00734 var3, Predicate var4) {
      return var4 == I ? var1.N(class07504.class, var3, var1x -> var1x != var2 && var1x.Z()) : var1.method_8333(var2, var3, var4);
   }

   public static class05300 N() {
      return method_26827().N(class05298.O, 0.0);
   }

   public void N(class00691 var1) {
      this.N(var1.N());
      this.y(var1.y());
      this.L(var1.L());
      this.u(var1.u());
      this.i(var1.i());
      this.R(var1.R());
   }

   private class07085 N(class06889 var1) {
      class07085 class07085x = class07085.field_6173;
      boolean flag = this.y();
      double d0 = var1.B / (this.method_55693() * this.method_17825());
      class07085 class07085x = class07085.field_6166;
      if (d0 >= 0.1 && d0 < 0.1 + (flag ? 0.8 : 0.45) && this.method_6084(class07085x)) {
         class07085x = class07085.field_6166;
      } else if (d0 >= 0.9 + (flag ? 0.3 : 0.0) && d0 < 0.9 + (flag ? 1.0 : 0.7) && this.method_6084(class07085.field_6174)) {
         class07085x = class07085.field_6174;
      } else if (d0 >= 0.4 && d0 < 0.4 + (flag ? 1.0 : 0.8) && this.method_6084(class07085.field_6172)) {
         class07085x = class07085.field_6172;
      } else if (d0 >= 1.6 && this.method_6084(class07085.field_6169)) {
         class07085x = class07085.field_6169;
      } else if (!this.method_6084(class07085.field_6173) && this.method_6084(class07085.field_6171)) {
         class07085x = class07085.field_6171;
      }

      return class07085x;
   }

   private void N(class04782 var1, class07072 var2) {
      class06584 class06584 = new class06584(class06570.GA);
      class06584.N(class02484.B, this.method_5797());
      class00891.N_21(this.method_73183(), this.method_24515(), class06584);
      this.y(var1, var2);
   }

   private void N(class04782 var1, class07072 var2, float var3) {
      float f = this.method_6032();
      f -= var3;
      if (f <= 0.5F) {
         this.y(var1, var2);
         this.method_5768(var1);
      } else {
         this.method_6033(f);
         this.method_32875(class01194.P, var2.u());
      }
   }

   public void N(boolean var1) {
      this.field_6011.N(T, this.N(this.field_6011.N(T), 4, var1));
   }

   private byte N(byte var1, int var2, boolean var3) {
      if (var3) {
         var1 = (byte)(var1 | var2);
      } else {
         var1 = (byte)(var1 & ~var2);
      }

      return var1;
   }

   public void N(class00744 var1) {
      this.field_6011.N(b, var1);
   }

   private boolean N(class08036 var1, class07085 var2, class06584 var3, class07050 var4) {
      class06584 class06584 = this.method_6118(var2);
      if (!class06584.R() && (this.c & 1 << var2.y(8)) != 0) {
         return false;
      } else if (class06584.R() && (this.c & 1 << var2.y(16)) != 0) {
         return false;
      } else if (var1.method_56992() && class06584.R() && !var3.R()) {
         this.method_5673(var2, var3.L(1));
         return true;
      } else if (var3.R() || var3.c() <= 1) {
         this.method_5673(var2, var3);
         var1.method_6122(var4, class06584);
         return true;
      } else if (!class06584.R()) {
         return false;
      } else {
         this.method_5673(var2, var3.N(1));
         return true;
      }
   }

   private boolean N(class07085 var1) {
      return (this.c & 1 << var1.y(0)) != 0 || var1.N() == class07043.field_6177 && !this.L();
   }

   private boolean W() {
      return !this.i() && !this.method_5740();
   }

   public class00744 R() {
      return this.field_6011.N(b);
   }

   public void R(class00744 var1) {
      this.field_6011.N(G, var1);
   }

   @Override
   public void method_6087(class07049 var1) {
   }

   @Override
   public void method_6031(float var1) {
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.field_5982;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.method_36454();
   }

   @Override
   public void method_6027() {
      this.method_5648(this.H);
   }

   @Nullable
   @Override
   public class04891 method_6002() {
      return class04909.NO;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.i(this.i());
   }

   @Override
   public boolean method_36608() {
      return !this.method_5767() && !this.i();
   }

   @Override
   public boolean method_6086() {
      return false;
   }

   @Override
   public class07443 method_39760() {
      return new class07443(class04909.Ng, class04909.Ng);
   }

   @Override
   public void method_6091(class06889 var1) {
      if (this.W()) {
         super.method_6091(var1);
      }
   }

   @Nullable
   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.NI;
   }

   @Override
   public void method_6070() {
      class07299 class07299 = this.method_73183();
      class00734 class00734 = this.method_5829();
      Predicate<class07049> predicate = I;
      class00734 class00734x = class00734;
      class07299 class07299x = class07299;

      for (class07049 class07049 : this.N(class07299x, this, class00734x, predicate)) {
         if (this.method_5858(class07049) <= 0.2) {
            class07049.method_5697(this);
         }
      }
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return var1 != class07085.field_48824 && var1 != class07085.field_55946 && !this.N(var1);
   }

   @Override
   public boolean method_6102() {
      return false;
   }
}
