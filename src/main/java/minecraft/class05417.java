package minecraft;

public class class05417 extends class01463<class06952> {
   private static final class01894 y = class01894.y("container/villager/out_of_stock");
   private static final class01894 L = class01894.y("container/villager/experience_bar_background");
   private static final class01894 u = class01894.y("container/villager/experience_bar_current");
   private static final class01894 n = class01894.y("container/villager/experience_bar_result");
   private static final class01894 t = class01894.y("container/villager/scroller");
   private static final class01894 G = class01894.y("container/villager/scroller_disabled");
   private static final class01894 l = class01894.y("container/villager/trade_arrow_out_of_stock");
   private static final class01894 d = class01894.y("container/villager/trade_arrow");
   private static final class01894 w = class01894.y("container/villager/discount_strikethrough");
   private static final class01894 k = class01894.y("textures/gui/container/villager.png");
   private static final int Y = 512;
   private static final int Q = 256;
   private static final int O = 99;
   private static final int g = 136;
   private static final int I = 16;
   private static final int J = 5;
   private static final int o = 35;
   private static final int q = 68;
   private static final int K = 6;
   private static final int V = 7;
   private static final int e = 5;
   private static final int H = 20;
   private static final int c = 88;
   private static final int X = 27;
   private static final int a = 6;
   private static final int p = 139;
   private static final int F = 18;
   private static final int A = 94;
   private static final class00392 f = class00392.L("merchant.trades");
   private static final class00392 C = class00392.L("merchant.deprecated");
   private int S;
   private final class05393[] x = new class05393[7];
   int N;
   private boolean D;

   public class05417(class06952 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      this.B = 276;
      this.E = 107;
   }

   @Override
   protected void u(class01054 var1, int var2, int var3) {
      int i = this.m.m();
      if (i > 0 && i <= 5 && this.m.T()) {
         class05216 class05216 = class00392.N("merchant.title", this.field_22785, class00392.L("merchant.level." + i));
         int j = this.field_22793.N(class05216);
         int kx = 49 + this.B / 2 - j / 2;
         var1.N(this.field_22793, class05216, kx, 6, -12566464, false);
      } else {
         var1.N(this.field_22793, this.field_22785, 49 + this.B / 2 - this.field_22793.N(this.field_22785) / 2, 6, -12566464, false);
      }

      var1.N(this.field_22793, this.P, this.E, this.W, -12566464, false);
      int lx = this.field_22793.N(f);
      var1.N(this.field_22793, f, 5 - lx / 2 + 48, 6, -12566464, false);
   }

   private void N(class01054 var1, class06584 var2, class06584 var3, int var4, int var5) {
      var1.y(var2, var4, var5);
      if (var3.c() == var2.c()) {
         var1.N(this.field_22793, var2, var4, var5);
      } else {
         var1.N(this.field_22793, var3, var4, var5, var3.c() == 1 ? "1" : null);
         var1.N(this.field_22793, var2, var4 + 14, var5, var2.c() == 1 ? "1" : null);
         var1.N(class08394.Na, w, var4 + 7, var5 + 12, 9, 2);
      }
   }

   private boolean N(int var1) {
      return var1 > 7;
   }

   private void N() {
      this.m.N(this.S);
      this.m.B(this.S);
      this.field_22787.NE().N(new class07351(this.S));
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5, class07316 var6) {
      int i = var6.size() + 1 - 7;
      if (i > 1) {
         int j = 139 - (27 + (i - 1) * 139 / i);
         int kx = 1 + j / i + 139 / i;
         byte b0 = 113;
         int lx = Math.min(113, this.N * kx);
         if (this.N == i - 1) {
            lx = 113;
         }

         int i1 = var2 + 94;
         int j1 = var3 + 18 + lx;
         var1.N(class08394.Na, t, i1, j1, 6, 27);
         if (var4 >= i1 && var4 < var2 + 94 + 6 && var5 >= j1 && var5 <= j1 + 27) {
            var1.N(this.D ? class06608.i : class06608.u);
         }
      } else {
         var1.N(class08394.Na, G, var2 + 94, var3 + 18, 6, 27);
      }
   }

