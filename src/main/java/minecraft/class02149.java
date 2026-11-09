package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class class02149 extends class05355<class07438> {
   private Optional<class07438> L(class04782 var1, class07438 var2) {
      return this.N(var2).flatMap(var3 -> var3.N(var3x -> this.u(var1, var2, var3x)));
   }

   public class02149() {
      super();
   }

   protected abstract boolean u(class04782 var1, class07438 var2, class07438 var3);

   protected abstract class05378<class07438> y();

   @Override
   protected void N(class04782 var1, class07438 var2) {
      var2.method_18868().N(this.y(), this.L(var1, var2));
   }

   protected Optional<class04051> N(class07438 var1) {
      return var1.method_18868().L(class05378.B);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(this.y());
   }
}
