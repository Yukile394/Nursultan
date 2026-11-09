package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

class class07527 extends class07473 {
   private final class07525 N;
   @Nullable
   private class07438 y;

   @Override
   public void L() {
      this.N.f().W();
   }

   public class07527(class07525 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
   }

   @Override
   public void i() {
      this.N.p().N(this.y.method_23317(), this.y.method_23320(), this.y.method_23321());
   }

   @Override
   public boolean N() {
      this.y = this.N.T();
      if (this.y instanceof class08036 class08036) {
         double d0 = this.y.method_5858(this.N);
         return d0 > 256.0 ? false : this.N.N(class08036);
      } else {
         return false;
      }
   }
}
