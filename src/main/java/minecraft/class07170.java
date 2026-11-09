package minecraft;

import java.util.EnumSet;

class class07170 extends class07473 {
   private int y;

   @Override
   public void L() {
      this.y = 20;
      this.N.N(100);
   }

   public class07170(class07144 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      if (this.N.method_73183().y() != class07086.field_5801) {
         this.y--;
         class07438 class07438 = this.N.T();
         if (class07438 != null) {
            this.N.p().N(class07438, 180.0F, 180.0F);
            if (this.N.method_5858(class07438) < 400.0) {
               if (this.y <= 0) {
                  this.y = 20 + class07144.L(this.N).y(10) * 20 / 2;
                  this.N.method_73183().method_8649(new class08002(this.N.method_73183(), this.N, class07438, this.N.E().z()));
                  this.N.method_5783(class04909.kL, 2.0F, (class07144.u(this.N).z() - class07144.i(this.N).z()) * 0.2F + 1.0F);
               }
            } else {
               this.N.y(null);
            }

            super.i();
         }
      }
   }

   @Override
   public void u() {
      this.N.N(0);
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      return class07438 != null && class07438.method_5805() ? this.N.method_73183().y() != class07086.field_5801 : false;
   }
}
