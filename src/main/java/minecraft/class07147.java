package minecraft;

import org.jspecify.annotations.Nullable;

public class class07147 extends class07150 {
   @Nullable
   private class07175 N;

   public static class05300 M() {
      return class07150.Y().N(class05298.n, 8.0).N(class05298.l, 0.25).N(class05298.u, 1.0);
   }

   @Override
   public void method_5773() {
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.method_36454();
      super.method_5773();
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         if ((var2.u() != null || var2.N(class03696.l)) && this.N != null) {
            this.N.M();
         }

         return super.method_64397(var1, var2, var3);
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.kB, 0.15F, 1.0F);
   }

   @Override
   public void method_5636(float var1) {
      this.method_36456(var1);
      super.method_5636(var1);
   }

   public class07147(class07078<? extends class07147> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      return class04909.ki;
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return class07137.U(var2.method_8320(var1.method_10074())) ? 10.0F : super.N(var1, var2);
   }

   public static boolean N(class07078<class07147> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      if (!L(var0, var1, var2, var3, var4)) {
         return false;
      } else {
         return class06113.N(var2) ? true : var1.N(var3.method_10263() + 0.5, var3.method_10264() + 0.5, var3.method_10260() + 0.5, 5.0, true) == null;
      }
   }

   @Override
   protected void l_() {
      this.N = new class07175(this);
      this.e.N(1, new class07427(this));
      this.e.N(1, new class03559(this, this.method_73183()));
      this.e.N(3, this.N);
      this.e.N(4, new class07999(this, 1.0, false));
      this.e.N(5, new class07173(this));
      this.H.N(1, new class07989(this).N());
      this.H.N(2, new class07952<>(this, class08036.class, true));
   }

   @Override
   public class04891 method_6002() {
      return class04909.kR;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.kM;
   }
}
