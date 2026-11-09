package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class class03983 extends class05360<class04003> {
   public class03983() {
      super();
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.copyOf(Iterables.concat(super.N(), List.of(class05378.Q)));
   }

   protected void N(class04782 var1, class04003 var2) {
      super.N(var1, var2);
      N(var2, var0 -> var0.method_5864() == class07078.Ly)
         .or(() -> N(var2, var0x -> var0x.method_5864() != class07078.Ly))
         .ifPresentOrElse(var1x -> var2.method_18868().N(class05378.Q, var1x), () -> var2.method_18868().y(class05378.Q));
   }

   private static Optional<class07438> N(class04003 var0, Predicate<class07438> var1) {
      return var0.method_18868().L(class05378.M).stream().flatMap(Collection::stream).filter(var0::L).filter(var1).findFirst();
   }
}
