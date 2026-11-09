package minecraft;

public class class01604 implements class07825 {
   private final class02796 N;
   private final class00642 y;

   public class01604(class02796 var1, class00642 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void N(class07821 var1) {
      if (var1.u() != class04193.field_44975) {
         throw new UnsupportedOperationException("Invalid intention " + var1.u());
      } else {
         this.y.method_56330(class04279.y, new class01610(this.N, this.y, false));
         this.y.method_56329(class04279.u);
      }
   }

   @Override
   public boolean method_48106() {
      return this.y.method_10758();
   }

   @Override
   public void method_10839(class02570 var1) {
   }
}
