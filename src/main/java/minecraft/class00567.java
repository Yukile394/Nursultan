package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class class00567<T> implements class07340<T> {
   private final class01199<T> N;
   private final int y;

   private class00567(int var1, class01199<T> var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public class00567(int var1) {
      this(var1, class01199.L(1 << var1));
   }

   public class00567(int var1, List<T> var2) {
      this(var1);
      var2.forEach(this.N::u);
   }

   public List<T> N() {
      ArrayList arraylist = new ArrayList();
      this.N.iterator().forEachRemaining(arraylist::add);
      return arraylist;
   }

   public static <A> class07340<A> N(int var0, List<A> var1) {
      return new class00567(var0, var1);
   }

   @Override
   public void method_12287(class00667 var1, class00750<T> var2) {
      int i = this.method_12197();
      var1.L(i);

      for (int j = 0; j < i; j++) {
         var1.L(var2.N(this.N.N(j)));
      }
   }

   @Override
   public void method_12289(class00667 var1, class00750<T> var2) {
      this.N.N();
      int i = var1.E();

      for (int j = 0; j < i; j++) {
         this.N.u((T)var2.y(var1.E()));
      }
   }

   @Override
   public class07340<T> method_39956() {
      return new class00567<>(this.y, this.N.y());
   }

   @Override
   public int method_12290(class00750<T> var1) {
      int i = class01657.N(this.method_12197());

      for (int j = 0; j < this.method_12197(); j++) {
         i += class01657.N(var1.N(this.N.N(j)));
      }

      return i;
   }

   @Override
   public int method_12291(T var1, class07342<T> var2) {
      int i = this.N.N((T)var1);
      if (i == -1) {
         i = this.N.u((T)var1);
         if (i >= 1 << this.y) {
            i = var2.onResize(this.y + 1, var1);
         }
      }

      return i;
   }

   @Override
   public boolean method_19525(Predicate<T> var1) {
      for (int i = 0; i < this.method_12197(); i++) {
         if (var1.test(this.N.N(i))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int method_12197() {
      return this.N.L();
   }

   @Override
   public T method_12288(int var1) {
      Object object = this.N.N(var1);
      if (object == null) {
         throw new class01816(var1);
      } else {
         return (T)object;
      }
   }
}
