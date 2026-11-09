package minecraft;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface class06838 {
   class06838 N = Stream::empty;

   static class06838 N(class06838 var0, class06838 var1) {
      return () -> Stream.concat(var0.itemCopies(), var1.itemCopies());
   }

   static class06838 N_64(List<? extends class06838> var0) {
      return switch (var0.size()) {
         case 0 -> N;
         case 1 -> (class06838)var0.getFirst();
         case 2 -> N((class06838)var0.get(0), (class06838)var0.get(1));
         default -> () -> var0.stream().flatMap(class06838::itemCopies);
      };
   }

   default class06838 N_65(Predicate<class06584> var1) {
      return new class06815(this, var1);
   }

   default class06838 N(Function<class06584, ? extends class06838> var1) {
      return new class06836(this, var1);
   }

   default class06838 N(int var1) {
      return new class06831(this, var1);
   }

   static class06838 N(class04803 var0) {
      return () -> Stream.of(var0.N().t());
   }

   static class06838 N(Collection<? extends class04803> var0) {
      return switch (var0.size()) {
         case 0 -> N;
         case 1 -> N((class04803)var0.iterator().next());
         default -> () -> var0.stream().map(class04803::N).map(class06584::t);
      };
   }

   Stream<class06584> itemCopies();
}
