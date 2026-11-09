package minecraft;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;

public class class01756 extends class04919 {
   private final Map<class00329, class00295> y = new HashMap<>();
   private final Set<class00329> L = new HashSet<>();
   private Map<class00242, List<class05287>> u = Map.of();
   private List<class05287> i = List.of();

   public void L(class00329 var1) {
      this.L.remove(var1);
   }

   public List<class05287> L() {
      return this.i;
   }

   public class01756() {
      super();
   }

   public void u(class00329 var1) {
      this.L.add(var1);
   }

   public void y() {
      Map<class00305, List<List<class00295>>> map = N(this.y.values());
      HashMap hashmap = new HashMap();
      Builder builder = ImmutableList.builder();
      map.forEach((var2x, var3x) -> hashmap.put(var2x, (List)var3x.stream().map(class05287::new).peek(builder::add).collect(ImmutableList.toImmutableList())));

      for (class00296 class00296 : class00296.values()) {
         hashmap.put(
            class00296,
            (List)class00296.N().stream().flatMap(var1x -> hashmap.getOrDefault(var1x, List.of()).stream()).collect(ImmutableList.toImmutableList())
         );
      }

      this.u = Map.copyOf(hashmap);
      this.i = builder.build();
   }

   public boolean y(class00329 var1) {
      return this.L.contains(var1);
   }

   public void N(class00295 var1) {
      this.y.put(var1.N(), var1);
   }

   public void N() {
      this.y.clear();
      this.L.clear();
   }

   private static Map<class00305, List<List<class00295>>> N(Iterable<class00295> var0) {
      HashMap hashmap = new HashMap();
      HashBasedTable hashbasedtable = HashBasedTable.create();

      for (class00295 class00295 : var0) {
         class00305 class00305 = class00295.u();
         OptionalInt optionalint = class00295.L();
         if (optionalint.isEmpty()) {
            hashmap.computeIfAbsent(class00305, var0x -> new ArrayList<>()).add(List.of(class00295));
         } else {
            Object object = (List)hashbasedtable.get(class00305, optionalint.getAsInt());
            if (object == null) {
               object = new ArrayList();
               hashbasedtable.put(class00305, optionalint.getAsInt(), object);
               hashmap.computeIfAbsent(class00305, var0x -> new ArrayList<>()).add(object);
            }

            object.add(class00295);
         }
      }

      return hashmap;
   }

   public void N(class00329 var1) {
      this.y.remove(var1);
      this.L.remove(var1);
   }

   public List<class05287> N(class00242 var1) {
      return this.u.getOrDefault(var1, Collections.emptyList());
   }
}
