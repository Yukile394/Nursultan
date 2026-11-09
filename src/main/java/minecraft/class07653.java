package minecraft;

import java.util.List;

class class07653 extends class07473 {
   private int y;

   @Override
   public void L() {
      List<class00717> list = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07618.L);
      if (!list.isEmpty()) {
         this.N.f().N(list.get(0), 1.2F);
         this.N.method_5783(class04909.ZY, 1.0F, 1.0F);
      }

      this.y = 0;
   }

   class07653(class07618 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      List<class00717> list = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07618.L);
      class06584 class06584 = this.N.method_6118(class07085.field_6173);
      if (!class06584.R()) {
         this.N(class06584);
         this.N.method_5673(class07085.field_6173, class06584.E);
      } else if (!list.isEmpty()) {
         this.N.f().N(list.get(0), 1.2F);
      }
   }

   @Override
   public void u() {
      class06584 class06584 = this.N.method_6118(class07085.field_6173);
      if (!class06584.R()) {
         this.N(class06584);
         this.N.method_5673(class07085.field_6173, class06584.E);
         this.y = this.N.field_6012 + class07618.N(this.N).y(100);
      }
   }

   @Override
   public boolean N() {
      return this.y > this.N.field_6012
         ? false
         : !this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07618.L).isEmpty()
            || !this.N.method_6118(class07085.field_6173).R();
   }

   private void N(class06584 var1) {
      if (!var1.R()) {
         double d0 = this.N.method_23320() - 0.3F;
         class00717 class00717 = new class00717(this.N.method_73183(), this.N.method_23317(), d0, this.N.method_23321(), var1);
         class00717.N(40);
         class00717.N(this.N);
         float f = 0.3F;
         float f1 = class07618.y(this.N).z() * (float) (Math.PI * 2);
         float f2 = 0.02F * class07618.L(this.N).z();
         class00717.method_18800(
            0.3F * -class04995.m(this.N.method_36454() * (float) (Math.PI / 180.0)) * class04995.P(this.N.method_36455() * (float) (Math.PI / 180.0))
               + class04995.P(f1) * f2,
            0.3F * class04995.m(this.N.method_36455() * (float) (Math.PI / 180.0)) * 1.5F,
            0.3F * class04995.P(this.N.method_36454() * (float) (Math.PI / 180.0)) * class04995.P(this.N.method_36455() * (float) (Math.PI / 180.0))
               + class04995.m(f1) * f2
         );
         this.N.method_73183().method_8649(class00717);
      }
   }
}
