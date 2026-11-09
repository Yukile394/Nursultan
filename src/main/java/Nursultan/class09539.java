package Nursultan;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import minecraft.class02657;
import minecraft.class04189;
import org.jspecify.annotations.Nullable;

public class class09539<T> extends AbstractList<T> implements class02657<T> {
   private final class04189<T> y;

   public class09539(class04189<T> var1, class04189 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public T remove(int var1) {
      return this.y.remove(this.N(var1));
   }

   @Override
   public int size() {
      return this.y.size();
   }

   @Override
   public T get(int var1) {
      return this.y.get(this.N(var1));
   }

   @Override
   public int indexOf(Object var1) {
      return this.N(this.y.lastIndexOf(var1));
   }

   @Override
   public void clear() {
      this.y.clear();
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.N(this.y.indexOf(var1));
   }

   @Override
   public boolean isEmpty() {
      return this.y.isEmpty();
   }

   @Override
   public void add(int var1, T var2) {
      this.y.add(this.N(var1) + 1, (T)var2);
   }

   @Override
   public List<T> subList(int var1, int var2) {
      return this.y.subList(this.N(var2) + 1, this.N(var1) + 1).reversed();
   }

   @Override
   public Iterator<T> iterator() {
      return this.y.descendingIterator();
   }

   @Override
   public boolean contains(Object var1) {
      return this.y.contains(var1);
   }

   @Override
   public T set(int var1, T var2) {
      return this.y.set(this.N(var1), (T)var2);
   }

   @Override
   public class02657<T> y() {
      return this.y;
   }

   @Override
   public T getFirst() {
      return this.y.getLast();
   }

   @Override
   public T getLast() {
      return this.y.getFirst();
   }

   @Override
   public void addFirst(T var1) {
      this.y.addLast((T)var1);
   }

   @Override
   public void addLast(T var1) {
      this.y.addFirst((T)var1);
   }

   @Override
   public T removeFirst() {
      return this.y.removeLast();
   }

   @Override
   public T removeLast() {
      return this.y.removeFirst();
   }

   @Nullable
   @Override
   public T pollFirst() {
      return this.y.pollLast();
   }

   @Nullable
   @Override
   public T pollLast() {
      return this.y.pollFirst();
   }

   @Override
   public boolean offerLast(T var1) {
      return this.y.offerFirst((T)var1);
   }

   @Nullable
   @Override
   public T peekFirst() {
      return this.y.peekLast();
   }

   @Override
   public boolean removeFirstOccurrence(Object var1) {
      return this.y.removeLastOccurrence(var1);
   }

   @Override
   public boolean offerFirst(T var1) {
      return this.y.offerLast((T)var1);
   }

   @Nullable
   @Override
   public T peekLast() {
      return this.y.peekFirst();
   }

   @Override
   public boolean removeLastOccurrence(Object var1) {
      return this.y.removeFirstOccurrence(var1);
   }

   @Override
   public Iterator<T> descendingIterator() {
      return this.y.iterator();
   }

   private int N(int var1) {
      return var1 == -1 ? -1 : this.y.size() - 1 - var1;
   }
}
