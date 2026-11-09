package minecraft;

public class class07967 extends class07473 {
   private final class07876 N;
   private boolean y;

   @Override
   public void L() {
      this.y = false;
   }

   public class07967(class07876 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      if (!this.y && !this.N.Ng() && !this.N.g_()) {
         if (this.N.L_() instanceof class04770 class04770 && this.N.method_5829().L(class04770.method_5829())) {
            this.y = this.N.N(class04770);
         }
      }
   }

   @Override
   public boolean N() {
      if (!(this.N.L_() instanceof class04770 class04770)) {
         return false;
      } else {
         boolean flag = !class04770.method_7325() && !class04770.method_31549().y && !class04770.method_5799() && !class04770.field_27857;
         return !this.N.NJ() && flag && this.N.v();
      }
   }

   @Override
   public boolean O_() {
      return !this.y;
   }
}
