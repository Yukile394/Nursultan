package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class05375 implements class01857 {
   private static final boolean N = true;
   private static final boolean y = false;
   private static final boolean L = false;
   private static final boolean u = false;
   private static final boolean i = false;
   private static final boolean R = false;
   private static final boolean M = false;
   private static final boolean B = true;
   private static final boolean Z = false;
   private static final boolean z = true;
   private static final boolean U = true;
   private static final boolean E = true;
   private static final boolean W = true;
   private static final boolean m = true;
   private static final boolean P = true;
   private static final boolean s = true;
   private static final boolean T = true;
   private static final boolean b = true;
   private static final boolean j = true;
   private static final int v = 30;
   private static final int n = 8;
   private static final float t = 0.32F;
   private static final int G = -16711681;
   private static final int l = -3355444;
   private static final int d = -98404;
   private static final int w = -23296;
   private final class06202 k;
   @Nullable
   private UUID Y;

   public class05375(class06202 var1) {
      super();
      this.k = var1;
   }

   private void y(class00457 var1) {
      var1.L(class00429.L, (var1x, var2) -> {
         if (((class04453)this.k.T_4).method_24516(var1x, 30.0)) {
            this.N(var1x, var2);
         }
      });
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      this.y(var7);
      if (!((class04453)this.k.T_4).method_7325()) {
         this.N();
      }
   }

   public Map<class07209, List<String>> N(class00457 var1) {
      HashMap hashmap = Maps.newHashMap();
      var1.L(class00429.L, (var1x, var2x) -> {
         for (class07209 class07209 : Iterables.concat(var2x.W(), var2x.m())) {
            hashmap.computeIfAbsent(class07209, var0x -> Lists.newArrayList()).add(var2x.N());
         }
      });
      return hashmap;
   }

   private void N() {
      class01861.N(this.k.F(), 8).ifPresent(var1 -> this.Y = var1.method_5667());
   }

   private boolean N(class07049 var1) {
      return Objects.equals(this.Y, var1.method_5667());
   }

   private void N(class07049 var1, class00434 var2) {
      boolean flag = this.N(var1);
      int ix = 0;
      class06724.N(var1, ix, var2.N(), -1, 0.48F);
      ix++;
      if (flag) {
         class06724.N(var1, ix, var2.y() + " " + var2.L() + " xp", -1, 0.32F);
         ix++;
      }

      if (flag) {
         int var5 = var2.u() < var2.i() ? -23296 : -1;
         class06724.N(var1, ix, "health: " + String.format(Locale.ROOT, "%.1f", var2.u()) + " / " + String.format(Locale.ROOT, "%.1f", var2.i()), var5, 0.32F);
         ix++;
      }

      if (flag && !var2.R().equals("")) {
         class06724.N(var1, ix, var2.R(), -98404, 0.32F);
         ix++;
      }

      if (flag) {
         for (String sx : var2.z()) {
            class06724.N(var1, ix, sx, -16711681, 0.32F);
            ix++;
         }
      }

      if (flag) {
         for (String s1 : var2.Z()) {
            class06724.N(var1, ix, s1, -16711936, 0.32F);
            ix++;
         }
      }

      if (var2.M()) {
         class06724.N(var1, ix, "Wants Golem", -23296, 0.32F);
         ix++;
      }

      if (flag && var2.B() != -1) {
         class06724.N(var1, ix, "Anger Level: " + var2.B(), -98404, 0.32F);
         ix++;
      }

      if (flag) {
         for (String s2 : var2.E()) {
            if (s2.startsWith(var2.N())) {
               class06724.N(var1, ix, s2, -1, 0.32F);
            } else {
               class06724.N(var1, ix, s2, -23296, 0.32F);
            }

            ix++;
         }
      }

      if (flag) {
         for (String s3 : Lists.reverse(var2.U())) {
            class06724.N(var1, ix, s3, -3355444, 0.32F);
            ix++;
         }
      }
   }
}
