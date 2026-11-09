package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;

public class class06198 extends class04748 {
   public static final MapCodec<class06198> N = N(class06198::new);

   public class06198(class04758 var1) {
      super(var1);
   }

   public static class03300 N(class07321 var0, long var1, class03300 var3) {
      if (var3.N()) {
         return var3;
      } else {
         class07836 class07836 = new class07836(new class06075(class04043.N()));
         class07836.L(var1, var0.B, var0.Z);
         class04890 class04890 = var3.L().get(0);
         class05163 class05163 = class04890.L();
         int i = class05163.B();
         int j = class05163.z();
         class07211 class07211x = class07221.field_11062.N(class07836);
         class07211 class07211x = Objects.requireNonNullElse(class04890.i(), class07211x);
         class05167 class05167 = new class05167(class07836, i, j, class07211x);
         class03291 class03291 = new class03291();
         class03291.N(class05167);
         return class03291.N();
      }
   }

   @Override
   public class04367<?> N() {
      return class04367.z;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      int i = var1.B().N(9);
      int j = var1.B().y(9);
      Iterator<class03556<class00780>> iterator = var1.L().N(i, var1.y().R(), j, 29, var1.u().y()).iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().N(class03557.D)) {
            return Optional.empty();
         }
      }

      return N(var1, class07830.field_13195, var1x -> N(var1x, var1));
   }

   private static void N(class03291 var0, class04764 var1) {
      var0.N(N(var1.B(), var1.R()));
   }

   private static class04890 N(class07321 var0, class07836 var1) {
      int i = var0.i() - 29;
      int j = var0.R() - 29;
      class07211 class07211 = class07221.field_11062.N(var1);
      return new class05167(var1, i, j, class07211);
   }
}
