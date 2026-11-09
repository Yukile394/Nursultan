package minecraft;

public class class06178 extends class01463<class06146> {
   private static final class01894 N = class01894.y("container/stonecutter/scroller");
   private static final class01894 y = class01894.y("container/stonecutter/scroller_disabled");
   private static final class01894 L = class01894.y("container/stonecutter/recipe_selected");
   private static final class01894 u = class01894.y("container/stonecutter/recipe_highlighted");
   private static final class01894 n = class01894.y("container/stonecutter/recipe");
   private static final class01894 t = class01894.y("textures/gui/container/stonecutter.png");
   private static final int G = 12;
   private static final int l = 15;
   private static final int d = 4;
   private static final int w = 3;
   private static final int k = 16;
   private static final int Y = 18;
   private static final int Q = 54;
   private static final int O = 52;
   private static final int g = 14;
   private float I;
   private boolean J;
   private int o;
   private boolean q;

   private void L() {
      this.q = this.m.P();
      if (!this.q) {
         this.I = 0.0F;
         this.o = 0;
      }
   }

   public class06178(class06146 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      var1.N(this::L);
      this.U--;
   }

   private boolean y() {
      return this.q && this.m.m() > 12;
   }

   protected int N() {
      return (this.m.m() + 4 - 1) / 4 - 3;
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = this.T;
      int j = this.b;
      var1.N(class08394.Na, t, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      int kx = (int)(41.0F * this.I);
      class01894 class01894 = this.y() ? N : y;
      int lx = i + 119;
      int i1 = j + 15 + kx;
      var1.N(class08394.Na, class01894, lx, i1, 12, 15);
      if (var3 >= lx && var3 < lx + 12 && var4 >= i1 && var4 < i1 + 15) {
         var1.N(this.J ? class06608.i : class06608.u);
      }

      int j1 = this.T + 52;
      int k1 = this.b + 14;
      int l1 = this.o + 12;
      this.N(var1, var3, var4, j1, k1, l1);
      this.N(var1, j1, k1, l1);
   }

   private void N(class01054 var1, int var2, int var3, int var4, int var5, int var6) {
      for (int i = this.o; i < var6 && i < this.m.m(); i++) {
         int j = i - this.o;
         int kx = var4 + j % 4 * 16;
         int lx = j / 4;
         int i1 = var5 + lx * 18 + 2;
         class01894 class01894;
         if (i == this.m.E()) {
            class01894 = L;
         } else if (var2 >= kx && var3 >= i1 && var2 < kx + 16 && var3 < i1 + 18) {
            class01894 = u;
         } else {
            class01894 = n;
         }

         int j1 = i1 - 1;
         var1.N(class08394.Na, class01894, kx, j1, 16, 18);
         if (var2 >= kx && var3 >= j1 && var2 < kx + 16 && var3 < j1 + 18) {
            var1.N(class06608.u);
         }
      }
   }

   private void N(class01054 var1, int var2, int var3, int var4) {
      class00279<class06156> class00279 = this.m.W();
      class00311 class00311 = class00282.N((class03448)this.field_22787.T_3);

      for (int i = this.o; i < var4 && i < class00279.u(); i++) {
         int j = i - this.o;
         int kx = var2 + j % 4 * 16;
         int lx = j / 4;
         int i1 = var3 + lx * 18 + 2;
         class00299 class00299 = class00279.i().get(i).L().y();
         var1.N(class00299.y(class00311), kx, i1);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      if (this.J && this.y()) {
         int i = this.b + 14;
         int j = i + 54;
         this.I = ((float)var1.t() - i - 7.5F) / (j - i - 15.0F);
         this.I = class04995.N(this.I, 0.0F, 1.0F);
         this.o = (int)(this.I * this.N() + 0.5) * 4;
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
         if (this.y()) {
            int i = this.N();
            float f = (float)var7 / i;
            this.I = class04995.N(this.I - f, 0.0F, 1.0F);
            this.o = (int)(this.I * i + 0.5) * 4;
         }

         return true;
      }
   }

   @Override
   public boolean method_25406(class06613 var1) {
      this.J = false;
      return super.method_25406(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.q) {
         int i = this.T + 52;
         int j = this.b + 14;
         int kx = this.o + 12;

         for (int lx = this.o; lx < kx; lx++) {
            int i1 = lx - this.o;
            double d0 = var1.n() - (i + i1 % 4 * 16);
            double d1 = var1.t() - (j + i1 / 4 * 18);
            if (d0 >= 0.0 && d1 >= 0.0 && d0 < 16.0 && d1 < 18.0 && this.m.y((class04453)this.field_22787.T_4, lx)) {
               class06202.Nq().Nr().N(class00040.N(class04909.OX, 1.0F));
               ((class03443)this.field_22787.T_2).N(this.m.b, lx);
               return true;
            }
         }

         i = this.T + 119;
         j = this.b + 9;
         if (var1.n() >= i && var1.n() < i + 12 && var1.t() >= j && var1.t() < j + 54) {
            this.J = true;
         }
      }

      return super.method_25402(var1, var2);
   }

   @Override
   protected void a_(class01054 var1, int var2, int var3) {
      super.a_(var1, var2, var3);
      if (this.q) {
         int i = this.T + 52;
         int j = this.b + 14;
         int kx = this.o + 12;
         class00279<class06156> class00279 = this.m.W();

         for (int lx = this.o; lx < kx && lx < class00279.u(); lx++) {
            int i1 = lx - this.o;
            int j1 = i + i1 % 4 * 16;
            int k1 = j + i1 / 4 * 18 + 2;
            if (var2 >= j1 && var2 < j1 + 16 && var3 >= k1 && var3 < k1 + 18) {
               class00311 class00311 = class00282.N((class03448)this.field_22787.T_3);
               class00299 class00299 = class00279.i().get(lx).L().y();
               var1.y(this.field_22793, class00299.y(class00311), var2, var3);
            }
         }
      }
   }
}
