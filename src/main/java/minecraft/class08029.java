package minecraft;

public class class08029 extends class05639 {
   public class08029(class07299 var1, double var2, double var4, double var6, class06889 var8) {
      super(class07078.yT, var2, var4, var6, var8, var1);
   }

   public class08029(class07299 var1, class07438 var2, class06889 var3) {
      super(class07078.yT, var2, var3, var1);
   }

   public class08029(class07078<? extends class08029> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         this.method_31472();
      }
   }

   @Override
   protected void N(class06183 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         class07049 class07049 = this.z();
         if (!(class07049 instanceof class07079) || class04782.method_64395().N(class07305.I)) {
            class07209 class07209 = var1.u().method_10093(var1.i());
            if (this.method_73183().R(class07209)) {
               this.method_73183().method_8501(class07209, class05989.y(this.method_73183(), class07209));
            }
         }
      }
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         class07049 class07049 = var1.L();
         class07049 class07049x = this.z();
         int i = class07049.method_20802();
         class07049.method_5639(5.0F);
         class07072 class07072 = this.method_48923().N((class05639)this, class07049x);
         if (!class07049.method_64397(class04782, class07072, 5.0F)) {
            class07049.method_20803(i);
         } else {
            class07323.N(class04782, class07049, class07072);
         }
      }
   }
}
