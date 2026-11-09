package minecraft;

class class08202 implements class08222 {
   private final class08222[] y;
   private final class05163 L;
   private final int u;
   private final int i;
   private final int R;
   private final class08236 M;
   private final boolean B;
   private final boolean Z;
   private final boolean z;

   private boolean L() {
      return this.L.u() == 32;
   }

   public class08202(class08230 var1, class05163 var2) {
      super();
      this.N = var1;
      this.y = new class08222[8];
      this.L = var2;
      this.u = this.L.B() + this.L.u() / 2;
      this.i = this.L.Z() + this.L.i() / 2;
      this.R = this.L.z() + this.L.R() / 2;
      int ix = var1.N.method_10263() - this.u;
      int j = var1.N.method_10264() - this.i;
      int k = var1.N.method_10260() - this.R;
      this.M = class08236.N(Math.abs(ix), Math.abs(j), Math.abs(k));
      this.B = ix < 0;
      this.Z = j < 0;
      this.z = k < 0;
   }

   @Override
   public class00734 y() {
      return new class00734(this.L.B(), this.L.Z(), this.L.z(), this.L.U() + 1, this.L.E() + 1, this.L.W() + 1);
   }

   private class05163 N(boolean var1, boolean var2, boolean var3) {
      int ix;
      int j;
      if (var1) {
         ix = this.L.B();
         j = this.u - 1;
      } else {
         ix = this.u;
         j = this.L.U();
      }

      int k;
      int l;
      if (var2) {
         k = this.L.Z();
         l = this.i - 1;
      } else {
         k = this.i;
         l = this.L.E();
      }

      int i1;
      int j1;
      if (var3) {
         i1 = this.L.z();
         j1 = this.R - 1;
      } else {
         i1 = this.R;
         j1 = this.L.W();
      }

      return new class05163(ix, k, i1, j, l, j1);
   }

   @Override
   public class03345 N() {
      return null;
   }

   @Override
   public void N(class08239 var1, boolean var2, class01383 var3, int var4, int var5, boolean var6) {
      boolean flag = var2;
      if (!var2) {
         int ix = var3.method_62978(this.L);
         var2 = ix == -2;
         flag = ix == -2 || ix == -1;
      }

      if (flag) {
         var6 = var6 && this.N.N(this.L.B(), this.L.Z(), this.L.z(), this.L.U(), this.L.E(), this.L.W(), var5);
         var1.visit(this, var2, var4, var6);

         for (class08222 class08222 : this.y) {
            if (class08222 != null) {
               class08222.N(var1, var2, var3, var4 + 1, var5, var6);
            }
         }
      }
   }

   public boolean N(class03345 var1) {
      long ix = var1.M();
      boolean flag = class01296.L(class01296.y(ix)) - this.u < 0;
      boolean flag1 = class01296.L(class01296.L(ix)) - this.i < 0;
      boolean flag2 = class01296.L(class01296.u(ix)) - this.R < 0;
      boolean flag3 = flag != this.B;
      boolean flag4 = flag1 != this.Z;
      boolean flag5 = flag2 != this.z;
      int j = N(this.M, flag3, flag4, flag5);
      if (this.L()) {
         boolean flag6 = this.y[j] != null;
         this.y[j] = new class08228(this.N, var1);
         return !flag6;
      } else if (this.y[j] != null) {
         class08202 class08202 = (class08202)this.y[j];
         return class08202.N(var1);
      } else {
         class05163 class05163 = this.N(flag, flag1, flag2);
         class08202 class08202x = new class08202(this.N, class05163);
         this.y[j] = class08202x;
         return class08202x.N(var1);
      }
   }

   private static int N(class08236 var0, boolean var1, boolean var2, boolean var3) {
      int ix = 0;
      if (var1) {
         ix += var0.field_53912;
      }

      if (var2) {
         ix += var0.field_53913;
      }

      if (var3) {
         ix += var0.field_53914;
      }

      return ix;
   }
}
