package minecraft;

import java.util.List;
import org.apache.commons.lang3.math.Fraction;
import org.jspecify.annotations.Nullable;

public class class06334 implements class06357 {
   private static final class01894 N = class01894.y("container/bundle/bundle_progressbar_border");
   private static final class01894 y = class01894.y("container/bundle/bundle_progressbar_fill");
   private static final class01894 L = class01894.y("container/bundle/bundle_progressbar_full");
   private static final class01894 u = class01894.y("container/bundle/slot_highlight_back");
   private static final class01894 i = class01894.y("container/bundle/slot_highlight_front");
   private static final class01894 R = class01894.y("container/bundle/slot_background");
   private static final int M = 4;
   private static final int B = 24;
   private static final int Z = 96;
   private static final int z = 13;
   private static final int U = 96;
   private static final int E = 1;
   private static final int W = 94;
   private static final int m = 4;
   private static final class00392 P = class00392.L("item.minecraft.bundle.full");
   private static final class00392 s = class00392.L("item.minecraft.bundle.empty");
   private static final class00392 T = class00392.L("item.minecraft.bundle.empty.description");
   private final class02830 b;

   private int L() {
      return this.u() * 24;
   }

   private class01894 M() {
      return this.b.R().compareTo(Fraction.ONE) >= 0 ? L : y;
   }

   public class06334(class02830 var1) {
      super();
      this.b = var1;
   }

   @Nullable
   private class00392 B() {
      if (this.b.M()) {
         return s;
      } else {
         return this.b.R().compareTo(Fraction.ONE) >= 0 ? P : null;
      }
   }

   private int i() {
      return Math.min(12, this.b.i());
   }

   private int u() {
      return class04995.R(this.i(), 4);
   }

   private void y(class01590 var1, int var2, int var3, int var4, int var5, class01054 var6) {
      boolean flag = this.b.i() > 12;
      List<class06584> list = this.y(this.b.N());
      int ix = var2 + this.N(var4) + 96;
      int j = var3 + this.u() * 24;
      int k = 1;

      for (int l = 1; l <= this.u(); l++) {
         for (int i1 = 1; i1 <= 4; i1++) {
            int j1 = ix - i1 * 24;
            int k1 = j - l * 24;
            if (N(flag, i1, l)) {
               N(j1, k1, this.N(list), var1, var6);
            } else if (N(list, k)) {
               this.N(k, j1, k1, list, k, var1, var6);
               k++;
            }
         }
      }

      this.N(var1, var6, var2, var3, var4);
      this.N(var2 + this.N(var4), var3 + this.L() + 4, var1, var6);
   }

   private static int y(class01590 var0) {
      return var0.L(T, 96).size() * 9;
   }

   private static void y(int var0, int var1, class01590 var2, class01054 var3) {
      var3.N(var2, T, var0, var1, 96, -5592406);
   }

   private List<class06584> y(int var1) {
      int ix = Math.min(this.b.i(), var1);
      return this.b.y().toList().subList(0, ix);
   }

   private int y() {
      return this.L() + 13 + 8;
   }

   private static void N(int var0, int var1, int var2, class01590 var3, class01054 var4) {
      var4.N(var3, "+" + var2, var0 + 12, var1 + 10, -1);
   }

   private void N(class01590 var1, class01054 var2, int var3, int var4, int var5) {
      if (this.b.Z()) {
         class06584 class06584 = this.b.N(this.b.B());
         class00392 class00392 = class06584.Y();
         int ix = var1.N(class00392.method_30937());
         int j = var3 + var5 / 2 - 12;
         class06357 class06357 = class06357.N(class00392.method_30937());
         var2.N(var1, List.of(class06357), j - ix / 2, var4 - 15, class02128.N, class06584.method_58694(class02484.V));
      }
   }

   private void N(int var1, int var2, int var3, List<class06584> var4, int var5, class01590 var6, class01054 var7) {
      int ix = var4.size() - var1;
      boolean flag = ix == this.b.B();
      class06584 class06584 = (class06584)var4.get(ix);
      if (flag) {
         var7.N(class08394.Na, u, var2, var3, 24, 24);
      } else {
         var7.N(class08394.Na, R, var2, var3, 24, 24);
      }

      var7.N(class06584, var2 + 4, var3 + 4, var5);
      var7.N(var6, class06584, var2 + 4, var3 + 4);
      if (flag) {
         var7.N(class08394.Na, i, var2, var3, 24, 24);
      }
   }

   private void N(int var1, int var2, class01590 var3, class01054 var4) {
      var4.N(class08394.Na, this.M(), var1 + 1, var2, this.R(), 13);
      var4.N(class08394.Na, N, var1, var2, 96, 13);
      class00392 class00392 = this.B();
      if (class00392 != null) {
         var4.N(var3, class00392, var1 + 48, var2 + 3, -1);
      }
   }

   private static int N(class01590 var0) {
      return y(var0) + 13 + 8;
   }

   private int N(int var1) {
      return (var1 - 96) / 2;
   }

   @Override
   public boolean N() {
      return true;
   }

   private void N(class01590 var1, int var2, int var3, int var4, int var5, class01054 var6) {
      y(var2 + this.N(var4), var3, var1, var6);
      this.N(var2 + this.N(var4), var3 + y(var1) + 4, var1, var6);
   }

   private int N(List<class06584> var1) {
      return this.b.y().skip(var1.size()).mapToInt(class06584::c).sum();
   }

   private static boolean N(boolean var0, int var1, int var2) {
      return var0 && var1 * var2 == 1;
   }

   private static boolean N(List<class06584> var0, int var1) {
      return var0.size() >= var1;
   }

   @Override
   public void method_32666(class01590 var1, int var2, int var3, int var4, int var5, class01054 var6) {
      if (this.b.M()) {
         this.N(var1, var2, var3, var4, var5, var6);
      } else {
         this.y(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public int method_32664(class01590 var1) {
      return 96;
   }

   @Override
   public int method_32661(class01590 var1) {
      return this.b.M() ? N(var1) : this.y();
   }

   private int R() {
      return class04995.N(class04995.N(this.b.R(), 94), 0, 94);
   }
}
