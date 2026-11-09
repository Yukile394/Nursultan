package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07406 {
   private static final class00392 N = class00392.L("multiplayer.disconnect.kicked");

   public class07406() {
      super();
   }

   public static List<class07947> N(class07393 var0) {
      return var0.L().N().stream().map(class07947::N).toList();
   }

   @Nullable
   private static class04770 N(class07393 var0, class07947 var1) {
      if (var1.N().isPresent()) {
         return var0.L().N(var1.N().get());
      } else {
         return var1.y().isPresent() ? var0.L().L(var1.y().get()) : null;
      }
   }

   public static List<class07947> N(class07393 var0, List<class07384> var1, class07403 var2) {
      ArrayList arraylist = new ArrayList();

      for (class07384 class07384 : var1) {
         class04770 class04770 = N(var0, class07384.N());
         if (class04770 != null) {
            var0.L().N(class04770, var2);
            class04770.field_13987.method_52396(class07384.y().flatMap(class07415::N).orElse(N));
            arraylist.add(class07384.N());
         }
      }

      return arraylist;
   }
}
