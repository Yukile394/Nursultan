package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public abstract class class06508 implements class05952 {
   private final Builder<class05957> N = ImmutableList.builder();

   protected class06508(class05952... var1) {
      super();

      for (class05952 class05952 : var1) {
         this.N.add(class05952.build());
      }
   }

   @Override
   public class05957 build() {
      return this.N(this.N.build());
   }

   public void N(class05952 var1) {
      this.N.add(var1.build());
   }

   protected abstract class05957 N(List<class05957> var1);
}
