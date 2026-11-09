package minecraft;

public class class07494 extends class07504 {
   private static final class02131<Boolean> L = class03289.N(class07494.class, class02154.U);
   private static final int u = 3600;
   private static final int B = 32000;
   private static final short Z = 0;
   private static final class06889 z = class06889.L;
   private int U = 0;
   public class06889 y = z;

   protected void L(boolean var1) {
      this.field_6011.N(L, var1);
   }

   @Override
   public boolean P() {
      return true;
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.sU);
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, false);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (!this.method_73183().method_8608()) {
         if (this.U > 0) {
            this.U--;
         }

         if (this.U <= 0) {
            this.y = class06889.L;
         }

         this.L(this.U > 0);
      }

      if (this.U() && this.field_5974.y(4) == 0) {
         this.method_73183().method_8406(class07107.Ny, this.method_23317(), this.method_23318() + 0.8, this.method_23321(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("PushX", this.y.M);
      var1.N("PushZ", this.y.Z);
      var1.N("Fuel", (short)this.U);
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (this.N(var1.method_73189(), class06584)) {
         class06584.N(1, var1);
      }

      return class07082.N;
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      double d0 = var1.N("PushX", z.M);
      double d1 = var1.N("PushZ", z.Z);
      this.y = new class06889(d0, 0.0, d1);
      this.U = var1.N("Fuel", (short)0);
   }

   public class07494(class07078<? extends class07494> var1, class07299 var2) {
      super(var1, var2);
   }

   protected boolean U() {
      return this.field_6011.N(L);
   }

   @Override
   protected class06581 z() {
      return class06570.sU;
   }

   private class06889 y(class06889 var1) {
      double d0 = 1.0E-4;
      double d1 = 0.001;
      return this.y.z() > 1.0E-4 && var1.z() > 0.001 ? this.y.Z(var1).u().L(this.y.M()) : this.y;
   }

   @Override
   protected double N_73(class04782 var1) {
      return this.method_5799() ? super.N_73(var1) * 0.75 : super.N_73(var1) * 0.5;
   }

   @Override
   protected class06889 N(class06889 var1) {
      class06889 class06889;
      if (this.y.B() > 1.0E-7) {
         this.y = this.y(var1);
         class06889 = var1.u(0.8, 0.0, 0.8).i(this.y);
         if (this.method_5799()) {
            class06889 = class06889.L(0.1);
         }
      } else {
         class06889 = var1.u(0.98, 0.0, 0.98);
      }

      return super.N(class06889);
   }

   public boolean N(class06889 var1, class06584 var2) {
      if (var2.N(class01226.LU) && this.U + 3600 <= 32000) {
         this.U += 3600;
         if (this.U > 0) {
            this.y = this.method_73189().u(var1).R();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public class00500 R() {
      return class00869.uN.W().y(class05659.N, class07211.field_11043).y(class05659.y, this.U());
   }
}
