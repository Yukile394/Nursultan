package minecraft;

import Nursultan.class10706;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public sealed interface class07023 extends class07709, Iterable<class07709> permits class07741, class07029, class06995, class07757 {
   class07709 get(int var1);

   int size();

   void clear();

   default boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   default Iterator<class07709> iterator() {
      return new class10706(this);
   }

   default Stream<class07709> stream() {
      return StreamSupport.stream(this.spliterator(), false);
   }

   class07709 remove(int var1);

   boolean y(int var1, class07709 var2);

   boolean N(int var1, class07709 var2);
}
