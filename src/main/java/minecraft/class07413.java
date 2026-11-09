package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class class07413 {
   public static List<class07947> L(class07393 var0, List<class07947> var1, class07403 var2) {
      Set set = class07536.L(var1.stream().map(var1x -> var0.L().N(var1x.N(), var1x.y())).toList())
         .join()
         .stream()
         .flatMap(Optional::stream)
         .collect(Collectors.toSet());
      Set set1 = var0.N().N().stream().map(class05151::B).collect(Collectors.toSet());
      set1.stream().filter(var1x -> !set.contains(var1x)).forEach(var2x -> var0.N().N(var2x, var2));
      set.stream().filter(var1x -> !set1.contains(var1x)).forEach(var2x -> var0.N().N(new class05142(var2x), var2));
      var0.N().y(var2);
      return N(var0);
   }

   public class07413() {
      super();
   }

   public static List<class07947> y(class07393 var0, List<class07947> var1, class07403 var2) {
      Iterator iterator = class07536.L(var1.stream().map(var1x -> var0.L().N(var1x.N(), var1x.y())).toList()).join().iterator();

      while (iterator.hasNext()) {
         ((Optional)iterator.next()).ifPresent(var2x -> var0.N().N(var2x, var2));
      }

      var0.N().y(var2);
      return N(var0);
   }

   public static List<class07947> N(class07393 var0, class07403 var1) {
      var0.N().N(var1);
      return N(var0);
   }

   public static List<class07947> N(class07393 var0, List<class07947> var1, class07403 var2) {
      Iterator iterator = class07536.L(var1.stream().map(var1x -> var0.L().N(var1x.N(), var1x.y())).toList()).join().iterator();

      while (iterator.hasNext()) {
         ((Optional)iterator.next()).ifPresent(var2x -> var0.N().N(new class05142(var2x), var2));
      }

      return N(var0);
   }

   public static List<class07947> N(class07393 var0) {
      return var0.N().N().stream().filter(var0x -> var0x.B() != null).map(var0x -> class07947.N(var0x.B())).toList();
   }
}
