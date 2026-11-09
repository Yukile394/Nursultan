package minecraft;

import Nursultan.class10848;
import Nursultan.class10850;
import Nursultan.class10853;
import org.jspecify.annotations.Nullable;

public class class07879 extends class07633 {
   public static final double N = 0.6;
   public static final double y = 0.8;
   public static final double L = 1.0;
   public static final double u = 2.2;
   public static final double i = 1.4;
   private static final class02131<Integer> M = class03289.N(class07879.class, class02154.y);
   private static final int B = 0;
   private static final class01894 Z = class01894.y("killer_bunny");
   private static final int X = 3;
   private static final int p = 5;
   private static final class01894 F = class01894.y("evil");
   private static final int A = 8;
   private static final int f = 40;
   private int C;
   private int S;
   private boolean x;
   private int D;
   int R = 0;

   public void L(double var1) {
      this.f().N(var1);
      this.q.N(this.q.u(), this.q.i(), this.q.R(), var1);
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Nc);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(M, class07897.field_57617.field_41570);
   }

   @Override
   public class04911 method_5634() {
      return this.v() == class07897.field_41567 ? class04911.field_15251 : class04911.field_15254;
   }

   @Override
   public boolean method_27298() {
      return false;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("RabbitType", class07897.field_56654, this.v());
      var1.N("MoreCarrotTicks", this.R);
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Nc ? method_66651(var1, this.v()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class07897>N("RabbitType", class07897.field_56654).orElse(class07897.field_57617));
      this.R = var1.N("MoreCarrotTicks", 0);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 1) {
         this.method_5839();
         this.S = 10;
         this.C = 0;
      } else {
         super.method_5711(var1);
      }
   }

   public class07879(class07078<? extends class07879> var1, class07299 var2) {
      super(var1, var2);
      this.K = new class07873(this);
      this.q = new class07863(this);
      this.L(0.0);
   }

   public void B() {
      this.method_6100(true);
      this.S = 10;
      this.C = 0;
   }

   @Override
   protected class04891 s() {
      return class04909.lq;
   }

   boolean n() {
      return this.R <= 0;
   }

   private void l() {
      if (this.q.L() < 2.2) {
         this.D = 10;
      } else {
         this.D = 1;
      }
   }

   private void d() {
      this.l();
      this.G();
   }

   protected class04891 m() {
      return class04909.lH;
   }

   private void t() {
      ((class07873)this.K).N(true);
   }

   public class07897 v() {
      return class07897.N(this.field_6011.N(M));
   }

   public float u(float var1) {
      return this.S == 0 ? 0.0F : (this.C + var1) / this.S;
   }

   public static boolean N(class07078<class07879> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Lj) && N(var1, var3);
   }

   private void N(class07897 var1) {
      if (var1 == class07897.field_41567) {
         this.method_5996(class05298.y).N(8.0);
         this.e.N(4, new class07999(this, 1.4, true));
         this.H.N(1, new class07989(this).N());
         this.H.N(2, new class07952<>(this, class08036.class, true));
         this.H.N(2, new class07952<>(this, class07894.class, true));
         this.method_5996(class05298.u).N(new class07471(F, 5.0, class07463.field_6328));
         if (!this.method_16914()) {
            this.method_5665(class00392.L(class07536.N("entity", Z)));
         }
      } else {
         this.method_5996(class05298.u).L(F);
      }

      this.field_6011.N(M, var1.field_41570);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class07897 class07897 = N(var1, this.method_24515());
      if (var4 instanceof class10848) {
         class07897 = ((class10848)var4).N;
      } else {
         var4 = new class10848(class07897);
      }

      this.N(class07897);
      return super.N(var1, var2, var3, (class07446)var4);
   }

   private static class07897 N(class07284 var0, class07209 var1) {
      class03556<class00780> class03556 = var0.i(var1);
      int ix = var0.method_8409().y(100);
      if (class03556.N(class03557.NZ)) {
         return ix < 80 ? class07897.field_41562 : class07897.field_41564;
      } else if (class03556.N(class03557.NB)) {
         return class07897.field_41565;
      } else {
         return ix < 50 ? class07897.field_41561 : (ix < 90 ? class07897.field_41566 : class07897.field_41563);
      }
   }

   private void N(double var1, double var3) {
      this.method_36456((float)(class04995.u(var3 - this.method_23321(), var1 - this.method_23317()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   @Override
   public void N(class04782 var1) {
      if (this.D > 0) {
         this.D--;
      }

      if (this.R > 0) {
         this.R = this.R - this.field_5974.y(3);
         if (this.R < 0) {
            this.R = 0;
         }
      }

      if (this.method_24828()) {
         if (!this.x) {
            this.method_6100(false);
            this.d();
         }

         if (this.v() == class07897.field_41567 && this.D == 0) {
            class07438 class07438 = this.T();
            if (class07438 != null && this.method_5858(class07438) < 16.0) {
               this.N(class07438.method_23317(), class07438.method_23321());
               this.q.N(class07438.method_23317(), class07438.method_23318(), class07438.method_23321(), this.q.L());
               this.B();
               this.x = true;
            }
         }

         class07873 class07873 = (class07873)this.K;
         if (!class07873.L()) {
            if (this.q.y() && this.D == 0) {
               class00143 class00143 = this.V.Z();
               class06889 class06889 = new class06889(this.q.u(), this.q.i(), this.q.R());
               if (class00143 != null && !class00143.L()) {
                  class06889 = class00143.N(this);
               }

               this.N(class06889.M, class06889.Z);
               this.B();
            }
         } else if (!class07873.u()) {
            this.t();
         }
      }

      this.x = this.method_24828();
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.yy);
   }

   @Nullable
   public class07879 y(class04782 var1, class07077 var2) {
      class07879 class07879x = class07078.yM.N(var1, class06113.field_16466);
      if (class07879x != null) {
         class07897 class07897 = N(var1, this.method_24515());
         if (this.field_5974.y(20) != 0) {
            if (var2 instanceof class07879 class07879x && this.field_5974.Z()) {
               class07897 = class07879x.v();
            } else {
               class07897 = this.v();
            }
         }

         class07879x.N(class07897);
      }

      return class07879x;
   }

   public static class05300 W() {
      return class07633.Ne().N(class05298.n, 3.0).N(class05298.l, 0.3F).N(class05298.u, 3.0);
   }

   private void G() {
      ((class07873)this.K).N(false);
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.6F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Nc) {
         this.N(method_66651(class02484.Nc, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07427(this));
      this.e.N(1, new class03559(this, this.method_73183()));
      this.e.N(1, new class10850(this, 2.2));
      this.e.N(2, new class07434(this, 0.8));
      this.e.N(3, new class07960(this, 1.0, var0 -> var0.N(class01226.yy), false));
      this.e.N(4, new class10853<>(this, class08036.class, 8.0F, 2.2, 2.2));
      this.e.N(4, new class10853<>(this, class07894.class, 10.0F, 2.2, 2.2));
      this.e.N(4, new class10853<>(this, class07150.class, 4.0F, 2.2, 2.2));
      this.e.N(5, new class07891(this));
      this.e.N(6, new class07957(this, 0.6));
      this.e.N(11, new class07962(this, class08036.class, 10.0F));
   }

   @Override
   public float method_6106() {
      float fx = 0.3F;
      if (this.q.L() <= 0.6) {
         fx = 0.2F;
      }

      class00143 class00143 = this.V.Z();
      if (class00143 != null && !class00143.L() && class00143.N(this).B > this.method_23318() + 0.5) {
         fx = 0.5F;
      }

      if (this.field_5976 || super.fields_6212a028292fd3c078969e3ee4c71d9e8_4 && this.q.i() > this.method_23318() + 0.5) {
         fx = 0.5F;
      }

      return super.method_56994(fx / 0.42F);
   }

   @Override
   public class04891 method_6002() {
      return class04909.lV;
   }

   @Override
   public void method_59928() {
      if (this.v() == class07897.field_41567) {
         this.method_5783(class04909.lK, 1.0F, (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
      }
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.C != this.S) {
         this.C++;
      } else if (this.S != 0) {
         this.C = 0;
         this.S = 0;
         this.method_6100(false);
      }
   }

   @Override
   public void method_6100(boolean var1) {
      super.method_6100(var1);
      if (var1) {
         this.method_5783(this.m(), this.method_6107(), ((this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void method_6043() {
      super.method_6043();
      if (this.q.L() > 0.0 && this.method_18798().z() < 0.01) {
         this.method_5724(0.1F, new class06889(0.0, 0.0, 1.0));
      }

      if (!this.method_73183().method_8608()) {
         this.method_73183().method_8421(this, (byte)1);
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.le;
   }
}
