package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05385 extends class01463<class06951> {
   private static final class01894 N = class01894.y("container/slot/banner");
   private static final class01894 y = class01894.y("container/slot/dye");
   private static final class01894 L = class01894.y("container/slot/banner_pattern");
   private static final class01894 u = class01894.y("container/loom/scroller");
   private static final class01894 n = class01894.y("container/loom/scroller_disabled");
   private static final class01894 t = class01894.y("container/loom/pattern_selected");
   private static final class01894 G = class01894.y("container/loom/pattern_highlighted");
   private static final class01894 l = class01894.y("container/loom/pattern");
   private static final class01894 d = class01894.y("container/loom/error");
   private static final class01894 w = class01894.y("textures/gui/container/loom.png");
   private static final int k = 4;
   private static final int Y = 4;
   private static final int Q = 12;
   private static final int O = 15;
   private static final int g = 14;
   private static final int I = 56;
   private static final int J = 60;
   private static final int o = 13;
   private static final float q = 64.0F;
   private static final float K = 21.0F;
   private static final float V = 40.0F;
   private class08842 e;
   @Nullable
   private class02708 H;
   private class06584 c = class06584.E;
   private class06584 X = class06584.E;
   private class06584 a = class06584.E;
   private boolean p;
   private boolean F;
   private float A;
   private boolean f;
   private int C;

   public class05385(class06951 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      var1.N(this::y);
      this.U -= 2;
   }

   private void y() {
      class06584 class06584xxx = this.m.T().i();
      if (class06584xxx.R()) {
         this.H = null;
      } else {
         this.H = class06584xxx.a_(class02484.Nv, class02708.L);
      }

      class06584 class06584x = this.m.m().i();
      class06584 class06584xx = this.m.P().i();
      class06584 class06584xxx = this.m.s().i();
      class02708 class02708 = class06584x.a_(class02484.Nv, class02708.L);
      this.F = class02708.y().size() >= 6;
      if (this.F) {
         this.H = null;
      }

      if (!class06584.N(class06584x, this.c) || !class06584.N(class06584xx, this.X) || !class06584.N(class06584xxx, this.a)) {
         this.p = !class06584x.R() && !class06584xx.R() && !this.F && !this.m.E().isEmpty();
      }

      if (this.C >= this.N()) {
         this.C = 0;
         this.A = 0.0F;
      }

      this.c = class06584x.t();
      this.X = class06584xx.t();
      this.a = class06584xxx.t();
   }

   @Override
   protected boolean N(double var1, double var3, int var5, int var6) {
      return var1 < var5 || var3 < var6 || var1 >= var5 + this.B || var3 >= var6 + this.Z;
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = this.T;
      int j = this.b;
      var1.N(class08394.Na, w, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      class06937 class06937x = this.m.m();
      class06937 class06937x = this.m.P();
      class06937 class06937xx = this.m.s();
      class06937 class06937xxx = this.m.T();
      if (!class06937x.R()) {
         var1.N(class08394.Na, N, i + class06937x.i, j + class06937x.R, 16, 16);
      }

      if (!class06937x.R()) {
         var1.N(class08394.Na, y, i + class06937x.i, j + class06937x.R, 16, 16);
      }

      if (!class06937xx.R()) {
         var1.N(class08394.Na, L, i + class06937xx.i, j + class06937xx.R, 16, 16);
      }

      int kx = (int)(41.0F * this.A);
      class01894 class01894x = this.p ? u : n;
      int lx = i + 119;
      int i1 = j + 13 + kx;
      var1.N(class08394.Na, class01894x, lx, i1, 12, 15);
      if (var3 >= lx && var3 < lx + 12 && var4 >= i1 && var4 < i1 + 15) {
         var1.N(this.f ? class06608.i : class06608.u);
      }

      if (this.H != null && !this.F) {
         class06563 class06563x = ((class06920)class06937xxx.i().B()).N();
         int j1 = i + 141;
         int var17 = j + 8;
         var1.N(this.e, class06563x, this.H, j1, var17, j1 + 20, var17 + 40);
      } else if (this.F) {
         var1.N(class08394.Na, d, i + class06937xxx.i - 5, j + class06937xxx.R - 5, 26, 26);
      }

      if (this.p) {
         int i3 = i + 60;
         int j3 = j + 13;
         List<class03556<class00412>> list = this.m.E();

         label79:
         for (int l1 = 0; l1 < 4; l1++) {
            for (int i2 = 0; i2 < 4; i2++) {
               int j2 = (l1 + this.C) * 4 + i2;
               if (j2 >= list.size()) {
                  break label79;
               }

               int k2 = i3 + i2 * 14;
               int l2 = j3 + l1 * 14;
               class03556<class00412> class03556 = list.get(j2);
               boolean flag = var3 >= k2 && var4 >= l2 && var3 < k2 + 14 && var4 < l2 + 14;
               class01894 class01894x;
               if (j2 == this.m.W()) {
                  class01894x = t;
               } else if (flag) {
                  class01894x = G;
                  class06563 class06563 = ((class06559)this.X.B()).N();
                  var1.N(class00392.L(class03556.N().y() + "." + class06563.y()), var3, var4);
                  var1.N(class06608.u);
               } else {
                  class01894x = l;
               }

               var1.N(class08394.Na, class01894x, k2, l2, 14, 14);
               class08388 class08388 = var1.N(class05911.N(class03556));
               this.N(var1, k2, l2, class08388);
            }
         }
      }

      ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
   }

   private void N(class01054 var1, int var2, int var3, class08388 var4) {
      var1.i().pushMatrix();
      var1.i().translate(var2 + 4, var3 + 2);
      float fx = var4.method_4594();
      float f1 = fx + (var4.method_4577() - var4.method_4594()) * 21.0F / 64.0F;
      float f2 = var4.method_4575() - var4.method_4593();
      float f3 = var4.method_4593() + f2 / 64.0F;
      float f4 = f3 + f2 * 40.0F / 64.0F;
      byte b0 = 5;
      byte b1 = 10;
      var1.N(0, 0, 5, 10, class06563.field_7944.L());
      var1.N(var4.method_45852(), 0, 0, 5, 10, fx, f1, f3, f4);
      var1.i().popMatrix();
   }

   private int N() {
      return class04995.R(this.m.E().size(), 4);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      class01686 class01686 = this.field_22787.yt().N(class04802.s);
      this.e = new class08842(class01686);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      int i = this.N() - 4;
      if (this.f && this.p && i > 0) {
         int j = this.b + 13;
         int kx = j + 56;
         this.A = ((float)var1.t() - j - 7.5F) / (kx - j - 15.0F);
         this.A = class04995.N(this.A, 0.0F, 1.0F);
         this.C = Math.max((int)(this.A * i + 0.5), 0);
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
         int i = this.N() - 4;
         if (this.p && i > 0) {
            float fx = (float)var7 / i;
            this.A = class04995.N(this.A - fx, 0.0F, 1.0F);
            this.C = Math.max((int)(this.A * i + 0.5F), 0);
         }

         return true;
      }
   }

   @Override
   public boolean method_25406(class06613 var1) {
      this.f = false;
      return super.method_25406(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.p) {
         int i = this.T + 60;
         int j = this.b + 13;

         for (int kx = 0; kx < 4; kx++) {
            for (int lx = 0; lx < 4; lx++) {
               double d0 = var1.n() - (i + lx * 14);
               double d1 = var1.t() - (j + kx * 14);
               int i1 = (kx + this.C) * 4 + lx;
               if (d0 >= 0.0 && d1 >= 0.0 && d0 < 14.0 && d1 < 14.0 && this.m.y((class04453)this.field_22787.T_4, i1)) {
                  class06202.Nq().Nr().N(class00040.N(class04909.OV, 1.0F));
                  ((class03443)this.field_22787.T_2).N(this.m.b, i1);
                  return true;
               }
            }
         }

         i = this.T + 119;
         j = this.b + 9;
         if (var1.n() >= i && var1.n() < i + 12 && var1.t() >= j && var1.t() < j + 56) {
            this.f = true;
         }
      }

      return super.method_25402(var1, var2);
   }
}
