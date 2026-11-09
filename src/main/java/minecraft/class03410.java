package minecraft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class class03410 implements Iterable<class04981> {
   private final class06202 N;
   private final Set<class04981> y = new HashSet<>();
   private List<class04981> L = List.of();

   public class03410(class06202 var1) {
      super();
      this.N = var1;
   }

   @Override
   public Iterator<class04981> iterator() {
      return this.L.iterator();
   }

   public boolean N() {
      return this.L.isEmpty();
   }

   public void N(class04981 var1) {
      this.L.remove(var1);
      this.y.add(var1);
   }

   public void N(List<class04981> var1) {
      ArrayList arraylist = new ArrayList(var1);
      arraylist.sort(new class04952(this.N.Ny().L()));
      if (!arraylist.removeAll(this.y)) {
         this.y.clear();
      }

      this.L = arraylist;
   }
}
