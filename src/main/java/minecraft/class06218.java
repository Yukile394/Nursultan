package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class class06218 extends class04748 {
   public static Object N_0 = class04540.<class01016>y()
      .N(new class01016(class07078.T, 2, 3), 10)
      .N(new class01016(class07078.LN, 4, 4), 5)
      .N(new class01016(class07078.yA, 5, 5), 8)
      .N(new class01016(class07078.ym, 5, 5), 2)
      .N(new class01016(class07078.Ng, 4, 4), 3)
      .N();
   public static Object N_1 = class04748.N(class06218::new);

   public class06218(class04758 var1) {
      super(var1);
   }

   static {
      B();
   }

   private static void B() {
      N_0 = null;
      N_1 = null;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class07321 class07321 = var1.B();
      class07209 class07209 = new class07209(class07321.i(), 64, class07321.R());
      return Optional.of(new class04780(class07209, (Consumer<class03291>)(var1x -> N(var1x, var1))));
   }

   @Override
   public class04367<?> N() {
      return class04367.u;
   }

   private static void N(class03291 var0, class04764 var1) {
      class06461 class06461 = new class06461(var1.R(), var1.B().N(2), var1.B().y(2));
      var0.N(class06461);
      class06461.N(class06461, var0, var1.R());
      List<class04890> list = class06461.u;

      while (!list.isEmpty()) {
         int i = var1.R().y(list.size());
         list.remove(i).N(class06461, var0, var1.R());
      }

      var0.N(var1.R(), 48, 70);
   }
}
