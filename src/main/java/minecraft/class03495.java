package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class class03495<K, V extends class03511<K>> {
   private final Map<K, V> N = new HashMap<>();

   public class03495() {
      super();
   }

   private static <K> void y(Multimap<K, K> var0, K var1, K var2) {
      if (!N(var0, var1, var2)) {
         var0.put(var1, var2);
      }
   }

   private void N(Multimap<K, K> var1, Set<K> var2, K var3, BiConsumer<K, V> var4) {
      if (var2.add(var3)) {
         var1.get(var3).forEach(var4x -> this.N(var1, var2, (K)var4x, var4));
         class03511 class03511 = this.N.get(var3);
         if (class03511 != null) {
            var4.accept(var3, class03511);
         }
      }
   }

   public class03495<K, V> N(K var1, V var2) {
      this.N.put((K)var1, (V)var2);
      return this;
   }

   private static <K> boolean N(Multimap<K, K> var0, K var1, K var2) {
      Collection collection = var0.get(var2);
      return collection.contains(var1) ? true : collection.stream().anyMatch(var2x -> N(var0, var1, var2x));
   }

   public void N(BiConsumer<K, V> var1) {
      HashMultimap hashmultimap = HashMultimap.create();
      this.N.forEach((var1x, var2x) -> var2x.N(var2xx -> y(hashmultimap, (K)var1x, var2xx)));
      this.N.forEach((var1x, var2x) -> var2x.y(var2xx -> y(hashmultimap, (K)var1x, var2xx)));
      HashSet hashset = new HashSet();
      this.N.keySet().forEach(var4 -> this.N(hashmultimap, hashset, (K)var4, var1));
   }
}
