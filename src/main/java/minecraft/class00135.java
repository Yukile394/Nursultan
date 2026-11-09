package minecraft;

import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class00135 extends class00116<class09001> {
   public class00135(@Nullable class05096 var1, class09001 var2, class08781 var3) {
      super(var1, var2, var3);
   }

   protected Stream<class08734> N(class09001 var1, class08781 var2) {
      return var2.N().L().stream().map(var1x -> N(var1, var1x));
   }

   private static class08734 N(class09001 var0, class02213 var1) {
      return new class08734(new class09027(var1.N(), var0.i()), Optional.of(new class08751(new class00652(var1.L()))));
   }
}
