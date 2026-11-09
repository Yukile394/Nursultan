package minecraft;

public class class07560 extends class07150 {
   private static final int N = 2400;
   private static final int y = 0;
   private int L = 0;

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 8.0).N(class05298.l, 0.25).N(class05298.u, 2.0);
   }

   @Override
   public void method_5773() {
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.method_36454();
      super.method_5773();
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.UN, 0.15F, 1.0F);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Lifetime", this.L);
   }

   @Override
   public void method_5636(float var1) {
      this.method_36456(var1);
      super.method_5636(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L = var1.N("Lifetime", 0);
   }

   public class07560(class07078<? extends class07560> var1, class07299 var2) {
      super(var1, var2);
      this.J = 3;
   }

   @Override
   protected class04891 s() {
      return class04909.zD;
   }

   public static boolean N(class07078<class07560> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      if (!L(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         return class06113.N(var2) ? true : var1.N(var3.method_10263() + 0.5, var3.method_10264() + 0.5, var3.method_10260() + 0.5, 5.0, true) == null;
      }
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07427(this));
      this.e.N(1, new class03559(this, this.method_73183()));
      this.e.N(2, new class07999(this, 1.0, false));
      this.e.N(3, new class07957(this, 1.0));
      this.e.N(7, new class07962(this, class08036.class, 8.0F));
      this.e.N(8, new class07956(this));
      this.H.N(1, new class07989(this).N());
      this.H.N(2, new class07952<>(this, class08036.class, true));
   }

   @Override
   public class04891 method_6002() {
      return class04909.zh;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_73183().method_8608()) {
         for (int i = 0; i < 2; i++) {
            this.method_73183()
               .method_8406(
                  class07107.NM,
                  this.method_23322(0.5),
                  this.method_23319(),
                  this.method_23325(0.5),
                  (this.field_5974.U() - 0.5) * 2.0,
                  -this.field_5974.U(),
                  (this.field_5974.U() - 0.5) * 2.0
               );
         }
      } else {
         if (!this.Nm()) {
            this.L++;
         }

         if (this.L >= 2400) {
            this.method_31472();
         }
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.zr;
   }
}
