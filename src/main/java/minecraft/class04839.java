package minecraft;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class class04839 {
   private final List<class04800> N;
   private final class04838 y;
   private final Map<String, class04839> L = Maps.newHashMap();

   class04839(List<class04800> var1, class04838 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class04839 y(String var1) {
      return this.L.get(var1);
   }

   public Set<Entry<String, class04839>> y() {
      return this.L.entrySet();
   }

   public void y(Set<String> var1) {
      for (Entry entry : this.L.entrySet()) {
         class04839 class04839 = (class04839)entry.getValue();
         if (var1.contains(entry.getKey())) {
            class04839.N();
         } else {
            this.N((String)entry.getKey(), class04822.L(), class04839.y).y(var1);
         }
      }
   }

   public class04839 N(UnaryOperator<class04838> var1) {
      class04839 class04839 = new class04839(this.N, var1.apply(this.y));
      class04839.L.putAll(this.L);
      return class04839;
   }

   public class04839 N(String var1, class04822 var2, class04838 var3) {
      class04839 class04839 = new class04839(var2.y(), var3);
      return this.N(var1, class04839);
   }

   public class04839 N(String var1, class04839 var2) {
      class04839 class04839 = this.L.put(var1, var2);
      if (class04839 != null) {
         var2.L.putAll(class04839.L);
      }

      return var2;
   }

   public class04839 N() {
      for (String s : this.L.keySet()) {
         this.N(s).N();
      }

      return this;
   }

   public class04839 N(String var1) {
      class04839 class04839 = this.L.get(var1);
      if (class04839 == null) {
         throw new IllegalArgumentException("No child with name: " + var1);
      } else {
         return this.N(var1, class04822.L(), class04839.y);
      }
   }

   public void N(Set<String> var1) {
      for (Entry entry : this.L.entrySet()) {
         class04839 class04839 = (class04839)entry.getValue();
         if (!var1.contains(entry.getKey())) {
            this.N((String)entry.getKey(), class04822.L(), class04839.y).N(var1);
         }
      }
   }

   public class01686 N(int var1, int var2) {
      Object2ObjectArrayMap object2objectarraymap = this.L
         .entrySet()
         .stream()
         .collect(Collectors.toMap(Entry::getKey, var2x -> ((class04839)var2x.getValue()).N(var1, var2), (var0, var1x) -> var0, Object2ObjectArrayMap::new));
      List list = this.N.stream().map(var2x -> var2x.N(var1, var2)).toList();
      class01686 class01686 = new class01686(list, object2objectarraymap);
      class01686.N(this.y);
      class01686.y(this.y);
      return class01686;
   }
}
