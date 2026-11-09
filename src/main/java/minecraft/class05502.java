package minecraft;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import jerozgen.languagereload.access.IAdvancementsTab;
import org.jspecify.annotations.Nullable;

public class class05502 implements IAdvancementsTab {
   private final class06202 N;
   private final class01417 y;
   private final class05525 L;
   private final int u;
   private final class03734 i;
   private final class06513 R;
   private final class06584 M;
   private final class00392 B;
   private final class01387 Z;
   private final Map<class03711, class01387> z = Maps.newLinkedHashMap();
   private double U;
   private double E;
   private int W = Integer.MAX_VALUE;
   private int m = Integer.MAX_VALUE;
   private int P = Integer.MIN_VALUE;
   private int s = Integer.MIN_VALUE;
   private float T;
   private boolean b;

   public class03734 L() {
      return this.i;
   }

   public boolean M() {
      return this.s - this.m > 113;
   }

   public class05502(class06202 var1, class01417 var2, class05525 var3, int var4, class03734 var5, class06513 var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var6.L();
      this.B = var6.N();
      this.Z = new class01387(this, var1, var5, var6);
      this.N(this.Z, var5.y());
   }

   public class01417 B() {
      return this.y;
   }

   public class06513 i() {
      return this.R;
   }

   public class00392 u() {
      return this.B;
   }

   public void y(class01054 var1, int var2, int var3) {
      if (!this.b) {
         this.U = 117 - (this.P + this.W) / 2;
         this.E = 56 - (this.s + this.m) / 2;
         this.b = true;
      }

      var1.L(var2, var3, var2 + 234, var3 + 113);
      var1.i().pushMatrix();
      var1.i().translate(var2, var3);
      class01894 class01894 = this.R.u().map(class06953::y).orElse(class08627.N);
      int ix = class04995.N(this.U);
      int j = class04995.N(this.E);
      int k = ix % 16;
      int l = j % 16;

      for (int i1 = -1; i1 <= 15; i1++) {
         for (int j1 = -1; j1 <= 8; j1++) {
            var1.N(class08394.Na, class01894, k + 16 * i1, l + 16 * j1, 0.0F, 0.0F, 16, 16, 16, 16);
         }
      }

      this.Z.N(var1, ix, j, true);
      this.Z.N(var1, ix, j, false);
      this.Z.N(var1, ix, j);
      var1.i().popMatrix();
      var1.R();
   }

   public int y() {
      return this.u;
   }

   public void N(class03734 var1) {
      Optional<class06513> optional = var1.N().L();
      if (!optional.isEmpty()) {
         class01387 class01387 = new class01387(this, this.N, var1, optional.get());
         this.N(class01387, var1.y());
      }
   }

   public void N(double var1, double var3) {
      if (this.R()) {
         this.U = class04995.N(this.U + var1, (double)(-(this.P - 234)), 0.0);
      }

      if (this.M()) {
         this.E = class04995.N(this.E + var3, (double)(-(this.s - 113)), 0.0);
      }
   }

   private void N(class01387 var1, class03711 var2) {
      this.z.put(var2, var1);
      int ix = var1.u();
      int j = ix + 28;
      int k = var1.L();
      int l = k + 27;
      this.W = Math.min(this.W, ix);
      this.P = Math.max(this.P, j);
      this.m = Math.min(this.m, k);
      this.s = Math.max(this.s, l);
      Iterator<class01387> iterator = this.z.values().iterator();

      while (iterator.hasNext()) {
         iterator.next().y();
      }
   }

   @Nullable
   public class01387 N(class03711 var1) {
      return this.z.get(var1);
   }

   public void N(class01054 var1, int var2, int var3, int var4, int var5, boolean var6) {
      int ix = var2 + this.L.N(this.u);
      int j = var3 + this.L.y(this.u);
      this.L.N(var1, ix, j, var6, this.u);
      if (!var6 && var4 > ix && var5 > j && var4 < ix + this.L.N() && var5 < j + this.L.y()) {
         var1.N(class06608.u);
      }
   }

   public class05525 N() {
      return this.L;
   }

   public void N(class01054 var1, int var2, int var3, int var4, int var5) {
      var1.N(0, 0, 234, 113, class04995.y(this.T * 255.0F) << 24);
      boolean flag = false;
      int ix = class04995.N(this.U);
      int j = class04995.N(this.E);
      if (var2 > 0 && var2 < 234 && var3 > 0 && var3 < 113) {
         for (class01387 class01387 : this.z.values()) {
            if (class01387.N(ix, j, var2, var3)) {
               flag = true;
               class01387.N(var1, ix, j, this.T, var4, var5);
               break;
            }
         }
      }

      if (flag) {
         this.T = class04995.N(this.T + 0.02F, 0.0F, 0.3F);
      } else {
         this.T = class04995.N(this.T - 0.04F, 0.0F, 1.0F);
      }
   }

   public void N(class01054 var1, int var2, int var3) {
      this.L.N(var1, var2, var3, this.u, this.M);
   }

   @Nullable
   public static class05502 N(class06202 var0, class01417 var1, int var2, class03734 var3) {
      Optional<class06513> optional = var3.N().L();
      if (optional.isEmpty()) {
         return null;
      } else {
         for (class05525 class05525 : class05525.values()) {
            if (var2 < class05525.L()) {
               return new class05502(var0, var1, class05525, var2, var3, optional.get());
            }

            var2 -= class05525.L();
         }

         return null;
      }
   }

   public boolean N(int var1, int var2, double var3, double var5) {
      return this.L.N(var1, var2, this.u, var3, var5);
   }

   public boolean R() {
      return this.P - this.W > 234;
   }

   public void languagereload_recreateWidgets() {
      this.z.replaceAll((var1, var2) -> {
         class01387 class01387 = new class01387(var2.languagereload_getTab(), this.N, var2.languagereload_getAdvancement(), var2.languagereload_getDisplay());
         class01387.N(var2.languagereload_getProgress());
         class01387.languagereload_setParent(var2.languagereload_getParent());
         class01387.languagereload_setChildren(var2.languagereload_getChildren());
         return class01387;
      });
   }
}
