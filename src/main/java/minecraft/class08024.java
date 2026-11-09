package minecraft;

public class class08024 extends class05639 {
   private static final byte u = 1;
   private int R = 1;

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("ExplosionPower", (byte)this.R);
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.R = var1.N("ExplosionPower", (byte)1);
   }

   public class08024(class07078<? extends class08024> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08024(class07299 var1, class07438 var2, class06889 var3, int var4) {
      super(class07078.NL, var2, var3, var1);
      this.R = var4;
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782) {
         boolean flag = ((class04782)class07299).method_64395().N(class07305.I);
         this.method_73183().method_8537(this, this.method_23317(), this.method_23318(), this.method_23321(), this.R, flag, class07328.field_40890);
         this.method_31472();
      }
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         class07049 class07049 = var1.L();
         class07049 class07049x = this.z();
         class07072 class07072 = this.method_48923().N((class05639)this, class07049x);
         class07049.method_64397(class04782, class07072, 6.0F);
         class07323.N(class04782, class07049, class07072);
      }
   }
}
