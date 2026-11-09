package minecraft;

import java.util.EnumSet;

public class class06140 extends class07953 {
   private final class00683 N;
   private class07438 y;
   private int L;

   @Override
   public void L() {
      this.i.y(this.y);
      class07049 class07049 = this.N.yW();
      if (class07049 instanceof class06163) {
         this.L = ((class06163)class07049).method_6117();
      }

      super.L();
   }

   public class06140(class00683 var1) {
      super(var1, false);
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18408));
   }

   @Override
   public boolean N() {
      if (!this.N.g_()) {
         return false;
      } else if (!(this.N.yW() instanceof class06163 class06163)) {
         return false;
      } else {
         this.y = class06163.method_6065();
         return class06163.method_6117() != this.L && this.N(this.y, class01328.N);
      }
   }
}
