package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class class04776 extends class04748 {
   public static final MapCodec<class04776> N = N(class04776::new);

   public class04776(class04758 var1) {
      super(var1);
   }

   @Override
   public class04367<?> N() {
      return class04367.m;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      return Optional.of(new class04780(var1.B().W(), (Consumer<class03291>)(var1x -> N(var1x, var1))));
   }

   private static void N(class03291 var0, class04764 var1) {
      int i = 0;

      class04898 class04898;
      do {
         var0.y();
         var1.R().L(var1.M() + i++, var1.B().B, var1.B().Z);
         class04933.N();
         class04898 = new class04898(var1.R(), var1.B().N(2), var1.B().y(2));
         var0.N(class04898);
         class04898.N(class04898, var0, var1.R());
         List<class04890> list = class04898.L;

         while (!list.isEmpty()) {
            int j = var1.R().y(list.size());
            list.remove(j).N(class04898, var0, var1.R());
         }

         var0.N(var1.y().R(), var1.y().M(), var1.R(), 10);
      } while (var0.L() || class04898.y == null);
   }
}
