package minecraft;

import java.util.EnumSet;

class class07158 extends class07473 {
   private final class07162 N;
   private int y;

   @Override
   public void L() {
      this.y = y(300);
      super.L();
   }

   public class07158(class07162 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.N(class07438, 10.0F, 10.0F);
      }

      class07458 class07458 = this.N.F();
      if (class07458 instanceof class07143) {
         ((class07143)class07458).N(this.N.method_36454(), this.N.W());
      }
   }

   @Override
   public boolean y() {
      class07438 class07438 = this.N.T();
      if (class07438 == null) {
         return false;
      } else {
         return !this.N.method_18395(class07438) ? false : --this.y > 0;
      }
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      if (class07438 == null) {
         return false;
      } else {
         return !this.N.method_18395(class07438) ? false : this.N.F() instanceof class07143;
      }
   }
}
