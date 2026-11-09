package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class05427 implements class05399 {
   private final class00891 N;
   private final List<class05406> y;
   private final Set<class08092<?>> L;

   class05427(class00891 var1, List<class05406> var2, Set<class08092<?>> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public class04127 y() {
      HashMap hashmap = new HashMap();

      for (class05406 class05406 : this.y) {
         hashmap.put(class05406.N().N(), class05406.y().N());
      }

      return new class04127(Optional.of(new class04123(hashmap)), Optional.empty());
   }

   public static class05395 N(class00891 var0) {
      return new class05395(var0);
   }

   public static class05427 N(class00891 var0, class03264 var1) {
      return new class05427(var0, List.of(new class05406(class05390.N, var1)), Set.of());
   }

   static Set<class08092<?>> N(Set<class08092<?>> var0, class00891 var1, class05415<?> var2) {
      List<class08092<?>> list = var2.y();
      list.forEach(var2x -> {
         if (var1.E().N(var2x.R()) != var2x) {
            throw new IllegalStateException("Property " + var2x + " is not defined for block " + var1);
         } else if (var0.contains(var2x)) {
            throw new IllegalStateException("Values of property " + var2x + " already defined for block " + var1);
         }
      });
      HashSet hashset = new HashSet(var0);
      hashset.addAll(list);
      return hashset;
   }

   public class05427 N(class05415<class08503> var1) {
      Set<class08092<?>> set = N(this.L, this.N, var1);
      List list = this.y.stream().flatMap(var1x -> var1x.N(var1)).toList();
      return new class05427(this.N, list, set);
   }

   public class05427 N(class08503 var1) {
      List list = this.y.stream().flatMap(var1x -> var1x.N(var1)).toList();
      return new class05427(this.N, list, this.L);
   }

   @Override
   public class00891 N() {
      return this.N;
   }
}
