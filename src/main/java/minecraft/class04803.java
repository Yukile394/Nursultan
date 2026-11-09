package minecraft;

import Nursultan.class10470;
import Nursultan.class10471;
import Nursultan.class10472;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface class04803 {
   static class04803 N(class07438 var0, class07085 var1) {
      return N(var0, var1, var0x -> true);
   }

   static class04803 N(List<class06584> var0, int var1) {
      return new class10471(var0, var1);
   }

   class06584 N();

   static class04803 N(class07438 var0, class07085 var1, Predicate<class06584> var2) {
      return new class10470(var0, var1, var2);
   }

   static class04803 N(Supplier<class06584> var0, Consumer<class06584> var1) {
      return new class10472(var0, var1);
   }

   boolean N(class06584 var1);
}
