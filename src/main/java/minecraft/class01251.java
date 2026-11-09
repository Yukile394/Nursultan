package minecraft;

import java.util.List;

public class class01251<T extends class07079 & class01279> extends class07473 {
   private static final int N = 10;
   private final T y;
   private final boolean L;
   private int u;

   @Override
   public void L() {
      this.u = this.y.method_6117();
      this.y.Q_();
      if (this.L) {
         this.Z().stream().filter(var1 -> var1 != this.y).map(var0 -> (class01279)var0).forEach(class01279::Q_);
      }

      super.L();
   }

   private boolean M() {
      return this.y.method_6065() != null && this.y.method_6065().method_5864() == class07078.Ly && this.y.method_6117() > this.u;
   }

   public class01251(T var1, boolean var2) {
      super();
      this.y = (T)var1;
      this.L = var2;
   }

   private List<? extends class07079> Z() {
      double d0 = this.y.method_45325(class05298.P);
      class00734 class00734 = class00734.N(this.y.method_73189()).L(d0, 10.0, d0);
      return this.y.method_73183().N((Class<? extends class07079>)this.y.getClass(), class00734, class07042.R);
   }

   @Override
   public boolean N() {
      return N(this.y).method_64395().N(class07305.NR) && this.M();
   }
}
