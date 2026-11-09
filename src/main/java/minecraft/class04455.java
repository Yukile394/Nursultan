package minecraft;

import Nursultan.class10407;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public record class04455(List<class10407> entries) {
   public static Object y_0 = new class04455(List.of());
   public static Object y_1;
   public static Object y_2;

   private static void L() {
      y_1 = 8;
      y_2 = 16;
   }

   public class04455(class00667 var1) {
      this(var1.N_15(class00667.N(ArrayList::new, 8), class10407::new));
   }

   public class04455(List<class10407> entries) {
      super();
      this.entries = entries;
   }

   static {
      L();
   }

   public void N(class00667 var1) {
      var1.N_12(this.entries, (var0, var1x) -> var1x.N(var0));
   }

   public List<class10407> N() {
      return this.entries;
   }

   public static class04455 N(class03039<?> var0, class04443 var1) {
      List list = var0.N().stream().map(var1x -> {
         class04469 class04469 = var1.sign(var1x.L());
         return class04469 != null ? new class10407(var1x.N(), class04469) : null;
      }).filter(Objects::nonNull).toList();
      return new class04455(list);
   }
}
