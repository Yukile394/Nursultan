package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class05550 extends class05765<class07438> {
   private final class05378<Integer> N;

   @Override
   protected void L(class04782 var1, class07438 var2, long var3) {
      Optional<Integer> optional = this.y(var2);
      var2.method_18868().N(this.N, optional.get() - 1);
   }

   public class05550(class05378<Integer> var1) {
      super(ImmutableMap.of(var1, class05367.field_18456));
      this.N = var1;
   }

   @Override
   protected void y(class04782 var1, class07438 var2, long var3) {
      var2.method_18868().y(this.N);
   }

   private Optional<Integer> y(class07438 var1) {
      return var1.method_18868().L(this.N);
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   @Override
   protected boolean N(class04782 var1, class07438 var2, long var3) {
      Optional<Integer> optional = this.y(var2);
      return optional.isPresent() && optional.get() > 0;
   }
}
