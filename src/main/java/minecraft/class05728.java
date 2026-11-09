package minecraft;

import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

abstract class class05728 extends class05699<class05728> {
   protected static final int L = 10;
   private static final int N = 28;
   protected static final int u = 7;
   protected static final int i = 2;

   protected int L(int var1) {
      return var1 + this.y();
   }

   class05728(class05685 var1) {
      super();
      this.R = var1;
   }

   protected int u(int var1) {
      return var1 + this.y() * 2;
   }

   protected int y() {
      return 2 + 9;
   }

   protected int y(int var1, int var2, class00392 var3) {
      return var1 + var2 - class05685.P(this.R).N(var3) - 20;
   }

   protected int y(int var1) {
      return var1 + 36 + 2;
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5, class01894 var6, Supplier<class00392> var7) {
      var1.N(class08394.Na, var6, var2, var3, 10, 28);
      if (this.R.b.method_25405(var4, var5) && var4 >= var2 && var4 <= var2 + 10 && var5 >= var3 && var5 <= var3 + 28) {
         var1.N((class00392)var7.get(), var4, var5);
      }
   }

   protected void N(class01054 var1, int var2, int var3, int var4, int var5, class04981 var6) {
      int ix = this.y(var3);
      int j = this.N(var2);
      class00392 class00392 = class05685.N(var6.G, var6.u());
      int k = this.N(var3, var4, class00392);
      this.N(var1, var6.y(), ix, j, k, var5);
      if (class00392 != class05220.N && !var6.z()) {
         var1.y(class05685.i(this.R), class00392, k, j, -8355712);
      }
   }

   protected void N(class04981 var1, class01054 var2, int var3, int var4, int var5, int var6) {
      int ix = var3 - 10 - 7;
      int j = var4 + 2;
      if (var1.U) {
         this.N(var2, ix, j, var5, var6, class05685.L, () -> class05685.E);
      } else if (var1.R == class04961.field_19433) {
         this.N(var2, ix, j, var5, var6, class05685.R, () -> class05685.s);
      } else if (class05685.N(var1) && var1.W < 7) {
         this.N(var2, ix, j, var5, var6, class05685.u, () -> {
            if (var1.W <= 0) {
               return class05685.W;
            } else {
               return (class00392)(var1.W == 1 ? class05685.m : class00392.N("mco.selectServer.expires.days", var1.W));
            }
         });
      } else if (var1.R == class04961.field_19434) {
         this.N(var2, ix, j, var5, var6, class05685.i, () -> class05685.P);
      }
   }

   protected int N(class04981 var1, class01054 var2, int var3, int var4, int var5) {
      boolean flag = var1.P;
      int ix = var1.s;
      int j = var3;
      if (class07282.L(ix)) {
         class00392 class00392 = class05685.N(ix, flag);
         j = this.y(var3, var4, class00392);
         var2.y(class05685.s(this.R), class00392, j, this.L(var5), -8355712);
      }

      if (flag) {
         j -= 10;
         var2.N(class08394.Na, class05685.M, j, this.L(var5), 8, 8);
      }

      return j;
   }

   protected void N(class01054 var1, @Nullable String var2, int var3, int var4, int var5, int var6) {
      if (var2 != null) {
         int ix = var5 - var3;
         if (class05685.Z(this.R).y(var2) > ix) {
            String s = class05685.U(this.R).N(var2, ix - class05685.z(this.R).y("... "));
            var1.y(class05685.E(this.R), s + "...", var3, var4, var6);
         } else {
            var1.y(class05685.W(this.R), var2, var3, var4, var6);
         }
      }
   }

   protected int N(int var1, int var2, class00392 var3) {
      return var1 + var2 - class05685.m(this.R).N(var3) - 20;
   }

   protected void N(class01054 var1, int var2, int var3, int var4, class04981 var5) {
      int ix = this.y(var3);
      int j = this.N(var2);
      int k = this.L(j);
      String s = var5.L();
      if (var5.z() && s != null) {
         class05216 class05216 = class00392.y(s).N(class06541.field_1080);
         var1.y(class05685.R(this.R), class00392.N("mco.selectServer.minigameName", class05216).y(-171), ix, k, -1);
      } else {
         int l = this.N(var5, var1, var3, var4, j);
         this.N(var1, var5.N(), ix, this.L(j), l, -8355712);
      }
   }

   protected int N(int var1) {
      return var1 + 1;
   }

   protected void N(class01054 var1, int var2, int var3, class04981 var4) {
      int ix = this.y(var3);
      int j = this.N(var2);
      int k = this.u(j);
      if (!class05685.N(var4)) {
         var1.y(class05685.M(this.R), var4.M, ix, this.u(j), -8355712);
      } else if (var4.U) {
         class00392 class00392 = var4.E ? class05685.U : class05685.z;
         var1.y(class05685.B(this.R), class00392, ix, k, -2142128);
      }
   }
}
