package minecraft;

import java.util.List;
import java.util.Optional;

public class class09016 {
   public static final class05946<class09037> N = N("server_links");
   public static final class05946<class09037> y = N("custom_options");
   public static final class05946<class09037> L = N("quick_actions");
   public static final int u = 310;
   private static final class08734 i = new class08734(new class09027(class05220.U, 200), Optional.empty());

   public class09016() {
      super();
   }

   private static class05946<class09037> N(String var0) {
      return class05946.N(class04227.yL, class01894.y(var0));
   }

   public static void N(class04116<class09037> var0) {
      class02055 class02055 = var0.N(class04227.yL);
      var0.N(
         N,
         new class09001(
            new class09039(
               class00392.L("menu.server_links.title"),
               Optional.of(class00392.L("menu.server_links")),
               true,
               true,
               class08782.field_60962,
               List.of(),
               List.of()
            ),
            Optional.of(i),
            1,
            310
         )
      );
      var0.N(
         y,
         new class09040(
            new class09039(
               class00392.L("menu.custom_options.title"),
               Optional.of(class00392.L("menu.custom_options")),
               true,
               true,
               class08782.field_60962,
               List.of(),
               List.of()
            ),
            class02055.y(class00101.N),
            Optional.of(i),
            1,
            310
         )
      );
      var0.N(
         L,
         new class09040(
            new class09039(
               class00392.L("menu.quick_actions.title"),
               Optional.of(class00392.L("menu.quick_actions")),
               true,
               true,
               class08782.field_60962,
               List.of(),
               List.of()
            ),
            class02055.y(class00101.y),
            Optional.of(i),
            1,
            310
         )
      );
   }
}
