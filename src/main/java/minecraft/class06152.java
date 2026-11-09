package minecraft;

import java.util.EnumSet;

class class06152 extends class07473 {
   int N;

   @Override
   public void L() {
      this.N = this.N(40);
   }

   public class06152(class06165 var1) {
      super();
      this.y = var1;
      this.N_71(EnumSet.of(class07430.field_18406, class07430.field_18407, class07430.field_18405));
   }

   @Override
   public void i() {
      this.N--;
   }

   @Override
   public void u() {
      this.y.M(false);
   }

   @Override
   public boolean y() {
      return this.N() && this.N > 0;
   }

   @Override
   public boolean N() {
      return this.y.n();
   }
}
