package minecraft;

import org.jspecify.annotations.Nullable;

public class class08016 extends class08007 {
   private static final int u = 200;
   private int R = 200;

   @Override
   protected class06584 M() {
      return new class06584(class06570.lg);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608() && !this.y()) {
         this.method_73183().method_8406(class00436.N(class07107.T, -1, 1.0F), this.method_23317(), this.method_23318(), this.method_23321(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Duration", this.R);
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.R = var1.N("Duration", 200);
   }

   public class08016(class07078<? extends class08016> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08016(class07299 var1, double var2, double var4, double var6, class06584 var8, @Nullable class06584 var9) {
      super(class07078.yt, var2, var4, var6, var1, var8, var9);
   }

   public class08016(class07299 var1, class07438 var2, class06584 var3, @Nullable class06584 var4) {
      super(class07078.yt, var2, var1, var3, var4);
   }

   @Override
   protected void N(class07438 var1) {
      super.N(var1);
      class07055 class07055 = new class07055(class07047.l, this.R, 0);
      var1.method_37222(class07055, this.P());
   }
}
