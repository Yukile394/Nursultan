package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class class05360<T extends class07438> extends class05355<T> {
   public class05360() {
      super();
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.M, class05378.B);
   }

   @Override
   protected void N(class04782 var1, T var2) {
      double d0 = var2.method_45325(class05298.P);
      class00734 class00734 = var2.method_5829().L(d0, d0, d0);
      List<class07438> list = var1.N(class07438.class, class00734, var1x -> var1x != var2 && var1x.method_5805());
      list.sort(Comparator.comparingDouble(var2::method_5858));
      class01289<?> class01289 = var2.method_18868();
      class01289.N(class05378.M, list);
      class01289.N(class05378.B, new class04051(var1, var2, list));
   }
}
