package minecraft;

public class class07520 extends class07549 {
   public static final float N = class07078.p.z() / class07078.Nm.z();
   private static final int u = 1200;
   private static final int i = 50;
   private static final int R = 6000;
   private static final int M = 2;
   private static final int B = 1200;

   public static class05300 M() {
      return class07549.W().N(class05298.l, 0.3F).N(class05298.u, 8.0).N(class05298.n, 80.0);
   }

   public class07520(class07078<? extends class07520> var1, class07299 var2) {
      super(var1, var2);
      this.NW();
      if (this.L != null) {
         this.L.L(400);
      }
   }

   @Override
   public int B() {
      return 60;
   }

   @Override
   protected class04891 s() {
      return this.method_5799() ? class04909.zG : class04909.zl;
   }

   @Override
   protected class04891 E() {
      return class04909.zY;
   }

   @Override
   protected void N(class04782 var1) {
      super.N(var1);
      if ((this.field_6012 + this.method_5628()) % 1200 == 0) {
         class07055 class07055 = new class07055(class07047.u, 6000, 2);
         class07063.N(var1, this, this.method_73189(), 50.0, class07055, 1200)
            .forEach(var1x -> var1x.field_13987.method_14364(new class00503(class00503.E, this.method_5701() ? 0.0F : 1.0F)));
      }

      if (!this.Nj()) {
         this.N(this.method_24515(), 16);
      }
   }

   @Override
   public class04891 method_6002() {
      return this.method_5799() ? class04909.zw : class04909.zk;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return this.method_5799() ? class04909.zQ : class04909.zO;
   }
}