   private void N(class01054 var1, int var2, int var3, class07324 var4) {
      int i = this.m.m();
      int j = this.m.E();
      if (i < 5) {
         var1.N(class08394.Na, L, var2 + 136, var3 + 16, 102, 5);
         int kx = class05666.y(i);
         if (j >= kx && class05666.u(i)) {
            byte b0 = 102;
            float fx = 102.0F / (class05666.L(i) - kx);
            int lx = Math.min(class04995.y(fx * (j - kx)), 102);
            var1.N(class08394.Na, u, 102, 5, 0, 0, var2 + 136, var3 + 16, lx, 5);
            int i1 = this.m.W();
            if (i1 > 0) {
               int j1 = Math.min(class04995.y(i1 * fx), 102 - lx);
               var1.N(class08394.Na, n, 102, 5, lx, 0, var2 + 136 + lx, var3 + 16, j1, 5);
            }
         }
      }
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, k, i, j, 0.0F, 0.0F, this.B, this.Z, 512, 256);
      class07316 class07316 = this.m.s();
      if (!class07316.isEmpty()) {
         int kx = this.S;
         if (kx < 0 || kx >= class07316.size()) {
            return;
         }

         if (class07316.get(kx).b()) {
            var1.N(class08394.Na, y, this.T + 83 + 99, this.b + 35, 28, 21);
         }
      }
   }

   private void N(class01054 var1, class07324 var2, int var3, int var4) {
      if (var2.b()) {
         var1.N(class08394.Na, l, var3 + 5 + 35 + 20, var4 + 3, 10, 9);
      } else {
         var1.N(class08394.Na, d, var3 + 5 + 35 + 20, var4 + 3, 10, 9);
      }
   }

   @Override
   public void N(class01054 var1, int var2, int var3, float var4) {
      super.N(var1, var2, var3, var4);
      class07316 class07316 = this.m.s();
      if (!class07316.isEmpty()) {
         int i = (this.field_22789 - this.B) / 2;
         int j = (this.field_22790 - this.Z) / 2;
         int kx = j + 16 + 1;
         int lx = i + 5 + 5;
         this.N(var1, i, j, var2, var3, class07316);
         int i1 = 0;

         for (class07324 class07324x : class07316) {
            if (!this.N(class07316.size()) || i1 >= this.N && i1 < 7 + this.N) {
               class06584 class06584xxx = class07324x.N();
               class06584 class06584x = class07324x.y();
               class06584 class06584xx = class07324x.L();
               class06584 class06584xxx = class07324x.R();
               int j1 = kx + 2;
               this.N(var1, class06584x, class06584xxx, lx, j1);
               if (!class06584xx.R()) {
                  var1.y(class06584xx, i + 5 + 35, j1);
                  var1.N(this.field_22793, class06584xx, i + 5 + 35, j1);
               }

               this.N(var1, class07324x, i, j1);
               var1.y(class06584xxx, i + 5 + 68, j1);
               var1.N(this.field_22793, class06584xxx, i + 5 + 68, j1);
               kx += 20;
               i1++;
            } else {
               i1++;
            }
         }

         int k1 = this.S;
         class07324 class07324x = class07316.get(k1);
         if (this.m.T()) {
            this.N(var1, i, j, class07324x);
         }

         if (class07324x.b() && this.N(186, 35, 22, 21, var2, var3) && this.m.P()) {
            var1.N(this.field_22793, C, var2, var3);
         }

         for (class05393 class05393 : this.x) {
            if (class05393.method_25367()) {
               class05393.N(var1, var2, var3);
            }

            class05393.field_22764 = class05393.N < this.m.s().size();
         }
      }

      this.a_(var1, var2, var3);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2 + 16 + 2;

      for (int kx = 0; kx < 7; kx++) {
         this.x[kx] = this.method_37063(new class05393(this, i + 5, j, kx, var1x -> {
            if (var1x instanceof class05393) {
               this.S = ((class05393)var1x).y() + this.N;
               this.N();
            }
         }));
         j += 20;
      }
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      int i = this.m.s().size();
      if (this.D) {
         int j = this.b + 18;
         int kx = j + 139;
         int lx = i - 7;
         float fx = ((float)var1.t() - j - 13.5F) / (kx - j - 27.0F);
         fx = fx * lx + 0.5F;
         this.N = class04995.N((int)fx, 0, lx);
         return true;
      } else {
         return super.method_25403(var1, var2, var4);
      }
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (super.method_25401(var1, var3, var5, var7)) {
         return true;
      } else {
         int i = this.m.s().size();
         if (this.N(i)) {
            int j = i - 7;
            this.N = class04995.N((int)(this.N - var7), 0, j);
         }

         return true;
      }
   }

   @Override
   public boolean method_25406(class06613 var1) {
      this.D = false;
      return super.method_25406(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      if (this.N(this.m.s().size()) && var1.n() > i + 94 && var1.n() < i + 94 + 6 && var1.t() > j + 18 && var1.t() <= j + 18 + 139 + 1) {
         this.D = true;
      }

      return super.method_25402(var1, var2);
   }
}
