package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class05905<T> extends AbstractSet<T> implements Collection {
   private static final int L = 10;
   private final Comparator<T> u;
   T[] N;
   int y;

   private int L(T var1) {
      return Arrays.binarySearch(this.N, 0, this.y, var1, this.u);
   }

   private static int L(int var0) {
      return -var0 - 1;
   }

   public T L() {
      return this.i(this.y - 1);
   }

   public class05905(int var1, Comparator<T> var2) {
      super();
      this.u = var2;
      if (var1 < 0) {
         throw new IllegalArgumentException("Initial capacity (" + var1 + ") is negative");
      } else {
         this.N = (T[])N(new Object[var1]);
      }
   }

   @Override
   public boolean remove(Object var1) {
      int i = this.L((T)var1);
      if (i >= 0) {
         this.y(i);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public int size() {
      return this.y;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class05905 class05905 && this.u.equals(class05905.u)
            ? this.y == class05905.y && Arrays.equals(this.N, class05905.N)
            : super.equals(var1);
      }
   }

   @Override
   public void clear() {
      Arrays.fill(this.N, 0, this.y, null);
      this.y = 0;
   }

   @Override
   public boolean add(T var1) {
      int i = this.L((T)var1);
      if (i >= 0) {
         return false;
      } else {
         int j = L(i);
         this.N((T)var1, j);
         return true;
      }
   }

   @Override
   public Object[] toArray() {
      return Arrays.copyOf(this.N, this.y, Object[].class);
   }

   @Override
   public <U> U[] toArray(U[] var1) {
      if (var1.length < this.y) {
         return (U[])Arrays.copyOf(this.N, this.y, (Class<? extends T[]>)var1.getClass());
      } else {
         System.arraycopy(this.N, 0, var1, 0, this.y);
         if (var1.length > this.y) {
            var1[this.y] = null;
         }

         return (U[])var1;
      }
   }

   @Override
   public Iterator<T> iterator() {
      return new class05897<>(this);
   }

   private T i(int var1) {
      return this.N[var1];
   }

   @Override
   public boolean contains(Object var1) {
      return this.L((T)var1) >= 0;
   }

   private void u(int var1) {
      if (var1 > this.N.length) {
         if (this.N != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            var1 = class07536.N(this.N.length, var1);
         } else if (var1 < 10) {
            var1 = 10;
         }

         Object[] aobject = new Object[var1];
         System.arraycopy(this.N, 0, aobject, 0, this.y);
         this.N = (T[])N(aobject);
      }
   }

   void y(int var1) {
      this.y--;
      if (var1 != this.y) {
         System.arraycopy(this.N, var1 + 1, this.N, var1, this.y - var1);
      }

      this.N[this.y] = null;
   }

   public T y() {
      return this.i(0);
   }

   @Nullable
   public T y(T var1) {
      int i = this.L((T)var1);
      return i >= 0 ? this.i(i) : null;
   }

   @Override
   public boolean removeIf(Predicate var1) {
      Object[] aobject = this.N;
      int i = this.y;
      int j = 0;

      for (int k = 0; k < i; k++) {
         Object object = aobject[k];
         if (!var1.test(object)) {
            if (j != k) {
               aobject[j] = object;
            }

            j++;
         }
      }

      this.y = j;
      return i != j;
   }

   public static <T> class05905<T> N(Comparator<T> var0) {
      return N(var0, 10);
   }

   public static <T extends Comparable<T>> class05905<T> N(int var0) {
      return new class05905<>(var0, Comparator.naturalOrder());
   }

   public static <T extends Comparable<T>> class05905<T> N() {
      return N(10);
   }

   public T N(T var1) {
      int i = this.L((T)var1);
      if (i >= 0) {
         return this.i(i);
      } else {
         this.N((T)var1, L(i));
         return (T)var1;
      }
   }

   public static <T> class05905<T> N(Comparator<T> var0, int var1) {
      return new class05905<>(var1, var0);
   }

   private static <T> T[] N(Object[] var0) {
      return (T[])var0;
   }

   private void N(T var1, int var2) {
      this.u(this.y + 1);
      if (var2 != this.y) {
         System.arraycopy(this.N, var2, this.N, var2 + 1, this.y - var2);
      }

      this.N[var2] = (T)var1;
      this.y++;
   }
}
