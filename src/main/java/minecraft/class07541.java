package minecraft;

import Nursultan.class10764;
import org.jspecify.annotations.Nullable;

public class class07541 extends class08004 implements class07172 {
   public static final float N = 0.03F;
   private static final float M = 0.5F;
   public boolean y;

   public static class05300 M() {
      return class08004.l().N(class05298.O, 1.0);
   }

   @Override
   public boolean method_5675() {
      return !this.method_5681();
   }

   @Override
   public void method_5790() {
      if (!this.method_73183().method_8608()) {
         this.method_5796(this.method_6034() && this.method_5869() && this.v());
      }
   }

   @Override
   protected class04891 method_5737() {
      return class04909.zv;
   }

   @Override
   public void method_5842() {
      super.method_5842();
      if (this.method_49694() instanceof class07475 class07475) {
         super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = class07475.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      }
   }

   @Override
   public boolean method_20232() {
      return this.method_5681() && !this.method_5765();
   }

   public class07541(class07078<? extends class07541> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class10764(this);
      this.N(class04425.field_18, 0.0F);
   }

   @Override
   protected void B() {
      this.e.N(1, new class07522(this, 1.0));
      this.e.N(2, new class07532(this, 1.0, 40, 10.0F));
      this.e.N(2, new class07566(this, 1.0, false));
      this.e.N(5, new class07537(this, 1.0));
      this.e.N(6, new class07554(this, 1.0, this.method_73183().method_8615()));
      this.e.N(7, new class07978(this, 1.0));
      this.H.N(1, new class07989(this, class07541.class).N(class07182.class));
      this.H.N(2, new class07952<>(this, class08036.class, 10, true, false, (var1, var2) -> this.N(var1)));
      this.H.N(3, new class07952<>(this, class06171.class, false));
      this.H.N(3, new class07952<>(this, class07625.class, true));
      this.H.N(3, new class07952<>(this, class05538.class, true, false));
      this.H.N(5, new class07952<>(this, class07872.class, 10, true, false, class07872.y));
   }

   @Override
   protected class04891 s() {
      return this.method_5799() ? class04909.zW : class04909.zE;
   }

   protected boolean n() {
      class00143 class00143 = this.f().Z();
      if (class00143 != null) {
         class07209 class07209 = class00143.E();
         if (class07209 != null && this.method_5649(class07209.method_10263(), class07209.method_10264(), class07209.method_10260()) < 4.0) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected boolean m() {
      return false;
   }

   public boolean v() {
      if (this.y) {
         return true;
      } else {
         class07438 class07438 = this.T();
         return class07438 != null && class07438.method_5799();
      }
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      return var2.N(class01226.LR) ? false : super.y(var1, var2);
   }

   private static boolean N(class07284 var0, class07209 var1) {
      return var1.method_10264() < var0.method_8615() - 5;
   }

   public static boolean N(class07078<class07541> var0, class01001 var1, class06113 var2, class07209 var3, class06069 var4) {
      if (!var1.method_8316(var3.method_10074()).N(class01231.N) && !class06113.N(var2)) {
         return false;
      } else {
         class03556 class03556 = var1.i(var3);
         boolean flag = var1.y() != class07086.field_5801
            && (class06113.y(var2) || N(var1, var3, var4))
            && (class06113.N(var2) || var1.method_8316(var3).N(class01231.N));
         if (!flag || !class06113.N(var2) && var2 != class06113.field_16463) {
            return class03556.N(class03557.NW) ? var4.y(15) == 0 && flag : var4.y(40) == 0 && N(var1, var3) && flag;
         } else {
            return true;
         }
      }
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class05573(this, var1);
   }

   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      var4 = super.N(var1, var2, var3, var4);
      if (this.method_6118(class07085.field_6171).R() && var1.method_8409().z() < 0.03F) {
         this.method_5673(class07085.field_6171, new class06584(class06570.dj));
         this.N(class07085.field_6171);
      }

      if ((var3 == class06113.field_16459 || var3 == class06113.field_16474)
         && this.method_6047().N(class06570.db)
         && var1.method_8409().z() < 0.5F
         && !this.method_6109()
         && !var1.i(this.method_24515()).N(class03557.NW)) {
         class08187 class08187 = class07078.yh.N(this.method_73183(), class06113.field_16460);
         if (class08187 != null) {
            if (var3 == class06113.field_16474) {
               class08187.NW();
            }

            class08187.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
            class08187.N(var1, var2, var3, null);
            this.method_5873(class08187, false, false);
            var1.method_8649(class08187);
         }
      }

      return var4;
   }

   @Override
   public void N(class07438 var1, float var2) {
      class06584 class06584x = this.method_6047();
      class06584 class06584x = class06584x.N(class06570.db) ? class06584x : new class06584(class06570.db);
      class07517 class07517 = new class07517(this.method_73183(), this, class06584x);
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23323(0.3333333333333333) - class07517.method_23318();
      double d2 = var1.method_23321() - this.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      if (this.method_73183() instanceof class04782 class04782) {
         class08005.N(class07517, class04782, class06584x, d0, d1 + d3 * 0.2F, d2, 1.6F, 14 - this.method_73183().y().N() * 4);
      }

      this.method_5783(class04909.zb, 1.0F, 1.0F / (this.method_59922().z() * 0.4F + 0.8F));
   }

   public void N(boolean var1) {
      this.y = var1;
   }

   @Override
   protected boolean N(class06584 var1, class06584 var2, class07085 var3) {
      return var2.N(class06570.dj) ? false : super.N(var1, var2, var3);
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this);
   }

   public boolean N(@Nullable class07438 var1) {
      return var1 != null ? !this.method_73183().method_8530() || var1.method_5799() : false;
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      if (var1.z() > 0.9) {
         if (var1.y(16) < 10) {
            this.method_5673(class07085.field_6173, new class06584(class06570.db));
         } else {
            this.method_5673(class07085.field_6173, new class06584(class06570.jr));
         }
      }
   }

   @Override
   public class03530<class06581> NL() {
      return class01226.LP;
   }

   @Override
   public class04891 method_6002() {
      return this.method_5799() ? class04909.zP : class04909.zm;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.method_5799() ? class04909.zT : class04909.zs;
   }

   @Override
   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      if (this.method_5869() && this.v()) {
         this.method_5724(0.01F, var1);
         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_18799(this.method_18798().L(0.9));
      } else {
         super.method_76087(var1, var2, var4, var5);
      }
   }

   @Override
   protected class04891 X_() {
      return class04909.zj;
   }

   @Override
   protected boolean Y_() {
      return true;
   }
}
