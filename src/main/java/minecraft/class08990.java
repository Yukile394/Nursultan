package minecraft;

import java.util.Optional;
import java.util.OptionalInt;

public interface class08990 {
   int L();

   private static Optional<class07109> y(class06183 var0, class07211 var1) {
      class07211 class07211 = var0.i();
      if (var1 != class07211) {
         return Optional.empty();
      } else {
         class07209 class07209 = var0.u().method_10093(class07211);
         class06889 class06889 = var0.y().N(class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
         double d0 = class06889.N();
         double d1 = class06889.y();
         double d2 = class06889.L();

         return switch (class07211) {
            case field_11043 -> Optional.of(new class07109((float)(1.0 - d0), (float)d1));
            case field_11035 -> Optional.of(new class07109((float)d0, (float)d1));
            case field_11039 -> Optional.of(new class07109((float)d2, (float)d1));
            case field_11034 -> Optional.of(new class07109((float)(1.0 - d2), (float)d1));
            case field_11033, field_11036 -> Optional.empty();
         };
      }
   }

   int y();

   private static int N(float var0, int var1) {
      float f = var0 * 16.0F;
      float f1 = 16.0F / var1;
      return class04995.N(class04995.y(f / f1), 0, var1 - 1);
   }

   default OptionalInt N(class06183 var1, class07211 var2) {
      return y(var1, var2).map(var1x -> {
         int i = N(1.0F - var1x.U, this.y());
         return OptionalInt.of(N(var1x.z, this.L()) + i * this.L());
      }).orElseGet(OptionalInt::empty);
   }
}
