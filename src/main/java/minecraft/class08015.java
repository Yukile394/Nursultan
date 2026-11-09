package minecraft;

class class08015 extends class07953 {
   private final class01328 y;

   @Override
   public void L() {
      class07079 class07079 = this.N.z();
      this.N.y(class07079 != null ? class07079.T() : null);
      super.L();
   }

   public class08015(class08042 var1, class07475 var2) {
      super(var2, false);
      this.N = var1;
      this.y = class01328.y().u().i();
   }

   @Override
   public boolean N() {
      class07079 class07079 = this.N.z();
      return class07079 != null && class07079.T() != null && this.N(class07079.T(), this.y);
   }
}
