package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class class05774 {
   public static final Codec<class05774> N = class05382.u.listOf().xmap(class05774::new, var0 -> var0.i().toList());
   public static final int y = 2;
   private final Map<UUID, class05348> L = new HashMap<>();

   public void L() {
      this.L.clear();
   }

   public class05774() {
      super();
   }

   private class05774(List<class05382> var1) {
      super();
      var1.forEach(var1x -> this.N(var1x.y()).N.put(var1x.L(), var1x.u()));
   }

   private Stream<class05382> i() {
      return this.L.entrySet().stream().flatMap(var0 -> var0.getValue().N(var0.getKey()));
   }

   public class05774 u() {
      class05774 class05774 = new class05774();
      class05774.N(this);
      return class05774;
   }

   public void y(UUID var1, class05346 var2, int var3) {
      this.N(var1, var2, -var3);
   }

   public void y() {
      Iterator<class05348> iterator = this.L.values().iterator();

      while (iterator.hasNext()) {
         class05348 class05348 = iterator.next();
         class05348.N();
         if (class05348.y()) {
            iterator.remove();
         }
      }
   }

   public Map<UUID, Object2IntMap<class05346>> N() {
      HashMap hashmap = Maps.newHashMap();
      this.L.keySet().forEach(var2 -> {
         class05348 class05348 = this.L.get(var2);
         hashmap.put(var2, class05348.N);
      });
      return hashmap;
   }

   public void N(UUID var1, class05346 var2, int var3) {
      class05348 class05348 = this.N(var1);
      class05348.N.mergeInt(var2, var3, (var2x, var3x) -> this.N(var2, var2x, var3x));
      class05348.N(var2);
      if (class05348.y()) {
         this.L.remove(var1);
      }
   }

   public long N(class05346 var1, DoublePredicate var2) {
      return this.L.values().stream().filter(var2x -> var2.test(var2x.N.getOrDefault(var1, 0) * var1.field_18431)).count();
   }

   public int N(UUID var1, Predicate<class05346> var2) {
      class05348 class05348 = this.L.get(var1);
      return class05348 != null ? class05348.N(var2) : 0;
   }

   public void N(class05774 var1, class06069 var2, int var3) {
      var1.N(var2, var3).forEach(var1x -> {
         int i = var1x.u() - var1x.L().field_18434;
         if (i >= 2) {
            this.N(var1x.y()).N.mergeInt(var1x.L(), i, class05774::N);
         }
      });
   }

   private class05348 N(UUID var1) {
      return this.L.computeIfAbsent(var1, var0 -> new class05348());
   }

   private Collection<class05382> N(class06069 var1, int var2) {
      List<class05382> list = this.i().toList();
      if (list.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] aint = new int[list.size()];
         int i = 0;

         for (int j = 0; j < list.size(); j++) {
            class05382 class05382 = list.get(j);
            i += Math.abs(class05382.N());
            aint[j] = i - 1;
         }

         Set set = Sets.newIdentityHashSet();

         for (int i1 = 0; i1 < var2; i1++) {
            int k = var1.y(i);
            int l = Arrays.binarySearch(aint, k);
            set.add(list.get(l < 0 ? -l - 1 : l));
         }

         return set;
      }
   }

   private int N(class05346 var1, int var2, int var3) {
      int i = var2 + var3;
      return i > var1.field_18432 ? Math.max(var1.field_18432, var2) : i;
   }

   private static int N(int var0, int var1) {
      return Math.max(var0, var1);
   }

   public void N(class05774 var1) {
      var1.L.forEach((var1x, var2) -> this.N(var1x).N.putAll(var2.N));
   }

   public void N(class05346 var1) {
      Iterator<class05348> iterator = this.L.values().iterator();

      while (iterator.hasNext()) {
         class05348 class05348 = iterator.next();
         class05348.y(var1);
         if (class05348.y()) {
            iterator.remove();
         }
      }
   }

   public void N(UUID var1, class05346 var2) {
      class05348 class05348 = this.L.get(var1);
      if (class05348 != null) {
         class05348.y(var2);
         if (class05348.y()) {
            this.L.remove(var1);
         }
      }
   }
}
