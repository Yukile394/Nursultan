package minecraft;

public abstract class class07610 extends class07482 {
   protected final class06695 N;
   protected final class07438 y;
   protected final int L = 0;
   protected final int u = 1;
   protected final int i = 2;
   protected static final int R = 3;

   protected class07610(int var1, class08044 var2, class06695 var3, class07438 var4) {
      super(null, var1);
      this.N = var3;
      this.y = var4;
      var3.method_5435(var2.z);
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.N.method_5432(var1);
   }

   public static int N(int var0) {
      return var0 * 3;
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         int ix = 2 + this.N.method_5439();
         if (var2 < ix) {
            if (!this.N(class06584x, ix, this.T.size(), true)) {
               return class06584.E;
            }
         } else if (this.L(1).N(class06584x) && !this.L(1).R()) {
            if (!this.N(class06584x, 1, 2, false)) {
               return class06584.E;
            }
         } else if (this.L(0).N(class06584x) && !this.L(0).R()) {
            if (!this.N(class06584x, 0, 1, false)) {
               return class06584.E;
            }
         } else if (this.N.method_5439() == 0 || !this.N(class06584x, 2, ix, false)) {
            int j = ix + 27;
            int k = j + 9;
            if (var2 >= j && var2 < k) {
               if (!this.N(class06584x, ix, j, false)) {
                  return class06584.E;
               }
            } else if (var2 >= ix && var2 < j) {
               if (!this.N(class06584x, j, k, false)) {
                  return class06584.E;
               }
            } else if (!this.N(class06584x, j, j, false)) {
               return class06584.E;
            }

            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }
      }

      return class06584x;
   }

   protected abstract boolean N(class06695 var1);

   @Override
   public boolean N(class08036 var1) {
      return !this.N(this.N) && this.N.method_5443(var1) && this.y.method_5805() && var1.method_56094(this.y, 4.0);
   }
}
