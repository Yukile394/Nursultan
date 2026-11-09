package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class05713 extends class05728 {
   private static final int B = 40;
   public static final int N = 7;
   public static final int y = 38;
   private final class00392 Z;
   private final List<class06478> z;
   @Nullable
   private final class05683 U;
   private final class04230 E;
   private final class02060 W;
   private final class02077 m;
   private final class05362 P;
   private int s;

   private void L() {
      int i = this.method_25368();
      if (this.s != i) {
         this.R(i);
         this.s = i;
      }
   }

   public class05713(class05685 var1, class05685 var2, int var3, class00392 var4, class03605 var5) {
      super(var1);
      this.M = var1;
      this.z = new ArrayList<>();
      this.s = -1;
      this.Z = var4;
      this.W = new class02060();
      this.W.N(class03608.N(20, 20, class05685.N), 0, 0, this.W.y().N(7, 7, 0, 0));
      this.W.N(class02057.N(40), 0, 0);
      this.m = this.W.N(new class02077(0, var3), 0, 1, this.W.y().L(7));
      this.E = this.m.N(new class04230(var4, class05685.b(var1)).N(true), this.m.y().y().u());
      this.W.N(class02057.N(40), 0, 2);
      if (var5.y()) {
         this.U = this.W.N(new class05683(var2x -> this.M.N(var5.L()), class00392.L("mco.notification.dismiss")), 0, 2, this.W.y().L().N(0, 7, 7, 0));
      } else {
         this.U = null;
      }

      this.P = this.W.N(var5.N(var2), 1, 1, this.W.y().y().N(4));
      this.P.method_76613(() -> this.method_25370());
      this.W.method_48206(this.z::add);
   }

   public static int i(int var0) {
      return var0 - 80;
   }

   public class00392 N() {
      return this.Z;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.P.method_25404(var1)) {
         return true;
      } else {
         return this.U != null && this.U.method_25404(var1) ? true : super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.U != null && this.U.method_25402(var1, var2)) {
         return true;
      } else {
         return this.P.method_25402(var1, var2) ? true : super.method_25402(var1, var2);
      }
   }

   private void R(int var1) {
      int i = i(var1);
      this.m.y(i);
      this.E.N(i);
      this.W.N();
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.W.y(this.method_73380(), this.method_73382());
      this.L();
      this.z.forEach(var4x -> var4x.method_25394(var1, var2, var3, var5));
   }

   @Override
   public class00392 method_37006() {
      return this.N();
   }
}
