package minecraft;

import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;

public class class01822<T> implements class07340<T> {
   @Nullable
   private T N;

   public class01822(List<T> var1) {
      super();
      if (!var1.isEmpty()) {
         Validate.isTrue(var1.size() <= 1, "Can't initialize SingleValuePalette with %d values.", var1.size());
         this.N = (T)var1.getFirst();
      }
   }

   public static <A> class07340<A> N(int var0, List<A> var1) {
      return new class01822(var1);
   }

   @Override
   public void method_12287(class00667 var1, class00750<T> var2) {
      if (this.N == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         var1.L(var2.N(this.N));
      }
   }

   @Override
   public void method_12289(class00667 var1, class00750<T> var2) {
      this.N = (T)var2.y(var1.E());
   }

   @Override
   public class07340<T> method_39956() {
      if (this.N == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         return this;
      }
   }

   @Override
   public int method_12290(class00750<T> var1) {
      if (this.N == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         return class01657.N(var1.N(this.N));
      }
   }

   @Override
   public int method_12291(T var1, class07342<T> var2) {
      if (this.N != null && this.N != var1) {
         return var2.onResize(1, var1);
      } else {
         this.N = (T)var1;
         return 0;
      }
   }

   @Override
   public boolean method_19525(Predicate<T> var1) {
      if (this.N == null) {
         throw new IllegalStateException("Use of an uninitialized palette");
      } else {
         return var1.test(this.N);
      }
   }

   @Override
   public int method_12197() {
      return 1;
   }

   @Override
   public T method_12288(int var1) {
      if (this.N != null && var1 == 0) {
         return this.N;
      } else {
         throw new IllegalStateException("Missing Palette entry for id " + var1 + ".");
      }
   }
}
