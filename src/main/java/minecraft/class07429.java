package minecraft;

import com.mojang.datafixers.DataFixUtils;
import java.util.List;
import java.util.function.Predicate;

public class class07429 extends class07473 {
   private static final int N = 200;
   private final class07643 y;
   private int L;
   private int u;

   @Override
   public void L() {
      this.L = 0;
   }

   public class07429(class07643 var1) {
      super();
      this.y = var1;
      this.u = this.N(var1);
   }

   @Override
   public void i() {
      if (--this.L <= 0) {
         this.L = this.N(10);
         this.y.w();
      }
   }

   @Override
   public void u() {
      this.y.t();
   }

   @Override
   public boolean y() {
      return this.y.n() && this.y.d();
   }

   @Override
   public boolean N() {
      if (this.y.l()) {
         return false;
      } else if (this.y.n()) {
         return true;
      } else if (this.u > 0) {
         this.u--;
         return false;
      } else {
         this.u = this.N(this.y);
         Predicate predicate = var0 -> var0.G() || !var0.n();
         List<class07643> list = this.y.method_73183().N((Class<class07643>)this.y.getClass(), this.y.method_5829().L(8.0, 8.0, 8.0), predicate);
         ((class07643)DataFixUtils.orElse(list.stream().filter(class07643::G).findAny(), this.y)).N(list.stream().filter(var0 -> !var0.n()));
         return this.y.n();
      }
   }

   protected int N(class07643 var1) {
      return y(200 + var1.method_59922().y(200) % 20);
   }
}
