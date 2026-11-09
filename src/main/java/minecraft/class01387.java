package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import jerozgen.languagereload.mixin.AdvancementWidgetAccessor;
import org.jspecify.annotations.Nullable;

public class class01387 implements AdvancementWidgetAccessor {
   private static final class01894 N = class01894.y("advancements/title_box");
   private static final int y = 26;
   private static final int L = 0;
   private static final int u = 200;
   private static final int i = 26;
   private static final int R = 8;
   private static final int M = 5;
   private static final int B = 26;
   private static final int Z = 3;
   private static final int z = 5;
   private static final int U = 32;
   private static final int E = 9;
   private static final int W = 8;
   private static final int m = 163;
   private static final int P = 80;
   private static final int[] s = new int[]{0, 10, -10, 25, -25};
   private final class05502 T;
   private final class03734 b;
   private final class06513 j;
   private final List<class01028> v;
   private final int n;
   private final List<class01028> t;
   private final class06202 G;
   @Nullable
   private class01387 l;
   private List<class01387> d = Lists.newArrayList();
   @Nullable
   private class08019 w;
   private final int k;
   private final int Y;

   public int L() {
      return this.Y;
   }

   public class01387(class05502 var1, class06202 var2, class03734 var3, class06513 var4) {
      super();
      this.T = var1;
      this.b = var3;
      this.j = var4;
      this.G = var2;
      this.v = ((class01590)var2.i_3).L(var4.N(), 163);
      this.k = class04995.y(var4.R() * 28.0F);
      this.Y = class04995.y(var4.M() * 27.0F);
      int ix = Math.max(this.v.stream().mapToInt(((class01590)var2.i_3)::N).max().orElse(0), 80);
      int jx = this.i();
      int kx = 29 + ix + jx;
      this.t = class07018.y().N(this.N(class00390.N(var4.y(), class00405.N.N(var4.i().N())), kx));

      for (class01028 class01028 : this.t) {
         kx = Math.max(kx, ((class01590)var2.i_3).N(class01028));
      }

      this.n = kx + 3 + 5;
   }

   private int i() {
      int ix = this.b.N().R().N();
      if (ix <= 1) {
         return 0;
      } else {
         byte b0 = 8;
         class05216 class05216 = class00392.N("advancements.progress", ix, ix);
         return ((class01590)this.G.i_3).N(class05216) + 8;
      }
   }

   public int u() {
      return this.k;
   }

   public void y() {
      if (this.l == null && this.b.L() != null) {
         this.l = this.N(this.b);
         if (this.l != null) {
            this.l.N(this);
         }
      }
   }

   public void N(class01387 var1) {
      this.d.add(var1);
   }

   public void N(class01054 var1, int var2, int var3, float var4, int var5, int var6) {
      class01590 class01590 = (class01590)this.G.i_3;
      int ix = 9 * this.v.size() + 9 + 8;
      int jx = var3 + this.Y + (26 - ix) / 2;
      int kx = jx + ix;
      int lx = this.t.size() * 9;
      int i1 = 6 + lx;
      boolean flag = var5 + var2 + this.k + this.n + 26 >= this.T.B().field_22789;
      class00392 class00392 = this.w == null ? null : this.w.u();
      int j1 = class00392 == null ? 0 : class01590.N(class00392);
      boolean flag1 = kx + i1 >= 113;
      float f = this.w == null ? 0.0F : this.w.L();
      int k1 = class04995.y(f * this.n);
      class01394 class01394xx;
      class01394 class01394x;
      class01394 class01394xx;
      if (f >= 1.0F) {
         k1 = this.n / 2;
         class01394xx = class01394.field_2701;
         class01394x = class01394.field_2701;
         class01394xx = class01394.field_2701;
      } else if (k1 < 2) {
         k1 = this.n / 2;
         class01394xx = class01394.field_2699;
         class01394x = class01394.field_2699;
         class01394xx = class01394.field_2699;
      } else if (k1 > this.n - 2) {
         k1 = this.n / 2;
         class01394xx = class01394.field_2701;
         class01394x = class01394.field_2701;
         class01394xx = class01394.field_2699;
      } else {
         class01394xx = class01394.field_2701;
         class01394x = class01394.field_2699;
         class01394xx = class01394.field_2699;
      }

      int l1 = this.n - k1;
      int i2;
      if (flag) {
         i2 = var2 + this.k - this.n + 26 + 6;
      } else {
         i2 = var2 + this.k;
      }

      int j2 = ix + i1;
      if (!this.t.isEmpty()) {
         if (flag1) {
            var1.N(class08394.Na, N, i2, kx - j2, this.n, j2);
         } else {
            var1.N(class08394.Na, N, i2, jx, this.n, j2);
         }
      }

      if (class01394xx != class01394x) {
         var1.N(class08394.Na, class01394xx.N(), 200, ix, 0, 0, i2, jx, k1, ix);
         var1.N(class08394.Na, class01394x.N(), 200, ix, 200 - l1, 0, i2 + k1, jx, l1, ix);
      } else {
         var1.N(class08394.Na, class01394xx.N(), i2, jx, this.n, ix);
      }

      var1.N(class08394.Na, class01394xx.N(this.j.i()), var2 + this.k + 3, var3 + this.Y, 26, 26);
      int k2 = i2 + 5;
      if (flag) {
         this.N(var1, this.v, k2, jx + 9, -1);
         if (class00392 != null) {
            var1.y(class01590, class00392, var2 + this.k - j1, jx + 9, -1);
         }
      } else {
         this.N(var1, this.v, var2 + this.k + 32, jx + 9, -1);
         if (class00392 != null) {
            var1.y(class01590, class00392, var2 + this.k + this.n - j1 - 5, jx + 9, -1);
         }
      }

      if (flag1) {
         this.N(var1, this.t, k2, jx - lx + 1, -16711936);
      } else {
         this.N(var1, this.t, k2, kx, -16711936);
      }

      var1.y(this.j.L(), var2 + this.k + 8, var3 + this.Y + 5);
   }

