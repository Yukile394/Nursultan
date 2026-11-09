package minecraft;

import org.jspecify.annotations.Nullable;

public class class07182 extends class08004 implements class01279 {
   private static final class01325 N = class07078.LN.E().N(0.5F).y(0.97F);
   private static final class01894 y = class01894.y("attacking");
   private static final class07471 M = new class07471(y, 0.05, class07463.field_6328);
   private static final class02135 B = class01517.N(0, 1);
   private int Z;
   private static final class02135 W = class01517.N(20, 39);
   private long T;
   @Nullable
   private class08372<class07438> b;
   private static final int X = 10;
   private static final class02135 a = class01517.N(4, 6);
   private int p;

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.N(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(this.method_73183(), var1);
   }

   public class07182(class07078<? extends class07182> var1, class07299 var2) {
      super(var1, var2);
      this.N(class04425.field_14, 8.0F);
   }

   @Override
   protected void B() {
      this.e.N(1, new class08161<>(this, 1.0, 1.0, 10.0F, 2.0F));
      this.e.N(2, new class07972(this, 1.0, false));
      this.e.N(7, new class07957(this, 1.0));
      this.H.N(1, new class07989(this).N());
      this.H.N(2, new class07952<>(this, class08036.class, 10, true, false, this::N));
      this.H.N(3, new class01251<>(this, true));
   }

   private void I() {
      this.method_5783(class04909.oZ, this.method_6107() * 2.0F, this.method_6017() * 1.8F);
   }

   @Override
   protected class04891 s() {
      return this.P_() ? class04909.oZ : class04909.oB;
   }

   @Override
   protected boolean m() {
      return false;
   }

   private void t() {
      if (this.Z > 0) {
         this.Z--;
         if (this.Z == 0) {
            this.I();
         }
      }
   }

   public static class05300 v() {
      return class08004.l().N(class05298.Q, 0.0).N(class05298.l, 0.23F).N(class05298.u, 5.0);
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      return this.L(var2);
   }

   @Override
   public void y(@Nullable class07438 var1) {
      if (this.T() == null && var1 != null) {
         this.Z = B.N(this.field_5974);
         this.p = a.N(this.field_5974);
      }

      super.y(var1);
   }

   @Override
   public long E() {
      return this.T;
   }

   @Override
   public void N(long var1) {
      this.T = var1;
   }

   @Override
   public void N(class06069 var1, class07052 var2) {
      this.method_5673(class07085.field_6173, new class06584(var1.y(20) == 0 ? class06570.lH : class06570.TQ));
   }

   @Override
   public boolean N(class04782 var1, class08036 var2) {
      return this.N(var2, var1);
   }

   public static boolean N(class07078<class07182> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.y() != class07086.field_5801 && !var1.method_8320(var3.method_10074()).N(class00869.EJ);
   }

   @Override
   protected void N(class04782 var1) {
      class07469 class07469 = this.method_5996(class05298.l);
      if (this.P_()) {
         if (!this.method_6109() && !class07469.y(y)) {
            class07469.y(M);
         }

         this.t();
      } else if (class07469.y(y)) {
         class07469.L(y);
      }

      this.N(var1, true);
      if (this.T() != null) {
         this.G();
      }

      super.N(var1);
   }

   @Override
   public void N(@Nullable class08372<class07438> var1) {
      this.b = var1;
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this) && !var1.u(this.method_5829());
   }

   @Nullable
   @Override
   public class08372<class07438> W() {
      return this.b;
   }

   private void O() {
      double d0 = this.method_45325(class05298.P);
      class00734 class00734 = class00734.N(this.method_73189()).L(d0, 10.0, d0);
      this.method_73183()
         .N(class07182.class, class00734, class07042.R)
         .stream()
         .filter(var1x -> var1x != this)
         .filter(var0 -> var0.T() == null)
         .filter(var1x -> !var1x.method_5722(this.T()))
         .forEach(var1x -> var1x.y(this.T()));
   }

   private void G() {
      if (this.p > 0) {
         this.p--;
      } else {
         if (this.C().N(this.T())) {
            this.O();
         }

         this.p = a.N(this.field_5974);
      }
   }

   @Override
   public class04891 method_6002() {
      return class04909.oz;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? N : super.method_55694(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.oU;
   }

   @Override
   public void W_() {
      this.y(W.N(this.field_5974));
   }

   @Override
   protected void V_() {
      this.method_5996(class05298.Q).N(0.0);
   }
}
