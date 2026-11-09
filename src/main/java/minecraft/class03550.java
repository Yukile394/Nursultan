package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.stream.Stream;

public abstract class class03550<T> implements class03543<T> {
   protected abstract List<class03556<T>> M();

   public class03550() {
      super();
   }

   @Override
   public Iterator<class03556<T>> iterator() {
      return this.M().iterator();
   }

   @Override
   public Spliterator<class03556<T>> spliterator() {
      return this.M().spliterator();
   }

   @Override
   public int y() {
      return this.M().size();
   }

   @Override
   public class03556<T> N(int var1) {
      return this.M().get(var1);
   }

   @Override
   public boolean N(class02042<T> var1) {
      return true;
   }

   @Override
   public Optional<class03556<T>> N(class06069 var1) {
      return class07536.y_9(this.M(), var1);
   }

   @Override
   public Stream<class03556<T>> N() {
      return this.M().stream();
   }
}
