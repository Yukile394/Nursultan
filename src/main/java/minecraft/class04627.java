package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

class class04627 extends class07473 {
   @Override
   public void L() {
      class06889 class06889 = this.M();
      if (class06889 != null) {
         class04626.i(this.N).N(class04626.u(this.N).N(class07209.method_49638(class06889), 1), 1.0);
      }
   }

   @Nullable
   private class06889 M() {
      class06889 class06889x;
      if (this.N.Ng() && !this.N.y(this.N.C, this.Z())) {
         class06889x = class06889.y(this.N.C).u(this.N.method_73189()).u();
      } else {
         class06889x = this.N.method_5828(0.0F);
      }

      byte b0 = 8;
      class06889 class06889x = class05445.N(this.N, 8, 7, class06889x.M, class06889x.Z, (float) (Math.PI / 2), 3, 1);
      return class06889x != null ? class06889x : class05444.N(this.N, 8, 4, -2, class06889x.M, class06889x.Z, (float) (Math.PI / 2));
   }

   class04627(class04626 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   private int Z() {
      int i = !this.N.Y() && !this.N.v() ? 16 : 24;
      return 48 - i;
   }

   @Override
   public boolean y() {
      return class04626.L(this.N).E();
   }

   @Override
   public boolean N() {
      return class04626.N(this.N).U() && class04626.y(this.N).y(10) == 0;
   }
}
