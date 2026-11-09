package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class04265 {
   private static final int y = 50;
   public static final class04274 N = (var0, var1) -> Stream.of(new class05513(var0, class06993.field_11467, var1, class04272.N()));

   public class04265() {
      super();
   }

   public static class05498 N() {
      return N(50);
   }

   public static class05498 N(int var0) {
      return var1 -> var1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy(var0xx -> var0xx.t().u())).entrySet().stream().flatMap(var1x -> {
         class03556 class03556 = var1x.getKey();
         return Streams.mapWithIndex(Lists.partition(var1x.getValue(), var0).stream(), (var1xx, var2x) -> N(List.copyOf(var1xx), class03556, (int)var2x));
      }).toList();
   }

   public static class05531 N(Collection<class05513> var0, class03556<class00225> var1, int var2) {
      return new class05531(var2, var0, var1);
   }

   public static List<class05531> N(Collection<class03529<class00201>> var0, class04274 var1, class04782 var2) {
      return var0.stream()
         .flatMap(var2x -> var1.decorate((class03529<class00201>)var2x, var2))
         .collect(Collectors.groupingBy(var0x -> var0x.t().u()))
         .entrySet()
         .stream()
         .flatMap(var0x -> {
            class03556 class03556 = var0x.getKey();
            return Streams.mapWithIndex(Lists.partition(var0x.getValue(), 50).stream(), (var1x, var2x) -> N(var1x, class03556, (int)var2x));
         })
         .toList();
   }
}
