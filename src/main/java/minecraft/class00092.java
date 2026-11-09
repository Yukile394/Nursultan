package minecraft;

import org.jspecify.annotations.Nullable;

public class class00092 implements class08762 {
   private static final int N = 1200;
   private static final class00392 y = class00392.L("tutorial.craft_planks.title");
   private static final class00392 L = class00392.L("tutorial.craft_planks.description");
   private final class08764 u;
   @Nullable
   private class06128 i;
   private int R;

   public class00092(class08764 var1) {
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
   public void N(class06584 var1) {
      if (var1.N(class01226.y)) {
         this.u.N(class08966.field_5653);
      }
   }

   public static boolean N(class04453 var0, class03530<class06581> var1) {
      for (class03556<class06581> class03556 : class04206.B.u(var1)) {
         if (var0.O().N(class01235.y.y(class03556.N())) > 0) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void N() {
      this.R++;
      if (!this.u.R()) {
         this.u.N(class08966.field_5653);
      } else {
         class06202 class06202 = this.u.i();
         if (this.R == 1) {
            class04453 class04453 = (class04453)class06202.T_4;
            if (class04453 != null) {
               if (class04453.method_31548().N(class01226.y)) {
                  this.u.N(class08966.field_5653);
                  return;
               }

               if (N(class04453, class01226.y)) {
                  this.u.N(class08966.field_5653);
                  return;
               }
            }
         }

         if (this.R >= 1200 && this.i == null) {
            this.i = new class06128((class01590)class06202.i_3, class06090.field_2236, y, L, false);
            class06202.m().N(this.i);
         }
      }
   }
}
