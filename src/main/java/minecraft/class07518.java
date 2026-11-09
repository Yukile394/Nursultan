package minecraft;

public class class07518 extends class07504 {
   private float y;
   private float L;

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.sZ);
   }

   @Override
   public void method_5773() {
      double d0 = this.method_36454();
      class06889 class06889 = this.method_73189();
      super.method_5773();
      double d1 = (this.method_36454() - d0) % 360.0;
      if (this.method_73183().method_8608() && class06889.R(this.method_73189()) > 0.01) {
         this.y += (float)d1;
         this.y %= 360.0F;
      }
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      if (!var1.method_21823() && !this.method_5782() && (this.method_73183().method_8608() || var1.method_5804(this))) {
         this.L = this.y;
         if (!this.method_73183().method_8608()) {
            return (class07082)(var1.method_5804(this) ? class07082.L : class07082.i);
         } else {
            return class07082.N;
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   protected void method_5865(class07049 var1, class07067 var2) {
      super.method_5865(var1, var2);
      if (this.method_73183().method_8608() && var1 instanceof class08036 class08036 && class08036.method_61498() && N(this.method_73183())) {
         float f = (float)class04995.i(0.5, (double)this.L, (double)this.y);
         class08036.method_36456(class08036.method_36454() - (f - this.L));
         this.L = f;
      }
   }

   public class07518(class07078<?> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public boolean Z() {
      return true;
   }

   @Override
   protected class06581 z() {
      return class06570.sZ;
   }

   @Override
   public void N(class04782 var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         if (this.method_5782()) {
            this.method_5772();
         }

         if (this.G() == 0) {
            this.L(-this.l());
            this.y(10);
            this.y(50.0F);
            this.method_5785();
         }
      }
   }
}
