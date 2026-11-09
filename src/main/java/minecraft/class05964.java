package minecraft;

import java.util.Optional;

public class class05964 {
   public static final class05946<class04382> N = N("normal");
   public static final class05946<class04382> y = N("flat");
   public static final class05946<class04382> L = N("large_biomes");
   public static final class05946<class04382> u = N("amplified");
   public static final class05946<class04382> i = N("single_biome_surface");
   public static final class05946<class04382> R = N("debug_all_block_states");

   public static class03764 L(class01929 var0) {
      return var0.y(class04227.yO).y(y).N().N();
   }

   public class05964() {
      super();
   }

   public static class01255 y(class01929 var0) {
      return var0.y(class04227.yO).y(N).N().y().orElseThrow();
   }

   public static void N(class04116<class04382> var0) {
      new class05953(var0).N();
   }

   public static class03764 N(class01929 var0) {
      return var0.y(class04227.yO).y(N).N().N();
   }

   private static class05946<class04382> N(String var0) {
      return class05946.N(class04227.yO, class01894.y(var0));
   }

   public static Optional<class05946<class04382>> N(class03764 var0) {
      return var0.N(class01255.y).flatMap(var0x -> {
         return switch (var0x.y()) {
            case class07850 class07850 -> Optional.of(y);
            case class07833 class07833 -> Optional.of(R);
            case class04865 class04865 -> Optional.of(N);
            default -> Optional.empty();
         };
      });
   }
}
