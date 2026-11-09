package minecraft;

import com.mojang.serialization.Dynamic;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class08982 extends class07649 implements class05310, class08978 {
   private static final long y = -2L;
   private static final long L = -1L;
   private static final int u = 504000;
   private static final int i = 552000;
   private static final int R = 200;
   private static final int M = 240;
   private static final float B = 10.0F;
   private static final float Z = 0.0058F;
   private static final int W = 60;
   private static final int m = 100;
   private static final class02131<class02774> P = class03289.N(class08982.class, class02154.o);
   private static final class02131<class08979> s = class03289.N(class08982.class, class02154.q);
   @Nullable
   private class07209 T;
   @Nullable
   private UUID b;
   private long X = -1L;
   private int a = 0;
   private final class04396 p = new class04396();
   private final class04396 F = new class04396();
   private final class04396 A = new class04396();
   private final class04396 f = new class04396();
   private final class04396 C = new class04396();
   public static final class07085 N = class07085.field_55946;

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void w() {
      switch (this.B()) {
         case field_61292:
            this.A.N();
            this.F.N();
            this.f.N();
            this.C.N();
            if (this.a == this.field_6012) {
               this.p.N(this.field_6012);
            } else if (this.a == 0) {
               this.a = this.field_6012 + this.field_5974.y(200, 240);
            }

            if (this.field_6012 == this.a + 10.0F) {
               this.Y();
               this.a = 0;
            }
            break;
         case field_61293:
            this.p.N();
            this.a = 0;
            this.A.N();
            this.f.N();
            this.C.N();
            this.F.y(this.field_6012);
            break;
         case field_61294:
            this.p.N();
            this.a = 0;
            this.F.N();
            this.C.N();
            this.f.N();
            this.A.y(this.field_6012);
            break;
         case field_61295:
            this.p.N();
            this.a = 0;
            this.F.N();
            this.A.N();
            this.C.N();
            this.f.y(this.field_6012);
            break;
         case field_61296:
            this.p.N();
            this.a = 0;
            this.F.N();
            this.A.N();
            this.f.N();
            this.C.y(this.field_6012);
      }
   }

   private void L(class04782 var1) {
      class07209 class07209 = this.method_24515();
      var1.method_8652(
         class07209,
         class00869.vO
            .W()
            .y(class08981.L, class08973.values()[this.field_5974.y(0, class08973.values().length)])
            .y(class08981.y, class07211.N((double)this.method_36454())),
         3
      );
      class00394 class00394 = var1.method_8321(class07209);
      if (class00394 instanceof class08965) {
         ((class08965)class00394).N(this);
         this.y_3(var1);
         this.method_31472();
         this.method_43077(class04909.MH);
         if (this.g_()) {
            if (var1.method_64395().N(class07305.U)) {
               this.yU();
            } else {
               this.yE();
            }
         }
      }
   }

   public static class05300 M() {
      return class07079.H().N(class05298.l, 0.2F).N(class05298.O, 1.0).N(class05298.n, 12.0);
   }

   private class04891 Q() {
      return class08971.N(this.E()).N();
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(P, class02774.field_28704);
      var1.N(s, class08979.field_61292);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         if (!this.Nt()) {
            this.w();
         }
      } else {
         this.N((class04782)this.method_73183(), this.method_73183().method_8409(), this.method_73183().N());
      }
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class08971.N(this.E()).u(), 1.0F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("next_weather_age", this.X);
      var1.N("weather_state", class02774.field_46493, this.E());
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.X = var1.N("next_weather_age", -1L);
      this.N(var1.<class02774>N("weather_state", class02774.field_46493).orElse(class02774.field_28704));
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
      super.method_5800(var1, var2);
      UUID uuid = var2.method_5667();
      if (!uuid.equals(this.b)) {
         this.b = uuid;
         class02774 class02774 = this.E();
         if (class02774 != class02774.field_28704) {
            this.X = -1L;
            this.field_6011.N(P, class02774.y(), true);
         }
      }
   }

   public class08982(class07078<? extends class07649> var1, class07299 var2) {
      super(var1, var2);
      this.f().N(48.0F);
      this.f().y(true);
      this.NW();
      this.N(class08979.field_61292);
      this.N(class04425.field_9, 16.0F);
      this.N(class04425.field_5, 16.0F);
      this.N(class04425.field_3, -1.0F);
      this.method_18868().N(class05378.Ni, this.method_59922().y(60, 100));
   }

   public class08979 B() {
      return this.field_6011.N(s);
   }

   public class04396 n() {
      return this.A;
   }

   @Override
   public void l() {
      this.method_43077(class04909.MA);
   }

   @Override
   public boolean d() {
      return this.method_5805() && this.method_6118(N).N(class01226.Lj);
   }

   public class04396 m() {
      return this.p;
   }

   public class04396 t() {
      return this.f;
   }

   public class04396 v() {
      return this.F;
   }

   private boolean y(class07299 var1) {
      return var1.method_8320(this.method_24515()).P() && var1.field_9229.z() <= 0.0058F;
   }

   public void y(class02774 var1) {
      this.N(var1);
      this.l();
   }

   public class02774 E() {
      return this.field_6011.N(P);
   }

   public void N(class02774 var1) {
      this.field_6011.N(P, var1);
   }

   @Override
   public void N(class04782 var1, class04911 var2, class06584 var3) {
      var1.method_43129(null, this, class04909.Mf, var2, 1.0F, 1.0F);
      class06584 class06584 = this.method_6118(N);
      this.method_5673(N, class06584.E);
      this.method_5699(var1, class06584, 1.5F);
   }

   public void N(class08979 var1) {
      this.field_6011.N(s, var1);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584x = var1.method_5998(var2);
      if (class06584x.R()) {
         class06584 class06584x = this.method_6047();
         if (!class06584x.R()) {
            class06293.N(this, class06584x, var1.method_73189());
            this.method_6122(class07050.field_5808, class06584.E);
            return class07082.N;
         }
      }

      class07299 class07299 = this.method_73183();
      if (class06584x.N(class06570.vr) && this.d()) {
         if (class07299 instanceof class04782 class04782) {
            this.N(class04782, class04911.field_15248, class06584x);
            this.method_32875(class01194.H, var1);
            class06584x.N(1, var1, var2);
         }

         return class07082.N;
      } else if (class07299.method_8608()) {
         return class07082.i;
      } else if (class06584x.N(class06570.wR) && this.X != -2L) {
         class07299.method_8444(this, 3003, this.method_24515(), 0);
         this.X = -2L;
         this.N(var1, var2, class06584x);
         return class07082.y;
      } else if (class06584x.N(class01226.Ly) && this.X == -2L) {
         class07299.method_43129(null, this, class04909.Ne, this.method_5634(), 1.0F, 1.0F);
         class07299.method_8444(this, 3004, this.method_24515(), 0);
         this.X = -1L;
         class06584x.N(1, var1, var2.N());
         return class07082.y;
      } else {
         if (class06584x.N(class01226.Ly)) {
            class02774 class02774 = this.E();
            if (class02774 != class02774.field_28704) {
               class07299.method_43129(null, this, class04909.Ne, this.method_5634(), 1.0F, 1.0F);
               class07299.method_8444(this, 3005, this.method_24515(), 0);
               this.X = -1L;
               this.field_6011.N(P, class02774.y(), true);
               class06584x.N(1, var1, var2.N());
               return class07082.y;
            }
         }

         return super.N(var1, var2);
      }
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("copperGolemBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      class04643.N("copperGolemActivityUpdate");
      class08988.N(this);
      class04643.L();
      super.N(var1);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.l();
      return super.N(var1, var2, var3, var4);
   }

   public void N(class07209 var1) {
      this.T = var1;
   }

   private void N(class04782 var1, class06069 var2, long var3) {
      if (this.X != -2L) {
         if (this.X == -1L) {
            this.X = var3 + var2.N(504000, 552000);
         } else {
            class02774 class02774x = this.field_6011.N(P);
            boolean flag = class02774x.equals(class02774.field_28707);
            if (var3 >= this.X && !flag) {
               class02774 class02774x = class02774x.N();
               boolean flag1 = class02774x.equals(class02774.field_28707);
               this.N(class02774x);
               this.X = flag1 ? 0L : this.X + var2.N(504000, 552000);
            }

            if (flag && this.y(var1)) {
               this.L(var1);
            }
         }
      }
   }

   @Override
   public void W() {
      this.T = null;
   }

   public class04396 G() {
      return this.C;
   }

   private void Y() {
      if (!this.method_5701()) {
         this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), this.Q(), this.method_5634(), 1.0F, 1.0F, false);
      }
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.75F * this.method_5751(), 0.0);
   }

   @Override
   public void method_16078(class04782 var1) {
      super.method_16078(var1);
      this.y_3(var1);
   }

   @Override
   public class05781<class08982> method_28306() {
      return class08988.N();
   }

   @Override
   public class04891 method_6002() {
      return class08971.N(this.E()).L();
   }

   @Override
   public class01289<class08982> method_18868() {
      return (class01289<class08982>)super.method_18868();
   }

   @Override
   public void method_6074(class04782 var1, class07072 var2, float var3) {
      super.method_6074(var1, var2, var3);
      this.N(class08979.field_61292);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class08971.N(this.E()).y();
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      return class08988.N(this.method_28306().N(var1));
   }

   @Override
   public double method_72381() {
      return 3.0;
   }

   @Override
   public boolean method_72380(class01114 var1, class07209 var2) {
      if (this.T == null) {
         return false;
      } else {
         class00500 class00500 = this.method_73183().method_8320(this.T);
         return this.T.equals(var2)
            || class00500.i() instanceof class00860 && class00500.L(class00860.i) != class06638.field_12569 && class00860.y(this.T, class00500).equals(var2);
      }
   }
}
