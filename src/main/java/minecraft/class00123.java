package minecraft;

import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class00123 extends class00116<class09040> {
   public class00123(@Nullable class05096 var1, class09040 var2, class08781 var3) {
      super(var1, var2, var3);
   }

   protected Stream<class08734> N(class09040 var1, class08781 var2) {
      return var1.i().N().map(var1x -> N(var1, (class03556<class09037>)var1x));
   }

   private static class08734 N(class09040 var0, class03556<class09037> var1) {
      return new class08734(new class09027(((class09037)var1.N()).H_().N(), var0.R()), Optional.of(new class08751(new class00626(var1))));
   }
}
