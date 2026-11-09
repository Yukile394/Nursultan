package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class class05383 extends class05355<class07438> {
   public class05383() {
      super();
   }

   protected double N(class07438 var1) {
      return var1.method_45325(class05298.P);
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      List list = var1.method_18456()
         .stream()
         .filter(class07042.R)
         .filter(var2x -> var2.method_24516(var2x, this.N(var2)))
         .sorted(Comparator.comparingDouble(var2::method_5858))
         .collect(Collectors.toList());
      class01289<?> class01289 = var2.method_18868();
      class01289.N(class05378.z, list);
      List list1 = list.stream().filter(var2x -> N(var1, var2, var2x)).collect(Collectors.toList());
      class01289.N(class05378.U, list1.isEmpty() ? null : (class08036)list1.get(0));
      List list2 = list1.stream().filter(var2x -> y(var1, var2, var2x)).toList();
      class01289.N(class05378.W, list2);
      class01289.N(class05378.E, list2.isEmpty() ? null : (class08036)list2.get(0));
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.z, class05378.U, class05378.E, class05378.W);
   }
}
