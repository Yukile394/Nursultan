package minecraft;

class class03402 implements class01609 {
   private int L;

   class03402(class03386 var1, class08652 var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   private void N(class00620 var1, boolean var2) {
      int i = (var2 ? 128 : 255) - (this.L++ & 1) * 64;
      class00405 class00405 = var1.z();
      int j = class00405.Z() != null ? i : 0;
      int k = class00405.z() != null ? i : 0;
      int l = j != 0 && k != 0 ? 0 : i;
      int i1 = class02566.y(128, j, k, l);
      this.y.B.N(new class08656(class08394.NH, class08679.N(), this.N.L, (int)var1.P(), (int)var1.s(), (int)var1.T(), (int)var1.b(), i1, i1, this.N.z));
   }

   @Override
   public void N(class00578 var1) {
      this.N(var1, true);
   }

   @Override
   public void N(class07915 var1) {
      this.N(var1, false);
   }
}
