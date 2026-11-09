package minecraft;

import java.io.Serializable;
import java.util.Deque;
import java.util.List;
import java.util.RandomAccess;
import org.jspecify.annotations.Nullable;

public interface class02657<T> extends Serializable, Cloneable, Deque<T>, List<T>, RandomAccess {
   @Override
   default T remove() {
      return this.removeFirst();
   }

   @Nullable
   @Override
   default T peek() {
      return this.peekFirst();
   }

   class02657<T> y();

   @Override
   T getFirst();

   @Override
   T getLast();

   @Override
   default T element() {
      return this.getFirst();
   }

   @Override
   void addFirst(T var1);

   @Override
   void addLast(T var1);

   @Override
   T removeFirst();

   @Override
   T removeLast();

   @Nullable
   @Override
   default T poll() {
      return this.pollFirst();
   }

   @Override
   default void push(T var1) {
      this.addFirst((T)var1);
   }

   @Override
   default T pop() {
      return this.removeFirst();
   }

   @Override
   default boolean offer(T var1) {
      return this.offerLast((T)var1);
   }
}
