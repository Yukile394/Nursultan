package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class class05708 extends class05355<class07438> {
   private static final int N = 200;
   private static final int y = 599;

   public class05708() {
      this(200);
   }

   public class05708(int var1) {
      super(var1);
   }

   public static void y(class07438 var0) {
      var0.method_18868().N(class05378.J, true, 599L);
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.M);
   }

   public static void N(class07438 var0) {
      Optional<List<class07438>> optional = var0.method_18868().L(class05378.M);
      if (!optional.isEmpty()) {
         if (optional.get().stream().anyMatch(var0x -> var0x.method_5864().equals(class07078.Nn))) {
            y(var0);
         }
      }
   }

   @Override
   protected void N(class04782 var1, class07438 var2) {
      N(var2);
   }
}
