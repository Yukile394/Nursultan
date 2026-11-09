package minecraft;

import java.util.function.Predicate;

public class class00551<T> implements class07340<T> {
   private final class00750<T> N;

   public class00551(class00750<T> var1) {
      super();
      this.N = var1;
   }

   @Override
   public void method_12287(class00667 var1, class00750<T> var2) {
   }

   @Override
   public void method_12289(class00667 var1, class00750<T> var2) {
   }

   @Override
   public class07340<T> method_39956() {
      return this;
   }

   @Override
   public int method_12290(class00750<T> var1) {
      return 0;
   }

   @Override
   public int method_12291(T var1, class07342<T> var2) {
      int i = this.N.N((T)var1);
      return i == -1 ? 0 : i;
   }

   @Override
   public boolean method_19525(Predicate<T> var1) {
      return true;
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
