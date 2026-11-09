package minecraft;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class class06963 {
   private final class01683 N;
   private final class06463 y;
   private Set<class00455<?>> L = Set.of();
   private final Map<class00455<?>, class06980<?>> u = new HashMap<>();

   static <T> class06988<UUID, T> L() {
      return var0 -> var0.L;
   }

   public class06963(class01683 var1, class06463 var2) {
      super();
      this.y = var2;
      this.N = var1;
   }

   static <T> class06988<class07321, T> i() {
      return var0 -> var0.N;
   }

   static <T> class06988<class07209, T> u() {
      return var0 -> var0.y;
   }

   public void y() {
      this.u.clear();
      this.y(this.L);
   }

   private void y(Set<class00455<?>> var1) {
      for (class00455 class00455 : var1) {
         this.u.computeIfAbsent(class00455, var0 -> new class06980());
      }
   }

   public void N(class07321 var1) {
      if (!this.u.isEmpty()) {
         Iterator<class06980<?>> iterator = this.u.values().iterator();

         while (iterator.hasNext()) {
            iterator.next().N(var1);
         }
      }
   }

   private <K, V> void N(long var1, K var3, class00442<V> var4, class06988<K, V> var5) {
      class06976 class06976 = this.N(var4.N(), var5);
      if (class06976 != null) {
         class06976.N(var1, var3, var4);
      }
   }

   <K, V> void N(class00455<V> var1, class06988<K, V> var2, BiConsumer<K, V> var3) {
      class06976 class06976 = this.N(var1, var2);
      if (class06976 != null) {
         class06976.N(var3);
      }
   }

   public void N(class07049 var1) {
      if (!this.u.isEmpty()) {
         Iterator<class06980<?>> iterator = this.u.values().iterator();

         while (iterator.hasNext()) {
            iterator.next().L.N(var1.method_5667());
         }
      }
   }

   @Nullable
   private <K, V> class06976<K, V> N(class00455<V> var1, class06988<K, V> var2) {
      class06980 class06980 = this.N(var1);
      return class06980 != null ? var2.get(class06980) : null;
   }

   @Nullable
   <V> class06980<V> N(class00455<V> var1) {
      return (class06980<V>)this.u.get(var1);
   }

   private void N(Set<class00455<?>> var1) {
      this.u.keySet().retainAll(var1);
      this.y(var1);
      this.N.N(new class02884(var1));
   }

   public void N(long var1) {
      Set<class00455<?>> set = this.R();
      if (!set.equals(this.L)) {
         this.L = set;
         this.N(set);
      }

      this.u.forEach((var2, var3x) -> {
         if (var2.L() != 0) {
            var3x.N(var1);
         }
      });
   }

   public void N() {
      this.L = Set.of();
      this.y();
   }

   private static void N(Set<class00455<?>> var0, class00455<?> var1, boolean var2) {
      if (var2) {
         var0.add(var1);
      }
   }

   public <T> void N(long var1, class00428<T> var3) {
      class06980 class06980 = this.N(var3.N());
      if (class06980 != null) {
         class06980.u.add(new class06986<>(var3.y(), var1 + var3.N().L()));
      }
   }

   public <T> void N(long var1, class07049 var3, class00442<T> var4) {
      this.N(var1, var3.method_5667(), var4, L());
   }

   public <T> void N(long var1, class07209 var3, class00442<T> var4) {
      this.N(var1, var3, var4, u());
   }

   @Nullable
   <K, V> V N(class00455<V> var1, K var2, class06988<K, V> var3) {
      class06976 class06976 = this.N(var1, var3);
      return (V)(class06976 != null ? class06976.y(var2) : null);
   }

   public class00457 N(class07299 var1) {
      return new class06970(this, var1);
   }

   public <T> void N(long var1, class07321 var3, class00442<T> var4) {
      this.N(var1, var3, var4, i());
   }

   private Set<class00455<?>> R() {
      ReferenceOpenHashSet referenceopenhashset = new ReferenceOpenHashSet();
      N(referenceopenhashset, class02303.field_48817.N(), this.y.i());
      if (class07529.T) {
         N(referenceopenhashset, class00429.y, class07529.A);
         N(referenceopenhashset, class00429.B, class07529.A);
         N(referenceopenhashset, class00429.L, class07529.p);
         N(referenceopenhashset, class00429.u, class07529.NM);
         N(referenceopenhashset, class00429.M, class07529.Nt);
         N(referenceopenhashset, class00429.R, class07529.k);
         N(referenceopenhashset, class00429.s, class07529.J);
         N(referenceopenhashset, class00429.m, class07529.J);
         N(referenceopenhashset, class00429.i, class07529.X || class07529.A);
         N(referenceopenhashset, class00429.P, class07529.O);
         N(referenceopenhashset, class00429.Z, class07529.F);
         N(referenceopenhashset, class00429.E, class07529.f);
         N(referenceopenhashset, class00429.z, class07529.g);
         N(referenceopenhashset, class00429.W, class07529.I);
         N(referenceopenhashset, class00429.U, class07529.a);
      }

      return referenceopenhashset;
   }
}
