package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class class07417 {
   public static List<class07397> L(class07393 var0, List<class07397> var1, class07403 var2) {
      Set set = class07536.L(
            var1.stream()
               .map(var1x -> var0.L().N(var1x.N().N(), var1x.N().y()).thenApply(var1xx -> var1xx.map(var1xxx -> new class07387(var1xxx, var1x.y(), var1x.L()))))
               .toList()
         )
         .join()
         .stream()
         .flatMap(Optional::stream)
         .collect(Collectors.toSet());
      Set set1 = var0.i()
         .N()
         .stream()
         .filter(var0x -> var0x.B() != null)
         .map(var0x -> new class07387(var0x.B(), Optional.of(var0x.N().N()), Optional.of(var0x.y())))
         .collect(Collectors.toSet());
      set1.stream().filter(var1x -> !set.contains(var1x)).forEach(var2x -> var0.i().y(var2x.N(), var2));
      set.stream().filter(var1x -> !set1.contains(var1x)).forEach(var2x -> var0.i().N(var2x.N(), var2x.y(), var2x.L(), var2));
      return N(var0);
   }

   public class07417() {
      super();
   }

   public static List<class07397> y(class07393 var0, List<class07397> var1, class07403 var2) {
      Iterator iterator = class07536.L(
            var1.stream()
               .map(var1x -> var0.L().N(var1x.N().N(), var1x.N().y()).thenApply(var1xx -> var1xx.map(var1xxx -> new class07387(var1xxx, var1x.y(), var1x.L()))))
               .toList()
         )
         .join()
         .iterator();

      while (iterator.hasNext()) {
         ((Optional)iterator.next()).ifPresent(var2x -> var0.i().N(var2x.N(), var2x.y(), var2x.L(), var2));
      }

      return N(var0);
   }

   public static List<class07397> N(class07393 var0, List<class07947> var1, class07403 var2) {
      Iterator iterator = class07536.L(var1.stream().map(var1x -> var0.L().N(var1x.N(), var1x.y())).toList()).join().iterator();

      while (iterator.hasNext()) {
         ((Optional)iterator.next()).ifPresent(var2x -> var0.i().y(var2x, var2));
      }

      return N(var0);
   }

   public static List<class07397> N(class07393 var0, class07403 var1) {
      var0.i().N(var1);
      return N(var0);
   }

   public static List<class07397> N(class07393 var0) {
      return var0.i().N().stream().filter(var0x -> var0x.B() != null).map(class07397::N).toList();
   }
}