   private void N(class01054 var1, List<class01028> var2, int var3, int var4, int var5) {
      class01590 class01590 = (class01590)this.G.i_3;

      for (int ix = 0; ix < var2.size(); ix++) {
         var1.y(class01590, (class01028)var2.get(ix), var3, var4 + ix * 9, var5);
      }
   }

   public boolean N(int var1, int var2, int var3, int var4) {
      if (!this.j.z() || this.w != null && this.w.N()) {
         int ix = var1 + this.k;
         int jx = ix + 26;
         int kx = var2 + this.Y;
         int lx = kx + 26;
         return var3 >= ix && var3 <= jx && var4 >= kx && var4 <= lx;
      } else {
         return false;
      }
   }

   public void N(class01054 var1, int var2, int var3, boolean var4) {
      if (this.l != null) {
         int var5 = var2 + this.l.k + 13;
         int jx = var2 + this.l.k + 26 + 4;
         int kx = var3 + this.l.Y + 13;
         int lx = var2 + this.k + 13;
         int i1 = var3 + this.Y + 13;
         int j1 = var4 ? -16777216 : -1;
         if (var4) {
            var1.N(jx, var5, kx - 1, j1);
            var1.N(jx + 1, var5, kx, j1);
            var1.N(jx, var5, kx + 1, j1);
            var1.N(lx, jx - 1, i1 - 1, j1);
            var1.N(lx, jx - 1, i1, j1);
            var1.N(lx, jx - 1, i1 + 1, j1);
            var1.y(jx - 1, i1, kx, j1);
            var1.y(jx + 1, i1, kx, j1);
         } else {
            var1.N(jx, var5, kx, j1);
            var1.N(lx, jx, i1, j1);
            var1.y(jx, i1, kx, j1);
         }
      }

      for (class01387 class01387 : this.d) {
         class01387.N(var1, var2, var3, var4);
      }
   }

   @Nullable
   private class01387 N(class03734 var1) {
      do {
         var1 = var1.L();
      } while (var1 != null && var1.N().L().isEmpty());

      return var1 != null && !var1.N().L().isEmpty() ? this.T.N(var1.y()) : null;
   }

   private List<class05936> N(class00392 var1, int var2) {
      class05228 class05228 = ((class01590)this.G.i_3).y();
      List<class05936> list = null;
      float f = Float.MAX_VALUE;

      for (int ix : s) {
         List<class05936> list1 = class05228.y(var1, var2 - ix, class00405.N);
         float f1 = Math.abs(N(class05228, list1) - var2);
         if (f1 <= 10.0F) {
            return list1;
         }

         if (f1 < f) {
            f = f1;
            list = list1;
         }
      }

      return list;
   }

   private static float N(class05228 var0, List<class05936> var1) {
      return (float)var1.stream().mapToDouble(var0::N).max().orElse(0.0);
   }

   public void N(class08019 var1) {
      this.w = var1;
   }

   public int N() {
      return this.n;
   }

   public void N(class01054 var1, int var2, int var3) {
      if (!this.j.z() || this.w != null && this.w.N()) {
         float var4 = this.w == null ? 0.0F : this.w.L();
         class01394 class01394;
         if (var4 >= 1.0F) {
            class01394 = class01394.field_2701;
         } else {
            class01394 = class01394.field_2699;
         }

         var1.N(class08394.Na, class01394.N(this.j.i()), var2 + this.k + 3, var3 + this.Y, 26, 26);
         var1.y(this.j.L(), var2 + this.k + 8, var3 + this.Y + 5);
      }

      for (class01387 class01387 : this.d) {
         class01387.N(var1, var2, var3);
      }
   }
}
