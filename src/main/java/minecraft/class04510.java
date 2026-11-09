package minecraft;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

record class04510(class04489 element, List<class04480> problems, Map<class04489, class04510> children) {

   public List<class04480> L() {
      return this.problems;
   }

   public class04510(class04489 var1) {
      this(var1, new ArrayList<>(), new LinkedHashMap<>());
   }

   private class04510(class04489 element, List<class04480> problems, Map<class04489, class04510> children) {
      this.element = element;
      this.problems = problems;
      this.children = children;
   }

   public Map<class04489, class04510> u() {
      return this.children;
   }

   public class04489 y() {
      return this.element;
   }

   public class04510 N(class04489 var1) {
      return this.children.computeIfAbsent(var1, class04510::new);
   }

   public List<String> N() {
      int i = this.problems.size();
      int j = this.children.size();
      if (i == 0 && j == 0) {
         return List.of();
      } else if (i == 0 && j == 1) {
         ArrayList arraylist1 = new ArrayList();
         this.children.forEach((var1x, var2x) -> arraylist1.addAll(var2x.N()));
         arraylist1.set(0, this.element.get() + (String)arraylist1.get(0));
         return arraylist1;
      } else if (i == 1 && j == 0) {
         return List.of(this.element.get() + ": " + this.problems.getFirst().N());
      } else {
         ArrayList arraylist = new ArrayList();
         this.children.forEach((var1x, var2x) -> arraylist.addAll(var2x.N()));
         arraylist.replaceAll(var0 -> "  " + var0);

         for (class04480 class04480 : this.problems) {
            arraylist.add("  " + class04480.N());
         }

         arraylist.addFirst(this.element.get() + ":");
         return arraylist;
      }
   }
}
