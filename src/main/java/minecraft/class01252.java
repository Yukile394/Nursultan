package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public class class01252 extends class05355<class07438> {
   public class01252() {
      super();
   }

   protected void N(class07438 var1, class04051 var2) {
      Optional<class07438> optional = var2.N(var1x -> var1x.method_5864() == var1.method_5864() && !var1x.method_6109());
      var1.method_18868().N(class05378.e, optional);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.e, class05378.B);
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      var2.method_18868().L(class05378.B).ifPresent(var2x -> this.N(var2, var2x));
   }
}
