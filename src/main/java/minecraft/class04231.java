package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class04231 implements Iterable<class04200> {
   private final List<class04200> N;

   public Set<class04215> L() {
      return this.N.stream().map(class04200::u).collect(Collectors.toSet());
   }

   class04231(List<class04200> var1) {
      super();
      this.N = new ArrayList<>(var1);
   }

   @Override
   public Iterator<class04200> iterator() {
      return this.N.iterator();
   }

   public Stream<class04200> y() {
      return this.N.stream();
   }

   public class04231 N(LocalDate var1, int var2) {
      this.N.removeIf(var2x -> {
         LocalDate localdate = var2x.u().N().plusDays(var2);
         if (!var1.isBefore(localdate)) {
            try {
               Files.delete(var2x.L());
               return true;
            } catch (IOException ioexception) {
               class04242.N.warn("Failed to delete expired event log file: {}", var2x.L(), ioexception);
            }
         }

         return false;
      });
      return this;
   }

   public class04231 N() {
      ListIterator<class04200> listiterator = this.N.listIterator();

      while (listiterator.hasNext()) {
         class04200 class04200 = listiterator.next();

         try {
            listiterator.set(class04200.y());
         } catch (IOException ioexception) {
            class04242.N.warn("Failed to compress event log file: {}", class04200.L(), ioexception);
         }
      }

      return this;
   }
}
