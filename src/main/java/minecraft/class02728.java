package minecraft;

import Nursultan.class09885;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class class02728 implements class02762, AutoCloseable {
   private final int y;
   private final Deque<class09885<?>> L = new ArrayDeque<>();

   protected Collection<class09885<?>> L() {
      return this.L;
   }

   public class02728(int var1) {
      super();
      this.y = var1;
   }

   @Override
   public void close() {
      this.y();
   }

   public void y() {
      this.L.forEach(class09885::close);
      this.L.clear();
   }

   private <T> T y(class02418<T> var1) {
      Iterator<class09885<?>> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         class09885<?> class09885 = iterator.next();
         if (var1.N(class09885.N)) {
            iterator.remove();
            return (T)class09885.y;
         }
      }

      return (T)var1.R();
   }

   @Override
   public <T> void N(class02418<T> var1, T var2) {
      this.L.addFirst(new class09885<>(var1, var2, this.y));
   }

   @Override
   public <T> T N(class02418<T> var1) {
      Object object = this.y(var1);
      var1.y(object);
      return (T)object;
   }

   public void N() {
      Iterator<class09885<?>> iterator = this.L.iterator();

      while (iterator.hasNext()) {
         class09885<?> class09885 = iterator.next();
         if (class09885.L-- == 0) {
            class09885.close();
            iterator.remove();
         }
      }
   }
}
