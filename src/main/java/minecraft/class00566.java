package minecraft;

import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public class class00566<T> implements class07340<T> {
   private final T[] N;
   private final int y;
   private int L;

   private class00566(int var1, List<T> var2) {
      super();
      this.N = (T[])(new Object[1 << var1]);
      this.y = var1;
      Validate.isTrue(var2.size() <= this.N.length, "Can't initialize LinearPalette of size %d with %d entries", new Object[]{this.N.length, var2.size()});

      for (int i = 0; i < var2.size(); i++) {
         this.N[i] = (T)var2.get(i);
      }

      this.L = var2.size();
   }

   private class00566(T[] var1, int var2, int var3) {
      super();
      this.N = (T[])var1;
      this.y = var2;
      this.L = var3;
   }

   public static <A> class07340<A> N(int var0, List<A> var1) {
      return new class00566(var0, var1);
   }

   @Override
   public void method_12287(class00667 var1, class00750<T> var2) {
      var1.L(this.L);

      for (int i = 0; i < this.L; i++) {
         var1.L(var2.N(this.N[i]));
      }
   }

   @Override
   public void method_12289(class00667 var1, class00750<T> var2) {
      this.L = var1.E();

      for (int i = 0; i < this.L; i++) {
         this.N[i] = (T)var2.y(var1.E());
      }
   }

   @Override
   public class07340<T> method_39956() {
      return new class00566<>((T[])((Object[])this.N.clone()), this.y, this.L);
   }

   @Override
   public int method_12290(class00750<T> var1) {
      int i = class01657.N(this.method_12197());

      for (int j = 0; j < this.method_12197(); j++) {
         i += class01657.N(var1.N(this.N[j]));
      }

      return i;
   }

   @Override
   public int method_12291(T var1, class07342<T> var2) {
      for (int i = 0; i < this.L; i++) {
         if (this.N[i] == var1) {
            return i;
         }
      }

      int j = this.L;
      if (j < this.N.length) {
         this.N[j] = (T)var1;
         this.L++;
         return j;
      } else {
         return var2.onResize(this.y + 1, var1);
      }
   }

   @Override
   public boolean method_19525(Predicate<T> var1) {
      for (int i = 0; i < this.L; i++) {
         if (var1.test(this.N[i])) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int method_12197() {
      return this.L;
   }

   @Override
   public T method_12288(int var1) {
      if (var1 >= 0 && var1 < this.L) {
         return this.N[var1];
      } else {
         throw new class01816(var1);
      }
   }
}
