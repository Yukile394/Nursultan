package minecraft;

public class class08045 extends class05668 {
   @Override
   public void method_5711(byte var1) {
      if (var1 == 3) {
         class07126 class07126 = this.y();

         for (int i = 0; i < 8; i++) {
            this.method_73183().method_8406(class07126, this.method_23317(), this.method_23318(), this.method_23321(), 0.0, 0.0, 0.0);
         }
      }
   }

   public class08045(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.yj, var2, var4, var6, var1, var8);
   }

   public class08045(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.yj, var2, var1, var3);
   }

   public class08045(class07078<? extends class08045> var1, class07299 var2) {
      super(var1, var2);
   }

   private class07126 y() {
      class06584 class06584 = this.L();
      return (class07126)(class06584.R() ? class07107.NN : new class07092(class07107.S, class06584));
   }

   @Override
   protected class06581 N() {
      return class06570.jP;
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      class07049 class07049 = var1.L();
      int i = class07049 instanceof class07530 ? 3 : 0;
      class07049.method_64419(this.method_48923().y(this, this.z()), i);
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         this.method_73183().method_8421(this, (byte)3);
         this.method_31472();
      }
   }
}
