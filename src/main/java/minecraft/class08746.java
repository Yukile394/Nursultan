package minecraft;

import org.jspecify.annotations.Nullable;

public class class08746 implements class08762 {
   private static final int N = 600;
   private static final class00392 y = class00392.L("tutorial.open_inventory.title");
   private static final class00392 L = class00392.N("tutorial.open_inventory.description", class08764.N("inventory"));
   private final class08764 u;
   @Nullable
   private class06128 i;
   private int R;

   @Override
   public void L() {
      this.u.N(class08966.field_5655);
   }

   public class08746(class08764 var1) {
      super();
      this.u = var1;
   }

   @Override
   public void y() {
      if (this.i != null) {
         this.i.B();
         this.i = null;
      }
   }

   @Override
   public void N() {
      this.R++;
      if (!this.u.R()) {
         this.u.N(class08966.field_5653);
      } else {
         if (this.R >= 600 && this.i == null) {
            class06202 class06202 = this.u.i();
            this.i = new class06128((class01590)class06202.i_3, class06090.field_2233, y, L, false);
            class06202.m().N(this.i);
         }
      }
   }
}
