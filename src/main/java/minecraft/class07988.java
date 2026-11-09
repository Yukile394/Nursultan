package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07988 extends class07473 {
   private final class07550 N;
   @Nullable
   private class07438 y;

   @Override
   public void L() {
      this.N.f().W();
      this.y = this.N.T();
   }

   public class07988(class07550 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      if (this.y == null) {
         this.N.N(-1);
      } else if (this.N.method_5858(this.y) > 49.0) {
         this.N.N(-1);
      } else if (!this.N.C().N(this.y)) {
         this.N.N(-1);
      } else {
         this.N.N(1);
      }
   }

   @Override
   public void u() {
      this.y = null;
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      return this.N.E() > 0 || class07438 != null && this.N.method_5858(class07438) < 9.0;
   }
}
