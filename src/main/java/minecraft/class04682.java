package minecraft;

import org.jspecify.annotations.Nullable;

public class class04682 implements class01239 {
   private static final class01894 N = class01894.y("hud/hotbar");
   private static final class01894 y = class01894.y("hud/hotbar_selection");
   private static final long L = 5000L;
   private static final long u = 2000L;
   private final class06202 i;
   private long R;
   @Nullable
   private class05973 M;

   private float L() {
      return class04995.N((float)(this.R - class07536.L() + 5000L) / 2000.0F, 0.0F, 1.0F);
   }

   public class04682(class06202 var1) {
      super();
      this.i = var1;
   }

   public void y(int var1) {
      int ix = this.M.i() + var1;

      while (ix >= 0 && ix <= 8 && (this.M.N(ix) == class05973.M || !this.M.N(ix).ax_())) {
         ix += var1;
      }

      if (ix >= 0 && ix <= 8) {
         this.M.y(ix);
         this.R = class07536.L();
      }
   }

   public void y() {
      this.R = class07536.L();
      if (this.N()) {
         int ix = this.M.i();
         if (ix != -1) {
            this.M.y(ix);
         }
      } else {
         this.M = new class05973(this);
      }
   }

   public void y(class01054 var1) {
      float f = this.L();
      if (f > 0.0F && this.M != null) {
         class01262 class01262 = this.M.y();
         class00392 class00392 = class01262 == class05973.M ? this.M.L().y() : class01262.aw_();
         int ix = ((class01590)this.i.i_3).N(class00392);
         int j = (var1.N() - ix) / 2;
         int k = var1.y() - 35;
         var1.N((class01590)this.i.i_3, class00392, j, k, ix, class02566.y(f));
      }
   }

   public void N(class01054 var1) {
      if (this.M != null) {
         float f = this.L();
         if (f <= 0.0F) {
            this.M.u();
         } else {
            int ix = var1.N() / 2;
            int j = class04995.y(var1.y() - 22.0F * f);
            class01271 class01271 = this.M.R();
            this.N(var1, f, ix, j, class01271);
         }
      }
   }

   public boolean N() {
      return this.M != null;
   }

   protected void N(class01054 var1, float var2, int var3, int var4, class01271 var5) {
      int ix = class02566.y(var2);
      var1.N(class08394.Na, N, var3 - 91, var4, 182, 22, ix);
      if (var5.N() >= 0) {
         var1.N(class08394.Na, y, var3 - 91 - 1 + var5.N() * 20, var4 - 1, 24, 23, ix);
      }

      for (int j = 0; j < 9; j++) {
         this.N(var1, j, var1.N() / 2 - 90 + j * 20 + 2, var4 + 3, var2, var5.N(j));
      }
   }

   private void N(class01054 var1, int var2, int var3, float var4, float var5, class01262 var6) {
      if (var6 != class05973.M) {
         var1.i().pushMatrix();
         var1.i().translate(var3, var4);
         float f = var6.ax_() ? 1.0F : 0.25F;
         var6.N(var1, f, var5);
         var1.i().popMatrix();
         if (var5 > 0.0F && var6.ax_()) {
            class00392 class00392 = ((class05630)this.i.i_7).f[var2].m();
            var1.y((class01590)this.i.i_3, class00392, var3 + 19 - 2 - ((class01590)this.i.i_3).N(class00392), (int)var4 + 6 + 3, class02566.y(var5));
         }
      }
   }

   public void N(int var1) {
      this.R = class07536.L();
      if (this.M != null) {
         this.M.y(var1);
      } else {
         this.M = new class05973(this);
      }
   }

   @Override
   public void N(class05973 var1) {
      this.M = null;
      this.R = 0L;
   }
}
