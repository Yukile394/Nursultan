package minecraft;

import Nursultan.class10413;
import com.google.common.collect.Streams;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

class class08316 implements class08319 {
   private final class04490 N;
   private final class08296 y;
   private final List<class07001> L;

   public class08316(class04490 var1, class08296 var2, List<class07001> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public Iterator<class08299> iterator() {
      ListIterator<class07001> listiterator = this.L.listIterator();
      return new class08323(this, listiterator);
   }

   @Override
   public Stream<class08299> y() {
      return Streams.mapWithIndex(this.L.stream(), (var1, var2) -> this.N((int)var2, var1));
   }

   @Override
   public boolean N() {
      return this.L.isEmpty();
   }

   class08299 N(int var1, class07001 var2) {
      return class08308.N(this.N.N_46(new class10413(var1)), this.y, var2);
   }
}
