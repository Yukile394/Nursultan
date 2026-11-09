package minecraft;

import java.util.ArrayList;
import java.util.List;

class class04628 extends class04614 {
   private static final class01894 y = class01894.y("statistics/block_mined");
   private static final class01894 L = class01894.y("statistics/item_broken");
   private static final class01894 u = class01894.y("statistics/item_crafted");
   private static final class01894 i = class01894.y("statistics/item_used");
   private static final class01894 R = class01894.y("statistics/item_picked_up");
   private static final class01894 M = class01894.y("statistics/item_dropped");
   private final class04595 B;
   private final class04595 Z;
   private final class04595 z;
   private final class04595 U;
   private final class04595 E;
   private final class04595 W;
   private final List<class06478> m;

   class04628(class04611 var1) {
      super();
      this.N = var1;
      this.m = new ArrayList<>();
      this.B = new class04595(this, 0, y);
      this.Z = new class04595(this, 1, L);
      this.z = new class04595(this, 2, u);
      this.U = new class04595(this, 3, i);
      this.E = new class04595(this, 4, R);
      this.W = new class04595(this, 5, M);
      this.m.addAll(List.of(this.B, this.Z, this.z, this.U, this.E, this.W));
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.m;
   }

   @Override
   public List<? extends class03434> method_37025() {
      return this.m;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.B.y(this.method_73380() + this.N.N(0) - 18, this.method_73382() + 1);
      this.B.method_25394(var1, var2, var3, var5);
      this.Z.y(this.method_73380() + this.N.N(1) - 18, this.method_73382() + 1);
      this.Z.method_25394(var1, var2, var3, var5);
      this.z.y(this.method_73380() + this.N.N(2) - 18, this.method_73382() + 1);
      this.z.method_25394(var1, var2, var3, var5);
      this.U.y(this.method_73380() + this.N.N(3) - 18, this.method_73382() + 1);
      this.U.method_25394(var1, var2, var3, var5);
      this.E.y(this.method_73380() + this.N.N(4) - 18, this.method_73382() + 1);
      this.E.method_25394(var1, var2, var3, var5);
      this.W.y(this.method_73380() + this.N.N(5) - 18, this.method_73382() + 1);
      this.W.method_25394(var1, var2, var3, var5);
      if (this.N.u != null) {
         int ix = this.N.N(this.N.N(this.N.u)) - 36;
         class01894 class01894 = this.N.i == 1 ? class04610.L : class04610.u;
         var1.N(class08394.Na, class01894, this.method_73380() + ix, this.method_73382() + 1, 18, 18);
      }
   }
}
