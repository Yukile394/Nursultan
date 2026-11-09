package minecraft;

public class class07523 extends class07079 implements class07542 {
   private static final class02131<Boolean> N = class03289.N(class07523.class, class02154.U);
   private static final byte y = 1;
   private int L = 1;

   public boolean M() {
      return this.field_6011.N(N);
   }

   @Override
   public boolean method_70986() {
      return true;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15251;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (N(var2)) {
         super.method_64397(var1, var2, 1000.0F);
         return true;
      } else {
         return this.method_5679(var1, var2) ? false : super.method_64397(var1, var2, var3);
      }
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("ExplosionPower", (byte)this.L);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L = var1.N("ExplosionPower", (byte)1);
   }

   public class07523(class07078<? extends class07523> var1, class07299 var2) {
      super(var1, var2);
      this.J = 5;
      this.q = new class07547(this, false, () -> false);
   }

   public int B() {
      return this.L;
   }

   public static class05300 Z() {
      return class07079.H().N(class05298.n, 10.0).N(class05298.P, 100.0).N(class05298.z, 8.0).N(class05298.m, 0.06);
   }

   @Override
   protected class04891 s() {
      return class04909.Eh;
   }

   public static void N(class07079 var0) {
      if (var0.T() == null) {
         class06889 class06889 = var0.method_18798();
         var0.method_36456(-((float)class04995.u(class06889.M, class06889.Z)) * (180.0F / (float)Math.PI));
         var0.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = var0.method_36454();
      } else {
         class07438 class07438 = var0.T();
         double d0 = 64.0;
         if (class07438.method_5858(var0) < 4096.0) {
            double d1 = class07438.method_23317() - var0.method_23317();
            double d2 = class07438.method_23321() - var0.method_23321();
            var0.method_36456(-((float)class04995.u(d1, d2)) * (180.0F / (float)Math.PI));
            var0.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = var0.method_36454();
         }
      }
   }

   public static boolean N(class07078<class07523> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.y() != class07086.field_5801 && var4.y(20) == 0 && y(var0, var1, var2, var3, var4);
   }

   public void N(boolean var1) {
      this.field_6011.N(N, var1);
   }

   private static boolean N(class07072 var0) {
      return var0.L() instanceof class08024 && var0.u() instanceof class08036;
   }

   @Override
   protected void l_() {
      this.e.N(5, new class07535(this));
      this.e.N(7, new class07519(this));
      this.e.N(7, new class07521(this));
      this.H.N(1, new class07952<>(this, class08036.class, 10, true, false, (var1, var2) -> Math.abs(var1.method_23318() - this.method_23318()) <= 4.0));
   }

   @Override
   public int n_() {
      return 1;
   }

   @Override
   public double p_() {
      return 16.0;
   }

   @Override
   public double q_() {
      return 10.0;
   }

   @Override
   public boolean method_5679(class04782 var1, class07072 var2) {
      return this.method_5655() && !var2.N(class03696.u) || !N(var2) && super.method_5679(var1, var2);
   }

   @Override
   public class04891 method_6002() {
      return class04909.Er;
   }

   @Override
   public float method_6107() {
      return 5.0F;
   }

   @Override
   public void method_6091(class06889 var1) {
      this.method_70670(var1, 0.02F);
   }

   @Override
   public boolean method_6101() {
      return false;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.WN;
   }
}
