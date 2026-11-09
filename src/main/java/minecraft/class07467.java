package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class class07467 {
   private static final class05764 N = new class07998(Integer.MAX_VALUE, new class07963());
   private final Map<class07430, class05764> y = new EnumMap<>(class07430.class);
   private final Set<class05764> L = new ObjectLinkedOpenHashSet();
   private final EnumSet<class07430> u = EnumSet.noneOf(class07430.class);

   public class07467() {
      super();
   }

   public void y(class07430 var1) {
      this.u.remove(var1);
   }

   public Set<class05764> y() {
      return this.L;
   }

   public void N(class07430 var1, boolean var2) {
      if (var2) {
         this.y(var1);
      } else {
         this.N(var1);
      }
   }

   public void N(class07430 var1) {
      this.u.add(var1);
   }

   public void N(Predicate<class07473> var1) {
      this.L.removeIf(var1x -> var1.test(var1x.U()));
   }

   public void N(class07473 var1) {
      for (class05764 class05764 : this.L) {
         if (class05764.U() == var1 && class05764.M()) {
            class05764.u();
         }
      }

      this.L.removeIf(var1x -> var1x.U() == var1);
   }

   private static boolean N(class05764 var0, EnumSet<class07430> var1) {
      for (class07430 class07430 : var0.z()) {
         if (var1.contains(class07430)) {
            return true;
         }
      }

      return false;
   }

   private static boolean N(class05764 var0, Map<class07430, class05764> var1) {
      for (class07430 class07430 : var0.z()) {
         if (!var1.getOrDefault(class07430, N).N(var0)) {
            return false;
         }
      }

      return true;
   }

   public void N() {
      class04643 class04643 = class08700.N();
      class04643.N("goalCleanup");

      for (class05764 class05764x : this.L) {
         if (class05764x.M() && (N(class05764x, this.u) || !class05764x.y())) {
            class05764x.u();
         }
      }

      this.y.entrySet().removeIf(var0 -> !var0.getValue().M());
      class04643.L();
      class04643.N("goalUpdate");

      for (class05764 class05764x : this.L) {
         if (!class05764x.M() && !N(class05764x, this.u) && N(class05764x, this.y) && class05764x.N()) {
            for (class07430 class07430 : class05764x.z()) {
               this.y.getOrDefault(class07430, N).u();
               this.y.put(class07430, class05764x);
            }

            class05764x.L();
         }
      }

      class04643.L();
      this.N(true);
   }

   public void N(boolean var1) {
      class04643 class04643 = class08700.N();
      class04643.N("goalTick");

      for (class05764 class05764 : this.L) {
         if (class05764.M() && (var1 || class05764.B())) {
            class05764.i();
         }
      }

      class04643.L();
   }

   public void N(int var1, class07473 var2) {
      this.L.add(new class05764(var1, var2));
   }
}
