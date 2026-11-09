package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class08770 {
   public static final Supplier<Optional<class00647>> N = Optional::empty;
   private final class00134<?> y;
   private final Map<String, class08737> L = new HashMap<>();

   public class08770(class00134<?> var1) {
      super();
      this.y = var1;
   }

   public class05373 N(class08734 var1) {
      Supplier<Optional<class00647>> supplier = this.N(var1.y());
      return N(var1.N(), var2x -> this.y.N(supplier.get()));
   }

   public void N(class09009 var1, Consumer<class02102> var2) {
      String s = var1.N();
      class00100.N(var1.y(), this.y, (var3x, var4) -> {
         this.L.put(s, var4);
         var2.accept(var3x);
      });
   }

   public Supplier<Optional<class00647>> N(Optional<class08752> var1) {
      if (var1.isPresent()) {
         class08752 class08752 = (class08752)var1.get();
         return () -> class08752.N(this.L);
      } else {
         return N;
      }
   }

   private static class05373 N(class09027 var0, class05361 var1) {
      class05373 class05373 = class05362.method_46430(var0.N(), var1);
      class05373.N(var0.L());
      if (var0.y().isPresent()) {
         class05373 = class05373.N(class04141.N(var0.y().get()));
      }

      return class05373;
   }
}
