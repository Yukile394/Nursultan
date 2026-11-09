package minecraft;

import Nursultan.class10478;
import Nursultan.class10480;
import Nursultan.class10481;
import org.jspecify.annotations.Nullable;

public abstract class class04977 extends class07482 {
   private static final int N = 9;
   private static final int y = 3;
   private static final int L = 0;
   protected final class05880 i;
   protected final class08036 R;
   protected final class06695 j;
   protected final class06919 v = new class10478(this);
   private final int u;

   private int P() {
      return this.W() + 27;
   }

   private int T() {
      return this.s() + 9;
   }

   public class04977(@Nullable class05851<?> var1, int var2, class08044 var3, class05880 var4, class03275 var5) {
      super(var1, var2);
      this.i = var4;
      this.R = var3.z;
      this.j = this.N(var5.u());
      this.u = var5.i();
      this.N(var5);
      this.y(var5);
      this.L(var3, 8, 84);
   }

   private int s() {
      return this.P();
   }

   public int m() {
      return this.u;
   }

   @Override
   public void y(class06695 var1) {
      super.y(var1);
      if (var1 == this.j) {
         this.E();
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.i.N_53((var2, var3) -> this.N(var1, this.j));
   }

   private void y(class03275 var1) {
      this.N(new class04960(this, this.v, var1.y().N(), var1.y().y(), var1.y().L()));
   }

   protected boolean y(class06584 var1) {
      return true;
   }

   @Override
   public abstract void E();

   protected boolean N(class08036 var1, boolean var2) {
      return true;
   }

   private class07075 N(int var1) {
      return new class10480(this, var1);
   }

   private void N(class03275 var1) {
      for (class03285 class03285 : var1.L()) {
         this.N(new class10481(this, this.j, class03285.N(), class03285.y(), class03285.L(), class03285));
      }
   }

   protected abstract boolean N(class00500 var1);

   protected abstract void N(class08036 var1, class06584 var2);

   @Override
   public boolean N(class08036 var1) {
      return this.i.N((var2, var3) -> !this.N(var2.method_8320(var3)) ? false : var1.method_56093(var3, 4.0), true);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         int ix = this.W();
         int jx = this.T();
         if (var2 == this.m()) {
            if (!this.N(class06584x, ix, jx, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 >= 0 && var2 < this.m()) {
            if (!this.N(class06584x, ix, jx, false)) {
               return class06584.E;
            }
         } else if (this.y(class06584x) && var2 >= this.W() && var2 < this.T()) {
            if (!this.N(class06584x, 0, this.m(), false)) {
               return class06584.E;
            }
         } else if (var2 >= this.W() && var2 < this.P()) {
            if (!this.N(class06584x, this.s(), this.T(), false)) {
               return class06584.E;
            }
         } else if (var2 >= this.s() && var2 < this.T() && !this.N(class06584x, this.W(), this.P(), false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   private int W() {
      return this.m() + 1;
   }
}
