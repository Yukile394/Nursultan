package minecraft;

import java.util.EnumSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07434 extends class07473 {
   private static final class01328 u = class01328.y().N(8.0).u();
   protected final class07633 N;
   private final Class<? extends class07633> i;
   protected final class04782 y;
   @Nullable
   protected class07633 L;
   private int R;
   private final double M;

   @Nullable
   private class07633 M() {
      List<class07633> list = this.y.N(this.i, u, this.N, this.N.method_5829().M(8.0));
      double d0 = Double.MAX_VALUE;
      class07633 class07633x = null;

      for (class07633 class07633x : list) {
         if (this.N.N(class07633x) && !class07633x.Nk() && this.N.method_5858(class07633x) < d0) {
            class07633x = class07633x;
            d0 = this.N.method_5858(class07633x);
         }
      }

      return class07633x;
   }

   public class07434(class07633 var1, double var2) {
      this(var1, var2, (Class<? extends class07633>)var1.getClass());
   }

   public class07434(class07633 var1, double var2, Class<? extends class07633> var4) {
      super();
      this.N = var1;
      this.y = N(var1);
      this.i = var4;
      this.M = var2;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public void i() {
      this.N.p().N(this.L, 10.0F, this.N.Ni());
      this.N.f().N(this.L, this.M);
      this.R++;
      if (this.R >= this.N(60) && this.N.method_5858(this.L) < 9.0) {
         this.R();
      }
   }

   @Override
   public void u() {
      this.L = null;
      this.R = 0;
   }

   @Override
   public boolean y() {
      return this.L.method_5805() && this.L.NX() && this.R < 60 && !this.L.Nk();
   }

   @Override
   public boolean N() {
      if (!this.N.NX()) {
         return false;
      } else {
         this.L = this.M();
         return this.L != null;
      }
   }

   protected void R() {
      this.N.N(this.y, this.L);
   }
}
