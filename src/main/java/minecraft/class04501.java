package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class class04501 extends class05360<class04508> {
   public class04501() {
      super();
   }

   protected void N(class04782 var1, class04508 var2) {
      super.N(var1, var2);
      var2.method_18868()
         .L(class05378.M)
         .stream()
         .flatMap(Collection::stream)
         .filter(class07042.i)
         .filter(var2x -> class05355.y(var1, var2, var2x))
         .findFirst()
         .ifPresentOrElse(var1x -> var2.method_18868().N(class05378.Q, var1x), () -> var2.method_18868().y(class05378.Q));
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.copyOf(Iterables.concat(super.N(), List.of(class05378.Q)));
   }
}
