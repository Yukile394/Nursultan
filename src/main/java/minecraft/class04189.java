package minecraft;

import Nursultan.class09537;
import Nursultan.class09539;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class class04189<T> extends AbstractList<T> implements class02657<T> {
   private static final int N = 1;
   private Object[] y;
   private int L;
   private int u;

   private void L() {
      Object[] aobject = new Object[this.y.length + Math.max(this.y.length >> 1, 1)];
      this.N(aobject, this.u);
      this.L = 0;
      this.y = aobject;
   }

   private T L(int var1) {
      return (T)this.y[var1];
   }

   public class04189() {
      this(1);
   }

   public class04189(int var1) {
      super();
      this.y = new Object[var1];
      this.L = 0;
      this.u = 0;
   }

   @Override
   public T remove(int var1) {
      this.y(var1);
      int i = this.N(var1);
      Object object = this.L(i);
      if (var1 == 0) {
         this.y[i] = null;
         this.L++;
      } else if (var1 == this.u - 1) {
         this.y[i] = null;
      } else {
         for (int j = var1 + 1; j < this.u; j++) {
            this.y[this.N(j - 1)] = this.get(j);
         }

         this.y[this.N(this.u - 1)] = null;
      }

      this.modCount++;
      this.u--;
      return (T)object;
   }

   @Override
   public int size() {
      return this.u;
   }

   @Override
   public T get(int var1) {
      this.y(var1);
      return this.L(this.N(var1));
   }

   @Override
   public void replaceAll(UnaryOperator<T> var1) {
      for (int i = 0; i < this.u; i++) {
         int j = this.N(i);
         this.y[j] = Objects.requireNonNull(var1.apply(this.L(i)));
      }
   }

   @Override
   public void add(int var1, T var2) {
      N(var1, this.u + 1);
      Objects.requireNonNull(var2);
      if (this.u == this.y.length) {
         this.L();
      }

      int i = this.N(var1);
      if (var1 == this.u) {
         this.y[i] = var2;
      } else if (var1 == 0) {
         this.L--;
         if (this.L < 0) {
            this.L = this.L + this.y.length;
         }

         this.y[this.N(0)] = var2;
      } else {
         for (int j = this.u - 1; j >= var1; j--) {
            this.y[this.N(j + 1)] = this.y[this.N(j)];
         }

         this.y[i] = var2;
      }

      this.modCount++;
      this.u++;
   }

   @Override
   public T set(int var1, T var2) {
      this.y(var1);
      Objects.requireNonNull(var2);
      int i = this.N(var1);
      Object object = this.L(i);
      this.y[i] = var2;
      return (T)object;
   }

   @Override
   public void forEach(Consumer<? super T> var1) {
      for (int i = 0; i < this.u; i++) {
         var1.accept(this.get(i));
      }
   }

   private void y(int var1) {
      N(var1, this.u);
   }

   @Override
   public class02657<T> y() {
      return new class09539<>(this, this);
   }

   @Override
   public boolean removeIf(Predicate<? super T> var1) {
      int i = 0;

      for (int j = 0; j < this.u; j++) {
         Object object = this.get(j);
         if (var1.test(object)) {
            i++;
         } else if (i != 0) {
            this.y[this.N(j - i)] = object;
            this.y[this.N(j)] = null;
         }
      }

      this.modCount += i;
      this.u -= i;
      return i != 0;
   }

   @Override
   public T getFirst() {
      if (this.u == 0) {
         throw new NoSuchElementException();
      } else {
         return this.get(0);
      }
   }

   @Override
   public T getLast() {
      if (this.u == 0) {
         throw new NoSuchElementException();
      } else {
         return this.get(this.u - 1);
      }
   }

   @Override
   public void addFirst(T var1) {
      this.add(0, (T)var1);
   }

   @Override
   public void addLast(T var1) {
      this.add(this.u, (T)var1);
   }

   @Override
   public T removeFirst() {
      if (this.u == 0) {
         throw new NoSuchElementException();
      } else {
         return this.remove(0);
      }
   }

   @Override
   public T removeLast() {
      if (this.u == 0) {
         throw new NoSuchElementException();
      } else {
         return this.remove(this.u - 1);
      }
   }

   @Nullable
   @Override
   public T pollFirst() {
      return this.u == 0 ? null : this.removeFirst();
   }

   @Nullable
   @Override
   public T pollLast() {
      return this.u == 0 ? null : this.removeLast();
   }

   @Override
   public boolean offerLast(T var1) {
      this.addLast((T)var1);
      return true;
   }

   @Nullable
   @Override
   public T peekFirst() {
      return this.u == 0 ? null : this.getFirst();
   }

   @Override
   public boolean removeFirstOccurrence(Object var1) {
      for (int i = 0; i < this.u; i++) {
         Object object = this.get(i);
         if (Objects.equals(var1, object)) {
            this.remove(i);
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean offerFirst(T var1) {
      this.addFirst((T)var1);
      return true;
   }

   @Nullable
   @Override
   public T peekLast() {
      return this.u == 0 ? null : this.getLast();
   }

   @Override
   public boolean removeLastOccurrence(Object var1) {
      for (int i = this.u - 1; i >= 0; i--) {
         Object object = this.get(i);
         if (Objects.equals(var1, object)) {
            this.remove(i);
            return true;
         }
      }

      return false;
   }

   @Override
   public Iterator<T> descendingIterator() {
      return new class09537<>(this);
   }

   private void N(Object[] var1, int var2) {
      for (int i = 0; i < var2; i++) {
         var1[i] = this.get(i);
      }
   }

   public int N() {
      return this.y.length;
   }

   private int N(int var1) {
      return (var1 + this.L) % this.y.length;
   }

   private static void N(int var0, int var1) {
      if (var0 < 0 || var0 >= var1) {
         throw new IndexOutOfBoundsException(var0);
      }
   }
}
