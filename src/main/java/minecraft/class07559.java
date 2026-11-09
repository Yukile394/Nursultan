package minecraft;

import java.util.EnumSet;

class class07559 extends class07473 {
   private final class07549 N;
   private int y;
   private final boolean L;

   @Override
   public void L() {
      this.y = -10;
      this.N.f().W();
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.p().N(class07438, 90.0F, 90.0F);
      }

      this.N.field_64356 = true;
   }

   public class07559(class07549 var1) {
      super();
      this.N = var1;
      this.L = var1 instanceof class07520;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.f().W();
         this.N.p().N(class07438, 90.0F, 90.0F);
         if (!this.N.method_6057(class07438)) {
            this.N.y(null);
         } else {
            this.y++;
            if (this.y == 0) {
               this.N.N(class07438.method_5628());
               if (!this.N.method_5701()) {
                  this.N.method_73183().method_8421(this.N, (byte)21);
               }
            } else if (this.y >= this.N.B()) {
               float f = 1.0F;
               if (this.N.method_73183().y() == class07086.field_5807) {
                  f += 2.0F;
               }

               if (this.L) {
                  f += 2.0F;
               }

               class04782 class04782 = N(this.N);
               class07438.method_64397(class04782, this.N.method_48923().L(this.N, (class07049)this.N), f);
               this.N.method_6121(class04782, class07438);
               this.N.y(null);
            }

            super.i();
         }
      }
   }

   @Override
   public void u() {
      this.N.N(0);
      this.N.y(null);
      this.N.L.Z();
   }

   @Override
   public boolean y() {
      return super.y() && (this.L || this.N.T() != null && this.N.method_5858(this.N.T()) > 9.0);
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      return class07438 != null && class07438.method_5805();
   }
}
