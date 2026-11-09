package minecraft;

import org.jspecify.annotations.Nullable;

public class class08776 implements class08762 {
   private static final int N = 600;
   private static final class00392 y = class00392.L("tutorial.punch_tree.title");
   private static final class00392 L = class00392.N("tutorial.punch_tree.description", class08764.N("attack"));
   private final class08764 u;
   @Nullable
   private class06128 i;
   private int R;
   private int M;

   public class08776(class08764 var1) {
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
   public void N(class03448 var1, class07209 var2, class00500 var3, float var4) {
      boolean flag = var3.N(class01210.g);
      if (flag && var4 > 0.0F) {
         if (this.i != null) {
            this.i.N(var4);
         }

         if (var4 >= 1.0F) {
            this.u.N(class08966.field_5652);
         }
      } else if (this.i != null) {
         this.i.N(0.0F);
      } else if (flag) {
         this.M++;
      }
   }

   @Override
   public void N(class06584 var1) {
      if (var1.N(class01226.g)) {
         this.u.N(class08966.field_5655);
      }
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
               if (class04453.method_31548().N(class01226.g)) {
                  this.u.N(class08966.field_5655);
                  return;
               }

               if (class08757.N(class04453)) {
                  this.u.N(class08966.field_5655);
                  return;
               }
            }
         }

         if ((this.R >= 600 || this.M > 3) && this.i == null) {
            this.i = new class06128((class01590)class06202.i_3, class06090.field_2235, y, L, true);
            class06202.m().N(this.i);
         }
      }
   }
}
