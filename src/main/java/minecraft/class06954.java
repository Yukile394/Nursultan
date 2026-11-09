package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class06954 {
   private final class02796 N;
   private final Map<class00455<?>, List<class04770>> y = new HashMap<>();

   public class06954(class02796 var1) {
      super();
      this.N = var1;
   }

   private List<class04770> y(class00455<?> var1) {
      return this.y.getOrDefault(var1, List.of());
   }

   public Set<class00455<?>> y() {
      return Set.copyOf(this.y.keySet());
   }

   public void N() {
      this.y.values().forEach(List::clear);

      for (class04770 class04770 : this.N.Nm().v()) {
         for (class00455<?> class00455 : class04770.method_74538()) {
            this.y.computeIfAbsent(class00455, var0 -> new ArrayList<>()).add(class04770);
         }
      }

      this.y.values().removeIf(List::isEmpty);
   }

   public boolean N(class04770 var1) {
      class08774 class08774 = var1.method_72498();
      return class07529.ND && this.N.N(class08774) ? true : this.N.Nm().R(class08774);
   }

   public boolean N(class00455<?> var1) {
      return !this.y(var1).isEmpty();
   }

   public void N(class00455<?> var1, class00381<?> var2) {
      Iterator<class04770> iterator = this.y(var1).iterator();

      while (iterator.hasNext()) {
         iterator.next().field_13987.method_14364(var2);
      }
   }
}
