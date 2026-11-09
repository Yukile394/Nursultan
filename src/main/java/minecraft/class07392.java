package minecraft;

import com.google.common.net.InetAddresses;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class class07392 {
   private static final String N = "Management server";

   public static List<class07385> L(class07393 var0, List<class07385> var1, class07403 var2) {
      Set set = var1.stream().filter(var0x -> InetAddresses.isInetAddress(var0x.N())).map(class07385::i).collect(Collectors.toSet());
      Set set1 = var0.y().y().stream().map(class07407::N).collect(Collectors.toSet());
      set1.stream().filter(var1x -> !set.contains(var1x)).forEach(var2x -> var0.y().N(var2x.y(), var2));
      set.stream().filter(var1x -> !set1.contains(var1x)).forEach(var2x -> var0.y().N(var2x.N(), var2));
      set.stream()
         .filter(var1x -> !set1.contains(var1x))
         .flatMap(var1x -> var0.L().y(var1x.y()).stream())
         .forEach(var0x -> var0x.field_13987.method_52396(class00392.L("multiplayer.disconnect.ip_banned")));
      return N(var0);
   }

   public class07392() {
      super();
   }

   public static List<class07385> y(class07393 var0, List<String> var1, class07403 var2) {
      var1.forEach(var2x -> var0.y().N(var2x, var2));
      return N(var0);
   }

   private static List<class04770> N(class07393 var0, class07407 var1, class07403 var2) {
      var0.y().N(var1.N(), var2);
      return var0.L().y(var1.y());
   }

   private static List<class04770> N(class07393 var0, class07390 var1, class07403 var2) {
      class07407 class07407 = var1.N();
      if (class07407 != null) {
         return N(var0, class07407, var2);
      } else {
         if (var1.y().isPresent()) {
            Optional<class04770> optional = var0.L().y(var1.y().get().N(), var1.y().get().y());
            if (optional.isPresent()) {
               return N(var0, var1.N(optional.get()), var2);
            }
         }

         return List.of();
      }
   }

   public static List<class07385> N(class07393 var0, List<class07390> var1, class07403 var2) {
      var1.stream()
         .map(var2x -> N(var0, var2x, var2))
         .flatMap(Collection::stream)
         .forEach(var0x -> var0x.field_13987.method_52396(class00392.L("multiplayer.disconnect.ip_banned")));
      return N(var0);
   }

   public static List<class07385> N(class07393 var0) {
      return var0.y().y().stream().map(class07407::N).map(class07385::N).toList();
   }

   public static List<class07385> N(class07393 var0, class07403 var1) {
      var0.y().N(var1);
      return N(var0);
   }
}
