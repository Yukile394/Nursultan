package minecraft;

import java.util.List;
import java.util.UUID;

public interface class04514 {
   class04514 N = (var0, var1, var2, var3, var5) -> var1.N(
         var0, var3x -> var3x.method_24515().method_19771(var2, var3) && !var3x.method_68878() && !var3x.method_7325()
      )
      .stream()
      .filter(var3x -> !var5 || N(var0, var2.method_46558(), var3x.method_33571()))
      .map(class07049::method_5667)
      .toList();
   class04514 y = (var0, var1, var2, var3, var5) -> var1.N(var0, var3x -> var3x.method_24515().method_19771(var2, var3) && !var3x.method_7325())
      .stream()
      .filter(var3x -> !var5 || N(var0, var2.method_46558(), var3x.method_33571()))
      .map(class07049::method_5667)
      .toList();
   class04514 L = (var0, var1, var2, var3, var5) -> {
      class00734 class00734 = new class00734(var2).M(var3);
      return var1.N(var0, class07078.yz, class00734, class07438::method_5805)
         .stream()
         .filter(var3x -> !var5 || N(var0, var2.method_46558(), var3x.method_33571()))
         .map(class07049::method_5667)
         .toList();
   };

   private static boolean N(class07299 var0, class06889 var1, class06889 var2) {
      class06183 class06183 = var0.N(new class05862(var2, var1, class05849.field_23142, class05835.field_1348, class06092.N()));
      return class06183.u().equals(class07209.method_49638(var1)) || class06183.N() == class07113.field_1333;
   }

   List<UUID> detect(class04782 var1, class04488 var2, class07209 var3, double var4, boolean var6);
}
