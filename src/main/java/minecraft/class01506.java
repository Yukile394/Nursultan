package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class01506 extends class05355<class07079> {
   private static final long y = 32L;
   private static final long L = 16L;
   public static final int N = 32;

   public class01506() {
      super();
   }

   protected void N(class04782 var1, class07079 var2) {
      class01289<?> class01289 = var2.method_18868();
      List<class00717> list = var1.N(class00717.class, var2.method_5829().L(32.0, 16.0, 32.0), var0 -> true);
      list.sort(Comparator.comparingDouble(var2::method_5858));
      Optional<class00717> optional = list.stream()
         .filter(var2x -> var2.y(var1, var2x.N()))
         .filter(var1x -> var1x.method_24516(var2, 32.0))
         .filter(var2::method_6057)
         .findFirst();
      class01289.N(class05378.H, optional);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.H);
   }
}
