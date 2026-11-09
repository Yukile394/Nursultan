package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class class06306 extends class05355<class07438> {
   private class04051 L(class07438 var1) {
      return var1.method_18868().L(class05378.B).orElse(class04051.N());
   }

   public class06306() {
      super();
   }

   private boolean y(class07438 var1) {
      return var1.method_5864() == class07078.ye && var1.method_6109();
   }

   private List<class07438> N(class07438 var1) {
      return ImmutableList.copyOf(this.L(var1).y(this::y));
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      var2.method_18868().N(class05378.Z, this.N(var2));
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.Z);
   }
}
