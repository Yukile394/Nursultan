package minecraft;

class class06167 extends class07434 {
   @Override
   public void L() {
      ((class06165)this.N).Y();
      ((class06165)this.L).Y();
      super.L();
   }

   public class06167(class06165 var1, double var2) {
      super(var1, var2);
   }

   @Override
   protected void R() {
      class06165 class06165 = (class06165)this.N.y(this.y, this.L);
      if (class06165 != null) {
         class04770 class04770xx = this.N.Nc();
         class04770 class04770x = this.L.Nc();
         class04770 class04770xx = class04770xx;
         if (class04770xx != null) {
            class06165.N(class04770xx);
         } else {
            class04770xx = class04770x;
         }

         if (class04770x != null && class04770xx != class04770x) {
            class06165.N(class04770x);
         }

         if (class04770xx != null) {
            class04770xx.method_7281(class01235.F);
            class06912.s.N(class04770xx, this.N, this.L, class06165);
         }

         this.N.u(6000);
         this.L.u(6000);
         this.N.Na();
         this.L.Na();
         class06165.u(-24000);
         class06165.method_5808(this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), 0.0F, 0.0F);
         this.y.y(class06165);
         this.y.method_8421(this.N, (byte)18);
         if (this.y.method_64395().N(class07305.O)) {
            this.y.method_8649(new class07057(this.y, this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), this.N.method_59922().y(7) + 1));
         }
      }
   }
}
