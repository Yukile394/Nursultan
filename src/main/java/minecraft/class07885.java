package minecraft;

class class07885 extends class07434 {
   private final class07872 u;

   class07885(class07872 var1, double var2) {
      super(var1, var2);
      this.u = var1;
   }

   @Override
   public boolean N() {
      return super.N() && !this.u.B();
   }

   @Override
   protected void R() {
      class04770 class04770 = this.N.Nc();
      if (class04770 == null && this.L.Nc() != null) {
         class04770 = this.L.Nc();
      }

      if (class04770 != null) {
         class04770.method_7281(class01235.F);
         class06912.s.N(class04770, this.N, this.L, null);
      }

      this.u.N(true);
      this.N.u(6000);
      this.L.u(6000);
      this.N.Na();
      this.L.Na();
      class06069 class06069 = this.N.method_59922();
      if (N_18(this.y).method_64395().N(class07305.O)) {
         this.y.method_8649(new class07057(this.y, this.N.method_23317(), this.N.method_23318(), this.N.method_23321(), class06069.y(7) + 1));
      }
   }
}
