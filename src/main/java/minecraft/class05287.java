package minecraft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class class05287 {
   public static final class05287 N = new class05287(List.of());
   private final List<class00295> y;
   private final Set<class00329> L = new HashSet<>();
   private final Set<class00329> u = new HashSet<>();

   public List<class00295> L() {
      return this.y;
   }

   public class05287(List<class00295> var1) {
      super();
      this.y = var1;
   }

   public boolean y() {
      return !this.u.isEmpty();
   }

   public boolean N() {
      return !this.L.isEmpty();
   }

   public List<class00295> N(class05317 var1) {
      Predicate predicate = switch (var1) {
         case field_52847 -> this.u::contains;
         case field_52848 -> this.L::contains;
         case field_52849 -> var1x -> this.u.contains(var1x) && !this.L.contains(var1x);
      };
      ArrayList arraylist = new ArrayList();

      for (class00295 class00295 : this.y) {
         if (predicate.test(class00295.N())) {
            arraylist.add(class00295);
         }
      }

      return arraylist;
   }

   public void N(class02741 var1, Predicate<class00265> var2) {
      for (class00295 class00295 : this.y) {
         boolean flag = var2.test(class00295.y());
         if (flag) {
            this.u.add(class00295.N());
         } else {
            this.u.remove(class00295.N());
         }

         if (flag && class00295.N(var1)) {
            this.L.add(class00295.N());
         } else {
            this.L.remove(class00295.N());
         }
      }
   }

   public boolean N(class00329 var1) {
      return this.L.contains(var1);
   }
}
