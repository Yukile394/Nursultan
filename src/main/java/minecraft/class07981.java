package minecraft;

public class class07981 extends class07473 {
   private final class07475 N;

   @Override
   public void L() {
      class07623 class07623 = this.N.f();
      if (class07623 instanceof class07655) {
         ((class07655)class07623).L(true);
      }
   }

   public class07981(class07475 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void u() {
      if (class05459.N(this.N)) {
         class07623 class07623 = this.N.f();
         if (class07623 instanceof class07655) {
            ((class07655)class07623).L(false);
         }
      }
   }

   @Override
   public boolean N() {
      return this.N.method_73183().method_8530() && this.N.method_6118(class07085.field_6169).R() && class05459.N(this.N);
   }
}
