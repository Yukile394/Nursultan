package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07995 extends class07473 {
   private static final class01328 y = class01328.y().N(6.0);
   private static final class06581 L = class06570.ud;
   public static final int N = 400;
   private final class07625 u;
   @Nullable
   private class07438 i;
   private int R;

   @Override
   public void L() {
      this.R = this.N(400);
      this.u.N(true);
   }

   private class00734 M() {
      return this.u.method_5829().L(6.0, 2.0, 6.0);
   }

   public class07995(class07625 var1) {
      super();
      this.u = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      if (this.i != null) {
         this.u.p().N(this.i, 30.0F, 30.0F);
      }

      this.R--;
   }

   @Override
   public void u() {
      this.u.N(false);
      if (this.R == 0
         && this.i instanceof class07079 class07079
         && class07079.method_5864().N(class01217.p)
         && class07079.method_6118(class08982.N).R()
         && this.M().L(class07079.method_5829())) {
         class07079.method_5673(class08982.N, L.E());
         class07079.N(class08982.N);
      }

      this.i = null;
   }

   @Override
   public boolean y() {
      return this.R > 0;
   }

   @Override
   public boolean N() {
      if (!this.u.method_73183().method_8530()) {
         return false;
      } else if (this.u.method_59922().y(8000) != 0) {
         return false;
      } else {
         this.i = N(this.u).N(class01217.F, y, this.u, this.u.method_23317(), this.u.method_23318(), this.u.method_23321(), this.M());
         return this.i != null;
      }
   }
}
