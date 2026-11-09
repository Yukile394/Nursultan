package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class05916 implements class01857 {
   private static final boolean N = true;
   private static final boolean y = true;
   private static final boolean L = true;
   private static final boolean u = true;
   private static final boolean i = true;
   private static final boolean R = true;
   private static final boolean M = true;
   private static final boolean B = true;
   private static final boolean Z = true;
   private static final boolean z = true;
   private static final boolean U = true;
   private static final boolean E = true;
   private static final int W = 30;
   private static final int m = 30;
   private static final int P = 8;
   private static final float s = 0.32F;
   private static final int T = -23296;
   private static final int b = -3355444;
   private static final int j = -98404;
   private final class06202 v;
   @Nullable
   private UUID n;

   private void L(class00457 var1) {
      HashMap hashmap = new HashMap();
      var1.L(class00429.y, (var1x, var2x) -> {
         if (var2x.y().isPresent()) {
            hashmap.computeIfAbsent(var2x.y().get(), var0x -> new HashSet<>()).add(var1x.method_5667());
         }
      });
      hashmap.forEach((var0, var1x) -> {
         Set set = var1x.stream().map(class01445::N).collect(Collectors.toSet());
         int ix = 1;
         class06724.N(set.toString(), var0, ix++, -256, 0.32F);
         class06724.N("Flower", var0, ix++, -1, 0.32F);
         class06724.N(var0, 0.05F, class06747.y(class02566.N(0.3F, 0.8F, 0.8F, 0.0F)));
      });
   }

   public class05916(class06202 var1) {
      super();
      this.v = var1;
   }

   private Map<class07209, List<String>> u(class00457 var1) {
      HashMap hashmap = new HashMap();
      var1.L(class00429.y, (var2x, var3) -> {
         if (var3.N().isPresent() && var1.N(class00429.B, var3.N().get()) == null) {
            hashmap.computeIfAbsent(var3.N().get(), var0x -> Lists.newArrayList()).add(class01445.N(var2x));
         }
      });
      return hashmap;
   }

   private void y() {
      class01861.N(this.v.F(), 8).ifPresent(var1 -> this.n = var1.method_5667());
   }

   private Map<class07209, Set<UUID>> y(class00457 var1) {
      HashMap hashmap = new HashMap();
      var1.L(class00429.y, (var1x, var2x) -> {
         for (class07209 class07209 : var2x.u()) {
            hashmap.computeIfAbsent(class07209, var0x -> new HashSet<>()).add(var1x.method_5667());
         }
      });
      return hashmap;
   }

   private void N(class07209 var1, class00447 var2, Collection<UUID> var3, class00457 var4) {
      int ix = 0;
      if (!var3.isEmpty()) {
         N("Blacklisted by " + N(var3), var1, ix++, -65536);
      }

      N("Out: " + N(this.N(var1, var4)), var1, ix++, -3355444);
      if (var2.y() == 0) {
         N("In: -", var1, ix++, -256);
      } else if (var2.y() == 1) {
         N("In: 1 bee", var1, ix++, -256);
      } else {
         N("In: " + var2.y() + " bees", var1, ix++, -256);
      }

      N("Honey: " + var2.L(), var1, ix++, -23296);
      N(var2.N().M().getString() + (var2.u() ? " (sedated)" : ""), var1, ix++, -1);
   }

   private void N(class07209 var1, List<String> var2) {
      float f = 0.05F;
      class06724.N(var1, 0.05F, class06747.y(class02566.N(0.3F, 0.2F, 0.2F, 1.0F)));
      class06724.N(var2.toString(), var1, 0, -256, 0.32F);
      class06724.N("Ghost Hive", var1, 1, -65536, 0.32F);
   }

   private static void N(class07209 var0) {
      float f = 0.05F;
      class06724.N(var0, 0.05F, class06747.y(class02566.N(0.3F, 0.2F, 0.2F, 1.0F)));
   }

   private static String N(Collection<UUID> var0) {
      if (var0.isEmpty()) {
         return "-";
      } else {
         return var0.size() > 3 ? var0.size() + " bees" : var0.stream().map(class01445::N).collect(Collectors.toSet()).toString();
      }
   }

   private void N(class00457 var1) {
      class07209 class07209 = this.N().u();
      var1.L(class00429.y, (var2x, var3x) -> {
         if (((class04453)this.v.T_4).method_24516(var2x, 30.0)) {
            class00432 class00432 = var1.N(class00429.i, var2x);
            this.N(var2x, var3x, class00432);
         }
      });
      this.L(var1);
      Map<class07209, Set<UUID>> map = this.y(var1);
      var1.y(class00429.B, (var4, var5) -> {
         if (class07209.method_19771(var4, 30.0)) {
            N(var4);
            Set set = map.getOrDefault(var4, Set.of());
            this.N(var4, var5, set, var1);
         }
      });
      this.u(var1).forEach((var2x, var3x) -> {
         if (class07209.method_19771(var2x, 30.0)) {
            this.N(var2x, (List<String>)var3x);
         }
      });
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      this.N(var7);
      if (!((class04453)this.v.T_4).method_7325()) {
         this.y();
      }
   }

   private Collection<UUID> N(class07209 var1, class00457 var2) {
      HashSet hashset = new HashSet();
      var2.L(class00429.y, (var2x, var3x) -> {
         if (var3x.N(var1)) {
            hashset.add(var2x.method_5667());
         }
      });
      return hashset;
   }

   private boolean N(class07049 var1) {
      return Objects.equals(this.n, var1.method_5667());
   }

   private String N(class07049 var1, class07209 var2) {
      double d0 = Math.round(var2.method_19770(var1.method_73189()) * 10.0) / 10.0;
      return var2.method_23854() + " (dist " + d0 + ")";
   }

   private class05363 N() {
      return ((class03386)this.v.i_5).s();
   }

   private static void N(String var0, class07209 var1, int var2, int var3) {
      class06724.N(var0, var1, var2, var3, 0.32F);
   }

   private void N(class07049 var1, class00433 var2, @Nullable class00432 var3) {
      boolean flag = this.N(var1);
      int ix = 0;
      class06724.N(var1, ix++, var2.toString(), -1, 0.48F);
      if (var2.N().isEmpty()) {
         class06724.N(var1, ix++, "No hive", -98404, 0.32F);
      } else {
         class06724.N(var1, ix++, "Hive: " + this.N(var1, var2.N().get()), -256, 0.32F);
      }

      if (var2.y().isEmpty()) {
         class06724.N(var1, ix++, "No flower", -98404, 0.32F);
      } else {
         class06724.N(var1, ix++, "Flower: " + this.N(var1, var2.y().get()), -256, 0.32F);
      }

      if (var3 != null) {
         for (class00452 class00452 : var3.N()) {
            if (class00452.y()) {
               class06724.N(var1, ix++, class00452.L(), -16711936, 0.32F);
            }
         }
      }

      if (var2.L() > 0) {
         int jx = var2.L() < 2400 ? -3355444 : -23296;
         class06724.N(var1, ix++, "Travelling: " + var2.L() + " ticks", jx, 0.32F);
      }
   }
}
