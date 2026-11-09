package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

class class02201 extends class04530 {
   private final List<class04530> y;

   private static double L(List<class04530> var0) {
      double d0 = 0.0;

      for (class04530 class04530 : var0) {
         d0 += class04530.L().getAsDouble();
      }

      return d0 / var0.size();
   }

   class02201(String var1, List<class04530> var2) {
      super(var1, ((class04530)var2.get(0)).i(), () -> L(var2), () -> y(var2), N(var2));
      this.y = var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null || this.getClass() != var1.getClass()) {
         return false;
      } else if (!super.equals(var1)) {
         return false;
      } else {
         class02201 class02201 = (class02201)var1;
         return this.y.equals(class02201.y);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.y);
   }

   private static void y(List<class04530> var0) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         ((class04530)iterator.next()).N();
      }
   }

   private static class04522 N(List<class04530> var0) {
      return var1 -> var0.stream().anyMatch(var2 -> var2.N != null ? var2.N.method_34792(var1) : false);
   }
}
