package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class class03841<T extends class07438> extends class05355<T> {
   private final BiPredicate<T, class07438> N;
   private final Predicate<T> y;
   private final class05378<Boolean> L;
   private final int u;

   public void L(T var1) {
      var1.method_18868().y(this.L);
   }

   public class03841(int var1, BiPredicate<T, class07438> var2, Predicate<T> var3, class05378<Boolean> var4, int var5) {
      super(var1);
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
   }

   public void y(T var1) {
      var1.method_18868().N(this.L, true, this.u);
   }

   @Override
   public void N(T var1) {
      Optional<List<class07438>> optional = var1.method_18868().L(class05378.M);
      if (!optional.isEmpty()) {
         if (optional.get().stream().anyMatch(var2x -> this.N.test((T)var1, var2x))) {
            this.y((T)var1);
         }
      }
   }

   @Override
   public Set<class05378<?>> N() {
      return Set.of(class05378.M);
   }

   @Override
   protected void N(class04782 var1, T var2) {
      if (!this.y.test((T)var2)) {
         this.L((T)var2);
      } else {
         this.N((T)var2);
      }
   }
}
