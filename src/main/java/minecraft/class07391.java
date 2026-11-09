package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class class07391 {
   private static final String N = "Management server";

   public static List<class07395> L(class07393 var0, List<class07395> var1, class07403 var2) {
      Set set = class07536.L(var1.stream().map(var1x -> var0.L().N(var1x.N().N(), var1x.N().y()).thenApply(var1xx -> var1xx.map(var1x::N))).toList())
         .join()
         .stream()
         .flatMap(Optional::stream)
         .collect(Collectors.toSet());
      Set set1 = var0.y().N().stream().filter(var0x -> var0x.B() != null).map(class07419::N).collect(Collectors.toSet());
      set1.stream().filter(var1x -> !set.contains(var1x)).forEach(var2x -> var0.y().N(var2x.y(), var2));
      set.stream().filter(var1x -> !set1.contains(var1x)).forEach(var2x -> {
         var0.y().N(var2x.N(), var2);
         class04770 class04770 = var0.L().N(var2x.y().N());
         if (class04770 != null) {
            class04770.field_13987.method_52396(class00392.L("multiplayer.disconnect.banned"));
         }
      });
      return N(var0);
   }

   public class07391() {
      super();
   }

   public static List<class07395> y(class07393 var0, List<class07947> var1, class07403 var2) {
      for (Optional optional : class07536.L(var1.stream().map(var1x -> var0.L().N(var1x.N(), var1x.y())).toList()).join()) {
         if (!optional.isEmpty()) {
            var0.y().N((class08774)optional.get(), var2);
         }
      }

      return N(var0);
   }

   public static List<class07395> N(class07393 var0, class07403 var1) {
      var0.y().y(var1);
      return N(var0);
   }

   public static List<class07395> N(class07393 var0, List<class07395> var1, class07403 var2) {
      for (Optional optional : class07536.L(
            var1.stream().map(var1x -> var0.L().N(var1x.N().N(), var1x.N().y()).thenApply(var1xx -> var1xx.map(var1x::N))).toList()
         )
         .join()) {
         if (!optional.isEmpty()) {
            class07419 class07419 = (class07419)optional.get();
            var0.y().N(class07419.N(), var2);
            class04770 class04770 = var0.L().N(((class07419)optional.get()).y().N());
            if (class04770 != null) {
               class04770.field_13987.method_52396(class00392.L("multiplayer.disconnect.banned"));
            }
         }
      }

      return N(var0);
   }

   public static List<class07395> N(class07393 var0) {
      return var0.y().N().stream().filter(var0x -> var0x.B() != null).map(class07419::N).map(class07395::N).toList();
   }
}
