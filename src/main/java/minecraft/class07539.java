package minecraft;

import java.util.List;

public class class07539 extends class07145 {
   private final class01328 i;

   @Override
   protected int M() {
      return 60;
   }

   public class07539(class07538 var1) {
      super(var1);
      this.N = var1;
      this.i = class01328.y().N(16.0).N((var0, var1x) -> ((class07881)var0).W() == class06563.field_7966);
   }

   @Override
   protected int Z() {
      return 140;
   }

   @Override
   protected int m() {
      return 40;
   }

   @Override
   protected void U() {
      class07881 class07881 = this.N.W();
      if (class07881 != null && class07881.method_5805()) {
         class07881.N(class06563.field_7964);
      }
   }

   @Override
   public void u() {
      super.u();
      this.N.N(null);
   }

   @Override
   public boolean y() {
      return this.N.W() != null && this.y > 0;
   }

   @Override
   protected class04891 E() {
      return class04909.Um;
   }

   @Override
   public boolean N() {
      if (this.N.T() != null) {
         return false;
      } else if (this.N.n()) {
         return false;
      } else if (this.N.field_6012 < this.L) {
         return false;
      } else {
         class04782 class04782 = N_18(this.N.method_73183());
         if (!class04782.method_64395().N(class07305.I)) {
            return false;
         } else {
            List list = class04782.N(class07881.class, this.i, this.N, this.N.method_5829().L(16.0, 4.0, 16.0));
            if (list.isEmpty()) {
               return false;
            } else {
               this.N.N((class07881)list.get(class07538.i(this.N).y(list.size())));
               return true;
            }
         }
      }
   }

   @Override
   protected class07156 W() {
      return class07156.field_7381;
   }
}
