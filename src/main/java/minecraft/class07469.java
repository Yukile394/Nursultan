package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class07469 {
   private final class03556<class07468> N;
   private final Map<class07463, Map<class01894, class07471>> y = Maps.newEnumMap(class07463.class);
   private final Map<class01894, class07471> L = new Object2ObjectArrayMap();
   private final Map<class01894, class07471> u = new Object2ObjectArrayMap();
   private double i;
   private boolean R = true;
   private double M;
   private final Consumer<class07469> B;

   public void L(class07471 var1) {
      this.L(var1.N());
      this.R(var1);
      this.u.put(var1.N(), var1);
   }

   public Set<class07471> L() {
      return ImmutableSet.copyOf(this.L.values());
   }

   public boolean L(class01894 var1) {
      class07471 class07471 = this.L.remove(var1);
      if (class07471 == null) {
         return false;
      } else {
         this.N(class07471.L()).remove(var1);
         this.u.remove(var1);
         this.i();
         return true;
      }
   }

   public double M() {
      if (this.R) {
         this.M = this.Z();
         this.R = false;
      }

      return this.M;
   }

   public class07469(class03556<class07468> var1, Consumer<class07469> var2) {
      super();
      this.N = var1;
      this.B = var2;
      this.i = ((class07468)var1.N()).N();
   }

   public class07433 B() {
      return new class07433(this.N, this.i, List.copyOf(this.u.values()));
   }

   private double Z() {
      double d0 = this.y();

      for (class07471 class07471x : this.y(class07463.field_6328)) {
         d0 += class07471x.y();
      }

      double d1 = d0;

      for (class07471 class07471 : this.y(class07463.field_6330)) {
         d1 += d0 * class07471.y();
      }

      for (class07471 class07471xx : this.y(class07463.field_6331)) {
         d1 *= 1.0 + class07471xx.y();
      }

      return this.N.N().N(d1);
   }

   protected void i() {
      this.R = true;
      this.B.accept(this);
   }

   public void i(class07471 var1) {
      this.L(var1.N());
   }

   public Set<class07471> u() {
      return ImmutableSet.copyOf(this.u.values());
   }

   public void u(class07471 var1) {
      this.R(var1);
      this.u.put(var1.N(), var1);
   }

   public double y() {
      return this.i;
   }

   private Collection<class07471> y(class07463 var1) {
      return this.y.getOrDefault(var1, Map.of()).values();
   }

   public void y(class07471 var1) {
      this.R(var1);
   }

   public boolean y(class01894 var1) {
      return this.L.get(var1) != null;
   }

   @Nullable
   public class07471 N(class01894 var1) {
      return this.L.get(var1);
   }

   public void N(class07469 var1) {
      this.i = var1.i;
      this.L.clear();
      this.L.putAll(var1.L);
      this.u.clear();
      this.u.putAll(var1.u);
      this.y.clear();
      var1.y.forEach((var1x, var2) -> this.N(var1x).putAll((Map<? extends class01894, ? extends class07471>)var2));
      this.i();
   }

   public void N(class07433 var1) {
      this.i = var1.y();

      for (class07471 class07471 : var1.L()) {
         this.L.put(class07471.N(), class07471);
         this.N(class07471.L()).put(class07471.N(), class07471);
         this.u.put(class07471.N(), class07471);
      }

      this.i();
   }

   public void N(double var1) {
      if (var1 != this.i) {
         this.i = var1;
         this.i();
      }
   }

   public void N(Collection<class07471> var1) {
      for (class07471 class07471 : var1) {
         this.u(class07471);
      }
   }

   Map<class01894, class07471> N(class07463 var1) {
      return this.y.computeIfAbsent(var1, var0 -> new Object2ObjectOpenHashMap());
   }

   public void N(class07471 var1) {
      class07471 class07471 = this.L.put(var1.N(), var1);
      if (var1 != class07471) {
         this.N(var1.L()).put(var1.N(), var1);
         this.i();
      }
   }

   public class03556<class07468> N() {
      return this.N;
   }

   private void R(class07471 var1) {
      if (this.L.putIfAbsent(var1.N(), var1) != null) {
         throw new IllegalArgumentException("Modifier is already applied on this attribute!");
      } else {
         this.N(var1.L()).put(var1.N(), var1);
         this.i();
      }
   }

   public void R() {
      for (class07471 class07471 : this.L()) {
         this.i(class07471);
      }
   }
}
