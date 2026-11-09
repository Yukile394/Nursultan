package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class07528 extends class07150 implements class07172 {
   private static final int L = 20;
   private static final int u = 40;
   protected static final int N = 50;
   protected static final int y = 70;
   private final class07996<class07528> i = new class07996<>(this, 1.0, 20, 15.0F);
   private final class07999 R = new class07562(this, this, 1.2, false);

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(this.B(), 0.15F, 1.0F);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.v();
   }

   @Override
   public void method_5842() {
      super.method_5842();
      if (this.method_49694() instanceof class07475 class07475) {
         super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = class07475.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      }
   }

   public class07528(class07078<? extends class07528> var1, class07299 var2) {
      super(var1, var2);
      this.v();
   }

   abstract class04891 B();

   public boolean n() {
      return this.method_32314();
   }

   public static class05300 m() {
      return class07150.Y().N(class05298.l, 0.25);
   }

   @Override
   public void v() {
      if (this.method_73183() != null && !this.method_73183().method_8608()) {
         this.e.N(this.R);
         this.e.N(this.i);
         if (this.method_5998(class08038.N(this, class06570.sx)).N(class06570.sx)) {
            int ix = this.E();
            if (this.method_73183().y() != class07086.field_5807) {
               ix = this.W();
            }

            this.i.L(ix);
            this.e.N(4, this.i);
         } else {
            this.e.N(4, this.R);
         }
      }
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      return var2.N(class01226.LR) ? false : super.y(var1, var2);
   }

   @Override
   public boolean y(class06584 var1) {
      return var1.B() == class06570.sx;
   }

   protected int E() {
      return 20;
   }

   @Override
   protected void N(class06069 var1, class07052 var2) {
      super.N(var1, var2);
      this.method_5673(class07085.field_6173, new class06584(class06570.sx));
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      var4 = super.N(var1, var2, var3, var4);
      class06069 class06069 = var1.method_8409();
      this.N(class06069, var2);
      this.N(var1, class06069, var2);
      this.v();
      this.L(class06069.z() < 0.55F * var2.u());
      if (this.method_6118(class07085.field_6169).R() && class06842.y() && class06069.z() < 0.25F) {
         this.method_5673(class07085.field_6169, new class06584(class06069.z() < 0.1F ? class00869.iV : class00869.iK));
         this.N(class07085.field_6169, 0.0F);
      }

      return var4;
   }

   public class08007 N(class06584 var1, float var2, @Nullable class06584 var3) {
      return class08038.N(this, var1, var2, var3);
   }

   @Override
   public void N(class07438 var1, float var2) {
      class06584 class06584x = this.method_5998(class08038.N(this, class06570.sx));
      class06584 class06584x = this.method_18808(class06584x);
      class08007 class08007 = this.N(class06584x, var2, class06584x);
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23323(0.3333333333333333) - class08007.method_23318();
      double d2 = var1.method_23321() - this.method_23321();
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      if (this.method_73183() instanceof class04782 class04782) {
         class08005.N(class08007, class04782, class06584x, d0, d1 + d3 * 0.2F, d2, 1.6F, 14 - class04782.y().N() * 4);
      }

      this.method_5783(class04909.kn, 1.0F, 1.0F / (this.method_59922().z() * 0.4F + 0.8F));
   }

   protected int W() {
      return 40;
   }

   @Override
   protected void l_() {
      this.e.N(2, new class07981(this));
      this.e.N(3, new class07452(this, 1.0));
      this.e.N(3, new class07464<>(this, class07894.class, 6.0F, 1.0, 1.2));
      this.e.N(5, new class07957(this, 1.0));
      this.e.N(6, new class07962(this, class08036.class, 8.0F));
      this.e.N(6, new class07956(this));
      this.H.N(1, new class07989(this));
      this.H.N(2, new class07952<>(this, class08036.class, true));
      this.H.N(3, new class07952<>(this, class07625.class, true));
      this.H.N(3, new class07952<>(this, class07872.class, 10, true, false, class07872.y));
   }

   @Override
   public class03530<class06581> NL() {
      return class01226.Lm;
   }

   @Override
   public void method_6116(class07085 var1, class06584 var2, class06584 var3) {
      super.method_6116(var1, var2, var3);
      if (!this.method_73183().method_8608()) {
         this.v();
      }
   }
}
