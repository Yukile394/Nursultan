package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

class class07635 extends class07473 {
   private final class07618 N;
   private final double y;
   @Nullable
   private class08036 L;

   @Override
   public void L() {
      this.L.method_37222(new class07055(class07047.O, 100), this.N);
   }

   class07635(class07618 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      this.N.p().N(this.L, this.N.NR() + 20, this.N.Ni());
      if (this.N.method_5858(this.L) < 6.25) {
         this.N.f().W();
      } else {
         this.N.f().N(this.L, this.y);
      }

      if (this.L.method_5681() && this.L.method_73183().field_9229.y(6) == 0) {
         this.L.method_37222(new class07055(class07047.O, 100), this.N);
      }
   }

   @Override
   public void u() {
      this.L = null;
      this.N.f().W();
   }

   @Override
   public boolean y() {
      return this.L != null && this.L.method_5681() && this.N.method_5858(this.L) < 256.0;
   }

   @Override
   public boolean N() {
      this.L = N(this.N).N(class07618.N, this.N);
      return this.L == null ? false : this.L.method_5681() && this.N.T() != this.L;
   }
}
