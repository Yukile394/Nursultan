package minecraft;

public class class07146 extends class07528 {
   private static final int u = 300;
   private static final class02131<Boolean> i = class03289.N(class07146.class, class02154.U);
   public static final String L = "StrayConversionTime";
   private static final int R = -1;
   private int M;
   private int B;

   public boolean M() {
      return this.method_5841().N(i);
   }

   @Override
   public boolean method_32316() {
      return false;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(i, false);
   }

   @Override
   public void method_5773() {
      if (!this.method_73183().method_8608() && this.method_5805() && !this.Nt()) {
         if (this.field_27857) {
            if (this.M()) {
               this.B--;
               if (this.B < 0) {
                  this.t();
               }
            } else {
               this.M++;
               if (this.M >= 140) {
                  this.N(300);
               }
            }
         } else {
            this.M = -1;
            this.N(false);
         }
      }

      super.method_5773();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("StrayConversionTime", this.M() ? this.B : -1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      int ix = var1.N("StrayConversionTime", -1);
      if (ix != -1) {
         this.N(ix);
      } else {
         this.N(false);
      }
   }

   public class07146(class07078<? extends class07146> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   class04891 B() {
      return class04909.kt;
   }

   @Override
   protected class04891 s() {
      return class04909.kZ;
   }

   @Override
   public boolean n() {
      return this.M();
   }

   protected void t() {
      this.N(class07078.yk, class08234.N(this, true, true), var1 -> {
         if (!this.method_5701()) {
            this.method_73183().method_8444(null, 1048, this.method_24515(), 0);
         }
      });
   }

   public void N(boolean var1) {
      this.field_6011.N(i, var1);
   }

   public void N(int var1) {
      this.B = var1;
      this.N(true);
   }

   @Override
   public class04891 method_6002() {
      return class04909.kU;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.kv;
   }
}
