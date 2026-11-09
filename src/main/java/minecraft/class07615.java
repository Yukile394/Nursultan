package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

class class07615 extends class07960 {
   @Nullable
   private class08036 u;
   private final class07617 i;

   @Override
   protected boolean M() {
      return this.u != null && this.u.equals(this.L) ? false : super.M();
   }

   public class07615(class07617 var1, double var2, Predicate<class06584> var4, boolean var5) {
      super(var1, var2, var4, var5);
      this.i = var1;
   }

   @Override
   public void i() {
      super.i();
      if (this.u == null && this.N.method_59922().y(this.N(600)) == 0) {
         this.u = this.L;
      } else if (this.N.method_59922().y(this.N(500)) == 0) {
         this.u = null;
      }
   }

   @Override
   public boolean N() {
      return super.N() && !this.i.NQ();
   }
}
