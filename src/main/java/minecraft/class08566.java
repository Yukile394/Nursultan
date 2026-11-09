package minecraft;

public class class08566 extends class07486 {
   public class08566(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.yi, var1, var2, var4, var6, var8);
   }

   public class08566(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.yi, var1, var2, var3);
   }

   public class08566(class07078<? extends class08566> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class06581 N() {
      return class06570.lJ;
   }

   @Override
   public void N(class04782 var1, class06584 var2, class07089 var3) {
      class07048 class07048 = new class07048(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321());
      if (this.z() instanceof class07438 class07438) {
         class07048.N(class07438);
      }

      class07048.N(3.0F);
      class07048.L(-0.5F);
      class07048.N(600);
      class07048.L(10);
      class07048.u(-class07048.N() / class07048.u());
      class07048.method_66652(var2);
      var1.method_8649(class07048);
   }
}
