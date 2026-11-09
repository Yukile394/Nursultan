package minecraft;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class class02933 extends class08336<class07304> {
   public class02933(class01996 var1, CompletableFuture<class01929> var2) {
      super(var1, class04227.yR, var2);
   }

   protected void N(class01929 var1, class05946<class07304>... var2) {
      this.N(class02625.N).N(var2);
      Set set = Set.of(var2);
      List list = var1.y(class04227.yR).z().filter(var1x -> !set.contains(var1x.i().get())).map(class03556::M).collect(Collectors.toList());
      if (!list.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", list));
      }
   }
}
