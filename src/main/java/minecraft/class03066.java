package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public record class03066(List<class03928> entries) {
   public static final class03066 N = new class03066(List.of());

   public class03066(class00667 var1) {
      this(var1.N_15(class00667.N(ArrayList::new, 20), class03928::N));
   }

   public class03066(List<class03928> entries) {
      super();
      this.entries = entries;
   }

   public Optional<class03048> N(class03397 var1) {
      ArrayList arraylist = new ArrayList(this.entries.size());
      Iterator<class03928> iterator = this.entries.iterator();

      while (iterator.hasNext()) {
         Optional<class04469> optional = iterator.next().N(var1);
         if (optional.isEmpty()) {
            return Optional.empty();
         }

         arraylist.add(optional.get());
      }

      return Optional.of(new class03048(arraylist));
   }

   public List<class03928> N() {
      return this.entries;
   }

   public void N(class00667 var1) {
      var1.N_12(this.entries, class03928::N);
   }
}
