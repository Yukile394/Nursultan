package minecraft;

public class class08040 extends class05668 {
   @Override
   protected double method_7490() {
      return 0.07;
   }

   public class08040(class07078<? extends class08040> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08040(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.h, var2, var4, var6, var1, var8);
   }

   public class08040(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.h, var2, var1, var3);
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         class04782.N(2002, this.method_24515(), -13083194);
         int i = 3 + class04782.field_9229.y(5) + class04782.field_9229.y(5);
         if (var1 instanceof class06183) {
            class06889 class06889 = ((class06183)var1).i().W();
            class07057.N(class04782, var1.y(), class06889, i);
         } else {
            class07057.N(class04782, var1.y(), this.method_18798().L(-1.0), i);
         }

         this.method_31472();
      }
   }

   @Override
   protected class06581 N() {
      return class06570.GB;
   }
}
